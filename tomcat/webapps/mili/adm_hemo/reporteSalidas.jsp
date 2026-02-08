<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Reporte</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='validaciones.js'></script>
  <script src='rr3.js'></script>  
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/FechaReporteFracDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
function insertar()
{
var fecha_inicio=DWRUtil.getValue("fecha_inicio");
var fecha_final=DWRUtil.getValue("fecha_final");

document.getElementById("f1").innerHTML = fecha_inicio;
document.getElementById("f2").innerHTML = fecha_final;

FechaReporteFracDAO.cont(mostrar,fecha_inicio,fecha_final)
}

function mostrar(data)
{
$(lista).style.display='none';
$(reportes).style.display='';

}

 </script>
<body onload='fechas();'>
<div  id='lista' align="center">
<table class='tabla'>

<caption class='trCaption'>
<h3>Introdusca las Fechas:.</h3>
</caption>


<tr class='trFilas'>
<TD align='center'>Fecha Inicio:.</TD>
<TD  align='rigth'>
    <FORM name='caja'  method='post' onclick='v1();'>
    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_inicio' id='fecha_inicio' readonly='true' size='15'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_inicio');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
    <span id='E1'></span>
</TD>
</tr>
                   
<tr class='trFilas'>
<TD  align='center'>Fecha Final:.</TD>
<TD  align='rigth'>
    <FORM name='reporte'  method='post' onclick='v2();'>
    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_final' id='fecha_final' readonly='true' size='15'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('reporte.fecha_final');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
    <span id='E2'></span>
</TD>

</tr>
</table>
<br>

<table class='tabla'>
<tr class='trFilas'>

<td colspan="3"  align="center"><div id='agregar'></div></td>
<td   align="center"><input type='image' src='../imagenes/cancelar1.png' onclic=''></td>
</tr>
</table>

</div>

  
<div id='reportes' style='display:none'>

<table class='tabla' align='center' border='0'>
<caption>
	<h3 bgcolor='#FFFFFF'>Informe de Produccion de Servicios y Vigilancia</h3>
	<h5>Salida de Unidades de <br>Sangre y/o Hemocomponentes</h5>
</caption>

	<tr ALIGN='CENTER'  bgcolor='#FFFFFF'> 
	<TH align='center'>Codigo: R A SNIS-305</TH>
        <td align='center'>Desde <span id='f1'></span>...Hasta <span id='f2'></span></td>
        </tr>


</table>
<br>
<br>
<table class='tabla' border='0'>
<tr><td>
<h5>Destino Privado</h5>
<td><tr>
</caption>

<tr>
<td>Nºsalida</td>
<td>Codigo</td>
<td>Hemocomponente</td>
<td>Fecha de salida</td>
<td>Destino</td>
</tr>
</table>
<br>
<br>
<table class='tabla' border='0'>
<tr><td>
<h5>Destino Estatal</h5>
</td></tr>

<tr>
<td>Nºsalida</td>
<td>Codigo</td>
<td>Hemocomponente</td>
<td>Fecha de salida</td>
<td>Destino</td>
</tr>
</table>

<table class='tabla'  align='center'  border='0'> 
<pre>
  <tr>
    <td align='center'><input type='image' src='../imagenes/firma13.png'></td>
  </tr>
  <tr  bgcolor='#FFFFFF'>
    <td><div id='fecha1'></div></td>
  </tr>
</pre>
</table>
<br>
<table class='tabla'  align='center'> 
<tr class='trFilas'>
    <td colspan='3' align='center'><input type='image' src='../imagenes/imprimir.png' onclick='print();'></td>
    <td align='center'><input type='image' src='../imagenes/cancelar1.png' ></td>
</tr>
</table>

</div>

</body>
</html>


