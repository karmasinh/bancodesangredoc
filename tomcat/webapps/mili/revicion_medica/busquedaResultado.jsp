<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Busqueda</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
<body >

<table class='tabla'>
<caption class='trCaption'>
Busqueda de Resultados
<br><br>
Codigo.......:<input type=password name='cod_do' size=15>
</caption>
<tr class='trFilas'>
<td>
Apellido Paterno:<input type=text name='apepa' size=25></td>
<td>
Apellido Materno:<input type=text name='apema' size=25></td>
</tr>
<tr class='trFilas' align='center'>
<td colspan='2' >
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type=submit value=aceptar>
<input type=reset value=Borrar>
</td></tr>
</table>


</body>
</html>


