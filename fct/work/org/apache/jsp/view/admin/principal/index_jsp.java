package org.apache.jsp.view.admin.principal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("<!-- Dashboard icons -->\r\n");
      out.write("\t\t<div class=\"container_12\">\r\n");
      out.write("            <div class=\"grid_7\">\r\n");
      out.write("            \t<a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_write.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_write.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>New article</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_file.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_file.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>Upload file</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_files.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_files.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>Articles</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_calendar.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_calendar.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>Calendar</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_user.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_user.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>My profile</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_stats.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_stats.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>Stats</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"\" class=\"dashboard-module\">\r\n");
      out.write("                \t<img src=\"../../images/Crystal_Clear_settings.gif\" tppabs=\"http://www.xooom.pl/work/magicadmin/../../images/Crystal_Clear_settings.gif\" width=\"64\" height=\"64\" alt=\"edit\" />\r\n");
      out.write("                \t<span>Settings</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div style=\"clear: both\"></div>\r\n");
      out.write("            </div> <!-- End .grid_7 -->\r\n");
      out.write("            <!-- Account overview -->\r\n");
      out.write("            <div class=\"grid_5\">\r\n");
      out.write("                <div class=\"module\">\r\n");
      out.write("                        <h2><span>Account overview</span></h2>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"module-body\">\r\n");
      out.write("                        \r\n");
      out.write("                        \t<p>\r\n");
      out.write("                                <strong>User: </strong>User X<br />\r\n");
      out.write("                                <strong>Your last visit was on: </strong>20 January 2010,<br />\r\n");
      out.write("                                <strong>From IP: </strong>000.000.00.00\r\n");
      out.write("                            </p>\r\n");
      out.write("                        \r\n");
      out.write("                             <div>\r\n");
      out.write("                                 <div class=\"indicator\">\r\n");
      out.write("                                     <div style=\"width: 23%;\"></div><!-- change the width value (23%) to dynamically control your indicator -->\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                 <p>Your storage space: 23 MB out of 100MB</p>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                             <div>\r\n");
      out.write("                                 <div class=\"indicator\">\r\n");
      out.write("                                     <div style=\"width: 100%;\"></div><!-- change the width value (100%) to dynamically control your indicator -->\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                 <p>Your bandwidth (January): 1 GB out of 1 GB</p>\r\n");
      out.write("                             </div>\r\n");
      out.write("                             \r\n");
      out.write("                        \t<p>\r\n");
      out.write("                                Need to switch to a bigger plan?<br />\r\n");
      out.write("                                <a href=\"\">click here</a><br />\r\n");
      out.write("                            </p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("            </div> <!-- End .grid_5 -->\r\n");
      out.write("            <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div> <!-- End .container_12 -->\r\n");
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
    // /view/admin/principal/index.jsp(5,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /view/admin/principal/index.jsp(83,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
