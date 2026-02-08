/////////inicio de cancelar////
function Cancelar()
{        
DWRUtil.removeAllRows("campos");      
$("busqueda").style.display='';
$("evaluacion").style.display='none';
$("resultadoeva").style.display='none';
}
/////////fin de cancelar/////

//////****************validar****************//////////////ç////////////
var v1 = '1';
var v2 = '1';
var v3 = '1';
function vali(){
     if ( (v1=='0')&&(v2=='0')&&(v3=='0')){
      DWRUtil.setValue("agregar"," <input type='image' src='../imagenes/aceptar.png' onclick='insertarE();'>"); 
     }  
     else{
      DWRUtil.setValue("agregar","");
     }
}
                                 
function validarCadena(){v1 =validarString("ingestion",  "Em",      "*");vali();}
function validarCombos1(){ v2 =validarCombo ("ayunas",	  "EmC",   "*");vali();}
function validarCombos2(){ v3 = validarCombo("resultado",      "EmC1",  "*");vali();}

//////////////**********validar***********/////////////////////////////
function cambiar()
{
  
var dos="";
var tres="<select id='rechazo'> <option value='Ninguno'>ninguno</option><option value='Permanente'>Permanente</option> <option value='Temporalmente'>Temporal</option> </select>       Numeral:  <INPUT id='numeral'>";
var combo=DWRUtil.getValue("resultado");
 if (combo=="Donante Apto")
 {document.getElementById("uno").innerHTML = dos;}
 else if(combo=="Donante No Apto")
 {document.getElementById("uno").innerHTML = tres;}
 else
  {document.getElementById("uno").innerHTML = dos;}
}

function insertarE()
{
var id_aten=DWRUtil.getValue("id_aten");
var ayunas=DWRUtil.getValue("ayunas");
var r=DWRUtil.getValue("resultado");
var ingestion=DWRUtil.getValue("ingestion");
var obs=DWRUtil.getValue("obs");


if (r!="Donante Apto")
{
var numeral=DWRUtil.getValue("numeral");
var rechazo=DWRUtil.getValue("rechazo");
}
else
{
var numeral="";
var rechazo="";
}
var m=new Array(12);
m[0]="01";
m[1]="02";
m[2]="03";
m[3]="04";
m[4]="05";
m[5]="06";
m[6]="07";
m[7]="08";
m[8]="09";
m[9]="10";
m[10]="11";
m[11]="12";

today=new Date();
dia=today.getDate();
anno=today.getYear()+1900;
var fecha_a=anno+"-"+m[today.getMonth()]+"-"+dia;
var cod_do=DWRUtil.getValue("cod_do");
var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");
/*
alert('id_aten'+id_aten);
alert('ayunas'+ayunas);
alert('resultado'+r);
alert('ingestion'+ingestion);
alert('obs'+obs);
alert('fecha_a'+fecha_a);
alert('cod_do'+cod_do);
alert('cod_per'+cod_per);
alert('id_horario'+id_horario);
alert('numeral'+numeral);
alert('rechazo'+rechazo);
*/
ListaMedicaDAO.adicionarEvalu(insertarDatos,obs,ayunas,numeral,id_aten,r,ingestion,rechazo,fecha_a,cod_per,id_horario,cod_do);
}

//	  public void adicionarEvalu(String obs,String ayunas,String numeral,int idaten,String r,String ingestion,String rechazo,String fecha,String cod_per,int id_horario, String cod_do)   
//ListaMedicaDAO.cambioAtendido(cambioDatos,id_aten);

///------ES una prueba---------////
//var mar={ayunas1:ayunas,resultado1:r,ingestion1:ingestion,obs1:obs,numeral1:numeral,rechazo1:rechazo,id_aten1:id_aten};
//DWRUtil.setValues(mar);
//var resultado=DWRUtil.getValue("resultado1");
///----------------------------------///


function insertarDatos()
{
alert('llego');
$("avisoE").style.display='';
$("resultadoeva").style.display='none';
$("evaluacion").style.display='none';
$("busqueda").style.display='none';
}




function cambioDatos()
{
$("avisoE").style.display='';
$("resultadoeva").style.display='none';
$("evaluacion").style.display='none';
$("busqueda").style.display='none';
}


function ListarEva(id_aten,cod_do)
 {
 DWRUtil.setValue("id_aten", id_aten);
 DWRUtil.setValue("cod_do", cod_do);
 $("busqueda").style.display='none';
 $("evaluacion").style.display='';
 $("resultadoeva").style.display='';
// DWRUtil.setValue('id_aten1',id_aten);
 ListaMedicaDAO.mostrarListaEva(mostrarEva,id_aten);
 }


function Listar()
{        
DWRUtil.removeAllRows("campos");      
$("busqueda").style.display='';
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  

//*********paginacion********/////
ListaMedicaDAO.Cantidad(mostrarCantidad);
ListaMedicaDAO.mostrarLista(mostrarListaDonantes);
}

function mostrarCantidad(data){
     DWRUtil.setValue("total",data);
     inicio(data);
     ini = 1;
     fin = numer_filas;
     fabrica(1);
}
function tabla(ii,nf){
     ini = ii * nf - nf + 1;
     fin = ii * nf;
     DWRUtil.removeAllRows("campos");
     ListaMedicaDAO.mostrarLista(mostrarListaDonantes);
     $("busqueda").style.display='';
}
/////////******fin de paginacion************////////////

var cod_do = function(data) { return data.cod_do };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var nom = function(data) { return data.nom };
var id_aten = function(data) { return data.id_aten};
var fecha_a = function(data) { return data.fecha_a };
var hora_a = function(data) { return data.hora_a };
var sistolica = function(data) { return data.sistolica };
var diastolica = function(data) { return data.diastolica};
var pulso = function(data) { return data.pulso};
var peso = function(data) { return data.peso};
var talla = function(data) { return data.talla };
var temperatura = function(data) { return data.temperatura };


var Introducir= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ListarEva('"+data.id_aten+"','"+data.cod_do+"');");
      return input;
      
    };

var Agregar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/aceptar.png");
      input.setAttribute("onclick","insertarE('"+data.id_aten+"');");
      return input;
      
    };



function mostrarListaDonantes(data) {
  aux=1; 
  DWRUtil.addRows("campos",data,[id_aten,cod_do,nom,apepa,apema,Introducir],
       {rowCreator:function(options){
         var tr = document.createElement("tr");	
         if ((aux%2)==0){tr.style.backgroundColor = "#eeeeff";tr.style.border="1px solid #00008B";}
	            else{tr.style.backgroundColor = "#ffffff";tr.style.border="1px solid #00008B";}
	 aux++;
	 if ( ( aux-1 >= ini )&&( aux-1<=fin ) ) return tr;
      }
     } );
}




function mostrarEva(data) {
  aux=1;
  DWRUtil.addRows("camposE",data,[ fecha_a,hora_a,id_aten,sistolica,diastolica,pulso,peso,talla,temperatura],{
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
//document.getElementById("totalRecords").innerHTML = data;


