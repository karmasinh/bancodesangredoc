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
  <script src='rt.js'></script>  
  
  <script src='/mili1/dwr/interface/ListaMedicaDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
<script>
  
function ListarR()
{
var fecha_inicio=DWRUtil.getValue("fecha_inicio");
var fecha_final=DWRUtil.getValue("fecha_final");

document.getElementById("f1").innerHTML = fecha_inicio;
document.getElementById("f2").innerHTML = fecha_final;

$("reporte1").style.display='none';
$("reporte").style.display='';

ListaMedicaDAO.cont(mostrar,fecha_inicio,fecha_final);
ListaMedicaDAO.cont1(mostrar1,fecha_inicio,fecha_final);
ListaMedicaDAO.cont2(mostrar2,fecha_inicio,fecha_final);
ListaMedicaDAO.cont3(mostrar3,fecha_inicio,fecha_final);
ListaMedicaDAO.cont4(mostrar4,fecha_inicio,fecha_final);
ListaMedicaDAO.cont6(mostrar6,fecha_inicio,fecha_final);
ListaMedicaDAO.cont7(mostrar7,fecha_inicio,fecha_final);
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
document.getElementById("total3").innerHTML = data;
}

function mostrar4(data)
{
document.getElementById("total4").innerHTML = data;
}


function mostrar6(data)
{
document.getElementById("total6").innerHTML = data;
}

function mostrar7(data)
{
document.getElementById("total7").innerHTML = data;
}

</script>  
  
<body onload='fechas();'>

<div  id='reporte1' align="center">
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

<div id='reporte' style='display:none'  bgcolor='#FFFFFF'> 

<table class='tabla'  align='center'  border='0'  bgcolor='#FFFFFF'> 

<tr bgcolor='#FFFFFF'> 

<table class='tabla'  align='center'  border='0'  bgcolor='#FFFFFF'> 
<caption>
	<h3 bgcolor='#FFFFFF'>Informe de Produccion de Servicios y Vigilancia</h3>
</caption>

	<tr ALIGN='CENTER'  bgcolor='#FFFFFF'> 
	<TH align='center'>Codigo: R A SNIS-305</TH>
        <td align='center'>Desde <span id='f1'></span>...Hasta <span id='f2'></span></td>
        </tr>
</table> 
</tr> 


<tr bgcolor='#FFFFFF'> 
<pre> 
<table class='tabla'  align='center'  border='0'  bgcolor='#FFFFFF'> 
<tr  bgcolor='#FFFFFF'> 
    <td><h5>Informacion de Donantes</h5></td>
    <td><h5>Total</h5></td>
</tr>

<tr  bgcolor='#FFFFFF'>
    <td>Personas que acuden a donar</td>
    <td><span id='total'></span></td>
  </tr>
  <tr  bgcolor='#FFFFFF'>
    <td>Donantes Diferidas Temporalmente </td>
    <td><span id='total1'></span></td>
  </TR>
  <tr  bgcolor='#FFFFFF'>
    <td>Donantes Diferidas Permanentemente</td>
    <td><span id='total2'></span></td>
  </TR>
  <tr  bgcolor='#FFFFFF'>
    <td>Donaciones de Sangre Efectuadas</td>
    <td><span id='total3'></span></td>
  </TR>
  <tr  bgcolor='#FFFFFF'>
    <td>Donaciones de Donantes Voluntarios Altruistas </td>
    <td><span id='total4'></span></td>
  </TR>
  <tr  bgcolor='#FFFFFF'>
    <td>Donaciones de Donantes de Reposicion o Familiares</td>
     <td><span id='total6'></span></td>
  </TR>
  <tr  bgcolor='#FFFFFF'>
    <td>Donaciones de Donantes Autologos </td>
    <td><span id='total7'></span></td>
  </TR>
</table>
</pre> 
</tr> 

<tr bgcolor='#FFFFFF'> 
<pre> 
<table class='tabla'  align='center'  border='0'  bgcolor='#FFFFFF'> 
  <tr  bgcolor='#FFFFFF'>
    <td align='center'><input type='image' src='../imagenes/firma12.png'></td>
  </tr>
  
  <tr  bgcolor='#FFFFFF'>
    <td><div id='fecha1'></div></td>
  </tr>
</table>
</pre> 
</tr> 



<tr bgcolor='#FFFFFF'> 
<pre> 
<table class='tabla'  align='center'> 
<tr class='trFilas'>
    <td colspan='3' align='center'><input type='image' src='../imagenes/imprimir.png' onclick='print();'></td>
    <td align='center'><input type='image' src='../imagenes/cancelar1.png' ></td>
</tr>
</table>
</pre> 
</tr> 

</table>
</div>

</body>
</html>


