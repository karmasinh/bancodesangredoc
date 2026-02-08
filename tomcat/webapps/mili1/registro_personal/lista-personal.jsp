<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>lista</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
  <script src='/mili1/dwr/interface/ListaAdmPersonalDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
  
function ModificarP(cod_per)
{
$(lista).style.display='none';
$(lista1).style.display='';
ListaAdmPersonalDAO.informacion(ListaMo,cod_per);
}


var informacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Informacion");
      input.setAttribute("onclick","ModificarP('"+data.cod_per+"');");
      return input;
    };
  
 
 function Listar()
{              
$(lista).style.display='';
ListaAdmPersonalDAO.mostrarLista(mostrarListaPrueba);
}

var usuario = function(data) { return data.usuario };
var nom = function(data) { return data.nom };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var turno = function(data) { return data.turno };
var cod_per = function(data) { return data.cod_per };
var id_per = function(data) { return data.id_per };

var fecha = function(data) { return data.fecha };
var hrs_entrada = function(data) { return data.hrs_entrada };
var hrs_salida = function(data) { return data.hrs_salida };
var semana= function(data) { return data.semana };
	


function mostrarListaPrueba(data) {
  aux=1;      
  DWRUtil.addRows("campos",data,[id_per,cod_per,usuario,nom,apepa,apema],{
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
  DWRUtil.addRows("campos1",data,[cod_per,fecha,hrs_entrada,hrs_salida,turno,semana],{
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

<table class='tabla' align='center' style='display:none' id='lista'>

<caption class='trCaption'>
<H3>Registro de Personal</H3>
</caption>


<thead>
<tr class='trFilas'>
<th>Nro.</th>
<th>Codigo</th>
<th>Usuario</th>
<th>Nombre</th>
<th>A.Paterno</th>
<th>A.Materno</th>
</tr>

</thead>
<tbody id='campos' align='center'> 
</tbody>
</table>

<table class='tabla' align='center' style='display:none' id='lista1'>
<caption class='trCaption'>
Registro de Personal
</caption>
<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>Fecha</th>
<th>Hora de Entrada</th>
<th>Hora de Salida</th>
<th>Turno</th>
<th>Semana</th>
</tr>

</thead>
<tbody id='campos1'>
</tbody>
</table>

</body>
</html>


