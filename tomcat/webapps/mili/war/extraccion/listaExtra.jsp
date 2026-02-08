<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>extraccion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='validaciones.js'></script>
  <script src='listaExtra1.js'></script>
  <script src='lista_validar.js'></script>
  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script>


  </script>

<body onload='Listar();' >  

    <input  id="id_horario" type="hidden">
    <input  id="cod_per" type="hidden">

<table class='tabla'  id='extra1' style='display'>
<caption class='trCaption'>
<h3>Lista de Donantes</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro</th>
<th>Codigo</th>
<th>A.Paterno</th>
<th>A.Materno</th>
<th>Nombre</th>
<th>Resultado-Pre</th>
<th>Extraccion</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

<div id='extra' style='display:none'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Registrar  Extraccion</h3>
</caption>

<input type="hidden" id='id_aten'>

<tr class='trFilas'>

<TH align="right">Nro de Extraccion::.</TH>
<td><span id='total'></span></td>
<TH align="right">Codigo de Donante::.</TH>
<td><span id='codigo'></span></td>
</TR>


<tr class='trFilas'>
   <TH align="right">Fecha Extraccion::.</TH>
   <TD> <FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_a' id='fecha_extra' readonly='true' size='15'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_extra');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM> </TD>
    <TH align="right">Hora::.</TH>
    <td><span  id='hora' ></span><input type='HIDDEN' id='hora'></td>
</TR>
</table>
<br>

<table class='tabla'>
<tr class='trFilas'>  
          <TD align="right">Bolsa:</TD>
          <TD> <select  id='bolsa' onblur='validarCombos1();' onChange='cantidadExtraida();'>
          <option value="-1">---Seleccione---</option>
          <option value="Simples">Simples</option>
          <option value="Dobles">Dobles</option>
          <option value="Triples">Triples</option>
          <option value="Cuadruples">Cuadruples</option>
          <option value="Quintuples">Quintuples</option>
       </select>
       <span id='EmComb'></span></TD>

    <TD align="right">Cantidad Extraida:</TD>
    <TD><input type='text' id='cant_extra'  readonly='true' size='10'>  </TD> 
    <span id='Emcan'></span></TD>
</TR>

<tr class='trFilas'>  
    <TD align="right">Tubuladora:</TD>
    <TD><INPUT  id='tubuladora'  onblur='validarCadena();' maxLength=9 size='18'>
	<span id='Emtubu'></span></TD>
    <TD></TD>
    <TD></TD>
</TR>
</table>

<br>
<table class='tabla'>
<TR>
<td colspan="3" align='center'><div id='agregar'></div></td>
<td  align='center'> <input type='image' src='../imagenes/cancelar1.png' onclick='Cancelar();'></td>
</TR>
</table>

</div>

<table class='tabla'  id='extra2' style='display:none'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>

</table>


</body>
</html>


