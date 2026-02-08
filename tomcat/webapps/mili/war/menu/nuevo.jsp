<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Nuevo</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='nuevo44.js'></script>

  <script src='/mili1/dwr/interface/GestionarMenu.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

</head>


<body onload="listar()">

<div id='formulariomodulo' >
<table class='tabla' >
<caption class='trCaption'>
<h3>Registrar Modulo </h3>
</caption>
  <TR class='trFilas'>
    <TD>Nombre de modulo:</TD>                  
    <TD><input  id="nom" type="text"> </TD>
    <TD>Rol: 
	<select id='rol' >
    <option value="-1" selected='selected' >---</option>
        </select>
    <input type='hidden' id="id_mod">
    </TD>
  <tr class='trFilas'>
    <td colspan="3" align="center" id="boton"><input type='button' value='Aceptar' onclick="enviar()"></td>
  </tr>
</table>
</div>

<div id='fmenu' style="display:none" >
<table class='tabla' >
<caption class='trCaption'>
<h3>Registrar Menu </h3>
</caption>
  <TR class='trFilas'>
    <TD>Nombre de Menu:</TD>                  
    <TD><input  id="menu" type="text"> </TD>
    <TD>Enlace:</TD>                  
    <TD><input  id="enlace" type="text"> </TD>
    </TD>
  <tr class='trFilas'>
    <td colspan="3" align="center"><input type='button' value='Aceptar' onclick="addmenu()"></td>
  </tr>
</table>
<table class='tabla'>
<caption class='trCaption'>
<h3>Lista Menu </h3>
</caption>
    <thead class='tabla'>
  <TR class='trFilas'>
    <TD>Nombre de Menu:</TD>                  
    <TD>Enlace:</TD>                  
    </TD>
    </thead>
    
    <tbody class='tabla' id="dentromenu">
    </tbody>
</table>
</div>
</BODY>
</html>


