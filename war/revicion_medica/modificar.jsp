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
  <script src='modificarEva.js'></script>
  <script src='/mili1/dwr/interface/ListaMedicaDAO.js'></script>
  
  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>
<body>
    <input type='hidden' id='total'>
    <input type='hidden' id='id_aten'>
    <input type='hidden' id='fecha_a'>
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

<!/////////FIN DE BUSQUEDA POR APELLIDO>

<!/////INICIO BUSQUEDA POR CI Y CODIGO////////////>
<div style='display:none' id='resultado_todo'>
    <table class='tabla'>
    <caption class='trCaption'><H3>Informacion del Donante</H3></caption>
        <BR>
        <thead>
        <tr class='trFilas'>
             <th>Nro</th>
             <th>Codigo</th>
             <th>Nombre</th>
             <th>A.Paterno</th>
             <th>A.Materno</th>
	     <th>Edad</th>
        </tr>
        </thead>
        <tbody id='campostodos' align='center'></tbody>
    </table>
    <br>
    <table class='tabla'>
        <tr class='trFilas'>
	    <td align='center'><input type='image' src='../imagenes/ingrese_a_modificar.png' onclick='Modificar();'></td> 
        </tr>
    </table>
</div>
<!/////FIN BUSQUEDA POR CI Y CODIGO////////////>

<!-- **********************************************-->
<!-- *************inicio de modificar*********************************-->
<table class='tabla' id='evaluacion' style='display:none' >
<caption class='trCaption'>
<h3>Tamizaje Medico</h3>
</caption>
<br>
<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Fecha</th>
<th>Hora</th>
<th>Sistólica</th>
<th>Diastolica</th>
<th>Pulso</th>
<th>Peso</th>
<th>Talla</th>
<th>Temperatura</th>
</tr>
</thead>
<tbody id='camposE' align='center'>
</tbody>
</table>
<br>


<div id='resultadoeva' style='display:none'>
<input type='hidden' id='tal'>
<table class='tabla'>
<br>

<thead>
<tr class='trFilas'>
<th>Ayunas</th>
<th>Ingestion</th>
<th>Oservacion</th>
</tr>
</thead>
<tbody id='cam' align='center'>
</tbody>
<tr class='trFilas'>
<th>Resultado</th>
<th>Rechazo</th>
<th>Numeral</th>

</thead>
<tbody id='cam1' align='center'>
<td></td><td align='center'><div id='uno'>  </div></td><td align='center'><div id='dos'>  </div></td>
</tbody>
</table>
<br>
<table class='tabla'>		     
 <tr class='trFilas'>
 <td colspan="3"  align='center' ><input type='image' src='../imagenes/aceptar.png' onclick='modificarAhora();'></td>
 <td align='center'><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutarCero();'></td> 
 </tr>
</table>



</div>



<!-- *************fin de modificar************************************-->

<!-- *************************************************-->

<!-- *****************fin examen fisico********************************-->
<!-- *****************inicio MENSAJE examen fisico********************************-->
<table class='tabla' style='display:none' id='adios'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>


<!-- *****************fin MENSAJE examen fisico********************************-->

</body>
</html>
