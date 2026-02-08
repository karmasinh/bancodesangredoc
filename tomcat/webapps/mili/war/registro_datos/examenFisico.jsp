<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Examen</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='/mili1/dwr/interface/NuevoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
<body>
<table class='tabla' >
<caption class='trCaption'>
Registrar Donante
</caption>
<tr class='trFilas'>

<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<TD><input type="submit" name="Submit" value="Principio"></TD>
</form>

<TD>
<input type="hidden" name="id_aten" value="{$ID_ATEN}">
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<TD><input type="submit" name="Submit" value="Nuevo-Donante"></TD>
</form>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="atendido" value="T">
<input type="hidden" name="atendidop" value="T">
<input type="hidden" name="atendidoh" value="T">
<input type="hidden" name="atendidos" value="T">
<input type="hidden" name="atendidoe" value="T">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="hidden" name="cod_do" value="{$COD_DO}">
<TD><input type="submit" name="Submit" value="Agregar"></TD></TR>

<tr class='trFilas'>
    <TD>Fecha:</TD>
    <TD><input type="text" name="fecha_a"></TD>
    <TD>Hora:</TD>
    <TD><input type="text" name="hora_a"></TD>
    <TD>Nro de atencion:</TD>
    <TD>{$NUMERAL}</TD>
    <TD><input type="HIDDEN" name="id_aten" value="{$NUMERAL}" SIZE='5'></TD>
<tr class='trFilas'>
 <TD>Tipo_de_Donacion<hr></tr>
   <tr class='trFilas'>
            <TD ><input type="RADIO" name="tipo_do" value="V" size=4>Voluntaria</TD>
            <TD><input type="RADIO" name="tipo_do" value="R" size=4>Reposicion/Familiar</TD>
            <td></td><TD><input type="RADIO" name="tipo_do" value="A" size=4>Autóloga</TD><tr></tr>
            <TD><input type="RADIO" name="veces" value="H" size=4>Habitual</TD>
            <TD ><input type="RADIO" name="veces" value="P" size=4>Primera_Vez</TD></tr> 
</tr> 

<table align=center class='tabla'>
<tr><td align=center class='tabla'>
<h2>Examen Fisico</h2>
</td></tr>
</table>

<table class='tabla'>
<tr class='trFilas'><TD>Tension_Arterial:</TD></tr>
<tr class='trFilas'><TD>Sistólica</TD>
<TD><input name="sistolica" type="text" size="8"></td>
<TD>Diastólica</TD>
<TD><input name="diastolica" type="text" size="8"></td>
</TR>
<tr class='trFilas'><TD>Pulso</TD>
<TD><input name="pulso" type="text" size="8">pul./min.</td></TR>
<tr class='trFilas'><TD>Peso</TD>
<TD><input name="peso" type="text" size="8">Kg.</td></TR>
<tr class='trFilas'><TD>Talla</TD>
<TD><input name="talla" type="text" size="8">cms.</td></TR>
<tr class='trFilas'><TD>Temperatura</TD>
<TD><input name="temperatura" type="text" size="8">°C</td>
</TR>
</td></tr>
</TABLE>
</TABLE>


</body>
</html>


