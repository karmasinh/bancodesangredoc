<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Mari</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
<body >

<table class='tabla' align='center'>

<caption class='trCaption'>
Registrar Hemocomponentes
</caption>
<tr class='trFilas'><td>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Principio">
</TD>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Anterior">
</TD>
<TD>
<input type="hidden" name="encabezado" value="{$ENCABEZADO}">
<input type="hidden" name="valor" value="{$VALOR}">
<input type="submit" name="Submit" value="Agregar">
</TD>
</tr>


 <tr class='trFilas'><td>
    <TD>Nro de Hemocomponenete</TD>
     <TD><INPUT name=id_hemo></TD>
  </TR>
  <tr class='trFilas'><td>
    <TD>Nombre de Hemocomponente:</TD>
    <TD><input type="text" name="nombre"></TD>
    <TD>Descripcion:</TD>
    <TD><input type="text" name="descripcion"></TD>
</TR>
</TABLE>

</body>
</html>


