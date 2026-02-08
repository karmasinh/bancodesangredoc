<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Nuevo</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='modificar.js'></script>

  <script src='/mili1/dwr/interface/GestionarMenu.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

</head>


<body onload="listar()">

<div id='lista' >
<table class='tabla' >
<caption class='trCaption'>
<h3>Lista Modificar Modulo </h3>
</caption>
 <thead class='tabla' >
  <TR class='trFilas'>
    <TD>Nro</TD>                  
    <TD>Modulo</TD>
    <TD>Modificar</TD>
  </tr>
  </thead>
  <tbody class='tabla' id="listamod">
  </tbody>
</table>
</div>

<table class='tabla' id="fmodulo" style="display:none" >
<caption class='trCaption'>
<h3>Modificar Modulo </h3>
</caption>
  <TR class='trFilas'>
    <TD>Nombre de modulo:</TD>                  
    <TD><input  id="nom" type="text"> </TD>
    <TD>Rol: 
	<select id='rol' >
    <option value="-1" selected='selected' >---</option>
        </select>
    <input type='hidden' id="id_mod">
  <tr>
    <td colspan="3" align="center" id="boton"><input type='button' value='Modificar' onclick="Modificarmodulo()"></td>
  </tr>
</table>

<table class='tabla' id="fmenu" style="display:none">
<caption class='trCaption'>
<h3>Modificar Menu </h3>
</caption>
    <thead class='tabla' >
  <TR class='trFilas'>
    <TD>Nro:</TD>                    
    <TD>Nombre de Menu:</TD>                  
    <TD>Enlace:</TD>                  
    </TD>
  </TR>
    </thead>
    <tbody class='tabla' id="mmenu">
    </tbody>    
  </tfoot class='tabla'>
  <tr class='trFilas'>
    <td colspan="3" align="center"><input type='button' value='Modificar' onclick="Modificarmenu()"></td>
  </tr>
  </tfoot>
</table>

<div id='afmenu' style="display:none" >
<table class='tabla' >
<caption class='trCaption'>
<h3>Registrar Menu </h3>
</caption>
  <TR class='trFilas'>
    <TD>Nombre de Menu:</TD>                  
    <TD><input  id="amenu" type="text"> </TD>
    <TD>Enlace:</TD>                  
    <TD><input  id="aenlace" type="text"> </TD>
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
    
    <tbody class='tabla' id="adentromenu">
    </tbody>
</table>
</div>









<table class='tabla' style='display:none' id='mensaje'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Modificado Correctamente.............!</font></td>
</td>
</tr>
</table>

</BODY>
</html>
