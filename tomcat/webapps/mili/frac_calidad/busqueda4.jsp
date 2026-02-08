<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Resultados</title>
   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='validaciones.js'></script>
  <script src='busque.js'></script>
  <script src='pag.js'></script>
  
  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>
  <script src='/mili1/dwr/interface/NuevoDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>
<body>
    <input type='hidden' id='total'>

<!-- inicio busqueda : por ci,cod_do y apepa-->
<table class='tabla' style='display' id='busqueda'>
    <caption class='trCaption'><h3>Busqueda de Donantes<input type='image' src='../imagenes/progress.gif' ></input></h3></caption>
    <tr class='trFilas'>
	<td align="right">Codigo::..</td>
	<td align="center"><input type='text' name='cod_do'  id='cod_do' size='15' maxlength='9'></td>
        <td align="center"><span id='EmC'></span></td>         
	<td align="left"><input type='image' src='../imagenes/david.png'  onclick='BusquedaCodigo();'></td>
    </tr>
    <tr class='trFilas'>
	<td align="right">Nro de CI::..</td>
	<td align="center"><input type='text' name='ci' size='15' maxlength='7'></td>
        <td align="center"><span id='EmCi'></span></td>
	<td align="left"><input type='image' src='../imagenes/david.png'  onclick='BusquedaCi();'></td>
    </tr>
    <tr class='trFilas'>
	<td align="right">Apellido Paterno::..</td>
	<td align="center"><input type='text' name='apepa' size='15' maxlength='10'></td>
        <td align="center"><span id='EmA'></span></td>    
	<td align="left"><input type='image' src='../imagenes/david.png'  onclick='BusquedaApellido();'></td>

    </tr>
</table>
<!-- fin busqueda : por ci,cod_do y apepa-->

<!/////////INICIO BUSQUEDA POR APELLIDO>
<div style='display:none' id='resultado_apellido'>
    <table class='tabla' >
          <caption class='trCaption'><h3>Informacion del Donante</h3></caption>
          <BR>
          <thead>
          <tr class='trFilas'>
               <th>Codigo</th>
               <th>Nombre</th>
               <th>Ape.Paterno</th>
               <th>Ape.Materno</th>
	       <th>Ingresar</th>
          </tr>
          </thead>
          <tbody id='campos_de_apellido' align='center'></tbody>
    </table>
    <input type='hidden' id='total'>
     <br><center><div id='enlaces'></div></center>
</div>

</div>
<!/////////FIN DE BUSQUEDA POR APELLIDO>

<!/////INICIO BUSQUEDA POR CI Y CODIGO////////////>
<div style='display:none' id='resultado_todo'>
    <table class='tabla'>
        <caption class='trCaption'><h3>Informacion del Donante</h3></caption>
        <BR>
	<input type='hidden' id='cod_do'>
        <thead>
        <tr class='trFilas'>
             <th>Codigo</th>
             <th>Nombre</th>
             <th>Ape.Paterno</th>
             <th>Ape.Materno</th>
             <th>Gs_rh</th>
        </tr>
        </thead>
        <tbody id='campostodos' align='center'></tbody>
    </table>
    <PRE></PRE>
    <table class='tabla'>
        <thead>
        <tr class='trFilas'>
             <th>Nro</th>
             <th>Fecha</th>
             <th>Edad</th>
             <th>Resultado</th>
        </tr>
        </thead>
        <tbody id='camposResultados' align='center'> </tbody>
    </table>
    <PRE></PRE>
    <table class='tabla'>
        <tr class='trFilas'>
            <td align='center'><input type='image' src='../imagenes/adicionardonante.png'  onclick='agregar_donante();'></td>
        </tr>
    </table>
</div>
<!/////FIN BUSQUEDA POR CI Y CODIGO////////////>

<!-- **********************************************-->
<!-- *************inicio de modificar*********************************-->
<div style='display:none' id='resultado_donacion'>
    <table class='tabla'>
        <caption class='trCaption'><h3>Adicionar  Donacion</h3></caption>
        <BR>
        <thead>
        <tr class='trFilas'>
             <th></th>
             <th>Codigo</th>
             <th>Nombre</th>
             <th>Ape.Paterno</th>
             <th>Ape.Materno</th>
             <th>Gs_rh</th>
             <th>Ci</th>
             <th>Profesion</th>
             <th>Ocupacion</th>
        </tr>
        </thead>
        <tbody id='campos_1' align='center'></tbody>
    </table>
    <table class='tabla'>
        <thead>
        <tr class='trFilas'>
            <th>Lugar Trabajo</th>
            <th>Email</th>
            <th>Fono Propio</th>
            <th>Celular</th>
            <th>Fono Vecino</th>
            <th>Fono Trabajo</th>
        <!--/tr-->
        </thead>
        <tbody id='campos_2' align='center'></tbody>
    </table>
    <table class='tabla'>
        <thead>
        <tr class='trFilas'>
	    <th>Domicilio</th>
            <th>Calle/Residencia</th>
            <th>Nro</th>
            <th>Zona</th>

        <!--/tr-->
        </thead>
        <tbody id='campos_3' align='center'></tbody>
        <thead>
        <tr class='trFilas'>
	    <th>Domicilio1</th>
            <th>Calle/Residencia</th>
            <th>Nro</th>
            <th>Zona</th>
        
        <!--/tr-->
        </thead>
        <tbody id='campos_4' align='center'></tbody>
        </table>
	<PRE></PRE>
    <table class='tabla'>
        <tr class='trFilas'>
	    <td align='center'><input type='image' src='../imagenes/aceptar.png'  onclick='modificar_valor();'></td>
        </tr>
    </table>
</div>
<!-- *************fin de modificar************************************-->

<!-- *************************************************-->
<table class='tabla' style='display:none' id='mensaje' align='center'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
<pre>
<td align='center'><input type='image' src='../imagenes/next.png'  onclick='visualizar();'></td>
</tr>
</table>



<!-- ****************************************************-->

<!-- ***************inicio examen fisico********************************-->
<div style='display:none' id='examenFisico'>
    <table class='tabla'>
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
			    <td><span  id='id_aten1' ></span><input type='hidden' id='id_aten'></td>
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
	            <td><select id='tipo_do'  onChange='validarCombos111();'>         
			  <option value="V" align='center'>Voluntaria</option>
		          <option value="R" align='center'>Reposicion/Familiar</option>
		          <option value="A" align='center'>Autóloga</option>
			  <option value="-1" selected='selected'>---Seleccione---</option>
		       </select>
	              <span id='EmCom'></span></td>
	           <td><select id='veces' onChange='validarCombos112();'>
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
	    		<td><input id='pulso' size="3"  onBlur='validarEntero113();'  maxlength='3'>
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
		    </table> 
		    <BR>
		    <table class='tabla'>		     
		     <tr class='trFilas'>
			<td colspan="3"  align='center' ><div id='agregar12'></div></td>
			<td align='center'><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td> 
		     </tr>
		    </table>

		     
		</table>
		</tr>
</table>
</div>

<!-- *****************fin examen fisico********************************-->
<!-- *****************inicio MENSAJE examen fisico********************************-->
<table class='tabla' style='display:none' id='avisoEF'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>


<!-- *****************fin MENSAJE examen fisico********************************-->

</body>
</html>
