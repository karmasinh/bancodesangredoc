<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>prueba</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  
   <script src='validaciones.js'></script>
  <script src='/mili1/dwr/interface/NuevoPruebaDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>
///////////////validacion//////////////////////
var v7 = '1';
var v8 = '1';
var v9 = '1';
var v10 = '1';
var v11 = '1';

function v1(){v7 = validarCombo("tipo", "t", "*");cambiar();}
function v2(){v8 = validarString("nombre_tp","n", "*");cambiar();}
function v3(){v9 = validarString("descr", "d","*");cambiar();}
function v4(){v10= validarCombo("tipo_componente", "c","*");cambiar();}
function v5(){ v11= validarString("valores", "v","*");val();}


function val(){
     if (v11=='0'){
      DWRUtil.setValue("aceptar5"," <input type='image' src='../imagenes/aceptar.png' onclick='AdicionarValores();'>"); 
     }  
     else{
      DWRUtil.setValue("aceptar5","");
     }
}

/////////////////////////////////////////////////


function AdicionarValores()
 {
 var valores=DWRUtil.getValue("valores");
 DWRUtil.removeAllRows("campos");
v11='1'; 
 DWRUtil.setValue("aceptar5","");
 NuevoPruebaDAO.AdicionarValores(adicionarValor,valores);
 }

function adicionarValor()
{
$(avisoA).style.display='';
$(otro).style.display='';
$(principio).style.display='';
$(avisoE).style.display='none';
$(aviso).style.display='none';
$(formulario).style.display='none';
}
function principio1()
 {
 NuevoPruebaDAO.Principio(Valorp);
 }

function Valorp()
{
$(avisoP).style.display='';
$(avisoA).style.display='none';
$(otro).style.display='none';
$(principio).style.display='none';
$(avisoE).style.display='none';
$(aviso).style.display='none';
$(formulario).style.display='none';

}


function cambiar()
{

var dos="<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>";

var tres="<input type='image' src='../imagenes/agregar.png'  onclick='listarD();'>";

var combo=DWRUtil.getValue("tipo_componente");

 if ((combo=="3")||(combo=='1')&&((v7=='0')&&(v8=='0')&&(v9=='0')&&(v10=='0')))
{document.getElementById("uno").innerHTML = dos;}
 else  if ((v7=='0')&&(v8=='0')&&(v9=='0')&&(v10=='0'))
 {document.getElementById("uno").innerHTML = tres;}
}

function listarD()
{
var tipo=DWRUtil.getValue("tipo");
var nombre_tp=DWRUtil.getValue("nombre_tp");
var descr=DWRUtil.getValue("descr");
var tipo_componente=DWRUtil.getValue("tipo_componente");

NuevoPruebaDAO.adicionarPrueba(listaprueba,tipo,nombre_tp,descr,tipo_componente);


}


function listaprueba()
{
$("avisoE").style.display='';
$("avisoA").style.display='none';
$("aviso").style.display='none';
$("formulario").style.display='none';
var id_prueba=DWRUtil.getValue("id_prueba");
DWRUtil.removeAllRows("campos");
DWRUtil.removeAllRows("campospo");
//var tipo=DWRUtil.getValue("tipo");
NuevoPruebaDAO.listarPrueba(mostrarLista,id_prueba);
}


function listaprueba1()
{
$("avisoE").style.display='';
$("avisoA").style.display='none';
$("otro").style.display='none';
$("principio").style.display='none';
$("aviso").style.display='none';
$("formulario").style.display='none';

var id_prueba=DWRUtil.getValue("id_prueba");
DWRUtil.removeAllRows("campos");
DWRUtil.removeAllRows("campospo");

DWRUtil.setValue("valores","");
NuevoPruebaDAO.listarPrueba(mostrarLista1,id_prueba);
}


var id_prueba = function(data) { return data.id_prueba };
var tipo = function(data) { return data.tipo };

var Agregar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Agregar");
      input.setAttribute("onclick","AdicionarValores();");      
      return input;
    };



function mostrarLista(data) {
  aux=1; 
  DWRUtil.addRows("campospo",data,[id_prueba,tipo],{
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


function mostrarLista1(data) {
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prueba,tipo],{
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



function listar()
{
$(avisoE).style.display='';
$(avisoA).style.display='none';
$(aviso).style.display='none';
$(formulario).style.display='none';
}


function insertar()
{
var tipo=DWRUtil.getValue("tipo");
var nombre_tp=DWRUtil.getValue("nombre_tp");
var descr=DWRUtil.getValue("descr");
var tipo_componente=DWRUtil.getValue("tipo_componente");

NuevoPruebaDAO.adicionarPrueba(insertarDatos,tipo,nombre_tp,descr,tipo_componente);
}

function insertarDatos()
{
$(aviso).style.display='';
$(avisoA).style.display='none';
$(formulario).style.display='none';
}

function conteo()
{
NuevoPruebaDAO.countRegistro(conteoDatos);
}

function conteoDatos(data) {
document.getElementById("id_prueba").innerHTML = data;
}
</script>

<body onload='conteo();'>

<div id='formulario' >

<table class='tabla' align='center'>

<caption class='trCaption'>
<h3>Registrar Nueva Prueba</h3>
</caption>

 <tr class='trFilas'>
    <TD>Nro de prueba</TD>
    <TD> <span  id='id_prueba'></span> </TD>
    <TD>Tipo de prueba:</TD>
    <TD> <select id='tipo'  onblur='v1();'>
      <option value="-1">---Seleccionar---</option>
      <option value="pre-donacion">Pre-donacion</option>
      <option value="inmunohematologia">Inmunohematologia</option>
      <option value="inmunoserelogia">Inmunoserelogia</option>
      <option value="control de calidad">Control de Calidad</option>
      <option value="salida">Salidas</option>
    </select> <span id='t'></span></TD>

    
 <tr class='trFilas'>
     <TD>Nombre de la prueba:</TD>
    <TD><input id='nombre_tp' onblur='v2();'> <span id='n'></span></TD>
    <TD>Descripcion:</TD>
    <TD><input id='descr' onblur='v3();'> <span id='d'></span></TD>
    </TR>
 <tr class='trFilas'>
          <TD>Componente:</FONT></TD>
          <TD> <select id='tipo_componente' onblur='v4();' onchange='cambiar();' size='3'>
          <option value="1">--1--</option>
          <option value="2">--2--</option>
	  <option value="3">--3--</option>
	  <option value="-1"></option>
	  </select><span id='c'>   </span></TD>
  </TR>
</TABLE>

<table class='tabla' align='center'>
<tr class='trFilas'><TD>Ejemplos de Componentes</TD><TD></TD>
</TR>

<tr class='trFilas'><TD ></TD ><TD ><img src='../imagenes/2Dibujo.png' ></TD></TR>
<tr class='trFilas'><TD ></TD ><TD ><img src='../imagenes/1Dibujo.png' ></TD></TR>
<tr class='trFilas'><TD ></TD ><TD ><img src='../imagenes/3Dibujo.png' ></TD></TR>
</TABLE>
<br>
<table class='tabla' align='center'>
<tr class='trFilas'>
<TD colspan="3"  align="center"><div id='uno'>  </div></TD>
<TD align="center"><input type='image' src='../imagenes/cancelar1.png' ></TD>
</TR>

</TABLE>

</div>


<table class='tabla' style='display:none' id='aviso'>
<tr class='trFilas'>
<td>
Datos insertados Correctamente!-------------
</td>
</tr>
</table>

<div class='tabla' style='display:none' id='avisoE'>
<table class='tabla' >
<caption class='trCaption'>
<h3>Inserte Valores al Resultado</h3>
</caption>
<thead>
<tr class='trFilas'>
<th>Nro. de prueba</th>
<th>Tipo de prueba</th>
</tr>
</thead>
<tbody id='campos' align='center'>
</tbody>

<tbody id='campospo' align='center'>
</tbody>
</table>
<table class='tabla'>
<tr class='trFilas' >
<TD >Resultado::.<INPUT id='valores' onblur='v5();'><span id='v'></span></TD>
</tr>
</table>
<br>

<table class='tabla' >
<tr class='trFilas'>
<TD colspan="3"  align="center"><div id='aceptar5'> </div></TD>
<TD align="center"><input type='image' src='../imagenes/cancelar1.png' ></TD>
</TR>
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
<TD align="center"><input type='image' src='../imagenes/fin.png'   onclick='principio1();'  id='principio' style='display:none'></TD>
</tr>
</table>
</div>
<table class='tabla' style='display:none' id='avisoP'>
<tr class='trFilas'>
<td>
<td align='center'><font color="blue" size='3'>Datos Insertados Correctamente.............!</font></td>
</td>
</tr>
</table>


</body>
</html>


