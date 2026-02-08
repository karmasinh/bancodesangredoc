<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Modificar</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaAdmHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
  
  

function insertar()
{
var id_hemo=DWRUtil.getValue("id_hemo");
var descripcion=DWRUtil.getValue("descripcion");
var nombre=DWRUtil.getValue("nombre");
ListaAdmHemoDAO.modificarHemo(insertarDatos,id_hemo,descripcion,nombre);
}
function insertarDatos()
{
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista2).style.display='';

}

var ModificarValores= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/modificar.png");
      input.setAttribute("onclick","insertar('"+data.id_hemo+"');");
      return input;
    };


var modificar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ModificarP('"+data.id_hemo+"');");
      return input;
    };



var nombre1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "nombre");
      input.setAttribute("value",data.nombre );
      return input;
    };


var descripcion1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "descripcion");
      input.setAttribute("value",data.descripcion );
      return input;
    };






function ModificarP(id_hemo)
{
DWRUtil.setValue("id_hemo",id_hemo);
$(listaTotal).style.display='none';
$(lista).style.display='';
ListaAdmHemoDAO.mostrarLista1(ListaMo,id_hemo);
}
  
function Listar()
{          
ListaAdmHemoDAO.mostrarLista(mostrarListaPrueba)    
}

var id_hemo = function(data) { return data.id_hemo };
var descripcion = function(data) { return data.descripcion };
var nombre = function(data) { return data.nombre };

function mostrarListaPrueba(data) {
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_hemo,nombre,descripcion,modificar],{
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


function ListaMo(data) {
  aux=1; 
  //alert('hello');     
  DWRUtil.addRows("camposM",data,[id_hemo,nombre1,descripcion1],{
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
<table class='tabla' align='center' id='listaTotal'>
<caption class='trCaption'>
<h3>Lista de Hemocomponentes</h3>
</caption>

<thead>
<tr class='trFilas' align='center'>

<th>Codigo</th>
<th>Nombre</th>
<th>Descripcion</th>
<th>Modificar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

<div style='display:none' id='lista'>
<table class='tabla' >
<caption class='trCaption'>
<h3>Modificar Hemocomponente</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>Nombre</th>
<th>Descripcion</th>
</tr>
</thead>
<tbody id='camposM' align='center'>
</tbody>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td colspan="3"  align="center"><input type='image'  src='../imagenes/modificar.png' onclick='insertar();'></td>
<td align="center"><input type='image'  src='../imagenes/cancelar1.png' ></div></td>
</tr>
</table>

</div>


<table class='tabla' style='display:none' id='lista2'>
<caption class='trCaption'>
<font color="blue" size='3'>Datos Insertados Correctamente.............!</font>
</caption>
</table>
<input type='hidden' id='id_hemo'>

</body>
</html>


