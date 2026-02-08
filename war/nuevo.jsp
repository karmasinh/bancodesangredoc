<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Nuevo</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='validaciones.js'></script>
   <script src='nuevo44.js'></script>
   <script src='pi.js'></script>
   <script src='nuevo5.js'></script>

  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/interface/NuevoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>

</head>


<body onload='conteo();'>

    <div id='formulario' >
    <table class='tabla' >

    <input type='text' id='fecha'>

    <caption class='trCaption'>
    <h3>Registrar Donante </h3>
    </caption>

    <tr class='trFilas'  ><td><h5>Numero de Donante:...  <span  id="id_per" ></span></h5></TD>
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
    <TD>Codigo de Donante</TD>
     <TD><INPUT id='cod_do' onBlur='validarCadena3();' readonly='true'>
        <span id='EmC'></span>         
     </TD>
 </TR>
 <TR class='trFilas'>
    <TD>C.I.:</TD>
    <TD><input id='ci' onBlur='validarEntero();' maxlength='7'>
        <span id='EmCi'></span>
	<span id='cici'></span>
	<span id='cic'></span>
    </TD>
    <TD>Pasaporte:</TD>
    <TD><input id='pasaporte' onBlur='validarCadena4();'>
        <span id='EmP'></span>
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
      <input type='hidden'  id="fecha_naci">
      <TD><span  id="EmFF" ></span></TD>
      <TD><span  id="EmAP" ></span></TD>
</TR>     


  <TR class='trFilas'>
  
     <TD>Edad:</TD>
     <TD valign='bottom'><span id='uno'></span>   Años</TD>

     <TD>Sexo:</TD>
     <TD> <select id='sexo' onblur='validarCombos();'>
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
    <TD>Residencia Calle/Av:</TD>
    <TD><INPUT id='calle_residencia' onBlur='validarCadena5();'>
        <span id='EmCa'></span>
    </TD>
    <TD>Numero:</TD>
    <TD><INPUT id='num' onBlur='validarEntero1();'>
        <span id='EmNum'></span>
    </TD></TR>
  <TR class='trFilas'>
    <TD>Zona:</TD>
    <TD><INPUT id='zona' onBlur='validarCadena6();'>
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
        <TD>Telefono(vecino/familiar):</TD>
	<TD><input id='fono_vec' onBlur='validarEntero4();'>
        <span id='EmFov'></span>
	</TD>
    </TR>
    
    <TR class='trFilas'>
    <TD><h3> Trabajo:<h3></TD>
    <TD>Lugar de Trabajo:</TD>
    <TD><input id='lugar_tra' onBlur='validarCadena7();'>
    <span id='EmLu'></span></TD>
    <TD></TD>
    </TR>
    <INPUT type=hidden id='tipo_domt' value='trabajo'>
  
  <TR class='trFilas'>
    <TD>Direccion:Calle/Av:</TD>
    <TD><INPUT id='calle_residenciat' onBlur='validarCadena8();'>
        <span id='EmCare'></span>
    </TD>
    <TD>Numero:</TD>
    <TD><INPUT id='numt' onBlur='validarEntero5();'>
        <span id='EmNu'></span>
    </TD></TR>
  <TR class='trFilas'>
<TD>Zona:</TD>
    <TD><input id='zonat' onBlur='validarCadena9();'>
        <span id='EmZ'></span>
    </TD>
    <TD>Telefono de trabajo:</font></TD>
    <TD><input id='fono_tra' onBlur='validarEntero6();'>
        <span id='EmFt'></span>
    </TD></TR>
  <TR class='trFilas'>
    <TD>Fax:</TD>
    <TD><input id='fax' onBlur='validarCadena10();'>
        <span id='EmFa'></span>
    </TD>
    <TD>Casilla:</TD>
    <TD><input id='casilla' onBlur='validarCadena11();'>
        <span id='EmCasi'></span>
    </TD></TR>
  <TR class='trFilas'>
    <TD>Profesion:</TD>
    <TD><input id='prof' onBlur='validarCadena12();'>
        <span id='EmProf'></span>
    </TD>
    <TD>Ocupacion:</TD>
    <TD><input id='ocu' onBlur='validarCadena13();'>
        <span id='EmOcu'></span>
    </TD></TR>




<tr class='trFilas'>
<td colspan="3" align="center"><div id='agregar'></div></td>
<td><input type='image' src='../imagenes/cancelar1.png'  onclick='ejecutarCero();'></td>
</tr>
</table>
</tr>
</table>

</div>




<table class='tabla' style='display:none' id='aviso' align='center'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
<pre>
<td align='center'><input type='image' src='../imagenes/next.png'  onclick='visualizar();'></td>
</tr>
</table>



<div style='display:none' id='formulario_examenFisico'>
    
    <table class='tabla'>
    <tr>
    <input type='HIDDEN' id='cod_doCodigo'>
    <input type='text' id='fecha'>
    <input type='text' id='cod_per'>
    <input type='text' id='id_horario'>
    </tr>
    
	<caption class='trCaption'><h3>Examen Fisico</h3></caption>
	    <input type="hidden" id='atendido' value="T">
	    <input type="hidden" id='atendidop' value="T">
	    <input type="hidden" id='atendidoh' value="T">
	    <input type="hidden" id='atendidos' value="T">
	    <input type="hidden" id='atendidoe' value="T">
		<tr class='trFilas'>
		    <table class='tabla'>
		    	<tr>
			    <td align="right">Nro:.</td>
			    <td><span  id='id_aten' ></span><input type='HIDDEN' id='id_aten'></td>
			    <td></td><td></td><td></td><td></td><td></td>
			    </tr>
			    <tr class='trFilas'>
			    <td align="right">Fecha:</td>
			    <td>
				<FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
                        	    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
                        	    <input  id='fecha_a' readonly='true' size='15'>
                    		    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_a');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
                		</FORM>
	        		<span id='EmFechae'></span>
			    </td>
			    <td align="right">Hora:</td>
	    		    <td><span  id='hora_a' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>
	    		</tr>
	           </table>
	       </tr>
	       <tr class='trFilas'>
	         <table class='tabla'>
	            <td align="right">Tipo de Donacion:</td>
	            <td><select id='tipo_do'  onblur='validarCombos111();'>         
			  <option value="V" align='center'>Voluntaria</option>
		          <option value="R" align='center'>Reposicion/Familiar</option>
		          <option value="A" align='center'>Autóloga</option>
			  <option value="-1" selected='selected'>---Seleccione---</option>
		       </select>
	              <span id='EmCom'></span></td>
	           <td><select id='veces' onblur='validarCombos112();'>
		          <option value="H" align='center'>Habitual</option>
		          <option value="P" align='center'>Primera Vez</option>
			  <option value="-1" selected='selected'>---Seleccione---</option>
	               </select>
		 <span id='EmComb'></span></td><td></td><td></td>
	       </table>
	      </tr> 
	     <tr align='center' class='trFilas'>
		<table class='tabla'>
		    <tr class='trFilas'><td valign='bottom'><h5>Tension Arterial:</h5></td></tr>
		    <tr class='trFilas'><td align="right">Sistólica</td>
			<td><input id='sistolica'  size="3"  onBlur='validarEntero111();' maxlength='3'>
	        	<span id='EmSi'></span></td>
			<td align="right">Diastólica</td>
			<td><input id='diastolica'  size="3" onBlur='validarEntero112();'  maxlength='3'>
		            <span id='EmDi'></span>
			</td>
		    </tr>
		    <tr class='trFilas'><td align="right">Pulso</td>
	    		<td><input id='pulso' size="3"  onBlur='validarEntero113();'  maxlength='2'>
	    		<span id='EmPu'></span>
			pul./min.</td>
			<td align="right">Peso</td>
			<td><input id='peso'  size="3" onBlur='validarEntero114();'  maxlength='3'>
	    		    <span id='EmPe'></span>
			Kg.</td></tr>
		    <tr class='trFilas'>
			<td align="right">Talla</td>
			<td><input id='talla' size="3" onBlur='validarEntero115();'  maxlength='4'>
	    		<span id='EmTa'></span>
			cms.</td>
			<td align="right">Temperatura</td>
			<td><input id='temperatura' size="3" onBlur='validarEntero116();'  maxlength='2'>
	    		<span id='EmTe'></span>
			°C</td>
		     </tr>
		     
		      <table class='tabla'>		     
		     <tr class='trFilas'>
			<td colspan="3"   align='center' ><div id='agregar12'></div></td>
			<td align='center'><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td> 
		     </tr>
		    </table>

		     
		</table>
		</tr>
</table>
</div>



<table class='tabla' style='display:none' id='avisoEF'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>

</BODY>
</html>


