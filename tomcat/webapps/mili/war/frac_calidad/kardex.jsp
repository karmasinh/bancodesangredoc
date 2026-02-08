<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Kardex</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='kardex.js'></script>
  <script src='/mili1/dwr/interface/ListaKardexDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  
<body onload='Listar();'>  
<table class='tabla' align='center'>
    <caption class='trCaption'><h3>Control de Stock</h3></caption>
    <tr class='trFilas' align='center'>
	<td  align='center'>
	<table class='tabla' align='center'>
	    <td align="right">Fecha.:</td>
    	    <td><span  id='fecha_a' ></span></td>
	    <td align="right">Hora.:</td>
    	    <td><span  id='hora_a' ></span></td>

        </table>

     </td>
    </tr>

<tr class='trFilas' align='center'>
    <td  align='center'>
	<table class='tabla' align='center'>
	<td>PLASMA</td>
	</table>
    </td>

</tr>
<tr class='trFilas'>
<table class='tabla' align='center'>
    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo A</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">
            <td align="center"><span id='total21'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total22'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo B</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">
       
            <td align="center"><span id='total20'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total19'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo AB</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">
       
            <td align="center"><span id='total17'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total18'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo O</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total16'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total15'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>
</table>

</tr>

<tr class='trFilas' align='center'>
    <td  align='center'>
	<table class='tabla' align='center'>
	    <td>HEMATIES</td>
	</table>
    </td>
</tr>
<tr class='trFilas'>
<table class='tabla' align='center'>
    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo A</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total33'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total32'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo B</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total12'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total122'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo AB</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total9'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total10'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo O</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">
       
            <td align="center"><span id='total777'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total7'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>
</table>
</tr>

<tr class='trFilas' align='center'>
    <td  align='center'>
	<table class='tabla' align='center'>
	<td>SANGRE ENTERA</td>
	</table>
    </td>

</tr>
<tr class='trFilas'>
<table class='tabla' align='center'>
    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo A</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">
       
            <td align="center"><span id='total4'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total333'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo B</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total2'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total111'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo AB</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total31'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total313'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo O</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total6'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total666'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>
</table>

</tr>


<tr class='trFilas' align='center'>
    <td  align='center'>
	<table class='tabla' align='center'>
	<td>PLAQUETAS</td>
	</table>
    </td>

</tr>
<tr class='trFilas'>
<table class='tabla' align='center'>
    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo A</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total3'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total222'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo B</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total1'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total000'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo AB</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total34'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total35'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo O</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total5'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total444'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>
</table>

</tr>

<tr class='trFilas' align='center'>
    <td  align='center'>
	<table class='tabla' align='center'>
	<td>CRIOPRECIPITADO</td>
	</table>
    </td>

</tr>
<tr class='trFilas'>
<table class='tabla' align='center'>
    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo A</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total29'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total30'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo B</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total28'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total27'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo AB</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total25'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total26'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>

    <td>
     <table class='tabla'> 
      <tr class='trFilas' align="center">
    	    <td align="center"></td>
	    <td align="center">Grupo O</td>
    	    <td align="center"></td>
	    <td align="center"></td>
       </tr>
       <tr class='trFilas' align="center">

            <td align="center"><span id='total24'></span></td>
	    <td align="center">Rh+</td>
    	    <td align="center"><span id='total23'></span></td>
            <td align="center">Rh-</td>
       </tr>
     </table> 
    </td>
</table>

</tr>


</table>

</body>
</html>


