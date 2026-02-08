<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
     <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
 <Script src="t.js">  </script>

 <script src='/mili1/dwr/interface/ListaPreDAO.js'></script>
 <SCRIPT language='JavaScript' src="registro_datos/nuevo44.js"></SCRIPT>
 <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
</head>
  <body onload='Primero();'>
  <div id='uno' style='display'>
  <!--
  <table class='tabla'>
  <tr><td><a href='quienes_somos.jsp' target='derecha'>Quienes Somos</a></td></tr>
  </table>
-->
  <table class='tabla'>
  <tr><td><a href='mision.jsp' target='derecha'>Misión y Visión</a></td></tr>
  </table>

  <table class='tabla'>
  <tr><td><a href='sbanco.jsp' target='derecha'>Que es un Banco de Sangre</a></td></tr>
  </table>

  <table class='tabla'>
  <tr><td><a href='requisitos.jsp' target='derecha'>Requisitos del Donador</a></td></tr>
  </table>

  <table class='tabla'>
  <tr><td><a href='sangre.jsp' target='derecha'>Que es la Sangre</a></td></tr>
  </table>

  <table class='tabla'>
  <tr><td><a href='sdir.jsp' target='derecha'>Nuestra Dirección</a></td></tr>
  </table>


  <table class='tabla'>
  <tr><td><a href='quienes_somos.jsp' target='derecha'>Galeria de fotos</a></td></tr>
  </table>

  <table class='tabla'>
  <tr align='center'><td><img src="./imagenes/sangresegura.jpg" align="center" width="50%"></td></tr>
  <tr><td><img src="./imagenes/unidad.gif" align="center" width="100%"></td></tr>
  </table>



  
  <form>
  <table class='tabla'>
  <tr><td></td> </tr>   
  <tr><td></td> </tr>   
  <tr><td></td> </tr>   
  <tr><td></td> </tr>   
  <tr><td>Ingrese::.</td> </tr>   
  <tr><td>Usuario::.</td><td><input type="text" name="usuario" id="usuario" size='10'></td> </tr>   
  <tr><td>Contraseña::.</td><td><input type="text" name="contraseña" id="contraseña" size='10'></td> </tr>   
 
  <tr><td><input type="button" value="aceptar"  onclick='inicio();' size='5'></td>
  <td><input type="reset" value="cancelar" size='5'></td></tr>   

  <tr><td></td> </tr>   
  <tr><td></td> </tr>   
  </table>
    </form>
  <span id="permitido" ></span>
  </div>
  
  <div id='dos' style='display:none'>
  <table class='tabla'>
    <thead>
    <tr>
    <th ALIGN='LEFT'>Usuario</th>
    </tr>
    </thead>
    <tbody id='camposApellido' align='center'>
    </tbody>
  </table>
  </div>

  <div id='tres' style='display:none'>
  <table class='tabla'>

    <thead>
    <tr>
    <th ALIGN='LEFT'>Modulo</th>
    </tr>
    </thead>

    <tbody id='campos'>

    <tbody id='camposMenu'>
    </tbody>
    </tbody>
  </table>


  </div>

  <table class='tabla' BORDER='0'>
        
    <tbody id='campos_Todo' align='center'>
    </tbody>

<input type='TEXT' id='fecha'>
<input type='TEXT' id='cod_per'>
<input type='TEXT' id='id_horario'>

 </table>

  
  </body>
</html>