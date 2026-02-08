<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='nuevo.js'></script>
  <script src='validacion.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='conteo();' >  

<div style='display' id='lista'>

<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar Nuevo Rol</h3>
</caption>
<thead>
 <tr class='trFilas'>
    <TD>Nro::.</TD>
    <TD><span  id='id_rol'></span> </TD>
    <TD>Nombre::.</TD>
    <TD><input type='text' id='nombre' onblur='ca();'>
    <span  id='N' ></span></TD>

  </TR>
</table>


<!--<table class='tabla'>
  <tr class='trFilas'>
    <TD>Area::.</TD>
   </tr>
   <tr class='trFilas'>
    	<td align='center'><input type='checkbox' id='s1' value='Registro' onblur='q1();'></td><td>Registro de Datos</td>
    	<td align='center'><input type='checkbox' id='s2' value='Tamizaje' onblur='q2();'></td><td>Tamizaje Medico</td>
   </tr>
   <tr class='trFilas'>
	<td align='center'><input type='checkbox' id='s3' value='Laboratorio' onblur='q3();'></td><td>Laboratorio</td>
	<td align='center'><input type='checkbox' id='s4' value='Reportes' onblur='q4();' ></td><td>Reportes</td>
   </tr>
   <tr class='trFilas'>
	<td align='center'><input type='checkbox' id='s5' value='Adm' onblur='q5();'></td><td>Administracion</td>
	<td align='center'><input type='checkbox' id='s6' value='Consultas' onblur='q6();'></td><td>Consultas</td>
   </tr>    
-->
<!--
es no <input type='text' id='direccion' onblur='di();'>
        <span  id='D' ></span></TD>
-->
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


