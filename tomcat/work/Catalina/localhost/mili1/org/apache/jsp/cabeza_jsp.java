package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cabeza_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("\t.cabeza {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop:12%;\r\n");
      out.write("\tright: 2%;\r\n");
      out.write("\tz-index:50;\r\n");
      out.write("\t\r\n");
      out.write("}   \n");
      out.write("    </style>  \n");
      out.write("<script>      \n");
      out.write("function dospaginas(){\r\n");
      out.write("parent.izquierdaAnalisis2.location.href=\"index.jsp\"\r\n");
      out.write("parent.derecha.location.href=\"derecha.jsp\"\r\n");
      out.write("document.getElementById(\"desconectar\").style.display=\"none\";\n");
      out.write("}\r\n");
      out.write("</script>      \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<img src=\"./imagenes/titulo.jpg\" align=\"center\" width=\"100%\">\n");
      out.write("\n");
      out.write("<input class=\"cabeza\" id=\"desconectar\" type='image' style=\"display:none\"  src=\"imagenes/desconectarse.png\"  width=\"15%\" onclick=\"dospaginas()\">\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
