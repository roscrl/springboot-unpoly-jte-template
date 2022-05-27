package gg.jte.generated.ondemand.layout;
public final class JtemainGenerated {
	public static final String JTE_NAME = "layout/main.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,6,6,6,11,11,11,16};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String title, gg.jte.Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"overflow-x-hidden\">\n\n");
		gg.jte.generated.ondemand.layout.JteheadGenerated.render(jteOutput, jteHtmlInterceptor, title);
		jteOutput.writeContent("\n\n<body up-main=\"root\">\n\n<main>\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n</main>\n\n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String title = (String)params.getOrDefault("title", "Home");
		gg.jte.Content content = (gg.jte.Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, title, content);
	}
}
