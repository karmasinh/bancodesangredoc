<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>predonacion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='y.js'></script>
  <script src='validacion.js'></script>
  
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

  <script>
var v81 = '1';
var v82 = '1';
var v83 = '1';
var v84 = '1';
var v85 = '1';
var v86 = '1';
var v87 = '1';
var v88 = '1';
var v89 = '1';

function validar(){
     if ((v82=='0')&&(v83=='0')&&(v84=='0')&&(v85=='0')&&(v86=='0')&&(v87=='0')){
      DWRUtil.setValue("agregar1","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>");
     }  
     else{
      DWRUtil.setValue("agregar1","");
     }
}

function v6(){  	  v82 = validarCombo ("m6","E6","*");validar();}
function v5(){  	  v83 = validarCombo ("h5","E5","*");validar();}
function v4(){  	  v84 = validarCombo ("m4","E4","*");validar();}
function v3(){  	  v85 = validarCombo ("h3","E3","*");validar();}
function v2(){  	  v86 = validarCombo ("s2","E2","*");validar();}
function v1(){ 		  v87 = validarCombo ("s1","E1","*");validar();}

var m1 = '0';
var m2 = '0';
var m3 = '0';
var m4 = '0';
var m5 = '0';
var m6 = '0';
var m7 = '0';

function q1(){m1 =1 ;vali();}
function q2(){m2 =1 ;vali();}
function q3(){m3 =1 ;vali();}
function q4(){m4 =1 ;vali();}
function q5(){m5 =1 ;vali();}
function q6(){m6 =1 ;vali();}
function q7(){m7 =1 ;vali();}

function vali(){
     if ((m1=='1')||(m2=='1')||(m3=='1')||(m4=='1')||(m5=='1')||(m6=='1')||(m7=='1')){
      v86='0';
      v87='0';
      validar();
     }  
}
  </script>


<body onload='Listar();' >  

    <table class='tabla' style='display' id='horario'>
	<caption class='trCaption'><h3>Registrar Horario</h3></caption>
    <tr>aqui<span id='pp'> </span></tr>
    </table>

    <table class='tabla' id='semana'  style='display'> 
	<tr class='trFilas'>
        <TD>Semana::.</td>
        <TD>de
          <select name="semanap" id="s1" onblur='v1();'>
          <option value="Lunes">Lunes</option>
          <option value="Martes">Martes</option>
          <option value="Miercoles">Miercoles</option>
          <option value="Jueves">Jueves</option>
          <option value="Viernes">Viernes</option>
          <option value="Sabado">Sabado</option>
          <option value="Domingo">Domingo</option>
	  <option value="-1" selected='selected' >---</option>
        </select><span id='E1'></span></TD>
	<TD>a 
          <select name="semanas" id="s2" onblur='v2();'>
          <option value="Lunes">Lunes</option>
          <option value="Martes">Martes</option>
          <option value="Miercoles">Miercoles</option>
          <option value="Jueves">Jueves</option>
          <option value="Viernes">Viernes</option>
          <option value="Sabado">Sabado</option>
          <option value="Domingo">Domingo</option>
	  <option value="-1" selected='selected' >---</option>
        </select><span id='E2'></span></TD>
	<input type='hidden' id='otro' >
	<td><input type='image' src='../imagenes/opcion.png'  onclick='sacar();'></td>
       </TR>
       </table>

    <table class='tabla' id='semana1'  style='display:none'> 
	<tr class='trFilas'>
        <td>Semana::.</td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	<td></td><td></td>
	
	</tr>
	<tr class='trFilas'>
	<td></td>
	<td><input type='checkbox' id='s3' value='Lunes' onblur='q1();'></td><td>Lunes</td>
	<td><input type='checkbox' id='s4' value='Martes' onblur='q2();' ></td><td>Martes</td>
	<td><input type='checkbox' id='s5' value='Miercoles' onblur='q3();'></td><td>Miercoles</td>
	<td><input type='checkbox' id='s6' value='Jueves' onblur='q4();'></td><td>Jueves</td>
	<td><input type='checkbox' id='s7' value='Viernes' onblur='q5();'></td><td>Viernes</td>
	<td><input type='checkbox' id='s8' value='Sabado' onblur='q6();'></td><td>Sabado</td>
	<td><input type='checkbox' id='s9' value='Domingo' onblur='q7();'></td><td>Domingo</td>
	<td><input type='image' src='../imagenes/opcion.png'  onclick='volver();'></td>
	</tr>
   </table>

<table class='tabla' style='display' id='horario1'>

      <tr class='trFilas'>
      <td>Hora de Entrada::.</td>
         <td>Hora
          <select name="hrs_entrada" id="h3" onblur='v3();'>
          <option value="01">01</option>
          <option value="02">02</option>
          <option value="03">03</option>
          <option value="04">04</option>
          <option value="05">05</option>
          <option value="06">06</option>
          <option value="07">07</option>
          <option value="08">08</option>
          <option value="09">09</option>
          <option value="10">10</option>
          <option value="11">11</option>
          <option value="12">12</option>
          <option value="13">13</option>
          <option value="14">14</option>
          <option value="15">15</option>
          <option value="16">16</option>
          <option value="17">17</option>
          <option value="18">18</option>
          <option value="19">19</option>
          <option value="20">20</option>
          <option value="21">21</option>
          <option value="22">22</option>
          <option value="23">23</option>
          <option value="24">24</option>
	  <option value="-1" selected='selected' >---</option>
          </select><span id='E3'></span></TD>

          <TD>Min.
          <select name="min_entrada" id="m4" onblur='v4();'>
          <option value="00">00</option>
          <option value="05">05</option>
          <option value="10">10</option>
          <option value="15">15</option>
          <option value="20">20</option>
          <option value="25">25</option>
          <option value="30">30</option>
          <option value="35">35</option>
          <option value="40">40</option>
          <option value="45">45</option>
          <option value="50">50</option>
          <option value="55">55</option>
	  <option value="-1" selected='selected' >---</option>
        </select><span id='E4'></span></TD>
        </tr>

          <tr class='trFilas'>
          <td>Hora de Salida::.</td>
          <td>Hora
          <select name="hrs_salida" id="h5" onblur='v5();'>
          <option value="01">01</option>
          <option value="02">02</option>
          <option value="03">03</option>
          <option value="04">04</option>
          <option value="05">05</option>
          <option value="06">06</option>
          <option value="07">07</option>
          <option value="08">08</option>
          <option value="09">09</option>
     
          <option value="10">10</option>
          <option value="11">11</option>
          <option value="12">12</option>
          <option value="13">13</option>
          <option value="14">14</option>

          <option value="15">15</option>
          <option value="16">16</option>
          <option value="17">17</option>
          <option value="18">18</option>
          <option value="19">19</option>
          <option value="20">20</option>

          <option value="21">21</option>
          <option value="22">22</option>
          <option value="23">23</option>
          <option value="24">24</option>
	  <option value="-1" selected='selected' >---</option>
        </select><span id='E5'><span></TD>

          <TD>Min.
          <select name="min_salida" id="m6" onblur='v6();'>

          <option value="00">00</option>
          <option value="05">05</option>
          <option value="10">10</option>
          <option value="15">15</option>
          <option value="20">20</option>
          <option value="25">25</option>
          <option value="30">30</option>
          <option value="30">35</option>
          <option value="40">40</option>
          <option value="45">45</option>
          <option value="50">50</option>
          <option value="55">55</option>
	  <option value="-1" selected='selected' >---</option>
           </select><span id='E6'></span></TD>
	 </tr>

 <table class='tabla' id='aceptar' style='display'>		     
    <tr class='trFilas'>
    <td colspan="3"   align='center' ><div id='agregar1'></div></td>
    <td align='center'><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td> 
    </tr>
  </table>

</table>



<table class='tabla' style='display:none' id='avisoEF'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>

</table>


</body>
</html>


