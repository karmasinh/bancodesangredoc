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
  <script src='mod.js'></script>
 
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT> 
  <script src='/mili1/dwr/interface/NuevoHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='listar();' >  

<div style='display' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Destinos</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Nro</th>
<th >Nombre</th>
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
<h3>Destino a Modificar</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Nro</th>
<th >Nombre</th>
</tr>
</thead>
<tbody id='campos1' align='center'>
</tbody>
</table>
<br>

<table class='tabla'>
<tr class='trFilas'>
<td colspan="3"  align="center"><input type='image' src='../imagenes/modificar.png' onclick='InsertMo();'></td>
<td   align="center"><input type='image' src='../imagenes/cancelar1.png' onclick=''></td>
</tr>
</table>

</div>
<input type='hidden' id='id_destino'>
<table class='tabla' style='display:none' id='aviso'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>


</body>
</html>


