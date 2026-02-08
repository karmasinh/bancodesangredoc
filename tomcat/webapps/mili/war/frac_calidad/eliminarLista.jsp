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
var id_prod =function(data) {DWRUtil.setValue("id_prod",data.id_prod);return data.id_prod };

function ListarMod()
{     
var id_prod=DWRUtil.getValue("id_prod");
//alert(id_prod);
ListaFracDAO.Eliminar(Eliminado,id_prod);
}

function si(id_prod)
{
DWRUtil.setValue("id_prod",id_prod);      
$(siono).style.display='';         
$(prod1).style.display='none';   
}

function Eliminado()
{
$(prod1).style.display='none';         
$(prod3).style.display='';         
$(siono).style.display='none';         

}         


var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_produccion = function(data) { return data.fecha_produccion };
var nombre = function(data) { return data.nombre };



var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Eliminar");
      input.setAttribute("onclick","si('"+data.id_prod+"');");
      return input;                             
    };



function Listar()
{
$(siono).style.display='none';              
$(prod1).style.display='';         
DWRUtil.removeAllRows("campos");
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
<th>Eliminar</th>
</tr>
</thead>
<tbody id='campos'>
</tbody>
<input type='hidden' id='id_prod'>
</table>



<table class='tabla'  id='prod3' style='display:none'>
<caption class='trCaption'>
Datos Eliminados.............!
</caption>

</table>


<table class='tabla' style='display:none' id='siono'>
<caption class='trCaption'>
<tr><td colspan='2' size=10><center> Esta seguro que decea Eliminar</center></td></tr>
<tr>
<td><input type="submit" value="Eliminar" onclick='ListarMod();'></td>
<td><input type="submit" value="Cancelar" onclick='Listar();'></td>
</tr>						
</caption>
</table>


</body>
</html>


