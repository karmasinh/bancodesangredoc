<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Nuevo</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='eliminar.js'></script>

  <script src='/mili1/dwr/interface/GestionarMenu.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

</head>


<body onload="listar()">

<div id='lista' >
<table class='tabla' >
<caption class='trCaption'>
<h3>Lista Eliminar Modulo </h3>
</caption>
 <thead class='tabla' >
  <TR class='trFilas'>
    <TD>Nro</TD>                  
    <TD>Modulo</TD>
    <TD>Eliminar</TD>
  </tr>
  </thead>
  <tbody class='tabla' id="listamod">
  </tbody>
</table>
</div>


<table class='tabla' id="listaelimodulo" style="display:none" >
<caption class='trCaption'>
<h3>Eliminar Modulo </h3>
</caption>
 <thead class='tabla' >
  <TR class='trFilas'>
    <TD>Modulo</TD>                  
    <TD>Eliminar <input type="hidden" id="id_mod"> <input type="hidden" id="cual"></TD>                  
 <TR class='trFilas'>
    <TD><span id='nombre'></span></TD>                  
    <TD><input type="button" value="Eliminar" onclick="Elimodulo()"></TD>                  

 </thead>
 <tbody class='tabla' id="elimodulo">
 </tbody>
</table>

<table class='tabla' id="listaelimenu" style="display:none" >
<caption class='trCaption'>
<h3>Eliminar Menu </h3>
</caption>
 <thead class='tabla' >
  <TR class='trFilas'>
    <TD>Menu  <input type="hidden" id="codmenu"></TD>                  
    <TD>enlace</TD> 
    <TD>Eliminar</TD> 
 </thead>
 <tbody class='tabla' id="elimenu">
 </tbody>
</table>

<table class='tabla' style='display:none' id='mensaje'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Eliminados Correctamente.............!</font></td>
</td>
</tr>
</table>

<div style='display:none' id='seguro'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar</h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='Eliminar();'></td>
</tr>
</table>
</BODY>
</html>
