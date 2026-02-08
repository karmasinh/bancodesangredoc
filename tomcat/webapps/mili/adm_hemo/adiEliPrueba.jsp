<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Mari</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaAdmPruebaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
function Listar()
{              
ListaAdmPruebaDAO.mostrarLista(mostrarListaPrueba);
}

var id_prueba = function(data) { return data.id_prueba };
var descr = function(data) { return data.descr };
var nombre_tp = function(data) { return data.nombre_tp };
var tipo = function(data) { return data.tipo };


function mostrarListaPrueba(data) {
  aux=1;      
  DWRUtil.addRows("campos",data,[id_prueba,nombre_tp,tipo,descr],{
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
<h3>Tipos de Pruebas</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro</th>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripcion</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>






</body>
</html>


