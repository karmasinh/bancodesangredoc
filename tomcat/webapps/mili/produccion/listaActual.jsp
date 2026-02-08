<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Lista de produccion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='listaAc.js'></script>

  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
  <script src='/mili1/dwr/interface/ListaMedicaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  </script>

<body onload='Listar();' >  
<table class='tabla'>

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
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
<input type='hidden' id='total'>
</table>
     <br><center><div id='enlaces'></div></center>
</html>


