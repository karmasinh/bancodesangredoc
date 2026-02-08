package org.apache.jsp.extraccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Resultados</title>\n");
      out.write("   <style type=\"text/css\" media=\"screen\">\n");
      out.write("       @import url( style.css );\n");
      out.write("   </style>  \n");
      out.write("  <script src='validaciones.js'></script>\n");
      out.write("  <script src='modifica.js'></script>\n");
      out.write(" \n");
      out.write("  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>\n");
      out.write("  \n");
      out.write("  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>\n");
      out.write("  <SCRIPT language='JavaScript' src=\"../scripts/overlib_mini.js\"></SCRIPT>\n");
      out.write("  <script src='/mili1/dwr/engine.js'></script>\n");
      out.write("  <script src='/mili1/dwr/util.js'></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload='ListaCod_per();' >  \n");
      out.write("\n");
      out.write("    <input  id=\"id_horario\" type=\"HIDDEN\">\n");
      out.write("    <input  id=\"cod_per\" type=\"HIDDEN\">\n");
      out.write("\n");
      out.write("    <input type='hidden' id='total'>\n");
      out.write("    <input type='hidden' id='nom'>\n");
      out.write("    <input type='hidden' id='apepa'>\n");
      out.write("    <input type='hidden' id='apema'>\n");
      out.write("<!-- inicio busqueda : por ci,cod_do y apepa-->\n");
      out.write("<table class='tabla' style='display' id='busqueda'>\n");
      out.write("    <caption class='trCaption'><h3>Busqueda de Donantes<input type='image' src='../imagenes/progress.gif' ></input></h3></caption>\n");
      out.write("    <tr class='trFilas'>\n");
      out.write("\t<td align=\"right\">Codigo::..</td>\n");
      out.write("\t<td align=\"center\"><input type='text' name='cod_do'  id='cod_do' size='15' maxlength='9'></td>\n");
      out.write("        <td align=\"center\"><span id='EmC'></span></td>         \n");
      out.write("\t<td align=\"left\"><input type='image' src='../imagenes/david.png'  onclick='BusquedaCodigo();'></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr class='trFilas'>\n");
      out.write("\t<td align=\"right\">Nro de CI::..</td>\n");
      out.write("\t<td align=\"center\"><input type='text' name='ci' size='15' maxlength='7'></td>\n");
      out.write("        <td align=\"center\"><span id='EmCi'></span></td>\n");
      out.write("\t<td align=\"left\"><input type='image' src='../imagenes/david.png'  onclick='BusquedaCi();'></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr class='trFilas'>\n");
      out.write("\t<td align=\"right\">Apellido Paterno::..</td>\n");
      out.write("\t<td align=\"center\"><input type='text' name='apepa1' size='15' maxlength='10' id='apepa1'></td>\n");
      out.write("        <td align=\"center\"><span id='EmA'></span></td>    \n");
      out.write("\t<td align=\"left\"><input type='image' src='../imagenes/david.png'  onclick='BusquedaApellido();'></td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<!-- fin busqueda : por ci,cod_do y apepa-->\n");
      out.write("\n");
      out.write("<!/////////INICIO BUSQUEDA POR APELLIDO>\n");
      out.write("<div style='display:none' id='resultado_apellido'>\n");
      out.write("    <table class='tabla' id='hola' >\n");
      out.write("          <caption class='trCaption'><H3>Lista de Donantes</H3></caption>\n");
      out.write("          <BR>\n");
      out.write("          <thead>\n");
      out.write("          <tr class='trFilas'>\n");
      out.write("               <th>Codigo</th>\n");
      out.write("               <th>A.Paterno</th>\n");
      out.write("               <th>A.Materno</th>\n");
      out.write("\t       <th>Nombre</th>\n");
      out.write("\t       <th>Ingresar</th>\n");
      out.write("          </tr>\n");
      out.write("          </thead>\n");
      out.write("\t<tbody id='campos_de_apellido' align='center'></tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("<!/////////FIN DE BUSQUEDA POR APELLIDO>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!/////////modificacion>\n");
      out.write("<div style='display:none' id='modi'>    \n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<caption class='trCaption'>\n");
      out.write("<h3>Modificar Extraccion</h3>\n");
      out.write("</caption>\n");
      out.write("</table class='tabla'>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th align=\"right\">Donante::.</th>\n");
      out.write("<td><span id='nombre'> </span>-<span id='paterno'> </span>-<span id='materno'> </span>\n");
      out.write("</td>\n");
      out.write("<th align=\"right\">Codigo::.</td>\n");
      out.write("<td><span id='codigo_donante'></span></td>\n");
      out.write("</tr>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th align=\"right\">Fecha::.</th>\n");
      out.write("<td>\n");
      out.write("<FORM name='caja'  method='post'>\n");
      out.write("<span id='overDiv' style=\"Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute\"></span>\n");
      out.write("<input  id='fecha_extra' readonly='true' size='15' name='fecha_a'>\n");
      out.write("<A onmouseout=\"window.status=''; nd(); return true;\" href=\"javascript:show_calendar('caja.fecha_extra');\"><IMG src=\"../imagenes/caldrbtn.gif\"  border=0></A>\n");
      out.write("</FORM>\n");
      out.write("<span id='EmFechae'></span>\n");
      out.write("</td>\n");
      out.write("<th align=\"right\">Hora::.</th>\n");
      out.write("<td><span  id='hora_prueba' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type='HIDDEN' id='id_ext'>\n");
      out.write("<input type='hidden' id='cod_do'>\n");
      out.write("<input type='hidden' id='tipo_componente'>\n");
      out.write("<input type='hidden' id='id_pruebaF'>\n");
      out.write("<input type='hidden' id='resultado'>\n");
      out.write("<input type='hidden' id='d'>\n");
      out.write("\n");
      out.write("<table class='tabla'>\n");
      out.write("<thead>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<th>bolsa</th>\n");
      out.write("<th>tubuladora</th>\n");
      out.write("<th>cantidad</th>\n");
      out.write("</tr>\n");
      out.write("<thead>\n");
      out.write("<tbody id='camposp2' align='center'>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("    <table class='tabla'>\n");
      out.write("        <tr class='trFilas'>\n");
      out.write("        <td colspan=\"4\" align=\"center\"><input type='image' src='../imagenes/modificar.png' onclick='InsertarC();'></td>\n");
      out.write("\t<td align=\"center\"><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutar();'></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!/////////prueb a div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!/////////INICIO BUSQUEDA POR APELLIDO>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!/////INICIO BUSQUEDA POR CI Y CODIGO////////////>\n");
      out.write("<div style='display:none' id='resultado_todo'>\n");
      out.write("    <table class='tabla'>\n");
      out.write("        <caption class='trCaption'><h3>Informacion del Donante</h3></caption>\n");
      out.write("        <br>\n");
      out.write("        <thead>\n");
      out.write("        <tr class='trFilas'>\n");
      out.write("             <th>Codigo</th>\n");
      out.write("             <th>Nombre</th>\n");
      out.write("             <th>A.Paterno</th>\n");
      out.write("             <th>A.Materno</th>\n");
      out.write("             <th>Gs-rh</th>\n");
      out.write("        </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody id='campostodos_1' align='center'></tbody>\n");
      out.write("    </table>\n");
      out.write("    <br>\n");
      out.write("    <table class='tabla'>\n");
      out.write("        <tr class='trFilas'>\n");
      out.write("            <td align='center'><input type='image' src='../imagenes/ingrese_a_modificar.png'   onclick='Modificar();'></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("<!/////FIN BUSQUEDA POR CI Y CODIGO////////////>\n");
      out.write("\n");
      out.write("<!-- **********************************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- *****************inicio MENSAJE examen fisico********************************-->\n");
      out.write("<table class='tabla' style='display:none' id='adios'>\n");
      out.write("<tr class='trFilas'>\n");
      out.write("<td>\n");
      out.write("<td align='center'><font color=\"blue\" size='3'>Datos Insertados Correctamente.............!</font></td>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<!-- *****************fin MENSAJE examen fisico********************************-->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
