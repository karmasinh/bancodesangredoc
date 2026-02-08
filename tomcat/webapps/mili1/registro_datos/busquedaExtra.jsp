<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Fecha</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='/mili1/dwr/interface/LibroDiarioDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
 </script>
</head>
<body>

<table class='tabla'>
<caption class='trCaption'>
Resultados de  Extraccion
</caption>
<tr class='trFilas'>

<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="id_aten" value="{$ID_ATEN}">
<input type="submit" name="Submit" value="Principio">
</td>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="id_aten" value="{$Libreta[despliegue].ID_ATEN}">
<input type="hidden" name="cod_do" value="{$Libreta[despliegue].COD_DO}">
<input type="submit" name="Submit" value="Volver">
</td>
</tr>
</table>

<table class='tabla'>
    <tr class='trFilas'>
    <TD>Fecha:::</TD>
    <TD>{$Libreta[despliegue].FECHA_EXTRA}</TD>
    <TD>Hora:::</TD>
    <TD>{$Libreta[despliegue].HORA}</TD></TR>
    </table>
   <table class='tabla'>
    <tr class='trFilas'>
    <TD>Nro de atencion:::</TD>
    <TD>{$Libreta[despliegue].ID_ATEN}</TD>

    <TD>Codigo de Donante:::</TD>
    <TD>{$Libreta[despliegue].COD_DO}</TD>
    </TR>

    <tr class='trFilas'>
    <TD>Bolsa:::</TD>
    <TD>{$Libreta[despliegue].BOLSA}</TD>
    <TD>Cantidad Extraida:::</TD>
    <TD>{$Libreta[despliegue].CANT_EXTRA}</TD>
    </TR>

    <tr class='trFilas'>
    <TD>Licenciada::::::</TD>
    <TD>{$Libreta[despliegue].NOM}</TD>
    <TD>{$Libreta[despliegue].APEPA}</TD>
    <TD>{$Libreta[despliegue].APEMA}</TD>
    </TR>
    </table>
</table>


</TR>
</TABLE>

</body>
</html>


