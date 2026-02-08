<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Control de calidad</title>

   <style type="text/css" media="screen">
       @import url( style.css );
   </style>  


  <script src='/mili1/dwr/interface/ListaControlDAO.js'></script>
  <script src='/mili1/dwr/engine.js'></script>
  <script src='/mili1/dwr/util.js'></script>
  <script>

function ListarEva(id_aten,cod_do,id_prod)
{  
DWRUtil.setValue("id_aten",id_aten);     
DWRUtil.setValue("cod_do",cod_do);     
$(lista).style.display='none';
$(lista1).style.display='';
ListaControlDAO.mostrarLista3(mostrarListaDonantes1);
}

var mes=new Array(20);
var gel=new Array(20);
var va=new Array(20);
    for(i=0;i<=20;i++) va[i]=1;
var d=0;
var p=0;
var Pr= function(data) {
gel[j]=data.id_prueba;
j++;
     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id", data.id_prueba);
      input.setAttribute("readonly", "true");
//     input.setAttribute("value","hola a todos");
      input.setAttribute("size", 18);
//      DWRUtil.setValue("id_pruebaF",data.id_prueba);     
      //input.setAttribute("onblur","validarcaja('"+data.id_prueba+"');");
      return input;
    
     } 

     if(data.tipo_componente=='3'){

      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      input.setAttribute("onclick","Insertar('"+data.id_prueba+"');");
      return input;                             
     }
         
      if(data.tipo_componente=='2'){
      var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='0' selected='selected'>~</option> </select>";
      mes[d]=""+data.id_prueba+"";
       va[data.id_prueba]=0;
       p=p+500;
      setTimeout("ListaControlDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p);	
      d++;

//a=DWRUtil.getValue(a);     
 return input;                             

    }
};

var a1=0;
function nivel0(data)
{
DWRUtil.addOptions(''+mes[a1]+'',data,'valores','valores');
a1++;
}

function mostrarListaDonantes1(data) {
  aux=1; 
  DWRUtil.addRows("camposp",data,[id_prueba,nombre_tp,tipo_componente,Pr],{
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
  



function ListaTotal()
{
//$(resultado266).style.display='none';
ListaControlDAO.ListaT(mostrarTodo);
}

function insertarDatosV()
{
DWRUtil.removeAllRows("campos233");  
ListaTotal();
//$(resultado1).style.display='none';
//$(resultado23).style.display=''; 
//$(n0).style.display=''; 
//$(n1).style.display=''; 
//$(uno).style.display=''; 
//$(resultado2).style.display=''; 

$(resultado266).style.display='';
}
  
  

function ListarEvaCombo()
{

//$(extra1).style.display='none';             
//$(resultado23).style.display=''; 
//$(n0).style.display=''; 
//$(n1).style.display=''; 
//$(uno).style.display=''; 

var id_prueba=DWRUtil.getValue("n0"); 
ListaControlDAO.mostrarLista4(nivel0,id_prueba);
nivel2();
}

function nivel2()
 { 
var id_prueba= DWRUtil.getValue("n0"); 
ListaControlDAO.mostrarNombre(mostrarM,id_prueba);
}

function mostrarM(data)
{
document.getElementById("uno").innerHTML = data;
}


function nivel0(data)
 {
 DWRUtil.removeAllOptions('n1'); 
 DWRUtil.addOptions('n1',data,'valores','valores');
 }

function Listarcontrol(id_prod,id_ext,cod_do,id_aten,id_hemo)
{  
$(extra1).style.display='none';             
$(resultado23).style.display=''; 
$(n0).style.display=''; 
$(n1).style.display=''; 
$(uno).style.display=''; 

DWRUtil.setValue("id_prod",id_prod); 
DWRUtil.setValue("id_ext",id_ext); 
DWRUtil.setValue("cod_do",cod_do); 
DWRUtil.setValue("id_aten",id_aten); 
DWRUtil.setValue("id_hemo",id_hemo);
//ListaTotal();
ListaControlDAO.mostrarLista3(mostrarListaDonantes1);
}


function Listar()
{              
ListaControlDAO.mostrarLista(mostrarListaDonantes);
}

var id_aten = function(data) { return data.id_aten };	
var id_prod = function(data) { return data.id_prod };	
var cod_do = function(data) { return data.cod_do };
var cod_per = function(data) { return data.cod_per };
var id_salida = function(data) { return data.id_salida };
var id_ext = function(data) { return data.id_ext };
var fecha_expi = function(data) { return data.fecha_expi };
var nombre = function(data) { return data.nombre };

var resultado = function(data) { return data.resultado};
var id_hemo = function(data) { return data.id_hemo};
var id_prueba = function(data) { return data.id_prueba};
var nombre_tp = function(data) { return data.nombre_tp};
var tipo_componente = function(data) { return data.tipo_componente};

var valores = function(data) { return data.valores};
var id_valor = function(data) { return data.id_valor};

var id_hemo1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "hidden");
      input.setAttribute("id", "id_hemo");
      input.setAttribute("value",data.id_hemo );
      
      return input;
    };


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Control-Calidad");
      input.setAttribute("onclick","ListarEva('"+data.id_prod+"','"+data.cod_do+"','"+data.id_aten+"');");
      return input;                             
    };



function mostrarListaDonantes(data) {      
  aux=1; 								
  DWRUtil.addRows("campos",data,[id_aten,id_prod,cod_do,nombre,fecha_expi,Predonacion],{
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
  DWRUtil.addOptions('n0',data,'id_prueba','nombre_tp');
  }

function mostrarTodo(data) {
  aux=1; 
  DWRUtil.addRows("campos233",data,[nombre_tp,resultado],{
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
<table class='tabla'  id='extra1' style='display'>
<caption class='trCaption'>
Lista de hemocomponentes para realizar el Control de Calidad
</caption>

<thead>
<tr class='trFilas'>
id_aten,id_prod,cod_do,nombre,fecha_expi,
<th>Nro</th>
<th>Nro Prod.</th>
<th>Codigo</th>
<th>Componente</th>
<th>Fecha Expiracion</th>
<th>Control-Calidad</th>

</tr>
</thead>
<tbody id='campos'>
</tbody>
</table>

<table class='tabla'  id='resultado23' style='display:none'>
<caption class='trCaption'>
Registrar Control de Calidad
</caption>

<tr class='trFilas'>
<TD>Fecha</TD>
    <TD><input  id='fecha_prueba'></TD>
<TD><input type='submit' value='Finalizar' onclick='updateTT();'></TD>
</TR>
</table>


<table class='tabla'>
<tr class='trFilas'>
<input type='hidden' id='i'>
<select id='n0' size='3' onchange='ListarEvaCombo();' style='display:none' ></select>

<select id='n1' size='3'  onchange='insertarValor();' style='display:none'></select>
<div id='uno' style='display:none' ></div>

</tr>
<tr class='trFilas'>
</tr>
</TABLE>


<table class='tabla'  style='display:none' id='resultado266'>
<caption class='trCaption'>
Datos ya insertados
</caption>
<thead>
<tr class='trFilas'>
<th>Nombre-Prueba</th>
<th>Resultado</th>
</tr>
</thead>
<tbody id='campos233'>
</tbody>
</table>
<input type='hidden'  id='id_prod'>
<input type='hidden'  id='id_ext'>
<input type='hidden'  id='cod_do'>
<input type='hidden'  id='id_aten'>
<input type='hidden'  id='id_hemo'>

<table class='tabla' style='display:none' id='resultado2'>
<caption class='trCaption'>
Datos Insertados Correctamente.............!
</caption>
</table>


</body>
</html>


