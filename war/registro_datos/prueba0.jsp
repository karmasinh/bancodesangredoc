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
  <script src='prueba0.js'></script>
  <script src='pag.js'></script>
  
  <script src='/mili1/dwr/interface/ListaMedicaDAO.js'></script>
  <script src='/mili1/dwr/interface/BusquedaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
  </script>

</head>
<body>
    <input type='hidden' id='total'>
    <input type='hidden' id='yo'>
    <input type='hidden' id='yo1'>
    <input type='hidden' id='yo2'>
    <input type='hidden' id='yo3'>



<div style='display' id='busqueda1' >
<table class='tabla'>
    <caption class='trCaption'><h3>Busqueda de Resultados<input type='image' src='../imagenes/progress.gif' ></input></h3></caption>
    <tr class='trFilas'>
<!--    <form>-->
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


    <tr class='trFilas' align='center'>
	<td colspan='5' align="right">
	<input type='image' src='../imagenes/borrar.png' onclick='Borrar();'>
	</form>
	</td>
    </tr>
</table>
</div>
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

<table class='tabla' style='display:none' id='resultado-todo'>
    <caption class='trCaption'>
  <h3>    Informacion del Donante   </h3>
    </caption>
  <BR>
    <thead>
	<tr class='trFilas'>
	<th>Nro</th>
	<th>Fecha</th>
	<th>Codigo</th>
	<th>Nombre</th>
	<th>A.Paterno</th>
	<th>A.Materno</th>
	<th>Gs-rh</th>
	<th>Edad</th>
	<th>Tamizaje-M</th>
	<th>Pre-Donacion</th>
	<th>In-Hematologia</th>
	<th>In-Serelogia</th>

	</tr>
    </thead>

<tbody id='campostodos' align='center'>
</tbody>

</table>



<table class='tabla' style='display:none' id='resultado-Tamizaje-Medico'>
    <caption class='trCaption'>
     <h3>Resultados de Tamizaje Medico  </h3>
    </caption>
     <BR>
    <thead>
    <tr class='trFilas'>
    <th>Fecha</th>
    <th>Hora</th>
    <th>Nro</th>
    <th>Codigo</th>
    <th>Resultado</th>
    <th>Rechazo</th>
    <th>Numeral</th>
    <th>Observacion</th>
    </tr>
    </thead>
<tbody id='camposTamizaje' align='center'>
</tbody>
</table>


<table class='tabla' style='display:none' id='resultado-Predonacion'>
    <caption class='trCaption'>
    <h3>    Resultados de Predonacion    </h3>
     <BR>
    </caption>
    <thead>
    <tr class='trFilas'>
    <th>Fecha</th>
    <th>Prueba</th>
    <th>Resultado</th>
    </tr>
    </thead>
<tbody id='camposPredonacion' align='center'>
</tbody>
</table>


<table class='tabla' style='display:none' id='resultado-Serelogia'>
    <caption class='trCaption'>
    <h3>    Resultados de Serelogia    </h3>
     <BR>
    </caption>
    <thead>
    <tr class='trFilas'>
    <th>Fecha</th>
    <th>Prueba</th>
    <th>Resultado</th>
    </tr>
    </thead>
<tbody id='camposSerelogia' align='center'>
</tbody>
</table>

<table class='tabla' style='display:none' id='resultado-Hematologia'>
    <caption class='trCaption'>
    <h3>    Resultados de Hematologia    </h3>
     <BR>
    </caption>
    <thead>
    <tr class='trFilas'>
    <th>Fecha</th>
    <th>Prueba</th>
    <th>Resultado</th>
    </tr>
    </thead>
<tbody id='camposHematologia' align='center'>
</tbody>
</table>





</body>
</html>


