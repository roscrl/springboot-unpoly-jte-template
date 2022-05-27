package gg.jte.generated.ondemand.pages;
public final class JtehomeGenerated {
	public static final String JTE_NAME = "pages/home.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,1,1,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		gg.jte.generated.ondemand.layout.JtemainGenerated.render(jteOutput, jteHtmlInterceptor, "Home", new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <a href=\"orda\" up-follow>awwaa</a>   aaaawwweq\n\n    <div data-controller=\"example\">\n        wee\n    </div>\n\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
