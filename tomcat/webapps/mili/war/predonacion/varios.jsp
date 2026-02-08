<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
     <title>Lucia</title>
     <style type="text/css" media="screen">@import url( style.css );</style>  
     <script src='validaciones.js'></script>
     <script src='paginacion.js'></script>
     <script src='varios.js'></script>
     <script src='/mili1/dwr/interface/VariosDAO.js'></script>

     <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
     <script src='/mili1/dwr/engine.js'></script>
     <script src='/mili1/dwr/util.js'></script>
</head>
<body onload='ejecutarListar();'>
     <input type='hidden' id='cod_v'>
     <input type='hidden' id='total'>

     <!-- inicio primera -->
     <div style='display:none' id='cara_01'>
     <table class='tabla'>
          <caption class='trCaption'>LISTAR COMPRAS VARIAS</caption>
          <thead>
          <tr class='trFilas'>
               <th>Codigo</th>
               <th>Fecha</th>
               <th>Cantidad</th>
               <th>Costo</th>
               <th>Observaciones</th>
               <th> </th><!--Modificar-->
               <th> </th><!--Eliminar-->
          </tr>
          </thead>
          <tbody id='frente_01'></tbody>	  
     </table>
     <br><center><div id='enlaces'></div></center>
     </div>
     <!-- fin primera -->

     <!-- inicio segunda -->
     <table class='tablita' style='display:none' id='cara_02' align='center' width='350'>
          <caption class='trCaptioncito'>DESEA ELIMINAR ESTOS DATOS??</caption>
          <thead>
          <tr class='trFilas'>
               <td align="right">Codigo.::</td>
               <td>
		    <span id='e1'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td  align="right">Fecha::</td>
               <td>
	            <span id='e2'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td align="right">Cantidad::</td>
               <td>
		    <span id='e3'></span>
	       </td>
               <td align="right">Costo[Bs.]::</td>
               <td>
		    <span id='e4'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td colspan='4'>
	            Observaciones::<br>
          </tr>
          <tr class='trFilas'>
	       <td colspan='4'>
		    <span id='e5'></span><br><br>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td align='center' colspan='2'><div id='ejecutarE'></div></td>
               <td align='center' colspan='2'><input type="submit" value="Cancelar" onclick='ejecutarListar();'></td>
          </tr>
          </thead>
     </table>
     <!-- fin segunda -->

     <!-- inicio tercera -->
     <table class='tablita' style='display:none' id='cara_03' align='center' width='350'>
          <caption class='trCaptioncito'>DESEA MODIFICAR ESTOS DATOS??</caption>
          <tr class='trFilas'>
               <td align="right">Cod.::</td>
               <td>
		    <span id='m1'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td  align="right">Fecha::</td>
               <td>
                    <FORM name='caja'  method='post'>
                         <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
                         <input name='fechac' id='fechac' readonly='true' size='10'>
                        <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fechac');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
                    </FORM>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td align="right">Cantidad::</td>
               <td>
	            <input id='cantidad'  size="10" maxlength="10" onChange='valCantidad();'>
		    <span id='EmCantidad'></span>
	       </td>
               <td align="right">Costo[Bs.]::</td>
               <td>
	            <input id='cost_unit'  size="10" maxlength="10" onChange='valCost_unit();'>
		    <span id='EmCost_unit'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td  colspan='4'>
	            Observaciones::<br>
                    <textarea id="obser" cols="70" rows="3"  maxlength="100" onBlur='valObser();'></textarea>
		    <span id='EmObser'></span>
	       </td>
          </tr>
          <tr class='trFilas'>
               <td align='center' colspan='2'><div id='ejecutarM'></div></td>
               <td align='center' colspan='2'><input type="submit" value="Cancelar" onclick='ejecutarListar();'></td>
          </tr>
     </table>
     <!-- fin tercera -->

     <!-- inicio cuarta -->
     <table class='tabla' style='display:none' id='cara_04'>
          <thead>
          <tr class='trFilas'>
               <td><input type="submit" value="Volver" onclick='ejecutarListar();'></td>
               <th><span id='resultadoE'></span></th>
          </tr>
          </thead>
     </table>
     <!-- fin cuarta -->

     <!-- inicio quinta -->
     <table class='tabla' style='display:none' id='cara_05'>
          <thead>
          <tr class='trFilas'>
               <td><input type="submit" value="Volver" onclick='ejecutarListar();'></td>
               <th><span id='resultadoM'></span></th>
          </tr>
          </thead>
     </table>
     <!-- fin quinta -->
</body>
</html>
