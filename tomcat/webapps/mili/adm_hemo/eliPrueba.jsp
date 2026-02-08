<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>eli</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaAdmPruebaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>


var id_prueba =function(data) {DWRUtil.setValue("id_prueba",data.id_prueba);return data.id_prueba };

function seguro(id_prueba)
{  
DWRUtil.setValue("id_prueba",id_prueba);
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='none';
$(siono).style.display='';
}

function seguro2(id_prueba,id_valor)
{  
DWRUtil.setValue("id_prueba",id_prueba);
DWRUtil.setValue("id_valor",id_valor);
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='none';
$(siono).style.display='none';
$(sionov).style.display='';
}

function modValor()
{  
var id_prueba=DWRUtil.getValue("id_prueba");
var id_valor=DWRUtil.getValue("id_valor");
ListaAdmPruebaDAO.modificarValores1(insertarDatos1,id_prueba,id_valor);
}

function insertar()
{
var id_prueba=DWRUtil.getValue("id_prueba");
ListaAdmPruebaDAO.modificarPrueba1(insertarDatos,id_prueba);
}
function insertarDatos()
{
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='';
$(siono).style.display='none';
}


function insertarDatos1()
{
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='';
$(sionov).style.display='none';
$(siono).style.display='none';
}

var ModificarUnValor= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/eliminar1.png");   
      input.setAttribute("onclick","seguro2('"+data.id_prueba+"','"+data.id_valor+"');");
      return input;
    };



var ModificarValores= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/eliminar1.png");
      input.setAttribute("onclick","seguro("+data.id_prueba+");");
      return input;
    };


var modificar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ModificarP('"+data.id_prueba+"');");
      return input;
    };




var valores1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "valores"+i);
      input.setAttribute("value",data.valores );
     
      i++;
      return input;
    };

var valores = 	function(data) { return data.valores };

function ModificarP(id_prueba)
{
DWRUtil.removeAllRows("camposM");
$(listaTotal).style.display='none';
$(lista).style.display='';
$(lista1).style.display='';

ListaAdmPruebaDAO.mostrarLista1(ListaMo,id_prueba);
ListaAdmPruebaDAO.mostrarListaV(ListaMoV,id_prueba);
}
  
function Listar()
{        
DWRUtil.removeAllRows("campos");  
$("siono").style.display='none';              
$("lista2").style.display='none';              
$("listaTotal").style.display='';              
      
ListaAdmPruebaDAO.mostrarLista(mostrarListaPrueba);
}

var id_prueba = function(data) { return data.id_prueba };
var descr = function(data) { return data.descr };
var nombre_tp = function(data) { return data.nombre_tp };
var tipo = function(data) { return data.tipo };
var id_valor = function(data) { return data.id_valor};

function mostrarListaPrueba(data) {
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_prueba,nombre_tp,tipo,descr,modificar],{
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
  DWRUtil.addRows("camposM",data,[id_prueba,nombre_tp,tipo,descr,ModificarValores],{
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

function ver(){
var p=DWRUtil.getValue("camposMn");
if (p==""){
$(lista1).style.display='none';
}
}


function ListaMoV(data) {
  aux=1; i=1; 
  setTimeout("ver()",500);	  
  DWRUtil.addRows("camposMn",data,[id_prueba,id_valor,valores,ModificarUnValor],{
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
	tr.align="center";
        return tr;
        }
    });
  }

  
  </script>

  
<body onload='Listar();' >  
<table class='tabla' align='center' id='listaTotal'>
<caption class='trCaption'>
<h3>Tipos de Pruebas</h3>
</caption>

<thead>
<tr class='trFilas'>

<th>Nro</th>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripcion</th>
<th>Eliminar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>


<table class='tabla' style='display:none' id='lista'>

<caption class='trCaption'>
<h3>Eliminar Prueba</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro</th>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripcion</th>
<th>Eliminar</th>
</tr>
</thead>

<tbody id='camposM' align='center'>
<input type='hidden' id='id_prueba'>
<input type='hidden' id='id_valor'>
<input type='hidden' id='descr'>
<input type='hidden' id='nombre_tp'>
<input type='hidden' id='tipo'>
</tbody>
</table>

<table class='tabla' style='display:none' id='lista1'>

<caption class='trCaption'>
<h3>Eliminar Resultados</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>SubCodigo</th>
<th>Resultado</th>
<th>Eliminar</th>
</tr>
</thead>
<tbody id='camposMn' align='center'>
</tbody>
</table>

<table class='tabla' style='display:none' id='lista2'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Eliminados Correctamente.............!</font></td>
</td>
</tr>
</table>

<div style='display:none' id='siono'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar</h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='Listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='insertar();'></td>
</tr>
</table>
</div>
<div class='tabla' style='display:none' id='sionov'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='Listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='modValor();'></td>
</tr>
</table>
</div>



</body>
</html>


