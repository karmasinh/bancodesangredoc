<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Modificar</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  

  <script src='/mili1/dwr/interface/ListaAdmPruebaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
 
  
var k=0;
var gel=new Array(20);
function modValor(id_prueba,i,id_valor)
{  
var valores=DWRUtil.getValue("valores"+i);
ListaAdmPruebaDAO.modificarValores(insertarDatos1,id_prueba,valores,id_valor);
}

function insertar()
{
var id_prueba=DWRUtil.getValue("id_prueba");
//alert(id_prueba);
for(j=0;j<k;j++){
var valores=DWRUtil.getValue(""+gel[j]+"");
//alert(j+"el valor de k "+k+" el valor es  "+valores+" el valor de gel "+gel[j]);
ListaAdmPruebaDAO.modificarValores(insertarDatos1,id_prueba,valores,gel[j]);
}
var descr=DWRUtil.getValue("descr");
var nombre_tp=DWRUtil.getValue("nombre_tp");
var tipo=DWRUtil.getValue("tipo");
ListaAdmPruebaDAO.modificarPrueba(insertarDatos,id_prueba,descr,nombre_tp,tipo);
}
function insertarDatos()
{
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='';

}


function insertarDatos1()
{
$(listaTotal).style.display='none';
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='';
}

var ModificarUnValor= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");   
      return input;
    };



var ModificarValores= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Modificar");
      input.setAttribute("onclick","insertar();");
      return input;
    };


var modificar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ModificarP('"+data.id_prueba+"');");
      return input;
    };


var nombre_tp1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "nombre_tp");
      input.setAttribute("value",data.nombre_tp );
      return input;
    };


var descr1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "descr");
      input.setAttribute("value",data.descr );
      input.setAttribute("size",25 );
      return input;
    };

/*
var tipo1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo");
      input.setAttribute("value",data.tipo );
      DWRUtil.setValue("id_prueba",data.id_prueba);
      return input;
    };
*/
var tipo1= function(data) {
  var input="<select id=tipo><option  value="+data.tipo+">"+data.tipo+"</option><option value='pre-donacion'>Pre-donacion</option><option value='inmunohematologia'>Inmunohematologia</option><option value='inmunoserelogia'>Inmunoserelogia</option><option value='control de calidad'>Control de Calidad</option><option value='salida'>Salidas</option></select>";
 return input;
};


i=0;
var valores= function(data) {
     
      var input = document.createElement("input");
     i=i+1; 
      input.setAttribute("id",data.id_valor);
      gel[k]=data.id_valor;
      k++;                   
      //input.setAttribute("value",data.valores );
       input.setAttribute("value",data.valores );
      return input;

    };



function ModificarP(id_prueba)
{
DWRUtil.setValue("id_prueba",id_prueba);
$(listaTotal).style.display='none';
$(lista).style.display='';
$(lista1).style.display='';
ListaAdmPruebaDAO.mostrarLista1(ListaMo,id_prueba);
ListaAdmPruebaDAO.mostrarListaV(ListaMoV,id_prueba);
}
  
function Listar()
{
$(listaTotal).style.display='';
$(lista).style.display='none';
$(lista1).style.display='none';
$("agregarP").style.display='none';
$("lista").style.display='none';
$(avisoA).style.display='none';
$(otro).style.display='none';
$(principio).style.display='none';
              

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

//  DWRUtil.addRows("campos",data,[id_prueba,nombre_tp,tipo,descr],{
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
//  DWRUtil.addRows("camposM",data,[id_prueba,nombre_tp1,tipo1,descr1,ModificarValores],{
  DWRUtil.addRows("camposM",data,[id_prueba,nombre_tp1,tipo1,descr1],{
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
$(aresultado).style.display='none';
}
}


function ListaMoV(data) {
  aux=1; i=1; 
  setTimeout("ver()",500);	  
//  DWRUtil.addRows("camposMn",data,[id_prueba,id_valor,valores,ModificarUnValor],{
  DWRUtil.addRows("camposMn",data,[id_prueba,id_valor,valores],{
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
  
  
  
  //////////////////*******adicionar resultado*******//////////////////
function AdicionarValores()
 {
 var valores=DWRUtil.getValue("valores");
 var id_prueba=DWRUtil.getValue("id_prueba");
 //alert(valores);
 ListaAdmPruebaDAO.AdicionarValores(adicionarValor,valores,id_prueba);
 }
 
 function adicionarValor()
{
$(avisoA).style.display='';
$(otro).style.display='';
$(principio).style.display='';
$("agregarP").style.display='none';
}
 
function listaprueba1()
{
var id_prueba = DWRUtil.getValue("id_prueba");
//alert(id_prueba,'aqui');
$("agregarP").style.display='';
$("lista").style.display='none';
$(avisoA).style.display='none';
$(otro).style.display='none';
$(principio).style.display='none';
DWRUtil.removeAllRows("campospo");
DWRUtil.removeAllRows("camposMn");
DWRUtil.setValue("valores","");
ListaAdmPruebaDAO.listarPrueba1(mostrarLista1,id_prueba);
}

var Agregar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Agregar9");
      input.setAttribute("onclick","AdicionarValores();");      
       DWRUtil.setValue("tiponr",data.tipo);
       DWRUtil.setValue("id_prueba",data.id_prueba);
      return input;
    };


function mostrarLista1(data) {
  aux=1; 
  DWRUtil.addRows("campospo",data,[id_prueba,tipo,Agregar],{
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
//////////////////////*************fin*************////////////
  
  </script>

  
<body onload='Listar();' >  
<table class='tabla' align='center' id='listaTotal'>
<caption class='trCaption'>
<h3>Tipos de Pruebas</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nro.</th>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripcion</th>
<th>Modificar</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>
</table>

<div style='display:none' id='lista'>
<table class='tabla'>

<caption class='trCaption'>
<h3>Modificar Prueba</h3>
</caption>


<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>Nombre</th>
<th>Tipo</th>
<th>Descripcion</th>


</tr>
</thead>
<tbody id='camposM' align='center'>

</tbody>
<tr class='trFilas' align='center'>

</tr>
</table>

<table class='tabla' style='display:none' id='lista1'>

<caption class='trCaption'>
<h3>Modificar Resultados</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Codigo</th>
<th>SubCodigo</th>
<th>Resultado</th>
</tr>
</thead>
<tbody id='camposMn' align='center'>
</tbody>
</table>

<br>
<table class='tabla'>
<tr>
<th><input type="image" src="../imagenes/modificar.png" onclick='insertar();'></th>
<th> <input type="image" src="../imagenes/agregar.png" onclick='listaprueba1();'  id='aresultado' style='display:'>
     <input type='hidden' id='id_prueba'>
</th>
</tr>
</table>
</div>

<div style='display:none' id='agregarP'>
<table class='tabla'>
<caption class='trCaption'>
<h3>Inserte Valores al Resultado</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>id_prueba</th>
<th>tipo</th>
<th>Agregar</th>
</tr>
</thead>
<tbody id='campospo' align='center'>
</tbody>
<tr class='trFilas'>
<TD>Resultado:</TD>
<TD><input id='valores'></TD>
</tr>
</table>



</div>



<div style='display:none' id='avisoA' >
<table class='tabla'>
<caption class='trCaption'>
<h3>Decea insertar más valores al resultado</h3>
</caption>
</table>
<br>
<table class='tabla'>
<tr class='trFilas'>
<TD colspan="3"  align="center"><input type='image' src='../imagenes/agregar.png'  onclick='listaprueba1();' id='otro' style='display:none'></TD>
<TD align="center"><input type='image' src='../imagenes/fin.png'   onclick='Listar();'  id='principio' style='display:none'></TD>
</tr>
</table>
</div>






<table class='tabla' style='display:none' id='lista2'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Modificados Correctamente.............!</font></td>
</td>
</tr>
</table>


</body>
</html>


