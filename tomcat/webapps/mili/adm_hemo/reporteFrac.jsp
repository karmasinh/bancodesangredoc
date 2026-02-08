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
  <script src='rr.js'></script>  
  
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

$(lista).style.display='none';
$(reportes).style.display='';

FechaReporteFracDAO.cont(mostrar,fecha_inicio,fecha_final);
FechaReporteFracDAO.cont1(mostrar1,fecha_inicio,fecha_final);
FechaReporteFracDAO.cont3(mostrar3,fecha_inicio,fecha_final);
FechaReporteFracDAO.cont4(mostrar4,fecha_inicio,fecha_final);

FechaReporteFracDAO.cont6(mostrar5,fecha_inicio,fecha_final);
FechaReporteFracDAO.cont7(mostrar6,fecha_inicio,fecha_final);
FechaReporteFracDAO.cont8(mostrar7,fecha_inicio,fecha_final);
FechaReporteFracDAO.contotal(mostrar8,fecha_inicio,fecha_final);
}

function mostrar(data)
{
DWRUtil.setValue('primero',data);
document.getElementById("total").innerHTML = data;
}

function mostrar1(data)
{
DWRUtil.setValue('total12',data);
document.getElementById("total2").innerHTML = data;
}


function mostrar3(data)
{
DWRUtil.setValue('total13',data);
document.getElementById("total3").innerHTML = data;
}

function mostrar4(data)
{
DWRUtil.setValue('total14',data);
document.getElementById("total4").innerHTML = data;
}

function mostrar5(data)
{
DWRUtil.setValue('total15',data);
document.getElementById("total5").innerHTML = data;
}

function mostrar6(data)
{
DWRUtil.setValue('total16',data);
document.getElementById("total6").innerHTML = data;
}

function mostrar7(data)
{
DWRUtil.setValue('total11',data);
document.getElementById("total1").innerHTML = data;
}

function mostrar8(data)
{
DWRUtil.setValue('ultimo',data);
document.getElementById("countotal").innerHTML = data;
calcular();
calcular1();
calcular2();
calcular3();
calcular4();
calcular5();
calcular6();
//calcular7();
}


function calcular()
{
var p =DWRUtil.getValue("primero");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=(a*b)/100;
DWRUtil.setValue('primero2',t);
document.getElementById("primero1").innerHTML = t;
}

function calcular1()
{
var p =DWRUtil.getValue("total12");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=(a*b)/100;
DWRUtil.setValue('segundo2',t);
document.getElementById("segundo").innerHTML = t;
}


function calcular2()
{
var p =DWRUtil.getValue("total13");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=(a*b)/100;
DWRUtil.setValue('tercero2',t);
document.getElementById("tercero").innerHTML = t;
}

function calcular3()
{
var p =DWRUtil.getValue("total14");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=(a*b)/100;
DWRUtil.setValue('cuarto2',t);
document.getElementById("cuarto").innerHTML = t;
}

function calcular4()
{
var p =DWRUtil.getValue("total15");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=(a*b)/100;
DWRUtil.setValue('quinto2',t);
document.getElementById("quinto").innerHTML = t;
}


function calcular5()
{
var p =DWRUtil.getValue("total16");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=((a+b)*b)/100;
document.getElementById("sexto").innerHTML = t;
}

function calcular6()
{
var p =DWRUtil.getValue("total16");
var u =DWRUtil.getValue("total11");
var a=parseInt(p);
var b=parseInt(u);
var t=((a+b)*a)/100;
document.getElementById("septimo").innerHTML = t;
}

function calcular7()
{
var p =DWRUtil.getValue("primero2");
var u =DWRUtil.getValue("segundo2");
var m =DWRUtil.getValue("tercero2");
var n =DWRUtil.getValue("cuarto2");
var k =DWRUtil.getValue("quinto2");
var a=parseDouble(p);
var b=parseDouble(u);
var c=parseDouble(m);
var d=parseDouble(n);
var e=parseDouble(k);
var f=a+b+c+d+e;
document.getElementById("noveno").innerHTML = f;
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
	<h3 bgcolor='#FFFFFF'>Informe de Produccion de Servicios y Vigilancia
		<br>Fraccionamiento</h3>
</caption>

	<tr ALIGN='CENTER'  bgcolor='#FFFFFF'> 
	<TH align='center'>Codigo: R A SNIS-305</TH>
        <td align='center'>Desde <span id='f1'></span>...Hasta <span id='f2'></span></td>
        </tr>

</table>

<br>
<table class='tabla' align='center' border='0'>
<tr>
<td><h5>Hemocomponente</h5></td>
<td align='center'><h5>Nº</h5></td>
<td align='center'><h5>%</h5></td>
</tr>

<tr><td>-Plasma Fresco Congelado</td>
<td align='center'><span id='total'></span></td>
<input  type='hidden' id='primero'>
<td align='center'><div id='primero1'></div>
<input  type='hidden' id='primero2'></td>
</tr>


<tr><td>-Plasma Congelado</td>
<td align='center'><span id='total2'></span></td>
<input  type='hidden' id='total12'>
<td align='center'><div id='segundo'></div>
<input  type='hidden' id='segundo2'></td>
</tr>

<tr><td>-Concentrado de Globulos Rojos</td>
<td align='center'><span id='total3'></span></td>
<input type='hidden'  id='total13'>
<td align='center'><div id='tercero'></div>
<input  type='hidden' id='tercero2'></td>
</tr>

<tr><td>-Concentrado de Plaquetas</td>
<td align='center'><span id='total4'></span></td>
<input  type='hidden' id='total14'> 
<td align='center'><div id='cuarto'></div>
<input  type='hidden' id='cuarto2'></td>
</tr>

<tr><td>-Crioprecipitado</td>
<td align='center'><span id='total5'></span></td>
<input  type='hidden' id='total15'>
<td align='center'><div id='quinto'></div>
<input  type='hidden' id='quinto2'></td>
</tr>
</table>

<br>
<table class='tabla' border='0'>
<tr>
<td><h5>Sangre Total</h5></td>
<td align='center'><h5>Nº</h5></td>
<td align='center'><h5>%</h5></td>
</tr>

<tr>
<td>-Unidad de sangre total que fueron<br>separadas en hemocomponentes</td>
<td align='center'><span id='total1'></span></td>
<input  type='hidden' id='total11'>
<td align='center'><div id='sexto'></div></td>
</tr>

<tr>
<td>-Unidad de sangre total que no fueron<br>separadas en hemocomponentes</td>
<td align='center'><span id='total6'></span></td>
<input  type='hidden' id='total16'> 
<td align='center'><div id='septimo'></div></td>
</tr>
</table>

<br>

<table class='tabla' border='0'>
<tr>
<td><h5>Hemocomponentes</h5></td>
<td align='center'><h5>Nº</h5></td>
<td align='center'><h5>%</h5></td>
</tr>


<tr>
<td>-Total obtenidos</td>
<td align='center'><span id='countotal'></span><input type='hidden'  id='ultimo'> </td>
<td align='center'><div id='noveno'></div></td>
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


<table class='tabla'  align='center'> 
<pre>
<tr class='trFilas'>
    <td colspan='3' align='center'><input type='image' src='../imagenes/imprimir.png' onclick='print();'></td>
    <td align='center'><input type='image' src='../imagenes/cancelar1.png' ></td>
</tr>
</pre>
</table>



</div>


</body>
</html>


