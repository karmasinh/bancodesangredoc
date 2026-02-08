<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>lista descarte</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='listaDesc.js'></script>
  <script src='/mili1/dwr/interface/ListaDescarteDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>

  </script>

<body onload='Listar();' >  
<table class='tabla'  id='extra1' style='display:none'>
<caption class='trCaption'>
<h3>Lista de Descarte</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Fecha Descarte</th>
<th>Codigo</th>
<th>Area</th>
<th>Detalle-Pruebas</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

<table class='tabla'  id='extra2' style='display:none'>
<caption class='trCaption'>
<H3>Pruebas Positivas </H3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Prueba</th>
<th>Codigo</th>
<th>Resultado</th>
<input type='hidden' id='bb'>
<input type='hidden' id='id_aten'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='tipo_componente'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>

</tr>
</thead>
<tbody id='camposp' align='center'>
</tbody>
</table>

</body>
</html>


