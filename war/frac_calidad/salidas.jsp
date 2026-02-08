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
Hemocomponentes fraccionados
</caption>
<tr class='trFilas'>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<TD><input type="submit" name="Submit" value="Principio"></TD>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="id_hemo" value="{$ID_HEMO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<TD><input type="submit" name="Submit" value="Salidas"></TD>
</TR>
<tr class='trFilas'>
</table>
<table class='tabla'>
<tr class='trFilas'>
<td>Nro A.</td>
<td>Codigo</td>
<td>ID_PROD</td>
<td>GS/RH</td>
<td>Hemocomponente</td>
<td>Tubuladora</td>
<td>Fecha-Vencimiento</td>
<td>Pruebas de Salidas</td>
</tr>

<tr class='trFilas'>
<td> </td>
<td> </td>
<td> </td>
<td> </td>
<td> </td>
<td> </td>
<td> </td>
<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="id_prod" type="hidden" value="{$Libreta[despliegue].ID_PROD}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input type="submit" name="Submit" value="Pruebas"></td>
</tr>



</body>
</html>



