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
Registrar Pruebas de Salidas
</caption>
<tr class='trFilas'>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="valor" value="{$VALOR}">
<td><input type=submit value=Anterior></td>
</td>

<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="valor" value="{$VALOR}">
<td><input type=submit value=Principio></td>
</td>
<td>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<input type="hidden" name="id_prod" value="{$ID_PROD}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="id_aten" value="{$ID_ATEN}">
<input type="hidden" name="instancia" value="{$P}">
<input type="hidden" name="pruebas" value="{$PRUEBAS}">
<td><input type="submit" name="Submit" value="Agregar"></td>


</td>
</TR>

<tr><td>
Codigo del Donante::::{$COD_DO}
</tr></td>
</table>
<table>
<TR>

<TD>Fecha</TD>
<TD><input type="text" name="fecha_prueba"></TD>
<TR>
<table>

<TR>
<TD>   </TD>

     <TD>
     <input type="hidden" value="{$Libreta[despliegue].id_prueba}" name="id_prueba_{$Libreta[despliegue].cont_ii}">
     <select name="resultado_{$Libreta[despliegue].cont_ii}" id="resultado_{$Libreta[despliegue].cont_ii}" >

     <option value="{$Mili[despliegue1].valores}">

     </option>

     </select>
     </TD>



</body>
</html>



