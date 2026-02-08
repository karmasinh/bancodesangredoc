<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Eliminar</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='eli.js'></script>
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
<th>Nombre</th>
<th>A.Paterno</th>
<th>A.Materno</th>
<th>Codigo</th>
<th>Usuario</th>
<th>Eliminar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
<input type='hidden' id='id_per'>
<input type='hidden' id='cod_per'>
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
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='insertar();'></td>
</tr>
</table>
</div>


<table class='tabla' align='center'  style='display:none' id='listaT'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Eliminados Correctamente.............!</font>
</caption>
</table>

</body>
</html>


