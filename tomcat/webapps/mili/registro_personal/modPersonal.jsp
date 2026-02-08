<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Modificar</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='modificar11.js'></script>
  <script src='/mili1/dwr/interface/ListaAdmPersonalDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>


  </script>

  
<body onload='Listar();' >  

<table class='tabla' align='center'  style='display' id='lista'>
<caption class='trCaption'>
<h3>Registro de Personal</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nro.</th>
<th>Codigo</th>
<th>Nombre</th>
<th>A.Paterno</th>
<th>A.Materno</th>
<th>Modificar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>
<input type='hidden' id='id_per'>
<table class='tabla' align='center'  style='display:none' id='lista1'>
<caption class='trCaption'>
<h3>Modificar  Registro de Personal</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nombre</th>
<th>A.paterno</th>
<th>A.materno</th>
</tr>
</thead>
<tbody id='camposM' align='center'>
</tbody>
</table>
<div  style='display:none' id='lista2'>
<table class='tabla' align='center'>
<thead>
<tr class='trFilas'>

<th>Codigo</th>
<th>Usuario</th>
<th>C.i.</th>
</tr>
</thead>
<tbody id='camposM1' align='center'>
</tbody>
</table>

<table class='tabla' align='center'>
<thead>
<tr class='trFilas'>
<th>Calle-Residencia</th>
<th>Nro.</th>
<th>Zona</th>
</tr>
</thead>
<tbody id='camposM2' align='center'>
</tbody>
</table>
</div>


<div  style='display:none' id='lista3'>

<table class='tabla' align='center'>
<thead>
<tr class='trFilas'>
<th>Celular</th>
<th>Fono</th>
<th>Profesion</th>
<th>Grado</th>
</tr>
</thead>
<tbody id='camposM3' align='center'>
</tbody>
</table>
<br>
<table class='tabla'>
<tr class='trFilas'>
<td colspan="3"  align="center"><input type='image' src='../imagenes/modificar.png'  onclick='modificarC();'></td>
<td align="center"><input type='image' src='../imagenes/atras.png' onclick='Listar();'></td>
</tr>
</table>


</div>

<table class='tabla' align='center'  style='display:none' id='listaT'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Modificados Correctamente.............!</font>
</caption>

</table>

</body>
</html>


