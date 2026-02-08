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
Registrar Salidas
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
<TD><input type="submit" name="Submit" value="Guardar"></TD>
</TR>

<table class='tabla'>
<tr class='trFilas'>
    <TD>Fecha salida:</TD>
    <TD><input type="text" name="fecha_sal"></TD>
    <TD>Hora Salida:</TD>
    <TD><input type="text" name="hora_sal"></TD>

</TR>
<tr class='trFilas'>
    <TD>Nro de salida:</TD>
    <TD><input type="text" name="id_salida"></TD>
    <TD>Destino:</TD>
    <TD><select name="id_destino">
          <option value="1">H.U.S.J.D.D.</option>
          <option value="2">C.O.R.D.E.S.</option>
          <option value="3">C.N.N.S.</option>
          <option value="4">H.OBRERO</option>
        </select></TD>
</TR>

<TABLE class='tabla'>
<tr class='trFilas'>
<TD>Responsable:::::</TD>
<TD>{$ENCABEZADO}</TD>
</TR>
</TABLE>

<table class='tabla'>
<tr class='trFilas'>
<td>Codigo</td>
<td>GS/RH</td>
<td>Hemocomponente</td>
<td>Tubuladora</td>
<td>Fecha-Vencimiento</td>
</tr>
<tr class='trFilas'>
<td>{$Libreta[despliegue].COD_DO}</td>
<td>{$Libreta[despliegue].RESULTADO}</td>
<td>{$Libreta[despliegue].NOMBRE}</td>
<td>{$Libreta[despliegue].TUBULADORA}</td>
<td>{$Libreta[despliegue].FECHA_EXPI}</td>
</tr>

</tabla>
</body>
</html>



