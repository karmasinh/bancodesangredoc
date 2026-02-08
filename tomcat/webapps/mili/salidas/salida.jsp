<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Salidas</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='ena.js'></script>
  <script src='/mili1/dwr/interface/ListarSalidaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
</script>
  
<body onload='Listar();' >  

<div style='display:none' id='salida1'>
<table class='tabla' align='center'>
<caption class='trCaption'>
<H3>Elige el hemocomponente</H3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Nombre</th>
<th>Gs-rh</th>
<th>Cantidad</th>
<th>Información</th>
</tr>
<input type='hidden' id='id_prod'>
<input type='hidden' id='nombre2'>
<input type='hidden' id='id_hemo'>
<input type='hidden' id='id_aten'>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

<br>
<table class='tabla' align='center' style='display:none' id='salida2'>
<tr class='trFilas'>
<TD align='center'><input type="image" src="../imagenes/listar.png" onclick='cambiar();'>
</tr>
</table>
</div>



<table class='tabla' align='center' style='display:none' id='salida3'>
<caption class='trCaption'>
<H3>Hemocomponentes Fraccionados</H3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Codigo</th>
<th>Hemocomponente</th>
<th>Gs-rh</th>
<th>Tubuladora</th>
<th>Fecha Expiracion</th>
<th>Pruebas</th>

</tr>
</thead>
<tbody id='camposP' align='center'>
</tbody>
</table>
 <br><center><div id='enlaces'></div></center>
 </div>



<div style='display:none' id='salida4'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar Salida</h3>
</caption>
</table class='tabla'>

<table class='tabla'>
<tr class='trFilas'>
<th align="right">Codigo::.</td>
<td><span id='codigo_donante'></span></td>
<th align="right">Gs-rh::.</td>
<td><span id='gs_rh'></span></td>
<th align="right">Hemocomponente::.</td>
<td><span id='nom'></span></td>
</tr>

<tr class='trFilas'>
<th align="right">Fecha::.</th>
<td>
<FORM name='caja'  method='post'>
<span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
<input  id='fecha_prueba' readonly='true' size='15'>
<A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_prueba');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
</FORM>
<span id='EmFechae'></span>
</td>
<th align="right">Hora::.</th>
<td><span  id='hora_prueba' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>
</tr>
</table>


<table class='tabla'>
<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>prueba</th>
<th>tipo</th>
<th>Resultado</th>
</tr>
</thead>
<tbody id='campospe' align='center'>
<th><span id='EmV'></span></th>
</tbody>
</table>

<input type='hidden' id='id_aten'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>
<input type='hidden' id='bb'>

<table class='tabla'>
<tr class='trFilas'>
<td colspan="3" align="center"><input type='image' src='../imagenes/aceptar.png' onclick='InsertarC();'></td>
<td colspan="3" align="center"><div id='agregar'></div></td>
</tr>
</table>
</div>

<table class='tabla' style='display:none' id='Fin'>
<caption class='trCaption'>
Datos Insertados Correctamente.............!
</caption>
</table>

<div style='display:none' id='sangre'>
<table class='tabla' align='center'>
<caption class='trCaption'>
<h3>Información de <span id='id_hemo1'></span></h3>
</caption>

<tr class='trFilas'>
<td><h6>Gs-Rh</h6></td><td><h6>Cantidad</h6></td><td align="center"><h6>Gs-Rh</h6></td><td align="center"><h6>Cantidad</h6></td>
</tr>

<tr class='trFilas'>
<td>O-</td><td><span id='gs1'></span></td><td align="center">O+</td><td align="center"><span id='gs2'></span></td>
</tr>

<tr class='trFilas'>
<td>A-</td><td><span id='gs3'></span></td><td align="center">A+</td><td align="center"><span id='gs4'></span></td>
</tr>

<tr class='trFilas'>
<td>B-</td><td><span id='gs5'></span></td><td align="center">B+</td><td align="center"><span id='gs6'></span></td>
</tr>

<tr class='trFilas'>
<td>AB-</td><td><span id='gs7'></span></td><td align="center">AB+</td><td align="center"><span id='gs8'></span></td>
</tr>
</table>

<br>
<table class='tabla' align='center'>
<tr class='trFilas'>
<TD align='center'><input type='image' src='../imagenes/atras.png' onclick='Volver();'></TD>     
</tr>
</table>
</div>



</body>
</html>



