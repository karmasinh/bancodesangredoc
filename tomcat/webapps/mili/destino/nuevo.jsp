<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='nn.js'></script>
  <script src='validacion.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='conteo();' >  

<div style='display' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar Nuevo Destino</h3>
</caption>
<thead>
<tr class='trFilas'>
    <TD>Nro:.</TD>
    <TD><span  id='id_destino'></span> </TD>
    <TD>Nombre:.</TD>
    <TD ><input type='text' id='nombre' onblur='ca();'>
    <span  id='N' ></span></TD>

  </TR>
</table>
<br>

<table class='tabla'>
<tr class='trFilas'>
<td colspan="3"  align="center"><div id='mili'></div></td>
<td   align="center"><input type='image' src='../imagenes/cancelar1.png' onclic=''></td>
</tr>
</table>

</div>

<table class='tabla' style='display:none' id='aviso'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>

</body>
</html>
