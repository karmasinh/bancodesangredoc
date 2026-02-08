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
  <script src='modificar.js'></script>
 
  <script src='/mili1/dwr/interface/ListarSalidaDAO.js'></script>
  
  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>
  <script>

  
  
  </script>

<body>
    <input type='hidden' id='total'>
<!-- inicio busqueda : por ci,cod_do y apepa-->
<table class='tabla' style='display' id='busqueda'>
    <caption class='trCaption'>Busqueda de Donantes</caption>
    <tr class='trFilas'>
	<td>Codigo</td>
	<td><input type='text' name='cod_do'  id='cod_do' size='15'></td>
        <td><span id='EmC'></span></td>         
	<td><input type='submit' value='Aceptar' onclick='BusquedaCodigo();'></td>
    </tr>
    <tr class='trFilas'>
	<td>Nro de CI</td>
	<td><input type='text' name='ci' size='15'></td>
        <td><span id='EmCi'></span></td>         
	<td><input type='submit' value='Aceptar' onclick='BusquedaCi();'></td>
    </tr>
    <tr class='trFilas'>
	<td>Apellido Paterno</td>
	<td><input type='text' name='apepa' size='15'></td>
        <td><span id='EmA'></span></td>    
	<td><input type='submit' value='Aceptar' onclick='BusquedaApellido();'></td>
    </tr>
</table>
<!-- fin busqueda : por ci,cod_do y apepa-->

<!/////////INICIO BUSQUEDA POR APELLIDO>
<div style='display:none' id='resultado_apellido'>
    <table class='tabla' id='hola' >
          <caption class='trCaption'>Informacion del Donante</caption>
          <BR>
          <thead>
          <tr class='trFilas'>
               <th>Codigo</th>
               <th>Nombre</th>
               <th>Ape.Paterno</th>
               <th>Ape.Materno</th>
          </tr>
          </thead>
	            <tbody id='campos_de_apellido'></tbody>
    </table>
</div>
<!/////////FIN DE BUSQUEDA POR APELLIDO>
<!/////////modificacion>
<div style='display:none' id='modi'>    
<input type='hidden' id='bb'>
<table class='tabla'>
<thead>
<tr class='trFilas'>

<th>Nro</th>
<th>Prueba</th>
<th>Codigo</th>
<th>Resultado</th>

<input type='hidden' id='id_aten'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='tipo_componente'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>
<th></th>
</tr>
</thead>
<tbody id='camposp'>
<th><span id='EmV'></span></th>
</tbody>

<td colspan="4" align="center"><div id='mili'></div></td>

</table>
    <table class='tabla'>
        <tr class='trFilas'>
            <td><input type='submit' value='Modificar' onclick='InsertarC();'></td>
        </tr>
    </table>

</div>
<!/////////prueb a div>



<!/////////INICIO BUSQUEDA POR APELLIDO>



<!/////INICIO BUSQUEDA POR CI Y CODIGO////////////>
<div style='display:none' id='resultado_todo'>
    <table class='tabla'>
        <caption class='trCaption'>Informacion del Donante</caption>
        <BR>
        <thead>
        <tr class='trFilas'>
             <th>id</th>
             <th>Codigo</th>
             <th>Nombre</th>
             <th>Ape.Paterno</th>
             <th>Ape.Materno</th>
             <th>Gs_rh</th>
        </tr>
        </thead>
        <tbody id='campostodos'></tbody>
    </table>
<!--
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
        <tbody id='camposResultados'></tbody>
    </table>
    <PRE></PRE>!-->
    <table class='tabla'>
        <tr class='trFilas'>
            <td><input type='submit' value='Modificar1'   onclick='Modificar();'></td>
        </tr>
    </table>
</div>
<!/////FIN BUSQUEDA POR CI Y CODIGO////////////>

<!-- **********************************************-->
<!-- *************inicio de modificar*********************************-->
<div style='display:none' id='resultado_donacion'>
    <table class='tabla'>
        <caption class='trCaption'>Adicionar  Donacion</caption>
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
        <tbody id='campos_1'></tbody>
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
        <tbody id='campos_2'></tbody>
    </table>
    <table class='tabla'>
        <thead>
        <tr class='trFilas'>
            <th>Calle/Residencia</th>
            <th>Nro</th>
            <th>Zona</th>
            <th>Domicilio</th>
        <!--/tr-->
        </thead>
        <tbody id='campos_3'></tbody>
        <thead>
        <tr class='trFilas'>
            <th>Calle/Residencia</th>
            <th>Nro</th>
            <th>Zona</th>
            <th>Domicilio1</th>
        <!--/tr-->
        </thead>
        <tbody id='campos_4'></tbody>
        <PRE></PRE>
        <tr class='trFilas'>
            <td><input type="submit" value="Aceptar" onclick='modificar_valor();'></td>
        </tr>
    </table>
</div>
<!-- *************fin de modificar************************************-->

<!-- *************************************************-->
<table class='tabla' style='display:none' id='mensaje'>
<tr class='trFilas'>
<td>
Datos insertados Correctamente!--------------
<input type="submit" value="Siquiente" onclick='visualizar();'>
</td>
</tr>
</table>
<!-- ****************************************************-->

<!-- ***************inicio examen fisico********************************-->
<div style='display:none' id='examenFisico'>
    <table class='tabla'>
	<caption class='trCaption'><h4>Examen Fisico</h4></caption>
	    <input type="hidden" id='atendido' value="T">
	    <input type="hidden" id='atendidop' value="T">
	    <input type="hidden" id='atendidoh' value="T">
	    <input type="hidden" id='atendidos' value="T">
	    <input type="hidden" id='atendidoe' value="T">
		<tr class='trFilas'>
		    <table class='tabla'>
		    	<tr class='trFilas'>
			    <td>Fecha:</td>
			    <td>
				<FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
                        	    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
                        	    <input name='fecha_a' id='fecha_a' readonly='true' size='10'>
                    		    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_a');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
                		</FORM>
	        		<span id='EmFechae'></span>
			    </td>
			    <td>Hora.:</td>
	    		    <td><span  id='hora_a' ></span><input type='HIDDEN' id='hora_a'></td>
			    <td>Nro:</td>
			    <td><span  id='id_aten' ></span><input type='HIDDEN' id='id_aten'></td>
	    		</tr>
	           </table>
	       </tr>
	       <tr class='trFilas'>
	         <table class='tabla'>
	            <td>Tipo de Donacion:</td>
	            <td><select id='tipo_do'  onblur='validarCombos111();'>         
			  <option value="V" align='center'>Voluntaria</option>
		          <option value="R" align='center'>Reposicion/Familiar</option>
		          <option value="A" align='center'>Autóloga</option>
			  <option value="-1" selected='selected'>---Seleccione---</option>
		       </select>
	              <span id='EmCom'></span></td>
	           <td><select id='veces' onblur='validarCombos112();'>
		          <option value="H" align='center'>Habitual</option>
		          <option value="P" align='center'>Primera_Vez</option>
			  <option value="-1" selected='selected'>---Seleccione---</option>
	               </select>
		 <span id='EmComb'></span></td>
	       </table>
	      </tr> 
	     <tr align='center' class='trFilas'>
		<table class='tabla'>
		    <tr class='trFilas'><td>Tension_Arterial:</td></tr>
		    <tr class='trFilas'><td>Sistólica</td>
			<td><input id='sistolica'  size="8"  onBlur='validarEntero111();'>
	        	<span id='EmSi'></span></td>
			<td>Diastólica</td>
			<td><input id='diastolica'  size="8" onBlur='validarEntero112();'>
		            <span id='EmDi'></span>
			</td>
		    </tr>
		    <tr class='trFilas'><td>Pulso</td>
	    		<td><input id='pulso' size="8"  onBlur='validarEntero113();'>
	    		<span id='EmPu'></span>
			pul./min.</td>
			<td>Peso</td>
			<td><input id='peso'  size="8" onBlur='validarEntero114();'>
	    		    <span id='EmPe'></span>
			Kg.</td></tr>
		    <tr class='trFilas'>
			<td>Talla</td>
			<td><input id='talla' size="8" onBlur='validarEntero115();'>
	    		<span id='EmTa'></span>
			cms.</td>
			<td>Temperatura</td>
			<td><input id='temperatura' size="8" onBlur='validarEntero116();'>
	    		<span id='EmTe'></span>
			°C</td>
		     </tr>
		     <tr class='trFilas'>
			<td colspan="3" align="center"><div id='agregar12'></div></td>
			<td><input type="submit" value="Cancelar" onclick='ejecutarCero();'></td>
		     </tr>
		     
		</table>
		</tr>
</table>
</div>

<!-- *****************fin examen fisico********************************-->
<!-- *****************inicio MENSAJE examen fisico********************************-->
<table class='tabla' style='display:none' id='adios'>
<tr class='trFilas'>
<td>
Datos modificados correctamente!--------------
</td>
</tr>
</table>
<!-- *****************fin MENSAJE examen fisico********************************-->

</body>
</html>
