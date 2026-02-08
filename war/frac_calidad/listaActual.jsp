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
         



var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_produccion = function(data) { return data.fecha_produccion };
var nombre = function(data) { return data.nombre };



function Listar()
{              
ListaFracDAO.ListaTotalL(mostrarListaDonantes);
}




function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prod,cod_do,nombre,gs_rh,fecha_expi,fecha_produccion],{
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
<table class='tabla'>
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
</tr>
</thead>
<tbody id='campos'>
</tbody>
</table>

</body>
</html>


