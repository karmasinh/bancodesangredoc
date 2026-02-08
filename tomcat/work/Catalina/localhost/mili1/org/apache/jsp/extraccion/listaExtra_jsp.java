package org.apache.jsp.extraccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaExtra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>extraccion</title>\n");
      out.write("\n");
      out.write("   <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write("\n");
      out.write("  <script src='validaciones.js'></script>\n");
      out.write("  <script src='listaExtra1.js'></script>\n");
      out.write("  <script src='lista_validar.js'></script>\n");
      out.write("  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>\n");
      out.write("  <script src='/mili1/dwr/engine.js'></script>\n");
      out.write("  <script src='/mili1/dwr/util.js'></script>\n");
      out.write("  <SCRIPT language='JavaScript' src=\"../scripts/overlib_mini.js\"></SCRIPT>\n");
      out.write("  <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("<body onload='Listar();' >  \n");
      out.write("\n");
      out.write("    <input  id=\"id_horario\" type=\"hidden\">\n");
      out.write("    <input  id=\"cod_per\" type=\"hidden\">\n");
      out.write("\n");
      out.write("<table class='tabla'  id='extra1' style='display'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Lista de Donantes</h3>\n");
      out.write("</caption>\n");
      out.write("\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("\n");
      out.write("<th>Nro</th>\r\n");
      out.write("<th>Codigo</th>\r\n");
      out.write("<th>A.Paterno</th>\r\n");
      out.write("<th>A.Materno</th>\n");
      out.write("<th>Nombre</th>\r\n");
      out.write("<th>Resultado-Pre</th>\n");
      out.write("<th>Extraccion</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='campos' align='center'>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<div id='extra' style='display:none'>\n");
      out.write("<table class='tabla'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Registrar  Extraccion</h3>\n");
      out.write("</caption>\n");
      out.write("\n");
      out.write("<input type=\"hidden\" id='id_aten'>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("\n");
      out.write("<TH align=\"right\">Nro de Extraccion::.</TH>\n");
      out.write("<td><span id='total'></span></td>\n");
      out.write("<TH align=\"right\">Codigo de Donante::.</TH>\n");
      out.write("<td><span id='codigo'></span></td>\n");
      out.write("</TR>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("   <TH align=\"right\">Fecha Extraccion::.</TH>\n");
      out.write("   <TD> <FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>\n");
      out.write("    <span id='overDiv' style=\"Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute\"></span>\n");
      out.write("    <input name='fecha_a' id='fecha_extra' readonly='true' size='15'>\n");
      out.write("    <A onmouseout=\"window.status=''; nd(); return true;\" href=\"javascript:show_calendar('caja.fecha_extra');\"><IMG src=\"../imagenes/caldrbtn.gif\"  border=0></A>\n");
      out.write("    </FORM> </TD>\n");
      out.write("    <TH align=\"right\">Hora::.</TH>\n");
      out.write("    <td><span  id='hora' ></span><input type='HIDDEN' id='hora'></td>\n");
      out.write("</TR>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<tr class='trFilas'>  \n");
      out.write("          <TD align=\"right\">Bolsa:</TD>\n");
      out.write("          <TD> <select  id='bolsa' onblur='validarCombos1();' onChange='cantidadExtraida();'>\n");
      out.write("          <option value=\"-1\">---Seleccione---</option>\n");
      out.write("          <option value=\"Simples\">Simples</option>\n");
      out.write("          <option value=\"Dobles\">Dobles</option>\n");
      out.write("          <option value=\"Triples\">Triples</option>\n");
      out.write("          <option value=\"Cuadruples\">Cuadruples</option>\n");
      out.write("          <option value=\"Quintuples\">Quintuples</option>\n");
      out.write("       </select>\n");
      out.write("       <span id='EmComb'></span></TD>\n");
      out.write("\n");
      out.write("    <TD align=\"right\">Cantidad Extraida:</TD>\n");
      out.write("    <TD><input type='text' id='cant_extra'  readonly='true' size='10'>  </TD> \n");
      out.write("    <span id='Emcan'></span></TD>\n");
      out.write("</TR>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>  \n");
      out.write("    <TD align=\"right\">Tubuladora:</TD>\n");
      out.write("    <TD><INPUT  id='tubuladora'  onblur='validarCadena();' maxLength=9 size='18'>\n");
      out.write("\t<span id='Emtubu'></span></TD>\n");
      out.write("    <TD></TD>\n");
      out.write("    <TD></TD>\n");
      out.write("</TR>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<table class='tabla'>\n");
      out.write("<TR>\n");
      out.write("<td colspan=\"3\" align='center'><div id='agregar'></div></td>\n");
      out.write("<td  align='center'> <input type='image' src='../imagenes/cancelar1.png' onclick='Cancelar();'></td>\n");
      out.write("</TR>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<table class='tabla'  id='extra2' style='display:none'>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<td>\n");
      out.write("<td align='center'><font color=\"blue\" size='3'>Datos Insertados Correctamente.............!</font></td>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
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
