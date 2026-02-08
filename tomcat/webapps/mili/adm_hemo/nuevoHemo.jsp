<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Hemocomponente</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='validaciones.js'></script>
  <script src='nuevoHemo.js'></script>

  <script src='/mili1/dwr/interface/NuevoHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>


function insertar()
{
var nombre=DWRUtil.getValue("nombre");
var descripcion=DWRUtil.getValue("descripcion");
NuevoHemoDAO.adicionarHemo(insertarDatos,nombre,descripcion);
}

function insertarDatos()
{
$(formulario).style.display='';
$(formulario1).style.display='none';
}

function conteo()
{
NuevoHemoDAO.countRegistro(conteoDatos);
}

function conteoDatos(data) {
document.getElementById("id_hemo").innerHTML = data;
}
</script>

<body onload='conteo();'>


<div align='center' style='display' id='formulario1'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar Nuevo Hemocomponente</h3>
</caption>

 <tr class='trFilas'>
    <TD>Nro de Hemocomponente:</TD>
    <TD align="left"><span  id='id_hemo'></span> </TD>
    <TD></TD>
    <TD></TD>
 </tr>
 <tr class='trFilas'>
    <TD>Nombre de Hemocomponente:</TD>
    <TD align="left"><input type='text' id='nombre' onBlur='v11();'>
    <span id='E1'>  </span>
    </TD>
    <TD>Descripcion:</TD>
    <TD align="left"><input type='text' id='descripcion'  onBlur='v22();'>
    <span id='E2'>  </span>
    </TD>
</tr>
</table>

<br>
<table class='tabla' >
 <tr class='trFilas'>
     <td colspan="3" align="center"><div id='agregar'></div></td>
     <td><input type="image" src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td>

</tr>
</table>

</div>



<table class='tabla' align='center' style='display:none' id='formulario'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>


</body>
</html>


