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
  <script src='modifica.js'></script>
 
  <script src='/mili1/dwr/interface/ListaExtraDAO.js'></script>
  
  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>

<body onload='ListaCod_per();' >  

    <input  id="id_horario" type="HIDDEN">
    <input  id="cod_per" type="HIDDEN">

    <input type='hidden' id='total'>
    <input type='hidden' id='nom'>
    <input type='hidden' id='apepa'>
    <input type='hidden' id='apema'>
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
	<td align="center"><input type='text' name='apepa1' size='15' maxlength='10' id='apepa1'></td>
        <td align="center"><span id='EmA'></span></td>    
	<td align="left"><input type='image' src='../imagenes/david.png'  onclick='BusquedaApellido();'></td>

    </tr>
</table>
<!-- fin busqueda : por ci,cod_do y apepa-->

<!/////////INICIO BUSQUEDA POR APELLIDO>
<div style='display:none' id='resultado_apellido'>
    <table class='tabla' id='hola' >
          <caption class='trCaption'><H3>Lista de Donantes</H3></caption>
          <BR>
          <thead>
          <tr class='trFilas'>
               <th>Codigo</th>
               <th>A.Paterno</th>
               <th>A.Materno</th>
	       <th>Nombre</th>
	       <th>Ingresar</th>
          </tr>
          </thead>
	<tbody id='campos_de_apellido' align='center'></tbody>
    </table>
</div>
<!/////////FIN DE BUSQUEDA POR APELLIDO>


<!/////////modificacion>
<div style='display:none' id='modi'>    

<table class='tabla'>
<caption class='trCaption'>
<h3>Modificar Extraccion</h3>
</caption>
</table class='tabla'>

<table class='tabla'>
<tr class='trFilas'>
<th align="right">Donante::.</th>
<td><span id='nombre'> </span>-<span id='paterno'> </span>-<span id='materno'> </span>
</td>
<th align="right">Codigo::.</td>
<td><span id='codigo_donante'></span></td>
</tr>
<tr class='trFilas'>
<th align="right">Fecha::.</th>
<td>
<FORM name='caja'  method='post'>
<span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
<input  id='fecha_extra' readonly='true' size='15' name='fecha_a'>
<A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_extra');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
</FORM>
<span id='EmFechae'></span>
</td>
<th align="right">Hora::.</th>
<td><span  id='hora_prueba' ></span><input type='HIDDEN' id='hora_a'></td><td></td><td></td>
</tr>
</table>


<input type='HIDDEN' id='id_ext'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='tipo_componente'>
<input type='hidden' id='id_pruebaF'>
<input type='hidden' id='resultado'>
<input type='hidden' id='d'>

<table class='tabla'>
<thead>
<tr class='trFilas'>
<th>bolsa</th>
<th>tubuladora</th>
<th>cantidad</th>
</tr>
<thead>
<tbody id='camposp2' align='center'>
</tbody>
</table>
<br>
    <table class='tabla'>
        <tr class='trFilas'>
        <td colspan="4" align="center"><input type='image' src='../imagenes/modificar.png' onclick='InsertarC();'></td>
	<td align="center"><input type='image' src='../imagenes/cancelar1.png' onclick='ejecutar();'></td>
        </tr>
    </table>

</div>
<!/////////prueb a div>



<!/////////INICIO BUSQUEDA POR APELLIDO>



<!/////INICIO BUSQUEDA POR CI Y CODIGO////////////>
<div style='display:none' id='resultado_todo'>
    <table class='tabla'>
        <caption class='trCaption'><h3>Informacion del Donante</h3></caption>
        <br>
        <thead>
        <tr class='trFilas'>
             <th>Codigo</th>
             <th>Nombre</th>
             <th>A.Paterno</th>
             <th>A.Materno</th>
             <th>Gs-rh</th>
        </tr>
        </thead>
        <tbody id='campostodos_1' align='center'></tbody>
    </table>
    <br>
    <table class='tabla'>
        <tr class='trFilas'>
            <td align='center'><input type='image' src='../imagenes/ingrese_a_modificar.png'   onclick='Modificar();'></td>
        </tr>
    </table>
</div>
<!/////FIN BUSQUEDA POR CI Y CODIGO////////////>

<!-- **********************************************-->


<!-- *****************inicio MENSAJE examen fisico********************************-->
<table class='tabla' style='display:none' id='adios'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>

</table>
<!-- *****************fin MENSAJE examen fisico********************************-->

</body>
</html>
