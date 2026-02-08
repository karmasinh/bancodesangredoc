<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='modi.js'></script>
  <script src='validacion.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

<body onload='listar();' >  
<div id='lista' >
<!--
<table class='tabla' align='center' >
<caption class='trCaption'>
<h3>Lista Modificar Roles </h3>
</caption>
 <thead class='tabla' align='center'>
  <tr class='trFilas' align='center'>
    <th>Nro</th>                  
    <th>Nombre</th>
    <th>Modificar</th>
  </tr>
  </thead>
  <tbody class='tabla' id="listamod" align='center'>
  </tbody>
</table>
-->
<table class='tabla'>
<caption class='trCaption'>
<h3>Lista de Modificar Roles</h3>
</caption>
<thead>
<tr class='trFilas'>
<th >Nro</th>
<th >Nombre</th>
<th >Modificar</th>
</tr>
</thead>
<tbody id="listamod" align='center'>
</tbody>
</table>

</div>

<div style='display' id='f' style="display:none">
<table class='tabla'>
<caption class='trCaption'>
<h3>Modificar Rol</h3>
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
    <br>
    <table class='tabla'>
    <tr class='trFilas'>
    <td colspan="3"  align="center"><div id='mili'><input type='image' src='../imagenes/aceptar.png' onclick='Modificar();'></div></td>
    <td  align="center"><input type='image' src='../imagenes/cancelar1.png' onclick='listar()'></td>
    </tr>
    </table>
</div>

<table class='tabla' style='display:none' id='mensaje'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>



</body>
</html>


