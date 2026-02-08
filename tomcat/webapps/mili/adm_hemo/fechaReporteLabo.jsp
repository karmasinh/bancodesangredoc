<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Reportes</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   
  <script src='validaciones.js'></script>
  <script src='ff.js'></script>  
  
  <script src='/mili1/dwr/interface/FechaReporteDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
function insertar()
{
var fecha_inicio=DWRUtil.getValue("fecha_inicio");
var fecha_final=DWRUtil.getValue("fecha_final");

document.getElementById("f1").innerHTML = fecha_inicio;
document.getElementById("f2").innerHTML = fecha_final;

$(lista).style.display='none';
$(lista2).style.display='';
FechaReporteDAO.cont(mostrar,fecha_inicio,fecha_final)
FechaReporteDAO.cont1(mostrar1,fecha_inicio,fecha_final)
FechaReporteDAO.cont2(mostrar2,fecha_inicio,fecha_final)
FechaReporteDAO.cont3(mostrar3,fecha_inicio,fecha_final)
FechaReporteDAO.cont4(mostrar4,fecha_inicio,fecha_final)
FechaReporteDAO.cont6(mostrar5,fecha_inicio,fecha_final)
FechaReporteDAO.cont7(mostrar6,fecha_inicio,fecha_final)
}

function mostrar(data)
{
document.getElementById("total").innerHTML = data;
}

function mostrar1(data)
{
document.getElementById("total1").innerHTML = data;
}

function mostrar2(data)
{
document.getElementById("total2").innerHTML = data;
}

function mostrar3(data)
{
document.getElementById("total4").innerHTML = data;
}

function mostrar4(data)
{
document.getElementById("total5").innerHTML = data;
}

function mostrar5(data)
{
document.getElementById("total6").innerHTML = data;
}
function mostrar6(data)
{
document.getElementById("total7").innerHTML = data;
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



<div  style='display:none' id='lista2' >

<table class='tabla' align='center' border='0'>
<caption>
<h3 bgcolor='#FFFFFF'>Informe de Produccion de Servicios y Vigilancia</h3>
</caption>
	<tr ALIGN='CENTER'  bgcolor='#FFFFFF'> 
	<TH align='center'>Codigo: R A SNIS-305</TH>
        <td align='center'>Desde <span id='f1'></span>...Hasta <span id='f2'></span></td>
        </tr>
</table>

<br>

<table class='tabla' align='center' border='0'>
<tr>
<td align='center'><h5>Pruebas de enfermedades</h5></td>
<td align='center'><h5>Unidades Reactivas</h5></td>
<td align='center'><h5>Unidades Tamizadas</h5></td>
</tr>

<tr><td align='center'>VIH</td>
<td align='center'><span id='total2'></span></td>
<td align='center'><span id='total4'></span></td>

<tr><td align='center'>HEPATITIS B</td>
<td align='center'><span id='total6'></span></td>
<td align='center'><span id='total4'></span></td>

<tr><td align='center'>HEPATITIS C</td>
<td align='center'><span id='total7'></span></td>
<td align='center'><span id='total4'></span></td>

<tr><td align='center'>CHAGAS(ELISA)</td>
<td align='center'><span id='total1'></span></td>
<td align='center'><span id='total4'></span></td>

<tr><td align='center'>CHAGAS(HAI)</td>
<td align='center'><span id='total'></span></td>
<td align='center'><span id='total4'></span></td>

<tr><td align='center'>SIFILIS</td>
<td align='center'><span id='total5'></span></td>
<td align='center'><span id='total4'></span></td>
</table>
<br>
<br>
<br>
<table class='tabla' align='center' border='0'>
  <tr>
    <td align='center'><input type='image' src='../imagenes/firma13.png'></td>
  </tr>
  <tr  bgcolor='#FFFFFF'>
    <td><div id='fecha1'></div></td>
  </tr>

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


