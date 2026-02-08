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
Registro Control de Calidad
</caption>
<tr class='trFilas'>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type=submit value=Anterior>
</td>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type=submit value=Principio>
</td>

<TD>
<input type="submit" name="Submit" value="Agregar">
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="instancia" value="{$INSTANCIA}">
<input type="hidden" name="control" value="{$CONTROL}">
<input type="hidden" name="id_hemo" value="{$ID_HEMO}">
<input type="hidden" name="id_prod" value="{$ID_PROD}">
</TD>
</TR>
<tr class='trFilas'><td>
Fecha de Expiracion::::{$FECHA_EX}
</td>
<td>
Codigo::::{$COD_DO}
</td>
</tr>
<tr class='trFilas'>
<TD>Fecha de Extraccion::::{$Fecha[d].fecha_extra}</TD>
<input type="hidden" name=id_aten value="{$Fecha[d].id_aten}">

<td>
Componente::::{$NOMBRE}
</td></tr>
</table>

<table class='tabla'>
<tr class='trFilas'>

<TD>Fecha</TD>
    <TD><input type="text" name="fecha_prueba"></TD>
<tr class='trFilas'>
 <TD>      </TD>
    <TD><input type="text" name="resultado_{$Libreta[despliegue].cont_i}"></TD>
    <TD><input type="text" name="id_prueba_{$Libreta[despliegue].cont_i}" value="{$Libreta[despliegue].id_prueba}"></TD>
 </TR>


</body>
</html>



