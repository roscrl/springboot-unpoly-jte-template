package gg.jte.generated.ondemand.layout;
public final class JteheadGenerated {
	public static final String JTE_NAME = "layout/head.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,4,4,4,4,27,35,35,36,37,37,41};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title) {
		jteOutput.writeContent("\n<head>\n    <meta charset=\"UTF-8\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent("</title>\n\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/assets/tailwind.css\">\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/assets/main.css\">\n    <link rel=\"icon\" type=\"image/svg+xml\" href=\"/assets/favicon.svg\" sizes=\"any\"/>\n\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/webjars/unpoly/2.6.0/unpoly.min.css\">\n\n    <script type=\"importmap\">\n            {\n              \"imports\": {\n                \"stimulus\": \"/webjars/hotwired__stimulus/3.0.1/dist/stimulus.js\",\n                \"unpoly\":   \"/webjars/unpoly/2.6.0/unpoly.min.js\"\n              }\n            }\n\n\n    </script>\n\n    <script type=\"module\">\n        import \"unpoly\"\n\n        ");
		jteOutput.writeContent("\n\n        import { Application } from \"stimulus\"\n        import ExampleController from \"/assets/controllers/example_controller.js\"\n\n        window.Stimulus = Application.start()\n        Stimulus.register(\"example\", ExampleController)\n\n        ");
		if (com.example.demo.utils.Dev.isDevMode()) {
			jteOutput.writeContent("\n        up.log.enable() ");
			jteOutput.writeContent("\n        ");
		}
		jteOutput.writeContent("\n\n    </script>\n\n</head>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.get("title");
		render(jteOutput, jteHtmlInterceptor, title);
	}
}
