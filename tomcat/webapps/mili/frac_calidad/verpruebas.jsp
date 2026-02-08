<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Mari</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
<body >

<table class='tabla' align='center'>

<caption class='trCaption'>
Registro Descarte
</caption>
<tr class='trFilas'>
<td>
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input type="submit" name="Submit" value="Anterior">
</td></tr>
<table border=1 class='tabla'>
<tr class='trFilas'>
<td>Nombre prueba</td>
<td>Resultado</td>
<td>Codigo</td>

<tr class='trFilas'>
<td>

</td>
<td>

</td>
<td>

</td>
</tr>


</body>
</html>



