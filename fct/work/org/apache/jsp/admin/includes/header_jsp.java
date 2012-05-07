package org.apache.jsp.admin.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<title>.:: FCT - Fl&aacute;vio Carvalho Team ::.</title>\r\n");
      out.write("       \r\n");
      out.write("        <!-- CSS Reset -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/reset.css\" media=\"screen\" />\r\n");
      out.write("       \r\n");
      out.write("        <!-- Fluid 960 Grid System - CSS framework -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/grid.css\" media=\"screen\" />\r\n");
      out.write("\t\t\r\n");
      out.write("        <!-- IE Hacks for the Fluid 960 Grid System -->\r\n");
      out.write("        <!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"ie6.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie6.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("\t\t<!--[if IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"ie.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("        \r\n");
      out.write("        <!-- Main stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/styles.css\" media=\"screen\" />\r\n");
      out.write("        \r\n");
      out.write("        <!-- WYSIWYG editor stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.wysiwyg.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/jquery.wysiwyg.css\" media=\"screen\" />\r\n");
      out.write("        \r\n");
      out.write("        <!-- Table sorter stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/tablesorter.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/tablesorter.css\" media=\"screen\" />\r\n");
      out.write("        \r\n");
      out.write("        <!-- Thickbox stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/thickbox.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/thickbox.css\" media=\"screen\" />\r\n");
      out.write("        \r\n");
      out.write("        <!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/theme-blue.css\" media=\"screen\" />\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-red.css\" media=\"screen\" />-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-yellow.css\" media=\"screen\" />-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-green.css\" media=\"screen\" />-->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-graphite.css\" media=\"screen\" />-->\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- JQuery engine script-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- JQuery WYSIWYG plugin script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.wysiwyg.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.wysiwyg.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JQuery tablesorter plugin script-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.tablesorter.min.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- JQuery pager plugin script for tablesorter tables -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.tablesorter.pager.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.pager.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- JQuery password strength plugin script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.pstrength-min.1.2.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- JQuery thickbox plugin script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/thickbox.js\" tppabs=\"http://www.xooom.pl/work/magicadmin/js/thickbox.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JQuery thickbox plugin script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.masked-input-plugin.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Initiate WYIWYG text area -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t$('#wysiwyg').wysiwyg(\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tcontrols : {\r\n");
      out.write("\t\t\tseparator01 : { visible : true },\r\n");
      out.write("\t\t\tseparator03 : { visible : true },\r\n");
      out.write("\t\t\tseparator04 : { visible : true },\r\n");
      out.write("\t\t\tseparator00 : { visible : true },\r\n");
      out.write("\t\t\tseparator07 : { visible : false },\r\n");
      out.write("\t\t\tseparator02 : { visible : false },\r\n");
      out.write("\t\t\tseparator08 : { visible : false },\r\n");
      out.write("\t\t\tinsertOrderedList : { visible : true },\r\n");
      out.write("\t\t\tinsertUnorderedList : { visible : true },\r\n");
      out.write("\t\t\tundo: { visible : true },\r\n");
      out.write("\t\t\tredo: { visible : true },\r\n");
      out.write("\t\t\tjustifyLeft: { visible : true },\r\n");
      out.write("\t\t\tjustifyCenter: { visible : true },\r\n");
      out.write("\t\t\tjustifyRight: { visible : true },\r\n");
      out.write("\t\t\tjustifyFull: { visible : true },\r\n");
      out.write("\t\t\tsubscript: { visible : true },\r\n");
      out.write("\t\t\tsuperscript: { visible : true },\r\n");
      out.write("\t\t\tunderline: { visible : true },\r\n");
      out.write("            increaseFontSize : { visible : false },\r\n");
      out.write("            decreaseFontSize : { visible : false }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t} );\r\n");
      out.write("\t\t\t});\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Initiate tablesorter script -->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function() { \r\n");
      out.write("\t\t\t\t$(\"#myTable\") \r\n");
      out.write("\t\t\t\t.tablesorter({\r\n");
      out.write("\t\t\t\t\t// zebra coloring\r\n");
      out.write("\t\t\t\t\twidgets: ['zebra'],\r\n");
      out.write("\t\t\t\t\t// pass the headers argument and assing a object \r\n");
      out.write("\t\t\t\t\theaders: { \r\n");
      out.write("\t\t\t\t\t\t// assign the sixth column (we start counting zero) \r\n");
      out.write("\t\t\t\t\t\t6: { \r\n");
      out.write("\t\t\t\t\t\t\t// disable it by setting the property sorter to false \r\n");
      out.write("\t\t\t\t\t\t\tsorter: false \r\n");
      out.write("\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}) \r\n");
      out.write("\t\t\t.tablesorterPager({container: $(\"#pager\")}); \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t</script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Initiate password strength script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t$('.password').pstrength();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("        </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("    \t<!-- Header -->\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <!-- Header. Status part -->\r\n");
      out.write("            <div id=\"header-status\">\r\n");
      out.write("                <div class=\"container_12\">\r\n");
      out.write("                    <div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"grid_4\">\r\n");
      out.write("                        <a href=\"\" id=\"logout\">\r\n");
      out.write("                        Logout\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div> <!-- End #header-status -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- Header. Main part -->\r\n");
      out.write("            <div id=\"header-main\">\r\n");
      out.write("                <div class=\"container_12\">\r\n");
      out.write("                    <div class=\"grid_12\">\r\n");
      out.write("                        <div id=\"logo\">\r\n");
      out.write("                        \t<div id=\"logo_top\">\r\n");
      out.write("                                <ul id=\"nav\">\r\n");
      out.write("                                    <li id=\"current\"><a href=\"\">Painel de Controle</a></li>\r\n");
      out.write("                                    <li><a href=\"\">Outro</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"logo_bottom\"></div>\r\n");
      out.write("                        </div><!-- End. #Logo -->\r\n");
      out.write("                    </div><!-- End. .grid_12-->\r\n");
      out.write("                    <div style=\"clear: both;\"></div>\r\n");
      out.write("                </div><!-- End. .container_12 -->\r\n");
      out.write("            </div> <!-- End #header-main -->\r\n");
      out.write("            <div style=\"clear: both;\"></div>\r\n");
      out.write("            <!-- Sub navigation -->\r\n");
      out.write("            <div id=\"subnav\">\r\n");
      out.write("                <div class=\"container_12\">\r\n");
      out.write("                    <div class=\"grid_12\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Alunos</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Professores</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Secret&aacute;ria</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Modadidades</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Turmas</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        \r\n");
      out.write("                    </div><!-- End. .grid_12-->\r\n");
      out.write("                </div><!-- End. .container_12 -->\r\n");
      out.write("                <div style=\"clear: both;\"></div>\r\n");
      out.write("            </div> <!-- End #subnav -->\r\n");
      out.write("        </div> <!-- End #header -->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
