<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>lista</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaMedicaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script src='lista.js'></script>
  <script src='validaciones.js'></script>
  <script src='pagina.js'></script>

<body onload='Listar();' >
<div id='busqueda' style='display:none'>
<table class='tabla'>
    <input  id="id_horario" type="hidden">
    <input  id="cod_per" type="hidden">
    <input  id="cod_do" type="hidden">

<caption class='trCaption'>
<h3>Lista de Donantes</h3>
</caption>
<br>
<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Codigo</th>
<th>Nombre</th>
<th>A.Paterno</th>
<th>A.Materno</th>
<th>Ingresar</th>
</tr>
</thead>
<input type='hidden' id='id_aten'>
<input type='hidden' id='total'>
<tbody id='campos' align='center'>
</tbody>
</table>
     <br><center><div id='enlaces'></div></center>
</div>

<table class='tabla' id='evaluacion' style='display:none' >
<caption class='trCaption'>
<h3>Tamizaje Medico</h3>
</caption>
<br>
<thead>
<tr class='trFilas'>
<th>Fecha</th>
<th>Hora</th>
<th>Nro</th>
<th>Sistólica</th>
<th>Diastolica</th>
<th>Pulso</th>
<th>Peso</th>
<th>Talla</th>
<th>Temperatura</th>
</tr>
</thead>
<tbody id='camposE' align='center'>
</tbody>
</table>
<br>
<div id='resultadoeva' style='display:none'>
<table class='tabla'>
<TR class='trFilas'>
<TD>En Ayunas</TD>
<TD><select id='ayunas' onBlur='validarCombos1();' >   
<option value='-1'> - - Seleccione - - 
<option value='Si'>Si</option> <option value='No'>No</option> 
</select><span id='EmC'></span></TD>
<TD><span>Ingestion de Alimentos 3 horas previas a la extracción</span></TD>
<TD><input id='ingestion'  size="20" onBlur='validarCadena();'><span id='Em'></span></TD>
</TR>
</table>

<table class='tabla'>

<TR class='trFilas'><TD align='rigth'>RESULTADO:</TD>

<td>
<select id='resultado' onchange='cambiar();' onBlur='validarCombos2();'>
<option value='-1'> - - Seleccione - - 
<option value='Donante Apto'>DONANTE APTO
<option value='Donante No Apto'>DONANTE NO APTO
 </select><span id='EmC1'></span>
<div id='uno'>  </div>
</td>
</TR>
<TR class='trFilas'>
<td>OBSERVACION:</td>
<td><Textarea id='obs' rows='3' cols='30'></Textarea></TD>
</TR>
</table>
<br>
<table class='tabla'>		     
 <tr class='trFilas'>
 <td colspan="3"  align='center' ><div id='agregar'></div></td>
 <td align='center'><input type='image' src='../imagenes/cancelar1.png' onclick='Cancelar();'></td> 
 </tr>
</table>



</div>

<table class='tabla' style='display:none' id='avisoE'>
<tr class='trFilas'>
<td align='center' align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</tr>
</table>




<hr>
<!--
obs<input id='obs1'><br>
numeral<input id='numeral1'><br>
ingestion<input id='ingestion1'><br>
resultado<input id='resultado1'><br>
ayunas<input id='ayunas1'><br>
rechazo<input id='rechazo1'>
id_aten<input id='id_aten1'>
-->

</body>
</html>


