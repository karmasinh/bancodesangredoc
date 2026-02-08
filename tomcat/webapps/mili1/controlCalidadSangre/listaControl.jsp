<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Salidas</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='sal3.js'></script>
  <script src='/mili1/dwr/interface/ListaControlDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
</script>
  
<body onload='Listar();' >  

    <input  id="id_horario" type="hidden">
    <input  id="cod_per" type="hidden">
    <input  id="id_hemo" type="hidden">

<table class='tabla' align='center' style='display:none' id='salida1'>
<caption class='trCaption'>
<h3>Elige el hemocomponente</h3>
</caption>

<thead>
<tr class='trFilas'>
<!--<th>Nro</th>-->
<th>Nro-H</th>
<th>Nombre</th>
<th>Gs-rh</th>
<th>Total</th>
<th>Elegir</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>


<table class='tabla' align='center' style='display:none' id='salida2'>
<tr class='trFilas'>
<TD><input type="submit" value="Listar-Hemocomponente" onclick='cambiar();'>
</tr>

</table>


<table class='tabla' align='center' style='display:none' id='salida3'>
<caption class='trCaption'>
<h3>Hemocomponente Fraccionados</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Nro prod.</th>
<th>Codigo</th>
<th>fecha expi.</th>
<th>nombre</th>
<th>Pruebas</th>
</tr>
</thead>
<tbody id='camposP' align='center'>
</tbody>
</table>

<div style='display:none' id='salida4'>
<table class='tabla' align='center'>
<caption class='trCaption'>
<H3>Registrar Pruebas de Salida</H3>
</caption>
<thead>

<tr class='trFilas'>
<td align="right">Fecha:</td>
<td>
<FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
<span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
<input  id='fecha_a' readonly='true' size='15'>
<A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_a');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
</FORM>
<span id='EmFechae'></span>
</td>
<td align="right">Hora:</td>
<td><span  id='hora_a' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>
</tr>


<tr class='trFilas'>
<th>Nro</th>
<th>prueba</th>
<th>tipo</th>
<th>Resultado</th>

<input type='hidden' id='id_aten'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='id_prod'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>
<input type='hidden' id='bb'>
<input type='hidden' id='aa'>
<th></th>
</tr>
</thead>
<tbody id='campospe' align='center'>
<th><span id='EmV'></span></th>
</tbody>
</table>

<table class='tabla'>
<tr>
<td colspan="3" align="center"><input type='submit' value='Agregar' onclick='InsertarC();'></td>
<td colspan="3" align="center"><div id='agregar'></div></td>
</tr>
</table>
</div>

<table class='tabla' style='display:none' id='Fin'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>


</body>
</html>



