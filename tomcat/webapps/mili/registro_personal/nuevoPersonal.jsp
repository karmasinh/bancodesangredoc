<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Nuevo</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='validacion.js'></script>
   <script src='cinco1.js'></script>
   <script src='cuatro.js'></script>

  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

</head>


<body onload='conteo();'>
    <div id='formulario' >
    <table class='tabla' >

    <caption class='trCaption'>
    <H3>    Registrar Personal    </H3>
    </caption>

    <tr class='trFilas'>
    <table class='tabla' >
    <tr class='trFilas'><TD><h5>Nro::.<span  id="id_per" ></span></h5></TD>
    </table>
    </tr>

    <TR class='trFilas'>
    <table class='tabla'>
    <TR class='trFilas'>
    <TD>Nombres:</TD>                  
    <TD><input  id="nom"  onBlur='validarCadena();'>
        <span id='EmN'></span>
    </TD>
    <TD>Apellido Paterno:</TD>
    <TD><input id='apepa' onBlur='validarCadena1();'>
        <span id='EmA'></span>    
    </TD>
 </TR>
 <TR class='trFilas'>
    <TD>Apellido Materno:</TD>
    <TD><input id='apema' onBlur='validarCadena2();'>
        <span id='EmAp'></span>    
    </TD>
        <TD>Codigo</TD>
     <TD><INPUT id='cod_do' onBlur='validarCadena3();' readonly='true'>
        <span id='EmC'></span>         
     </TD>

 </TR>
 <TR class='trFilas'>
    <TD>Usuario:</TD>
    <TD><input id='usuario' onBlur='validarCadena4();' maxlength='6'>
        <span id='EmP'></span>
    </TD>
    
    <TD>C.I.:</TD>
    <TD><input id='ci' onBlur='validarEntero();' maxlength='7'>
        <span id='EmCi'></span>
	<span id='cici'></span>
	<span id='cic'></span>
    </TD>
 </TR>

<TR class='trFilas'>
<TD>Fecha de Nacimiento:</TD>


     <TD>Dia:
    	  <select id='dia' onblur='validarCombos290();' >
          <option value='01'>01</option>
          <option value='02'>02</option>
          <option value='03'>03</option>
          <option value='04'>04</option>
          <option value='05'>05</option>
          <option value='06'>06</option>
          <option value='07'>07</option>
          <option value='08'>08</option>

          <option value='09'>09</option>
          <option value='10'>10</option>
          <option value='11'>11</option>
          <option value='12'>12</option>
          <option value='13'>13</option>
          <option value='14'>14</option>
          <option value='15'>15</option>
          <option value='16'>16</option>

          <option value='17'>17</option>
          <option value='18'>18</option>
          <option value='19'>19</option>
          <option value='20'>20</option>
          <option value='21'>21</option>
          <option value='22'>22</option>
          <option value='23'>23</option>
          <option value='24'>24</option>

          <option value='25'>25</option>
          <option value='26'>26</option>
          <option value='27'>27</option>
          <option value='28'>28</option>
          <option value='29'>29</option>
          <option value='30'>30</option>
          <option value='31'>31</option>

	  <option value="-1" selected='selected' >---</option>
          </select>
	  <span id='EmDiaA'></span>
     </TD>
     <TD>Mes
	  <select id='mes' onblur='validarCombos300();'>
          <option value='01'>Enero</option>
          <option value='02'>Febrero</option>
	  <option value='03'>Marzo</option>
	  <option value='04'>Abril</option>
	  <option value='05'>Mayo</option>
	  <option value='06'>Junio</option>
	  <option value='07'>Julio</option>
	  <option value='08'>Agosto</option>
	  <option value='09'>Septiembre</option>
	  <option value='10'>Octubre</option>
	  <option value='11'>Noviembre</option>
	  <option value='12'>Diciembre</option>
	  <option value="-1" selected='selected'>--------</option>
          </select>
	  <span id='EmMesA'></span>
     </TD>

     <TD> Año
	  <input id='ano'  onBlur='validarEntero310();' size='7'>
	  <span id='EmAnoA'></span>
	  <span id='EmMili'></span>
     </TD>
	<input type='hidden'  id="fecha_naci" >
      <TD><span  id="EmFF" ></span></TD>
      <TD><span  id="EmAP" ></span></TD>
</TR>     


  <TR class='trFilas'>
     <TD>Edad:</TD>
     <TD valign='bottom'><span id='uno'></span>   Años</TD>

     <TD>Sexo:</TD>
     <TD> <select id='sexo' onblur='validarCombos100();'>
          <option value='M'>Masculino</option>
          <option value='F'>Femenino</option>
	  <option value="-1" selected='selected'>---Seleccione---</option>
        </select>
	<span id='EmCombos'></span>
    </TD>
 </TR>
 <TR class='trFilas'>
    <TD>Procedencia:</TD>
    <TD><input  id='procedencia' onBlur='validarCadena44();'>
        <span id='EmPro'></span>
    </TD>
    <TD>Tipo de procedencia</TD>
          <TD> <select id='tipo_proce' onblur='validarCombos1();'>
          <option value="Urbano">Urbano</option>
          <option value="Rural">Rural</option>
	  <option value="-1" selected='selected'>---Seleccione---</option>
        </select>
	<span id='EmCombos1'></span>
      </TD>
  </TR>
  <TR class='trFilas'>
    <TD><h3>Domicilio:<h3></TD>
    <TD><INPUT type=hidden id='tipo_dom' value='propio'></TD></TR>
  <TR class='trFilas'>
    <TD>Residencia_Calle/Av:</TD>
    <TD><INPUT id='calle_residencia' onBlur='validarCadena5();'>
        <span id='EmCa'></span>
    </TD>
    <TD>Numero:</TD>
    <TD><INPUT id='num' onBlur='validarEntero1();' maxlength='4'>
        <span id='EmNum'></span>
    </TD></TR>
  <TR class='trFilas'>
    <TD>Zona:</TD>
    <TD><INPUT id='zona' onBlur='validarCadena6();' maxlength='10'>
        <span id='EmZo'></span>
    </TD>
    <TD>Teléfono:</TD>
    <TD><input  maxLength=5  id='fono_pro' onBlur='validarEntero2();'>
        <span id='EmFo'></span>
    </TD></TR>
  <TR class='trFilas'>
    <TD>Celular</font></TD>
    <TD><input  maxLength=8 id='cel' onBlur='validarEntero3();'>
        <span id='EmCel'></span>
    </TD>
    <TD>E-mail:</font></TD>
    <TD><input id='email' onBlur='validarEmail1();'>
        <span id='EmE'></span>
    </TD></TR>
    
  <TR class='trFilas'>
    <TD>Profesión:</font></TD>
    <TD><input  maxLength=13 id='cargo' onBlur='validarCadena31();'>
        <span id='EmCar'></span>
    </TD>
    <TD>Grado:</font></TD>
    <TD> <select id='grado' onblur='validarCadena32();'>
          <option value='Licenciado'>Licenciado</option>
	  <option value='Master'>Master</option>
          <option value='Doctor'>Doctor</option>

	  <option value="-1" selected='selected'>---Seleccione---</option>
        </select>
	<span id='EmGra'></span>
    </TD>    
    
</TR>



<tr class='trFilas'>
<td colspan="3" align="center"><div id='agregar'></div></td>
<td><input type="image" src="../imagenes/cancelar1.png" onclick='ejecutarCero();'></td>
</tr>
</table>
</tr>
</table>

</div>


<table class='tabla' style='display:none' id='aviso' align='center'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</tr>
</table>




</BODY>
</html>


