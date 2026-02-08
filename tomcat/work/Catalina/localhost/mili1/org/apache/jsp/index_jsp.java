package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write(" <Script src=\"t.js\">  </script>\n");
      out.write("\n");
      out.write(" <script src='/mili1/dwr/interface/ListaPreDAO.js'></script>\n");
      out.write(" <SCRIPT language='JavaScript' src=\"registro_datos/nuevo44.js\"></SCRIPT>\n");
      out.write(" <script src='/mili1/dwr/engine.js'></script>\n");
      out.write("  <script src='/mili1/dwr/util.js'></script>\n");
      out.write("</head>\n");
      out.write("  <body onload='Primero();'>\n");
      out.write("  <div id='uno' style='display'>\n");
      out.write("  <!--\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='quienes_somos.jsp' target='derecha'>Quienes Somos</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("-->\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='mision.jsp' target='derecha'>Misión y Visión</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='sbanco.jsp' target='derecha'>Que es un Banco de Sangre</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='requisitos.jsp' target='derecha'>Requisitos del Donador</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='sangre.jsp' target='derecha'>Que es la Sangre</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='sdir.jsp' target='derecha'>Nuestra Dirección</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td><a href='quienes_somos.jsp' target='derecha'>Galeria de fotos</a></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr align='center'><td><img src=\"./imagenes/sangresegura.jpg\" align=\"center\" width=\"50%\"></td></tr>\n");
      out.write("  <tr><td><img src=\"./imagenes/unidad.gif\" align=\"center\" width=\"100%\"></td></tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <form>\n");
      out.write("  <table class='tabla'>\n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  <tr><td>Ingrese::.</td> </tr>   \n");
      out.write("  <tr><td>Usuario::.</td><td><input type=\"text\" name=\"usuario\" id=\"usuario\" size='10'></td> </tr>   \n");
      out.write("  <tr><td>Contraseña::.</td><td><input type=\"text\" name=\"contraseña\" id=\"contraseña\" size='10'></td> </tr>   \n");
      out.write(" \n");
      out.write("  <tr><td><input type=\"button\" value=\"aceptar\"  onclick='inicio();' size='5'></td>\n");
      out.write("  <td><input type=\"reset\" value=\"cancelar\" size='5'></td></tr>   \n");
      out.write("\n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  <tr><td></td> </tr>   \n");
      out.write("  </table>\n");
      out.write("    </form>\n");
      out.write("  <span id=\"permitido\" ></span>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div id='dos' style='display:none'>\n");
      out.write("  <table class='tabla'>\n");
      out.write("    <thead>\n");
      out.write("    <tr>\n");
      out.write("    <th ALIGN='LEFT'>Usuario</th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody id='camposApellido' align='center'>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div id='tres' style='display:none'>\n");
      out.write("  <table class='tabla'>\n");
      out.write("\n");
      out.write("    <thead>\n");
      out.write("    <tr>\n");
      out.write("    <th ALIGN='LEFT'>Modulo</th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("\n");
      out.write("    <tbody id='campos'>\n");
      out.write("\n");
      out.write("    <tbody id='camposMenu'>\n");
      out.write("    </tbody>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <table class='tabla' BORDER='0'>\n");
      out.write("        \n");
      out.write("    <tbody id='campos_Todo' align='center'>\n");
      out.write("    </tbody>\n");
      out.write("\n");
      out.write("<input type='TEXT' id='fecha'>\n");
      out.write("<input type='TEXT' id='cod_per'>\n");
      out.write("<input type='TEXT' id='id_horario'>\n");
      out.write("\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </body>\n");
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
