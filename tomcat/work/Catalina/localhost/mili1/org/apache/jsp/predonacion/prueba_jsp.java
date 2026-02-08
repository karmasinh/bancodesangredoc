package org.apache.jsp.predonacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>predonacion</title>\n");
      out.write("\n");
      out.write("   <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write("  \n");
      out.write("  <script src='pruebaba.js'></script>\n");
      out.write("  <script src='validaciones.js'></script>\n");
      out.write("  \n");
      out.write("  <SCRIPT language='JavaScript' src=\"../scripts/overlib_mini.js\"></SCRIPT>\n");
      out.write("  <script src='/mili1/dwr/interface/ListaPreDAO.js'></script>\n");
      out.write("  <script src='/mili1/dwr/engine.js'></script>\n");
      out.write("  <script src='/mili1/dwr/util.js'></script>\n");
      out.write("\n");
      out.write("<body onload='Listar();' >  \n");
      out.write("\n");
      out.write("<div style='display:none' id='lista'>\n");
      out.write("\n");
      out.write("    <input  id=\"id_horario\" type=\"hidden\">\n");
      out.write("    <input  id=\"cod_per\" type=\"hidden\">\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Lista de Donantes</h3>\n");
      out.write("</caption>\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th >Nro</th>\n");
      out.write("<th >Codigo</th>\n");
      out.write("<th >Ape.Paterno</th>\n");
      out.write("<th >Ape.Materno</th>\n");
      out.write("<th >Nombre</th>\n");
      out.write("<th >Resultado-1</th>\n");
      out.write("<th >Pre-Donacion</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='campos' align='center'>\n");
      out.write("</tbody>\n");
      out.write("\n");
      out.write("<input type='hidden' id='a'>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style='display:none' id='lista1'>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Registrar Pre-donación</h3>\n");
      out.write("</caption>\n");
      out.write("</table class='tabla'>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th align=\"right\">Donante::.</th>\n");
      out.write("<td><span id='nom'> </span>-<span id='apepa'> </span>-<span id='apema'> </span>\n");
      out.write("</td>\n");
      out.write("<th align=\"right\">Codigo::.</td>\n");
      out.write("<td><span id='codigo_donante'></span></td>\n");
      out.write("</tr>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th align=\"right\">Fecha::.</th>\n");
      out.write("<td>\n");
      out.write("<FORM name='caja'  method='post'>\n");
      out.write("<span id='overDiv' style=\"Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute\"></span>\n");
      out.write("<input  id='fecha_prueba' readonly='true' size='15'>\n");
      out.write("<A onmouseout=\"window.status=''; nd(); return true;\" href=\"javascript:show_calendar('caja.fecha_prueba');\"><IMG src=\"../imagenes/caldrbtn.gif\"  border=0></A>\n");
      out.write("</FORM>\n");
      out.write("<span id='EmFechae'></span>\n");
      out.write("</td>\n");
      out.write("<th align=\"right\">Hora::.</th>\n");
      out.write("<td><span  id='hora_prueba' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th>Nro</th>\n");
      out.write("<th>prueba</th>\n");
      out.write("<th>tipo</th>\n");
      out.write("<th>Resultado</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='camposp' align='center'>\n");
      out.write("<th><span id='EmV'></span></th>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<input type='hidden' id='id_aten'>\n");
      out.write("<input type='hidden' id='cod_do'>\n");
      out.write("<input type='hidden' id='id_pruebaF'>\n");
      out.write("<input type='hidden' id='resultado'>\n");
      out.write("<input type='hidden' id='d'>\n");
      out.write("<input type='hidden' id='bb'>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<td colspan=\"3\"  align=\"center\"><div id='mili'></div></td>\n");
      out.write("<td   align=\"center\"><div id='agregar'></div></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla' style='display:none' id='Fin'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<font color=\"blue\" size='3'>Datos Insertados Correctamente.............!</font>\n");
      out.write("</caption>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
