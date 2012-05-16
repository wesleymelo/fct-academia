package org.apache.jsp.view.admin.professor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaProfessores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container_12\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"grid_12\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"bottom-spacing\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t<div class=\"float-right\">\r\n");
      out.write("\t\t\t\t<a href=\"\" class=\"button\"> <span><b><fmt:message key=\"new\" /></b><t\r\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/plus-small.gif\"\r\n");
      out.write("\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/plus-small.gif\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"12\" height=\"9\" alt=\"Novo\" /></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Table records filtering -->\r\n");
      out.write("\t\t\tFilter: <select class=\"input-short\">\r\n");
      out.write("\t\t\t\t<option value=\"1\" selected=\"selected\">Select filter</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">Created last week</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">Created last month</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">Edited last week</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">Edited last month</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Example table -->\r\n");
      out.write("\t\t<div class=\"module\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<span><fmt:message key=\"professores\"/></span>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"module-table-body\">\r\n");
      out.write("\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t<table id=\"myTable\" class=\"tablesorter\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 4%\">#</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 25%\"><fmt:message key=\"nome\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 10%\"><fmt:message key=\"cpf\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 15%\"><fmt:message key=\"telefones\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 25%\"><fmt:message key=\"email\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 08%\"><fmt:message key=\"sexo\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 10%\"><fmt:message key=\"acoes\"/></th>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"pager\" id=\"pager\">\r\n");
      out.write("\t\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"first\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-stop-180.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-stop-180.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"first\" /> <img class=\"prev\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-180.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-180.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"prev\" /> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pagedisplay input-short align-center\" /> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"next\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"next\" /> <img class=\"last\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-stop.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-stop.gif\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"last\" /> <select class=\"pagesize input-short align-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"10\" selected=\"selected\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"30\">30</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"40\">40</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"table-apply\">\r\n");
      out.write("\t\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Apply action to selected:</span> <select\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-medium\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">Select action</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">Publish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\">Unpublish</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"4\">Delete</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"clear: both\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End .module-table-body -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End .module -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"pagination\">\r\n");
      out.write("\t\t\t<a href=\"\" class=\"button\"><span><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-stop-180-small.gif\"\r\n");
      out.write("\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-stop-180-small.gif\"\r\n");
      out.write("\t\t\t\t\theight=\"9\" width=\"12\" alt=\"First\" /> First</span></a> <a href=\"\"\r\n");
      out.write("\t\t\t\tclass=\"button\"><span><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-180-small.gif\"\r\n");
      out.write("\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-180-small.gif\"\r\n");
      out.write("\t\t\t\t\theight=\"9\" width=\"12\" alt=\"Previous\" /> Prev</span></a>\r\n");
      out.write("\t\t\t<div class=\"numbers\">\r\n");
      out.write("\t\t\t\t<span>Page:</span> <a href=\"\">1</a> <span>|</span> <a href=\"\">2</a>\r\n");
      out.write("\t\t\t\t<span>|</span> <span class=\"current\">3</span> <span>|</span> <a\r\n");
      out.write("\t\t\t\t\thref=\"\">4</a> <span>|</span> <a href=\"\">5</a> <span>|</span> <a\r\n");
      out.write("\t\t\t\t\thref=\"\">6</a> <span>|</span> <a href=\"\">7</a> <span>|</span> <span>...</span>\r\n");
      out.write("\t\t\t\t<span>|</span> <a href=\"\">99</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"button\"><span>Next <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-000-small.gif\"\r\n");
      out.write("\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-000-small.gif\"\r\n");
      out.write("\t\t\t\t\theight=\"9\" width=\"12\" alt=\"Next\" /></span></a> <a href=\"\" class=\"button last\"><span>Last\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/view/images/arrow-stop-000-small.gif\"\r\n");
      out.write("\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/arrow-stop-000-small.gif\"\r\n");
      out.write("\t\t\t\t\theight=\"9\" width=\"12\" alt=\"Last\" />\r\n");
      out.write("\t\t\t</span></a>\r\n");
      out.write("\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End .grid_12 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"clear: both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End .container_12 -->\r\n");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /view/admin/professor/listaProfessores.jsp(5,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("../../includes/header.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /view/admin/professor/listaProfessores.jsp(63,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("professor");
    // /view/admin/professor/listaProfessores.jsp(63,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/view/admin/professor/listaProfessores.jsp(63,7) '${professores}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${professores}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td class=\"align-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${professor.idPessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${professor.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${professor.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${professor.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${professor.sexo.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" /> <a href=\"\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/view/images/tick-circle.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/tick-circle.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"16\" height=\"16\" alt=\"published\" /></a> <a href=\"\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/view/images/pencil.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/pencil.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"16\" height=\"16\" alt=\"edit\" /></a> <a href=\"\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/view/images/balloon.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/balloon.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"16\" height=\"16\" alt=\"comments\" /></a> <a href=\"\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/view/images/bin.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ttppabs=\"http://www.xooom.pl/work/magicadmin/images/bin.gif\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"16\" height=\"16\" alt=\"delete\" /></a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /view/admin/professor/listaProfessores.jsp(70,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("telefone");
    // /view/admin/professor/listaProfessores.jsp(70,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/view/admin/professor/listaProfessores.jsp(70,10) '${professor.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${professor.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(')');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f1.setParent(null);
    // /view/admin/professor/listaProfessores.jsp(175,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f1.setUrl("../../includes/footer.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
      if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
    }
    return false;
  }
}
