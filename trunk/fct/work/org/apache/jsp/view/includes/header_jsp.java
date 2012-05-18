package org.apache.jsp.view.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>.:: FCT - Fl&aacute;vio Carvalho Team ::.</title>\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Reset -->\r\n");
      out.write("<!--\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/reset.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("  -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/reset.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\t\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/modal.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- Fluid 960 Grid System - CSS framework -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/grid.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- IE Hacks for the Fluid 960 Grid System -->\r\n");
      out.write("<!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/ie6.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie6.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("<!--[if IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/ie.css\" tppabs=\"http://www.xooom.pl/work/magicadmin/css/ie.css\" media=\"screen\" /><![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Main stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/styles.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/styles.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- WYSIWYG editor stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/jquery.wysiwyg.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/jquery.wysiwyg.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Table sorter stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/tablesorter.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/tablesorter.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Thickbox stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/thickbox.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/thickbox.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/theme.css\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/css/theme-blue.css\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/theme-red.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/theme-yellow.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/theme-green.css\" media=\"screen\" />-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/css/theme-graphite.css\" media=\"screen\" />-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery datepicked-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import \"css/jquery.datepick.css\";\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.datepick.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery engine script-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery-1.3.2.min.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery WYSIWYG plugin script -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery.wysiwyg.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.wysiwyg.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery tablesorter plugin script-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery.tablesorter.min.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery pager plugin script for tablesorter tables -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery.tablesorter.pager.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.pager.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery password strength plugin script -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery.pstrength-min.1.2.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery thickbox plugin script -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/thickbox.js\"\r\n");
      out.write("\ttppabs=\"http://www.xooom.pl/work/magicadmin/js/thickbox.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JQuery thickbox plugin script -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/js/jquery.masked-input-plugin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Initiate WYIWYG text area -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#wysiwyg').wysiwyg({\r\n");
      out.write("\t\t\tcontrols : {\r\n");
      out.write("\t\t\t\tseparator01 : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator03 : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator04 : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator00 : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator07 : {\r\n");
      out.write("\t\t\t\t\tvisible : false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator02 : {\r\n");
      out.write("\t\t\t\t\tvisible : false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tseparator08 : {\r\n");
      out.write("\t\t\t\t\tvisible : false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tinsertOrderedList : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tinsertUnorderedList : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tundo : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tredo : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tjustifyLeft : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tjustifyCenter : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tjustifyRight : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tjustifyFull : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsubscript : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuperscript : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tunderline : {\r\n");
      out.write("\t\t\t\t\tvisible : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tincreaseFontSize : {\r\n");
      out.write("\t\t\t\t\tvisible : false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdecreaseFontSize : {\r\n");
      out.write("\t\t\t\t\tvisible : false\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- Initiate tablesorter script -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#myTable\").tablesorter({\r\n");
      out.write("\t\t\t// zebra coloring\r\n");
      out.write("\t\t\twidgets : [ 'zebra' ],\r\n");
      out.write("\t\t\t// pass the headers argument and assing a object \r\n");
      out.write("\t\t\theaders : {\r\n");
      out.write("\t\t\t\t// assign the sixth column (we start counting zero) \r\n");
      out.write("\t\t\t\t8 : {\r\n");
      out.write("\t\t\t\t\t// disable it by setting the property sorter to false \r\n");
      out.write("\t\t\t\t\tsorter : false\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).tablesorterPager({\r\n");
      out.write("\t\t\tcontainer : $(\"#pager\")\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- Initiate modal script -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\t\r\n");
      out.write("\r\n");
      out.write("\t$('a[name=modal]').click(function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar id = $(this).attr('href');\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar maskHeight = $(document).height();\r\n");
      out.write("\t\tvar maskWidth = $(window).width();\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#mask').css({'width':maskWidth,'height':maskHeight});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#mask').fadeIn(1000);\t\r\n");
      out.write("\t\t$('#mask').fadeTo(\"slow\",0.8);\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t//Get the window height and width\r\n");
      out.write("\t\tvar winH = $(window).height();\r\n");
      out.write("\t\tvar winW = $(window).width();\r\n");
      out.write("              \r\n");
      out.write("\t\t$(id).css('top',  winH/2-$(id).height()/2);\r\n");
      out.write("\t\t$(id).css('left', winW/2-$(id).width()/2);\r\n");
      out.write("\t\r\n");
      out.write("\t\t$(id).fadeIn(2000); \r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$('.window .close').click(function (e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#mask').hide();\r\n");
      out.write("\t\t$('.window').hide();\r\n");
      out.write("\t});\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#mask').click(function () {\r\n");
      out.write("\t\t$(this).hide();\r\n");
      out.write("\t\t$('.window').hide();\r\n");
      out.write("\t});\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- Initiate password strength script -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('.password').pstrength();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Header -->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<!-- Header. Status part -->\r\n");
      out.write("\t\t<div id=\"header-status\">\r\n");
      out.write("\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_8\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/admin/principal/logout.do\"\r\n");
      out.write("\t\t\t\t\t\tid=\"logout\">");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acesso.pessoa.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write(' ');
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"mudaLingua.do?lingua=en&page=other\"><img\r\n");
      out.write("\t\t\t\t\t\tclass=\"bandeira\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/en_us.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"English\" /></a> <a href=\"mudaLingua.do?lingua=pt&page=other\"><img\r\n");
      out.write("\t\t\t\t\t\tclass=\"bandeira\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/pt_br.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"Português\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End #header-status -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header. Main part -->\r\n");
      out.write("\t\t<div id=\"header-main\">\r\n");
      out.write("\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo_top\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li id=\"current\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/admin/principal/index.jsp\">Painel de Controle</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Outro</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo_bottom\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End. #Logo -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- End. .grid_12-->\r\n");
      out.write("\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End. .container_12 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End #header-main -->\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t<!-- Sub navigation -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"subnav\">\r\n");
      out.write("\t\t\t<div class=\"container_12\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Alunos</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Professores</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Secret&aacute;ria</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Modalidades</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Turmas</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- End. .grid_12-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End. .container_12 -->\r\n");
      out.write("\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End #subnav -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End #header -->");
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

  private boolean _jspx_meth_fmt_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(null);
    // /view/includes/header.jsp(267,18) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("bemvindo");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent(null);
    // /view/includes/header.jsp(268,42) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("sair");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }
}
