package com.example.demo.configuration;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.output.Utf8ByteOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.view.AbstractTemplateView;
import org.springframework.web.servlet.view.AbstractTemplateViewResolver;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@Configuration
public class Jte {

    @Value("${spring.profiles.active:}")
    private String profile;

    @Bean
    public ViewResolver jteViewResolve(TemplateEngine templateEngine) {
        return new ViewResolver(templateEngine);
    }

    @Bean
    public TemplateEngine templateEngine() {

        if (profile.contains("prod")) {
            // Templates will be compiled by the maven build task
            return TemplateEngine.createPrecompiled(ContentType.Html);
        } else {
            // Here, a JTE file watcher will recompile the JTE templates upon file save (the web browser will auto-refresh)
            // If using IntelliJ, use Ctrl-F9 to trigger an auto-refresh when editing non-JTE files.
            var codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "resources", "views"));
            return TemplateEngine.create(codeResolver, Paths.get("src", "main", "java", "jte-classes"), ContentType.Html, getClass().getClassLoader());
        }
    }

}

class ViewResolver extends AbstractTemplateViewResolver {

    private final TemplateEngine templateEngine;

    public ViewResolver(TemplateEngine templateEngine) {
        this.setViewClass(this.requiredViewClass());
        this.setSuffix(".jte");
        this.templateEngine = templateEngine;
    }

    @Override
    protected AbstractUrlBasedView instantiateView() {
        return new View(templateEngine);
    }

}

class View extends AbstractTemplateView {

    private final TemplateEngine templateEngine;

    public View(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void renderMergedTemplateModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

        var output = new StringOutput();
        templateEngine.render(this.getUrl(), model, output);

        response.setContentType(MediaType.TEXT_HTML_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());

        response.getWriter().write(output.toString());
    }

}