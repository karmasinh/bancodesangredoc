package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class izquierdaAnalisis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/taglibs.jsp");
    _jspx_dependants.add("/common/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_menu_useMenuDisplayer_name_config_bundle;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_menu_displayMenu_name_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_menu_useMenuDisplayer_name_config_bundle = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_menu_displayMenu_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_menu_useMenuDisplayer_name_config_bundle.release();
    _jspx_tagPool_menu_displayMenu_name_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write("</head>\n");
      out.write("<body >");
      out.write('\n');
      if (_jspx_meth_menu_useMenuDisplayer_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_menu_useMenuDisplayer_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:useMenuDisplayer
    net.sf.navigator.taglib.UseMenuDisplayerTag _jspx_th_menu_useMenuDisplayer_0 = (net.sf.navigator.taglib.UseMenuDisplayerTag) _jspx_tagPool_menu_useMenuDisplayer_name_config_bundle.get(net.sf.navigator.taglib.UseMenuDisplayerTag.class);
    _jspx_th_menu_useMenuDisplayer_0.setPageContext(_jspx_page_context);
    _jspx_th_menu_useMenuDisplayer_0.setParent(null);
    _jspx_th_menu_useMenuDisplayer_0.setName("DropDown");
    _jspx_th_menu_useMenuDisplayer_0.setConfig("AppDisplayerStrings");
    _jspx_th_menu_useMenuDisplayer_0.setBundle("org.apache.struts.action.MESSAGE");
    int _jspx_eval_menu_useMenuDisplayer_0 = _jspx_th_menu_useMenuDisplayer_0.doStartTag();
    if (_jspx_eval_menu_useMenuDisplayer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t    \n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_0(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\t    \n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_1(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_2(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_3(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_4(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\t    \n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_5(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    ");
        if (_jspx_meth_menu_displayMenu_6(_jspx_th_menu_useMenuDisplayer_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    \n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_menu_useMenuDisplayer_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_menu_useMenuDisplayer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_useMenuDisplayer_name_config_bundle.reuse(_jspx_th_menu_useMenuDisplayer_0);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_0(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_0 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_0.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_0.setName("areaPredonacion");
    int _jspx_eval_menu_displayMenu_0 = _jspx_th_menu_displayMenu_0.doStartTag();
    if (_jspx_th_menu_displayMenu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_0);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_1(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_1 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_1.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_1.setName("areaExtraccion");
    int _jspx_eval_menu_displayMenu_1 = _jspx_th_menu_displayMenu_1.doStartTag();
    if (_jspx_th_menu_displayMenu_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_1);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_2(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_2 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_2.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_2.setName("areaAnalisis");
    int _jspx_eval_menu_displayMenu_2 = _jspx_th_menu_displayMenu_2.doStartTag();
    if (_jspx_th_menu_displayMenu_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_2);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_3(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_3 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_3.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_3.setName("areaAnalisi");
    int _jspx_eval_menu_displayMenu_3 = _jspx_th_menu_displayMenu_3.doStartTag();
    if (_jspx_th_menu_displayMenu_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_3);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_4(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_4 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_4.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_4.setName("areaMili");
    int _jspx_eval_menu_displayMenu_4 = _jspx_th_menu_displayMenu_4.doStartTag();
    if (_jspx_th_menu_displayMenu_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_4);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_5(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_5 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_5.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_5.setName("areaControlSangre");
    int _jspx_eval_menu_displayMenu_5 = _jspx_th_menu_displayMenu_5.doStartTag();
    if (_jspx_th_menu_displayMenu_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_5);
    return false;
  }

  private boolean _jspx_meth_menu_displayMenu_6(javax.servlet.jsp.tagext.JspTag _jspx_th_menu_useMenuDisplayer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:displayMenu
    net.sf.navigator.taglib.DisplayMenuTag _jspx_th_menu_displayMenu_6 = (net.sf.navigator.taglib.DisplayMenuTag) _jspx_tagPool_menu_displayMenu_name_nobody.get(net.sf.navigator.taglib.DisplayMenuTag.class);
    _jspx_th_menu_displayMenu_6.setPageContext(_jspx_page_context);
    _jspx_th_menu_displayMenu_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_menu_useMenuDisplayer_0);
    _jspx_th_menu_displayMenu_6.setName("areaPrueba");
    int _jspx_eval_menu_displayMenu_6 = _jspx_th_menu_displayMenu_6.doStartTag();
    if (_jspx_th_menu_displayMenu_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_menu_displayMenu_name_nobody.reuse(_jspx_th_menu_displayMenu_6);
    return false;
  }
}
