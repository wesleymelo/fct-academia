package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>.:: FCT - Fl&aacute;vio Carvalho Team ::.</title>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Reset -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/reset.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/reset.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Fluid 960 Grid System - CSS framework -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/grid.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- IE Hacks for the Fluid 960 Grid System -->\r\n");
      out.write("<!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"ie6.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie6.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("<!--[if IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"ie.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Main stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/styles.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/theme-blue.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-red.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-yellow.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-green.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/theme-graphite.css\" media=\"screen\" />-->\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery engine script-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery password strength plugin script -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.pstrength-min.1.2.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery thickbox plugin script -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/thickbox.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/thickbox.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery thickbox plugin script -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.masked-input-plugin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End #header -->\r\n");
      out.write("\t<!-- Dashboard icons -->\r\n");
      out.write("\t<div class=\"container_login\">\r\n");
      out.write("\t\t<!-- Password -->\r\n");
      out.write("\t\t<div class=\"grid_login\">\r\n");
      out.write("\t\t\t<div class=\"module\">\r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t<span><center>Realize seu Login</center></span>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"module-body\">\r\n");
      out.write("\t\t\t\t\t<form action=\"autenticaLogin.do\" \" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label>CPF:</label> <input class=\"input-short\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"cpf\" id=\"cpf\" size=\"15\" maxlength=\"14\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"notification-input ni-correct\">This is correct,\r\n");
      out.write("\t\t\t\t\t\t\t\tthanks!</span>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("\t\t       \t\t\t\t\t\t\t$(\"#cpf\").mask(\"999.999.999-99\");\r\n");
      out.write("\t\t       \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label>Senha:</label> <input class=\"input-short\" type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"senha\" id=\"senha\" /> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"notification-input ni-error\">Sorry, try again.</span>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"submit-green\" type=\"submit\" value=\"Entrar\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"submit-gray\" type=\"reset\" value=\"Limpar\" />\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- End .module-body -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End .module -->\r\n");
      out.write("\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End .grid_6 -->\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End .container_12 -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
