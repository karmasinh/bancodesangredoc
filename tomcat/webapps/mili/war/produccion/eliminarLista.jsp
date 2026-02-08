<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Lista de produccion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='paginacion.js'></script>
  <script src='eliminarL.js'></script>
  <script src='pagina.js'></script>
  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>


  </script>

<body onload='Listar();' >  
<div  id='prod1' style='display:none'>
<table class='tabla'  >

<caption class='trCaption'>
<h3>Lista de Hemocomponentes</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro Prod.</th>
<th>Codigo</th>
<th>Nombre</th>
<th>Gs-Rh</th>
<th>Fecha-Expiracion</th>
<th>Fecha-Produccion</th>
<th>Eliminar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
<input type='hidden' id='id_prod'>
</table>
     <br><center><div id='enlaces'></div></center>
<input type='hidden' id='total'>
</div>


<table class='tabla'  id='prod3' style='display:none'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Eliminados.............!</font></td>
</tr>

</table>

<div style='display:none' id='siono'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='Listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='ListarMod();'></td>
</tr>
</table>


</body>
</html>


