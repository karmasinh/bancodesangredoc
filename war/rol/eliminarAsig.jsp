<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='eliminarAsig.js'></script>
  <script src='validaciones.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoPersonalDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='listar();' >  

<div style='display' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Personal</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Codigo</th>
<th >Nombre</th>
<th >A. Paterno</th>
<th >A. Materno</th>
<th >Profesión</th>
<th >Ingresar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>
</div>

<div style='display:none' id='lista1'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Asignar Rol</h3>
</caption>
<tr class='trFilas' >
<th align='left'>Usuario::. </th>
<td align='left'><span id='nom'> </span>-<span id='apepa'> </span></td>
<td ></td><td ></td><td ></td>
</tr>
</table>
<br>
<table class='tabla'>
<thead>
<tr class='trFilas'>
<th >Id_rol</th>
<th >Nombre</th>
<th >Seleccione</th>
</tr>
<input type='hidden' id='cod_per3'>
<input type='hidden' id='total'>
</thead>
<tbody id='campos1' align='center'>
</tbody>
</table>
<br>
<table class='tabla'>
<tr class='trFilas'>
<td colspan="3"  align="center"><input type='image' src='../imagenes/eliminar2.png' onclick='elitodo();'></td>
<td   align="center"><input type='image' src='../imagenes/atras.png' onclick='listar();'></div></td>
</tr>
</table>
</div>



<div style='display:none' id='lista2'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='Ingresa1();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='eliminar();'></td>
</tr>
</table>
</div>
<div style='display:none' id='lista5'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='Todo();'></td>
</tr>
</table>
</div>

<table class='tabla'  id='lista3' style='display:none'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Eliminados.............!</font></td>
</tr>
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='volver();'></td>
</tr>
</table>

<input type='hidden' id='id_rol'>
</body>
</html>



