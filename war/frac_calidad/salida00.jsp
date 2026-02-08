<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Salidas</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='salida0.js'></script>
  <script src='/mili1/dwr/interface/ListarSalidaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
</script>
  
<body onload='Listar();' >  

<table class='tabla' align='center' style='display:none' id='salida1'>
<caption class='trCaption'>
Elige el hemocomponente
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Nro-H</th>
<th>Nombre</th>
<th>Gs-rh</th>
<th>Fecha/Vencimiento</th>
<th>Elegir</th>
</tr>
</thead>
<tbody id='campos'>
</tbody>
</table>


<table class='tabla' align='center' style='display:none' id='salida2'>
<tr class='trFilas'>
<TD><input type="submit" value="Listar-Hemocomponente" onclick='cambiar();'>
</tr>

</table>


<table class='tabla' align='center' style='display:none' id='salida3'>
<caption class='trCaption'>
Hemocomponente Fraccionados
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Codigo</th>
<th>Hemocomponente</th>
<th>Gs-rh</th>
<th>Tubuladora</th>
<th>Pruebas</th>
</tr>
</thead>
<tbody id='camposP'>
</tbody>
</table>

<div style='display:none' id='salida4'>
<table class='tabla' align='center'>
<caption class='trCaption'>
Registrar Pruebas de Salida
</caption>
<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>prueba</th>
<th>tipo</th>
<th>Resultado</th>

<input type='hidden' id='id_aten'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='id_prod'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>
<input type='hidden' id='bb'>
<input type='hidden' id='aa'>
<th></th>
</tr>
</thead>
<tbody id='campospe'>
<th><span id='EmV'></span></th>
</tbody>
</table>

<table class='tabla'>
<tr>
<td colspan="3" align="center"><input type='submit' value='Agregar' onclick='InsertarC();'></td>
<td colspan="3" align="center"><div id='agregar'></div></td>
</tr>
</table>
</div>

<table class='tabla' style='display:none' id='Fin'>
<caption class='trCaption'>
Datos Insertados Correctamente.............!
</caption>
</table>


</body>
</html>



