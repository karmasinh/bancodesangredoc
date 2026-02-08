<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>inmunohematologia</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='pp12.js'></script>
  <script src='validaciones.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/ListaHemaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='Listar();' >  

    <input  id="id_horario" type="HIDDEN">
    <input  id="cod_per" type="HIDDEN">


<div style='display:none' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Donantes</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Nro</th>
<th >Codigo</th>
<th >A.Paterno</th>
<th >A.Materno</th>
<th >Nombre</th>
<th >Resultado-2</th>
<th >Inmunohematologia</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>

<input type='hidden' id='a'>
<input type='hidden' id='gs_rh'>
</table>

</div>

<div style='display:none' id='lista1'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar Inmunohematologia</h3>
</caption>
</table class='tabla'>

<table class='tabla'>
<tr class='trFilas'>
<th align="right">Donante::.</th>
<td><span id='nom'> </span>-<span id='apepa'> </span>-<span id='apema'> </span>
</td>
<th align="right">Codigo::.</td>
<td><span id='codigo_donante'></span></td>
</tr>
<tr class='trFilas'>
<th align="right">Fecha::.</th>
<td>
<FORM name='caja'  method='post'>
<span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
<input  id='fecha_prueba' readonly='true' size='15'>
<A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_prueba');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
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
<tbody id='camposp' align='center'>
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
<td colspan="3"  align="center"><div id='mili'></div></td>
<td   align="center"><div id='agregar'></div></td>
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


