package org.apache.jsp.view.admin.aluno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroAluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      out.write("<!-- Header. Main part -->\r\n");
      out.write("<div id=\"header-main\">\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<div id=\"logo_top\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"current\"><a href=\"\">Painel de Controle</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Outro</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"logo_bottom\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End. #Logo -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End. .grid_12-->\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End. .container_12 -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End #header-main -->\r\n");
      out.write("<div style=\"clear: both;\"></div>\r\n");
      out.write("<!-- Sub navigation -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"subnav\">\r\n");
      out.write("\t<div class=\"container_12\">\r\n");
      out.write("\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Alunos</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Professores</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Secret&aacute;ria</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Modadidades</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Turmas</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End. .grid_12-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End. .container_12 -->\r\n");
      out.write("\t<div style=\"clear: both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End #subnav -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End #header -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container_12\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Form elements -->\r\n");
      out.write("\t<div class=\"grid_12\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"module\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<span>Cadastro Aluno</span>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"module-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"cadastroAluno.do\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pg\" value=\"1\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>Nome</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-short\" name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"nome\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-correct\">This is\tcorrect, thanks!</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("                        <label>Data de Nascimento</label> \r\n");
      out.write("                        <input type=\"text\" class=\"input-short-short\" name=\"dataNasc\" id=\"dataNasc\"/> \r\n");
      out.write("                        <span class=\"notification-input ni-error\">Sorry, try again.</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("      \t\t\t\t\t\t\t$(\"#dataNasc\").mask(\"99/99/9999\");\r\n");
      out.write("      \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><label>Sexo:&nbsp;&nbsp;&nbsp;<input type=\"radio\" name=\"sexo\"\tchecked=\"checked\" id=\"sexo\" value=\"F\" />&nbsp;&nbsp;Feminino &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"radio\" name=\"sexo\" id=\"sexo\" value=\"M\" />&nbsp;&nbsp;Masculino</label></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<label>CPF</label> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-short-short\" name=\"cpf\" id=\"cpf\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-correct\">This is correct, thanks!</span>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("      \t\t\t\t\t\t\t$(\"#cpf\").mask(\"999.999.999.99\");\r\n");
      out.write("      \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>E-Mail</label> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-short\" name=\"email\" id=\"email\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-correct\">This is correct, thanks!</span>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\t\r\n");
      out.write("\t\t\t\t\t\t<label>Telefone Celular</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-short-short\" name=\"celular\" id=\"celular\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-correct\">This is\tcorrect, thanks!</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("      \t\t\t\t\t\t\t$(\"#celular\").mask(\"(99)9999-9999\");\r\n");
      out.write("      \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>Telefone Residencial</label> <input type=\"text\" class=\"input-short-short\" name=\"residencial\" id=\"residencial\" /> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-error\">Sorry, try again.</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("      \t\t\t\t\t\t\t$(\"#residencial\").mask(\"(99)9999-9999\");\r\n");
      out.write("      \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>Telefone Comercial</label> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"input-short-short\" name=\"comercial\" id=\"comercial\" /> \r\n");
      out.write("\t\t\t\t\t\t<span class=\"notification-input ni-error\">Sorry, try again.</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tjQuery(function($){\r\n");
      out.write("      \t\t\t\t\t\t\t$(\"#comercial\").mask(\"(99)9999-9999\");\r\n");
      out.write("      \t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>Altura</label> <input type=\"text\" class=\"input-short-short\" name=\"altura\" id=\"altura\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<label>Peso</label> <input type=\"text\" class=\"input-short-short\" name=\"peso\" id=\"peso\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"submit-green\" type=\"submit\" value=\"Próximo\" /> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"submit-gray\" type=\"submit\" value=\"Cancelar\" />\r\n");
      out.write("\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End .module-body -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End .module -->\r\n");
      out.write("\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End .grid_12 -->\r\n");
      out.write("\t<div style=\"clear: both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End .container_12 -->\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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
    // /view/admin/aluno/cadastroAluno.jsp(5,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fimport_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f1.setParent(null);
    // /view/admin/aluno/cadastroAluno.jsp(173,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
