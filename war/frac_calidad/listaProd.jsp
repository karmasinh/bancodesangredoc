<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Fraccionamiento</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='listaProd.js'></script>
   <script src='validaciones.js'></script>


  <script src='/mili1/dwr/interface/ListaFracDAO.js'></script>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini.js"></SCRIPT>
  <SCRIPT language='JavaScript' src="../scripts/overlib_mini1.js"></SCRIPT>

  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
         
  
  
function updateTT()
{
var id_ext =DWRUtil.getValue("id_ext");
ListaFracDAO.FinalizarTodo(qq,id_ext);
}
function qq()
{
$(prod22).style.display='';
$(prod11).style.display='none';
$(extra2).style.display='none'; 
$(extra3).style.display='none'; 
$(extra1).style.display='none'; 
} 


function ListaTotal()
{
ListaFracDAO.ListaT(mostrarTodo);
}

function insertarValor()
{
var n0=DWRUtil.getValue("n0");
var fecha_produccion =DWRUtil.getValue("fecha_produccion");
var fecha_expi =DWRUtil.getValue("fecha_expi");
var id_aten =DWRUtil.getValue("id_aten");
var id_ext =DWRUtil.getValue("id_ext");
var cod_do =DWRUtil.getValue("cod_do");
var resultado =DWRUtil.getValue("resultado");

ListaFracDAO.adicionarR(insertarDatosV,n0,fecha_produccion,fecha_expi,id_aten,id_ext,cod_do,resultado);
}

function insertarDatosV()
{
DWRUtil.removeAllRows("campos233");  
ListaTotal();
DWRUtil.setValue("fecha_produccion",""); 
DWRUtil.setValue("fecha_expi",""); 
$(extra2).style.display='none'; 
$(extra3).style.display=''; 
$(prod11).style.display=''; 
$(prod22).style.display='';
}


function ListarEva(id_aten,id_ext,cod_do,resultado)
//function ListarEva(id_aten)
{  
$(extra1).style.display='none'; 
$(extra2).style.display='none'; 
$(extra3).style.display=''; 
DWRUtil.setValue("id_aten",id_aten); 

DWRUtil.setValue("id_ext",id_ext);
DWRUtil.setValue("cod_do",cod_do); 
DWRUtil.setValue("resultado",resultado); 

var id_aten= DWRUtil.getValue("id_aten"); 
ListaFracDAO.mostrar(mostrarLista,id_aten);
ListaelCombo();
}

function ListaelCombo()
{
$(n0).style.display=''; 
ListaFracDAO.mostrarCombo(mostrarListaDonantes1);
}


function Listar()
{              
$(extra1).style.display=''; 
$(extra2).style.display='none'; 
$(extra3).style.display='none'; 
ListaFracDAO.mostrarLista(mostrarListaDonantes);
}

var cod_do = function(data) { return data.cod_do };
var fecha_extra = function(data) { return data.fecha_extra };
var id_ext = function(data) { return data.id_ext };
var id_aten = function(data) { return data.id_aten};
var resultado = function(data) { return data.resultado};
var id_prueba = function(data) { return data.id_prueba};

var id_hemo = function(data) { return data.id_hemo};
var nombre = function(data) { return data.nombre};
var fecha_produccion = function(data) { return data.fecha_produccion;};
var fecha_expi = function(data) { return data.fecha_expi;};


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Fraccionar");
      input.setAttribute("onclick","ListarEva('"+data.id_aten+"','"+data.id_ext+"','"+data.cod_do+"','"+data.resultado+"');");
     //  input.setAttribute("onclick","ListarEva('"+data.id_aten+"');");
      return input;                             
    };


function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[id_aten,id_ext,cod_do,fecha_extra,Predonacion],{
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

function mostrarLista(data) {      
  aux=1; 
  DWRUtil.addRows("campos1",data,[id_ext,cod_do,resultado],{
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


function mostrarListaDonantes1(data) {
  DWRUtil.removeAllOptions('n0'); 
  DWRUtil.addOptions('n0',data,'id_hemo','nombre');
  }

function mostrarTodo(data) {
  aux=1; 
  DWRUtil.addRows("campos233",data,[nombre,fecha_produccion,fecha_expi],{
//  DWRUtil.addRows("campos233",data,[fecha_expi],{
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
<table class='tabla'  id='extra1' style='display:none'>
<caption class='trCaption'>
<h3>Lista de extracciones a fraccionar</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro Atencion</th>
<th>Nro extraccion</th>
<th>Codigo de Donante</th>
<th>Fecha Extraccion</th>
<th>Fraccionar</th>
</tr>
</thead>
<tbody id='campos'>
</tbody>
</table>

<input type='hidden' id='id_aten'>
<input type='hidden' id='id_ext'>
<input type='hidden' id='cod_do'>
<input type='hidden' id='resultado'>


<table class='tabla'  id='extra2' style='display:none'>
<caption class='trCaption'>
<h3>Registrar Fraccionamiento</h3>
</caption>

<thead>
<tr class='trFilas'>
<th>Nro extraccion</th>
<th>Codigo de Donante</th>
<th>Grupo Sanguineo</th>
</tr>
</thead>
<tbody id='campos1'>
</tbody>
</table>



<table class='tabla' align='center'  id='extra3' style='display:none'>
<caption class='trCaption'>
<h3>Registrar Fraccionamiento</h3>
</caption>

<tr class='trFilas'>
<input type='hidden' id='i'>
<TD>Hemocomponente</TD>
<td><select id='n0' size='5'  style='display:none' ></select> </td>
<TD></TD>
<TD></TD>
</tr>

<tr>

<TD>Fecha de Produccion</TD>
<td><FORM name='caja'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
    <span id='overDiv' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_produccion' id='fecha_produccion' readonly='true' size='15'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja.fecha_produccion');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
<span id='EmFechae'></span>
</td>
<td>Fecha Expiracion:</td>
<td><FORM name='caja1'  method='post' doubleClick='validarFechae();' onBlur='validarFechae2();'>
    <span id='overDiv1' style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></span>
    <input name='fecha_expi' id='fecha_expi' readonly='true' size='15'>
    <A onmouseout="window.status=''; nd(); return true;" href="javascript:show_calendar('caja1.fecha_expi');"><IMG src="../imagenes/caldrbtn.gif"  border=0></A>
    </FORM>
<span id='EmFechae'></span>
</td>
</tr>
<tr class='trFilas'>
<TD> <input type='submit' value='Aceptar' onclick='insertarValor();'></TD>     
<TD> <input type='submit' value='Finalizar' onclick='updateTT();'></TD>     
<TD></TD>     
<TD></TD>     
</tr>

</table>

<table class='tabla'  id='prod11' style='display:none'>

<thead>
<tr class='trFilas'>
<th>Hemocomponente</th>
<th>Fecha-Producción</th>
<th>Fecha-Expiración</th>
</tr>
</thead>
<tbody id='campos233'>
</tbody>
</table>


<table class='tabla'  id='prod22' style='display:none'>
<caption class='trCaption'>
Datos insertados correctamente.........!
</caption>
</table>




</body>
</html>

