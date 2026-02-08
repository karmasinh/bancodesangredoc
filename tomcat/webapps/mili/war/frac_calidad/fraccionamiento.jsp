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
Registrar Fraccionamiento
</caption>
<tr class='trFilas'>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Anterior">
</TD>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="fraccionado" value="{$FRACCIONADO}">
<input type="hidden" name="control" value="{$CONTROL}">
<input type="hidden" name="pruebas" value="{$PRUEBAS}">
<input type="hidden" name="id_ext" value="{$ID_EXT}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="submit" name="Submit" value="Agregar">
</TD>
</tr>

<tr class='trFilas'>
<table class='tabla'>

<tr>
<TD>Codigo de Donante</TD><td>{$COD_DO}</td>
<TD>Nro de Extraccion</TD>
<td>  </td>
</tr>
</table>
</TR>
<tr class='trFilas'>
<TD> </TD>
</tr>

<tr class='trFilas'>
<table class='tabla'>
<TD>Fecha de Produccion</TD>
<TD><input type="text" name="fecha_produccion" ></TD>
</table>
</tr>

<table class='tabla'>
<tr class='trFilas'>
    <TD>Grupo Sanguineo:</TD>
    <TD>{$Grupo[despliegue].resultado}</TD>
<input type="hidden" name="resultado" value="{$Grupo[despliegue].resultado}">
</TR>
</table>
<tr class='trFilas'>
<table class='tabla'>
<tr class='trFilas'>
  <p>
    <TD> </TD>
    <TD><input type="checkbox" name="id_hemo_{$Libreta[despliegue].cont_i}" value="{$Libreta[despliegue].id_hemo}" size=4 onClick="form1.t{$Libreta[despliegue].cont_i}.value = form1.t{$Libreta[despliegue].cont_i}.value*(-1);" ></TD>
    <TD><input type="text" name="t{$Libreta[despliegue].cont_i}" value="1"></TD>
    <TD>Fecha Expiracion:</TD>
    <TD><input type="text" name="fecha_expi_{$Libreta[despliegue].cont_i}"></TD>
</TR>


</body>
</html>



