<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>eli</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaAdmHemoDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>

function ModificarP()
{
var id_hemo=DWRUtil.getValue('id_hemo');
ListaAdmHemoDAO.eliminarH(ListaMo,id_hemo);
}

function Seguro(id_hemo)
{
DWRUtil.setValue("id_hemo",id_hemo);
$("siono").style.display='';
$("listaTotal").style.display='none';

}

var modificar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/eliminar1.png");
      input.setAttribute("onclick","Seguro('"+data.id_hemo+"');");
      return input;
    };

function ListaMo()
{
$("lista2").style.display='';
$("siono").style.display='none';
$("listaTotal").style.display='none';
}

function Listar()
{
DWRUtil.removeAllRows("campos");  
$("siono").style.display='none';              
$("lista2").style.display='none';              
$("listaTotal").style.display='';              
ListaAdmHemoDAO.mostrarLista(mostrarListaPrueba);
}

var id_hemo = function(data) { return data.id_hemo };
var descripcion= function(data) { return data.descripcion };
var nombre = function(data) { return data.nombre};

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


  
  </script>

  
<body onload='Listar();' >  
<table class='tabla' align='center' id='listaTotal'>
<caption class='trCaption'>
<h3>Lista de Hemocomponentes</h3>
</caption>

<thead>
<tr class='trFilas' align='center'>
<input type="hidden" id='id_hemo'>
<th>Codigo</th>
<th>Nombre</th>
<th>Descripcion</th>
<th>Eliminar</th>
</tr>
</thead>
<tbody id='campos' align='center'> 
</tbody>
</table>

<div style='display:none' id='siono'>
<table class='tabla' >
<caption class='trCaption'>
<h3> Esta seguro que decea Eliminar </h3>
</caption>
</table>
<br>
<table class='tabla' >
<tr class='trFilas'>
<td  align='center'><input type="image" src="../imagenes/atras.png" onclick='Listar();'></td>
<td  align='center'><input type="image" src="../imagenes/eliminar1.png" onclick='ModificarP();'></td>
</tr>
</caption>
</table>
</div>


<table class='tabla' style='display:none' id='lista2'>
<tr class='trFilas'>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</tr>
</table>


</body>
</html>


