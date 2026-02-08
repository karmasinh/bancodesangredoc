<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>HEMOCOMPONENTES</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  
  <script src='/mili1/dwr/interface/ListaAdmHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
function Listar()
{              
ListaAdmHemoDAO.mostrarLista(mostrarListaPrueba);
}


var id_hemo = function(data) { return data.id_hemo };
var nombre = function(data) { return data.nombre };
var descripcion = function(data) { return data.descripcion };


function mostrarListaPrueba(data) {
  aux=1;      
  DWRUtil.addRows("campos",data,[id_hemo,nombre,descripcion],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	if ((aux%2)==0)
	{
	tr.style.backgroundColor = "#eeeeff";
	tr.style.border="1px solid #00008B";
	}
	else
	{
	tr.style.backgroundColor = "#ffffff";
	tr.style.border="1px solid #00008B";
	}
	aux=1+aux;
        return tr;
        }
    });
  }


  
  </script>

  
<body onload='Listar();' >  
<table class='tabla' align='center'>
<caption class='trCaption'>
<H3>Lista de Hemocomponentes</H3>
</caption>

<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>Nombre</th>
<th>Descripcion</th>
</tr>

</thead>
<tbody id='campos' align='center'>
</tbody>
</table>



</body>
</html>


