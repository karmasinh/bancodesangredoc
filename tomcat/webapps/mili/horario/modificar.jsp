<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Resultados</title>
   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='validacion.js'></script>
  <script src='me.js'></script>
 
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT> 
  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>

  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>
<body onload='listar();' >  

<div style='display' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Horarios</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Nro</th>
<th >Hora Entrada</th>
<th >Hora Salida</th>
<th >Semana</th>
<th >Modificar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

</div>

<div style='display:none' id='modificar'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Modificar Horarios</h3>
</caption>
<thead>
<tr class='trFilas' align='center'>
<th ></th><th align='left'>Hora Entrada</th>  <th ></th> <th align='left'>Hora Salida</th>
</tr>
<tr class='trFilas'>
<th >Hora</th>
<th >Minutos</th>
<th >Hora</th>
<th >Minutos</th>

</tr>
</thead>
<tbody id='campos55' align='center'>
</tbody>

</table>

</div>

<div style='display:none' id='semana'>
<br>
<table class='tabla'> 
<br>
<tr class='trFilas'><td>Semana a modificar:::..<span id='sem'></span>
</td>
</tr>
</table> 

<thead>
<tr class='trFilas'>
<table class='tabla'  style='display'> 
	<tr class='trFilas'>
        <TD>Semana::.</td>
        <TD>de
          <select name="semanap" id="s1">
	  <option value="Lunes">Lunes</option>
          <option value="Martes">Martes</option>
          <option value="Miercoles">Miercoles</option>
          <option value="Jueves">Jueves</option>
          <option value="Viernes">Viernes</option>
          <option value="Sabado">Sabado</option>
          <option value="Domingo">Domingo</option>
	  <option value="-1" selected='selected' >-----</option>
        </select><span id='E1'></span></TD>
	<TD>a 
          <select name="semanas" id="s2">
          <option value="Lunes">Lunes</option>
          <option value="Martes">Martes</option>
          <option value="Miercoles">Miercoles</option>
          <option value="Jueves">Jueves</option>
	  <option value="Viernes">Viernes</option>
          <option value="Sabado">Sabado</option>
	  <option value="Domingo">Domingo</option>
	  <option value="-1" selected='selected' >----</option>
        </select><span id='E2'></span></TD>
    <td><input type='image' src='../imagenes/opcion.png'  onclick='sacar();'></td>
       </TR>
       </table>
</div>

<div style='display:none' id='semana1'>
<table class='tabla'> 
<br>
<tr class='trFilas'><td>Semana a modificar:::..<span id='sem1'></span>
<input type='hidden' id='semanak'></td>
</tr>
</table> 
    <table class='tabla'> 
	<tr class='trFilas'>
        <td>Semana::.</td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	
	</tr>
	<tr class='trFilas'>
	<td></td>
	<td><input type='checkbox' id='s3' value='Lunes' ></td><td>Lunes</td>
	<td><input type='checkbox' id='s4' value='Martes'></td><td>Martes</td>
	<td><input type='checkbox' id='s5' value='Miercoles' ></td><td>Miercoles</td>
	<td><input type='checkbox' id='s6' value='Jueves' ></td><td>Jueves</td>
	<td><input type='checkbox' id='s7' value='Viernes'></td><td>Viernes</td>
	<td><input type='checkbox' id='s8' value='Sabado' ></td><td>Sabado</td>
	<td><input type='checkbox' id='s9' value='Domingo'></td><td>Domingo</td>

    <td><input type='image' src='../imagenes/opcion.png'  onclick='sacar1();'></td>
    </tr>
  </table>


</div>
<input type='hidden' id='id_horario'> 
<div style='display' id='aceptar'>
<br>
<table class='tabla'> 
<tr class='trFilas'>
 <td colspan="3"  align='center' >
 <input type='image' src='../imagenes/modificar.png' onclick='modi();'></td>
 <td align='center'>
 <input type='image' src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td> 
</tr>
</table>
</div>

<table class='tabla' style='display:none' id='adios'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>


</body>
</html>


