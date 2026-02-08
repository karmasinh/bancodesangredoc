<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Fraccionamiento</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

   <script src='validaciones.js'></script>
   <script src='listaProd.js'></script>

  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
   <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
   <SCRIPT language='JavaScript' src="../scripts/overlib_mini1.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>

  </script>

<body onload='Listar();' >  

    <input  id="id_horario" type="text">
    <input  id="cod_per" type="text">


<table class='tabla'  id='extra1' style='display:none'>
<caption class='trCaption'>
<h3>Lista de extracciones a fraccionar</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nro Atencion</th>
<th>Nro Extraccion</th>
<th>Codigo de Donante</th>
<th>Fecha Extraccion</th>
<th>Bolsa</th>
<th>Fraccionar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>


<input type='hidden' id='id_aten'>
<input type='hidden' id='id_ext'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='resultado'>
<input type='hidden' id='bolsa'>
<input type='hidden' id='n1'>

<table class='tabla'  id='extra2' style='display:none'>
<caption class='trCaption'>
<h3>Registrar Fraccionamiento</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro extraccion</th>
<th>Codigo de Donante</th>
<th>Grupo Sanguineo</th>
</tr>
</thead>
<tbody id='campos1' align='center'>
</tbody>
</table>



<table class='tabla' align='center'  id='extra3' style='display:none'>
<caption class='trCaption'>
<h3>Registrar Fraccionamiento</h3>
</caption>

<tr class='trFilas'>
<td align="right"><h5></h5>Codigo:</td><td><span id='cod_do1'></span></td>
<td align="right"><h5></h5>Bolsa:</td><td><span id='bolsa1'></span></td>
</tr>

<tr class='trFilas'>
<input type='hidden' id='i'>
<td align="right">Hemocomponente:</td>
<td><select id='n0' size='5'  style='display:none' onBlur='validarCombo(n0);' ></select> </td>

<td align="right">Cantidad:</td>
<td><input type='text' id='cantidad' size='6' maxLength='3'  onBlur='validarNum();'> ml 
<span id='EmCant'></span>
</td>

</tr>

<tr class='trFilas'>
<TD align="right">Fecha de Produccion:</TD>

<td><FORM name='caja'  method='post' >
    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input  id='fecha_produccion' readonly='true' size='15'    onBlur='validarFechae21();'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_produccion');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
<span id='EmFechae1'></span>
</td>
<td align="right">Fecha Expiracion:</td>
<td><FORM name='caja1'  method='post'>
    <span id='overDiv1' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_expi' id='fecha_expi' readonly='true' size='15'    onBlur='validarFechae2();'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja1.fecha_expi');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
<span id='EmFechae'></span>
</td>
<td></td>
</tr>

<tr class='trFilas'>

<td colspan="3" align="center"><div id='mili'></div></td>
<td colspan="3" align="center"></td>
<!-- 
<input type='submit' value='Aceptar' onclick='insertarValor();'></TD>     
<TD> <input type='submit' value='Finalizar' onclick='updateTT();'></TD>     
-->
<TD></TD>     
<TD></TD>     
</tr>

</table>

<table class='tabla'  id='prod11' style='display:none'>
<caption class='trCaption'>
<h3>Lista de hemocomponentes ya Fraccionados</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Hemocomponente</th>
<th>Cantidad</th>
<th>Fecha-Producción</th>
<th>Fecha-Expiración</th>
</tr>
</thead>
<tbody id='campos233' align='center'>
</tbody>
<td colspan="3" align="center"><div id='volver'></div></td>
</table>


<table class='tabla'  id='prod22' style='display:none'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>


<table class='tabla'  id='EstaMal' style='display:none'>
<caption class='trCaption'>
<font color="blue" size='3'>La Cantidad es Incorrecta.............!</font>
<pre>
<center><input type='image' src='../imagenes/atras.png' onclick='Denuevo();'></center>
</caption>
</table>



</body>
</html>


