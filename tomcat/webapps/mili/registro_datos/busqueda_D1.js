///////// busqueda_CODIGO///////////
var cod_do = 	function(data) { return data.cod_do };
var id_per = 	function(data) { return data.id_per };
var apepa = 	function(data) { return data.apepa };
var apema = 	function(data) { return data.apema };
var nom = 	function(data) { return data.nom };
var gs_rh = 	function(data) { return data.gs_rh };
/////////////////

///////// ///////////RESULTADOS
var id_aten = 	function(data) { return data.id_aten };
var fecha_a = 	function(data) { return data.fecha_a };
var edad = 	function(data) { return data.edad };
var resultado=	function(data) { return data.resultado };
/////////////////

///////// ///////////MODIFICAR
var ci = 	function(data) { return data.ci };
var prof = 	function(data) { return data.prof };
var ocu = 	function(data) { return data.ocu };
var lugar_tra =	function(data) { return data.lugar_tra };
var email = 	function(data) { return data.email };
var fono_pro = 	function(data) { return data.fono_pro };
var cel = 	function(data) { return data.cel };
var fono_vec = 	function(data) { return data.fono_vec };
var fono_tra = 	function(data) { return data.fono_tra };

var tipo_dom1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_domt");
      input.setAttribute("value",data.tipo_dom );
      return input;
    };


var tipo_dom2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_dom");
      input.setAttribute("value",data.tipo_dom );
      return input;
    };



var prof1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "prof");
      input.setAttribute("type", "String");      
      input.setAttribute("value",data.prof );
      return input;
    };

var ocu1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "ocu");
      input.setAttribute("value",data.ocu );
      return input;
    };

var lugar_tra1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "lugar_tra");
      input.setAttribute("value",data.lugar_tra );
      return input;
    };

var email1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "email");
      input.setAttribute("value",data.email );
      return input;
    };

var fono_pro1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_pro");
      input.setAttribute("value",data.fono_pro );
      input.setAttribute("size","9" );
      return input;
    };

var cel1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cel");
      input.setAttribute("value",data.cel );
      input.setAttribute("size","9" );
      return input;
    };

var fono_vec1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_vec");
      input.setAttribute("value",data.fono_vec );
      input.setAttribute("size","9" );
      return input;
    };

var fono_tra1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_tra");
      input.setAttribute("value",data.fono_tra );
      input.setAttribute("size","9" );
      return input;
    };

var calle_residencia1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "calle_residencia");
      input.setAttribute("value",data.calle_residencia );
      return input;
    };

var num1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "num");
      input.setAttribute("value",data.num );
      return input;
    };

var zona1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "zona");
      input.setAttribute("value",data.zona );
      return input;
    };

var calle_residencia2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "calle_residenciat");
      input.setAttribute("value",data.calle_residencia );
      return input;
    };

var num2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "numt");
      input.setAttribute("value",data.num );
      return input;
    };

var zona2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "zonat");
      input.setAttribute("value",data.zona );
      return input;
    };


var id_per1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type","hidden");
      input.setAttribute("id", "id_per");
      input.setAttribute("value",data.id_per );
      return input;
    };

//// inicio de agregar donante////////
function agregar_donante()
{   
    var cod_do=DWRUtil.getValue("cod_do"); 
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='none';
    $("resultado-todo1").style.display='none';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='none';
    $("resultado-todo3").style.display='';
    $("resultado-todo4").style.display='';
    $("resultado-todo5").style.display='';
    $("resultado-todo6").style.display='';
    $("resultado-por-apellido").style.display='none';
    
    BusquedaDAO.agregar_donante  (mostrarDonante,cod_do);
    BusquedaDAO.agregar_donante_1(mostrarDonante_1,cod_do);
    BusquedaDAO.agregar_donante_2(mostrarDonante_2,cod_do);
    BusquedaDAO.agregar_donante_2_2(mostrarDonante_2_2,cod_do);


}    


//// inicio de busqueda////////

/*

function busqueda_codigo()
{
//var val = validarString1("cod_do",   	  "EmC",        "*");
var cod_do=DWRUtil.getValue("cod_do");
/*
BusquedaDAO.mostrarBusqueda_Donantes(mostrarBusqueda,cod_do);

if (){
 alert("codigo inexistente");
 }

Collection lista = new Vector();
var cod_do=DWRUtil.getValue("cod_do");
    lista=BusquedaDAO.mostrarBusqueda_Donantes(cod_do);
if (lista==""){ alert("codigo inexistente"); } 

//var data=
BusquedaDAO.mostrarBusqueda_Donantes(cod_do);
//var c = DWRUtil.addRows("campostodos",data,[cod_do,apepa,apema,nom,gs_rh]);
//document.getElementById("c").innerHTML = c;
//if (c==""){ alert("hola mundo	"); val='1';}
//if (val=='0')
//    {

    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='';
    $("resultado-todo1").style.display='';
    $("resultado-todo2").style.display='';
    $("resultado-todo2_2").style.display='none';
    $("resultado-por-apellido").style.display='none';
    BusquedaDAO.mostrarBusqueda_Donantes(mostrarBusqueda,cod_do);
    BusquedaDAO.mostrarBusqueda_Resultados(mostrarResultados,cod_do);

  }
 else{
 alert("codigo inexistente");
 DWRUtil.setValue("cod_do","");}
}

*/

function busqueda_codigo(){  
    var cod_do = DWRUtil.getValue("cod_do"); 
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='';
    $("resultado-todo1").style.display='';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='';
    $("resultado-por-apellido").style.display='none';
    BusquedaDAO.mostrarBusqueda_Donantes(mostrarBusqueda,cod_do);
    BusquedaDAO.mostrarBusqueda_Resultados(mostrarResultados,cod_do);
}


function mostrarBusqueda(data) {
  aux=1;                        
  DWRUtil.addRows("campostodos",data,[cod_do,apepa,apema,nom,gs_rh],{
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



///////////fin de busqueda//////////
function mostrarResultados(data) {
  aux=1;                        
  DWRUtil.addRows("camposResultados",data,[ id_aten,fecha_a,edad,resultado],{
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



function mostrarDonante(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes",data,[ id_per1,cod_do,nom,apepa,apema,gs_rh,ci,prof1,ocu1],{
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


function mostrarDonante_1(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes_1",data,[ lugar_tra1,email1,fono_pro1,cel1,fono_vec1,fono_tra1],{
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
function mostrarDonante_2(data) {
  aux=1;                        
//  DWRUtil.addRows("campos_Donantes_2",data,[calle_residencia2,num2,zona2,tipo_domt],{
  DWRUtil.addRows("campos_Donantes_2",data,[calle_residencia1,num1,zona1,tipo_dom2],{
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

function mostrarDonante_2_2(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes_2_2",data,[calle_residencia2,num2,zona2,tipo_dom1],{
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


///////////inicio de modificar

function modificar_valor()
{
var id_per=DWRUtil.getValue("id_per");
var prof=DWRUtil.getValue("prof");
var ocu=DWRUtil.getValue("ocu");
var lugar_tra=DWRUtil.getValue("lugar_tra");
var email=DWRUtil.getValue("email");

var fono_pro=DWRUtil.getValue("fono_pro");
var cel=DWRUtil.getValue("cel");
var fono_vec=DWRUtil.getValue("fono_vec");
var fono_tra=DWRUtil.getValue("fono_tra");

var tipo_dom=DWRUtil.getValue("tipo_dom");

var calle_residencia=DWRUtil.getValue("calle_residencia");
var num=DWRUtil.getValue("num");
var zona=DWRUtil.getValue("zona");

var tipo_domt=DWRUtil.getValue("tipo_domt");
var calle_residenciat=DWRUtil.getValue("calle_residenciat");
var numt=DWRUtil.getValue("numt");
var zonat=DWRUtil.getValue("zonat");

BusquedaDAO.modificar_Datos_Donante(insertarDatos,tipo_dom,tipo_domt,id_per,prof,ocu,lugar_tra,email,fono_pro,cel,fono_vec,fono_tra,calle_residencia,num,zona,calle_residenciat,numt,zonat);
//BusquedaDAO.modificar_Datos_Donante(insertarDatos,id_per,prof,ocu,lugar_tra,email,fono_pro,cel,fono_vec,fono_tra);
}

function insertarDatos()
{
    $("resultado-todo").style.display='none';
    $("resultado-todo1").style.display='none';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='none';
    $("resultado-todo3").style.display='none';
    $("resultado-todo4").style.display='none';
    $("resultado-todo5").style.display='none';
    $("resultado-todo6").style.display='none';
    $("resultado-todo7").style.display='';
    $("resultado-por-apellido").style.display='none';
}
////fin de modificar
///////////EXAMEN FISICO

function visualizar(){
$("aviso").style.display='none';
$("resultado-todo7").style.display='none';
$("resultado-todo5").style.display='none';
$("resultado-todo4").style.display='none';
$("resultado-todo3").style.display='none';
$("resultado-todo2").style.display='none';
$("resultado-todo2_2").style.display='none';
$("resultado-todo1").style.display='none';
$("resultado-todo").style.display='none';
$("formulario_examenFisico").style.display='';
fechas();
horas();
}

/////////////FIN DE BUSQUEDA CON CODIGO/

var v81 = '1';
var v82 = '1';
var v83 = '1';
var v84 = '1';
var v85 = '1';
var v86 = '1';
var v87 = '1';
var v88 = '1';

function vali(){
//     if ( (v81=='0')&&(v82=='0')&&(v83=='0')&&(v84=='0')&&(v85=='0')&&(v86=='0')&&(v87=='0')&&(v88=='0') ){
     if ( (v81=='0')&&(v82=='0')&&(v83=='0')&&(v84=='0')&&(v85=='0')&&(v86=='0')&&(v87=='0')&&(v88=='0') ){
      DWRUtil.setValue("agregar12","<input type='submit' value='Agregar' onclick='insertarEF();'>");
     }  
     else{
      DWRUtil.setValue("agregar12","");
     }
}
                                 
function validarEntero111(){v81 =validarReales("sistolica",	  "EmSi",        "*");vali();}
function validarEntero112(){v82 =validarReales("diastolica",	  "EmDi",        "*");vali();}
function validarEntero113(){v83 =validarReales("pulso",	  	  "EmPu",        "*");vali();}
function validarEntero114(){v84 =validarReales("peso",		  "EmPe",        "*");vali();}
function validarEntero115(){v85 =validarReales("talla",		  "EmTa",        "*");vali();}
function validarEntero116(){v86 =validarReales("temperatura",	  "EmTe",        "*");vali();}
function validarCombos111(){v87 =validarCombo("tipo_do",	  "EmCom",       "*");vali();}
function validarCombos112(){v88= validarCombo("veces",		  "EmComb",      "*");vali();}



/*//////////////// PRIMERA procedimiento*/

//////////////////////////////////////////////////////////



function insertarEF()
{
var fecha_a=DWRUtil.getValue("fecha_a");
var hora_a=DWRUtil.getValue("hora_a");
var id_aten=DWRUtil.getValue("id_aten");
var tipo_do=DWRUtil.getValue("tipo_do");
var veces=DWRUtil.getValue("veces");
var cod_do=DWRUtil.getValue("cod_do");
var sistolica=DWRUtil.getValue("sistolica");
var diastolica=DWRUtil.getValue("diastolica");
var pulso=DWRUtil.getValue("pulso");
var peso=DWRUtil.getValue("peso");
var talla=DWRUtil.getValue("talla");
var temperatura=DWRUtil.getValue("temperatura");
var atendido=DWRUtil.getValue("atendido");
var atendidop=DWRUtil.getValue("atendidop");
var atendidoh=DWRUtil.getValue("atendidoh");
var atendidos=DWRUtil.getValue("atendidos");
var atendidoe=DWRUtil.getValue("atendidoe");

NuevoDAO.adicionarEF(insertarDatosEF,fecha_a,hora_a,id_aten,tipo_do,veces,cod_do,sistolica,diastolica,pulso,peso,talla,temperatura,atendido,atendidop,atendidoh,atendidos,atendidoe);
}
function insertarDatosEF()
{
$(avisoEF).style.display='';
$(aviso).style.display='none';
$(formulario).style.display='none';
$(formulario_examenFisico).style.display='none';
$("resultado-todo7").style.display='none';
$("resultado-todo5").style.display='none';
$("resultado-todo4").style.display='none';
$("resultado-todo3").style.display='none';
$("resultado-todo2").style.display='none';
$("resultado-todo2_2").style.display='none';
$("resultado-todo1").style.display='none';
$("resultado-todo").style.display='none';

}

function horas()
{  
var timeday;
var horas;
today=new Date();
sec=today.getSeconds();
hr=today.getHours();
min=today.getMinutes();

if(hr<12){timeday="AM";}
else {timeday="PM";}
if (hr>12) hr=hr-12;
if (hr<=9) hr="0"+hr;
if (min<=9) min="0"+min;
if (sec<=9) sec="0"+sec;
horas=hr+":"+min+":"+sec+timeday;
document.getElementById("hora_a").innerHTML =horas;
//document.relojito.hora_a.value=horas;
setTimeout("horas()",1000);
}


  
function fechas()
{
var mes=new Array(12);
mes[0]="Enero";
mes[1]="Febrero";
mes[2]="Marzo";
mes[3]="Abril";
mes[4]="Mayo";
mes[5]="Junio";
mes[6]="Julio";
mes[7]="Agosto";
mes[8]="Septiembre";
mes[9]="Octubre";
mes[10]="Noviembre";
mes[11]="Diciembre";

today=new Date();
dia=today.getDate();
//mes=today.getMonth();
anno=today.getYear()+1900;
var a=dia+" de "+mes[today.getMonth()]+" del "+anno;
//var a=dia+"-"+mes+"-"+anno;
//document.fechita.fecha_a.value=a;
document.getElementById("fecha_a").innerHTML = a;
}  

////*************PRIMERA PAGINA****************////////

////////////INICIO DE BUSQUEDA CON CI
