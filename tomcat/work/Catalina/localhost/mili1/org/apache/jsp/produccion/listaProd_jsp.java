package org.apache.jsp.produccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaProd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Fraccionamiento</title>\n");
      out.write("\n");
      out.write("   <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write("\n");
      out.write("   <script src='validaciones.js'></script>\n");
      out.write("   <script src='listaProd.js'></script>\n");
      out.write("\n");
      out.write("  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>\n");
      out.write("   <SCRIPT language='JavaScript' src=\"../scripts/overlib_mini.js\"></SCRIPT>\n");
      out.write("   <SCRIPT language='JavaScript' src=\"../scripts/overlib_mini1.js\"></SCRIPT>\n");
      out.write("  <script src='/mili1/dwr/engine.js'></script>\n");
      out.write("  <script src='/mili1/dwr/util.js'></script>\n");
      out.write("  <script>\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("<body onload='Listar();' >  \n");
      out.write("\n");
      out.write("    <input  id=\"id_horario\" type=\"text\">\n");
      out.write("    <input  id=\"cod_per\" type=\"text\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla'  id='extra1' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Lista de extracciones a fraccionar</h3>\n");
      out.write("</caption>\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th>Nro Atencion</th>\n");
      out.write("<th>Nro Extraccion</th>\n");
      out.write("<th>Codigo de Donante</th>\n");
      out.write("<th>Fecha Extraccion</th>\n");
      out.write("<th>Bolsa</th>\n");
      out.write("<th>Fraccionar</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='campos' align='center'>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type='hidden' id='id_aten'>\n");
      out.write("<input type='hidden' id='id_ext'>\n");
      out.write("<input type='hidden' id='cod_do'>\n");
      out.write("<input type='hidden' id='resultado'>\n");
      out.write("<input type='hidden' id='bolsa'>\n");
      out.write("<input type='hidden' id='n1'>\n");
      out.write("\n");
      out.write("<table class='tabla'  id='extra2' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Registrar Fraccionamiento</h3>\n");
      out.write("</caption>\n");
      out.write("\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th>Nro extraccion</th>\r\n");
      out.write("<th>Codigo de Donante</th>\r\n");
      out.write("<th>Grupo Sanguineo</th>\r\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='campos1' align='center'>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla' align='center'  id='extra3' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Registrar Fraccionamiento</h3>\n");
      out.write("</caption>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<td align=\"right\"><h5></h5>Codigo:</td><td><span id='cod_do1'></span></td>\n");
      out.write("<td align=\"right\"><h5></h5>Bolsa:</td><td><span id='bolsa1'></span></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<input type='hidden' id='i'>\n");
      out.write("<td align=\"right\">Hemocomponente:</td>\n");
      out.write("<td><select id='n0' size='5'  style='display:none' onBlur='validarCombo(n0);' ></select> </td>\n");
      out.write("\n");
      out.write("<td align=\"right\">Cantidad:</td>\n");
      out.write("<td><input type='text' id='cantidad' size='6' maxLength='3'  onBlur='validarNum();'> ml \n");
      out.write("<span id='EmCant'></span>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<TD align=\"right\">Fecha de Produccion:</TD>\n");
      out.write("\n");
      out.write("<td><FORM name='caja'  method='post' >\n");
      out.write("    <span id='overDiv' style=\"Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute\"></span>\n");
      out.write("    <input  id='fecha_produccion' readonly='true' size='15'    onBlur='validarFechae21();'>\n");
      out.write("    <A onmouseout=\"window.status=''; nd(); return true;\" href=\"javascript:show_calendar('caja.fecha_produccion');\"><IMG src=\"../imagenes/caldrbtn.gif\"  border=0></A>\n");
      out.write("    </FORM>\n");
      out.write("<span id='EmFechae1'></span>\n");
      out.write("</td>\n");
      out.write("<td align=\"right\">Fecha Expiracion:</td>\n");
      out.write("<td><FORM name='caja1'  method='post'>\n");
      out.write("    <span id='overDiv1' style=\"Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute\"></span>\n");
      out.write("    <input name='fecha_expi' id='fecha_expi' readonly='true' size='15'    onBlur='validarFechae2();'>\n");
      out.write("    <A onmouseout=\"window.status=''; nd(); return true;\" href=\"javascript:show_calendar('caja1.fecha_expi');\"><IMG src=\"../imagenes/caldrbtn.gif\"  border=0></A>\n");
      out.write("    </FORM>\n");
      out.write("<span id='EmFechae'></span>\n");
      out.write("</td>\n");
      out.write("<td></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class='trFilas'>\n");
      out.write("\n");
      out.write("<td colspan=\"3\" align=\"center\"><div id='mili'></div></td>\n");
      out.write("<td colspan=\"3\" align=\"center\"></td>\n");
      out.write("<!-- \n");
      out.write("<input type='submit' value='Aceptar' onclick='insertarValor();'></TD>     \n");
      out.write("<TD> <input type='submit' value='Finalizar' onclick='updateTT();'></TD>     \n");
      out.write("-->\n");
      out.write("<TD></TD>     \n");
      out.write("<TD></TD>     \n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class='tabla'  id='prod11' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Lista de hemocomponentes ya Fraccionados</h3>\n");
      out.write("</caption>\n");
      out.write("\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th>Hemocomponente</th>\n");
      out.write("<th>Cantidad</th>\n");
      out.write("<th>Fecha-Producción</th>\n");
      out.write("<th>Fecha-Expiración</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody id='campos233' align='center'>\n");
      out.write("</tbody>\n");
      out.write("<td colspan=\"3\" align=\"center\"><div id='volver'></div></td>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla'  id='prod22' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<font color=\"blue\" size='3'>Datos Insertados Correctamente.............!</font>\n");
      out.write("</caption>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class='tabla'  id='EstaMal' style='display:none'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<font color=\"blue\" size='3'>La Cantidad es Incorrecta.............!</font>\n");
      out.write("<pre>\n");
      out.write("<center><input type='image' src='../imagenes/atras.png' onclick='Denuevo();'></center>\n");
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
