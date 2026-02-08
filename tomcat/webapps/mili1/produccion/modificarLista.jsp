<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Lista de produccion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='modificarL.js'></script>
  <script src='pagina.js'></script>
  <script src='paginacion.js'></script>

  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>




  </script>

<body onload='Listar();' >  

    <input  id="id_horario" type="text">
    <input  id="cod_per" type="text">


<div  id='prod1' style='display'>
<table class='tabla'  >
<caption class='trCaption'>
<h3>Lista de Hemocomponentes</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro Prod.</th>
<th>Nro He.</th>
<th>Codigo</th>
<th>Hemocomponente</th>
<th>Gs-Rh</th>
<th>Fecha-Expiracion</th>
<th>Fecha-Produccion</th>
<th>Modificar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>
    <br><center><div id='enlaces'></div></center>
</div>

<div  id='prod2' style='display:none'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Hemocomponentes</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro</th>
<th>Nombre</th>
<th>Fecha-Expiracion</th>
<th>Fecha-Produccion</th>
</tr>
</thead>
<tbody id='campos1' align='center'>
</tbody>
</tr>
<br>
<table class='tabla'>
<tr class='trFilas'>
<td align='center'><input type='image' src='../imagenes/atras.png' onclick='Listar();'></td>
<td align='center' colspan='3'><input type='image' src='../imagenes/modificar.png' onclick='modificar();'></td>

</tr>
</table>
</table>
</div>

<input  type='hidden' id='total'>
<input  type='hidden' id='id_prod1'>
<input  type='hidden' id='id_hemo1'>

<div  id='prod3' style='display'>
<table class='tabla'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Modificados Correctamente.............!</font></td>
</td>
</tr>
</table>
</div>


</body>
</html>


