<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Lista de produccion</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  


  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>

function cambiar()
{

var dos="";
var tres="<select id='n0' size='3' onchange='ListarEvaCombo();' ></select> ";
var combo=DWRUtil.getValue("total");
 if (combo=="")
 {document.getElementById("uno").innerHTML = dos;}
 else
 ListaFracDAO.combitoboy(mostrarCombo);
 { document.getElementById("total").innerHTML = tres; }
}


function insertarValor()
{
var nombre =DWRUtil.getValue("nombre");
var fecha_produccion =DWRUtil.getValue("fecha_produccion");
var fecha_expi =DWRUtil.getValue("fecha_expi");
ListaFracDAO.modificado(modificarDatosV,fecha_produccion,fecha_expi,nombre);
}

function modificarDatosV()
{
$(prod2).style.display='none';
$(prod1).style.display='none';
$(prod3).style.display='';
}

         
function ListarMod(id_prod)
{
$(prod2).style.display='';
$(prod1).style.display='none';
ListaFracDAO.modificarLista(mostrarMod,id_prod);
ListaFracDAO.cont(mostrar,id_prod);

}

function mostrar(data)
{
document.getElementById("total").innerHTML = data;
}



var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_produccion = function(data) { return data.fecha_produccion };
var nombre = function(data) { return data.nombre };

var id_hemo = function(data) { return data.id_hemo };

var nombre1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "nombre");
      input.setAttribute("value",data.nombre );
      return input;
    };

var fecha_produccion1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fecha_produccion");
      input.setAttribute("value",data.fecha_produccion );
      return input;
    };

var fecha_expi1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fecha_expi");
      input.setAttribute("value",data.fecha_expi );
      return input;
    };

var combo= function(data) {
      var input = document.createElement("select");
      input.setAttribute("id", "fecha_expi");
      input.setAttribute("value", data.fecha_expi);
      //input.setAttribute("onclick","ListarMod('"+data.id_prod+"');");
      return input;                             
    };


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Modificar");
      input.setAttribute("onclick","ListarMod('"+data.id_prod+"');");
      return input;                             
    };


function Listar()
{     
$(prod1).style.display='';         
ListaFracDAO.ListaTotalL(mostrarListaDonantes);
}




function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prod,cod_do,nombre,gs_rh,fecha_expi,fecha_produccion,Predonacion],{
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


function mostrarMod(data) {      
  aux=1; 
  DWRUtil.addRows("campos1",data,[id_prod,nombre1,fecha_expi1,fecha_produccion1,combo],{
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

function mostrarCombo(data) {
  DWRUtil.removeAllOptions('n0'); 
  DWRUtil.addOptions('n0',data,'id_hemo','nombre');
  }


  </script>

<body onload='Listar();' >  
<table class='tabla'  id='prod1' style='display:none'>
<caption class='trCaption'>
Lista de Hemocomponentes
</caption>

<thead>
<tr class='trFilas'>

<th>Nro Prod.</th>
<th>Codigo</th>
<th>Nombre</th>
<th>Gs-Rh</th>
<th>Fecha-Expiracion</th>
<th>Fecha-Produccion</th>
<th>Modificar</th>
</tr>
</thead>
<tbody id='campos'>
</tbody>
</table>

<table class='tabla'  id='prod2' style='display:none'>
<caption class='trCaption'>
Lista de Hemocomponentes
</caption>

<thead>
<tr class='trFilas'>

<th>Nro Prod.</th>
<th>Nombre</th>
<th>Fecha-Expiracion</th>
<th>Fecha-Produccion</th>
<th>Combo</th>
</tr>
</thead>
<tbody id='campos1'>
</tbody>

<tr class='trFilas'>
<TD>Nombre:</TD>
<TD><span id='total' onclick='cambiar();' ></span></TD>
</tr>
<tr class='trFilas'>
<TD><div id='uno'></div> </TD>
</tr>
</table>


<table class='tabla'  id='prod3' style='display:none'>
<caption class='trCaption'>
Datos Modificados Correctamente........!
</caption>
</table>

</body>
</html>


