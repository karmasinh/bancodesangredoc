<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='e.js'></script>
  <script src='validaciones.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
<body onload='listar();' >  

<div style='display' id='lista'>
<input type='hidden' id='id_horario'>
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
<th >Eliminar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

</div>
<div style='display:none' id='siono'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='eliminar();'></td>
</tr>
</table>
</div>

<table class='tabla'  id='adios' style='display:none'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</tr>
</table>


</body>
</html>



