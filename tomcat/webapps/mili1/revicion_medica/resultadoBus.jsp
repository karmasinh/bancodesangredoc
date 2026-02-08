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

<table class='tabla'>
<caption class='trCaption'>
Resultados
</caption>
<tr class='trFilas'>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Anterior">
</td>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Principio">
</td>
</tr>
</table>

<tr class='trFilas'><td>
<table class='tabla'>
<tr class='trFilas'><td>Nro</td>
<td>Codigo</td>
<td>A.Paterno</td>
<td>A.Materno</td>
<td>Nombre</td>
<td>Fecha</td>
<td>Tamizaje-Cli</td>
<td>Predonacion</td>
<td>Serelogia</td>
<td>Hematologia</td>
<td>Extraccion</td>
</tr>
<tr class='trFilas'>
{section name=despliegue loop=$Libreta}
<td>
{$Libreta[despliegue].ID_ATEN}
</td>
<td>
{$Libreta[despliegue].COD_DO}
</td>
<td>
{$Libreta[despliegue].APEPA}
</td>
<td>
{$Libreta[despliegue].APEMA}
</td>
<td>
{$Libreta[despliegue].NOM}
</td>
<td>
{$Libreta[despliegue].FECHA_A}
</td>
<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">

<input type="submit" name="Submit" value="Tamizaje-cli">
</td>


<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">

<input type="submit" name="Submit" value="Predonacion">
</td>
<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">

<input type="submit" name="Submit" value="Serologia">
</td>
<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">

<input type="submit" name="Submit" value="Hematologia">
</td>
<td>
<input name="cod_do" type="hidden" value="{$Libreta[despliegue].COD_DO}">
<input name="valor" type="hidden" value="{$VALOR}">
<input name="encabezado" type="hidden" value="{$ENCABEZADO}">
<input name="id_aten" type="hidden" value="{$Libreta[despliegue].ID_ATEN}">

<input type="submit" name="Submit" value="Extraccion">
</td>

</tr>
</table>
</td></tr>
</table>

</body>
</html>


บบ