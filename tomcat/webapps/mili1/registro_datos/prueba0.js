  ///////// busqueda///////////
var cod_do = 	function(data) { return data.cod_do };
var id_per= 	function(data) { return data.id_per };
var apepa = 	function(data) { return data.apepa };
var apema = 	function(data) { return data.apema };
var nom = 	function(data) { return data.nom };
var edad = 	function(data) { return data.edad };
var gs_rh = 	function(data) { return data.gs_rh };
var id_aten = 	function(data) { return data.id_aten};
var fecha_a = 	function(data) { return data.fecha_a };
/////////////////

////// tamizaje/////////
var hora_a =       function(data) { return data.hora_a };
var resultado =    function(data) { return data.resultado };
var rechazo =      function(data) { return data.rechazo};
var numeral =      function(data) { return data.numeral};
var obs =          function(data) { return data.obs};
var fecha_prueba = function(data) { return data.fecha_a };
var instancia =    function(data) { return data.instancia };
////////////////////

//// predonacion ////////
var fecha_prueba_1 = function(data) { return data.fecha_a };
var nombre_tp_1 =    function(data) { return data.nombre_tp };
var resultado_1 =    function(data) { return data.resultado };
////////////////

//// serelogia ////////
var fecha_prueba_2 = function(data) { return data.fecha_a };
var nombre_tp_2 =    function(data) { return data.nombre_tp };
var resultado_2 =    function(data) { return data.resultado };
////////////////

//// hematologia ////////
var fecha_prueba_3 = function(data) { return data.fecha_a };
var nombre_tp_3 =    function(data) { return data.nombre_tp };
var resultado_3 =    function(data) { return data.resultado };
////////////////


////INICIO  BOTONES//////////
    

    
    
    
    

//// FIN DE BOTONES/////    
    
//// inicio de busqueda////////

function busqueda()
{  
    DWRUtil.setValue("yo",""); 
    DWRUtil.setValue("yo1",""); 
    DWRUtil.setValue("yo2",""); 
    DWRUtil.setValue("yo3",""); 
var cod_do=DWRUtil.getValue("cod_do"); 
var apepa=DWRUtil.getValue("apepa");   
var ci=DWRUtil.getValue("ci"); 
$("busqueda1").style.display='none';
$("resultado-todo").style.display='';
//alert(ci);
       ListaMedicaDAO.ciTm(evalu1,ci);
       ListaMedicaDAO.ciPr(predonacionT1,ci);
       ListaMedicaDAO.ciIH(inmunohematologiaIH1,ci);
       ListaMedicaDAO.ciIS(inmunoserelogiaIS1,ci);
BusquedaDAO.mostrarBusqueda(mostrarBusqueda,cod_do,apepa,ci);
}

function evalu(data){
DWRUtil.setValue("yo",data); 
}
var p='';
var y1='';
var evaluacion= function(data) {
      y1=DWRUtil.getValue("yo"); 
      if ( y1 > 0 ){
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/TM.png");
      input.setAttribute("onclick","ListarPre('"+data.cod_do+"','"+data.id_aten+"');");
      }
      else{
      var input = document.createElement("input");
      input.setAttribute("type", "hidden");
      }
      return input;
    };

function predonacionT(data) {
DWRUtil.setValue("yo1",data); 
}
var y2='';

var predonacion = function(data) {
   y2=DWRUtil.getValue("yo1"); 
   //alert(y2);
   if ( y2 > 0 ){
      var input = document.createElement("input");
      input.setAttribute("id", "predo");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/PD.png");
      input.setAttribute("onclick","ListarPredo('"+data.cod_do+"','"+data.id_aten+"');");
    }
else {
      var input = document.createElement("input");
      input.setAttribute("id", "predo");
      input.setAttribute("type", "hidden");
      }  
      return input;
    };



function inmunohematologiaIH(data) {
DWRUtil.setValue("yo2",data); 
}

var y3='';

var inmunohematologia = function(data) {
    y3=DWRUtil.getValue("yo2"); 
     //alert(y3);
    if ( y3 > 0 ){
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/IH.png");
      input.setAttribute("onclick","ListarHema('"+data.cod_do+"','"+data.id_aten+"');");
    }
else {
      var input = document.createElement("input");
      input.setAttribute("id", "predo");
      input.setAttribute("type", "hidden");
      }
      return input;
    };


function inmunoserelogiaIS(data) {
DWRUtil.setValue("yo3",data); 
}

var y4='';

var inmunoserelogia = function(data) {
    y4=DWRUtil.getValue("yo3"); 
    //alert(y4);
    if ( y4 > 0 ){
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/IS.png");
      input.setAttribute("onclick","ListarSere('"+data.cod_do+"','"+data.id_aten+"');");
      }
    else {
      var input = document.createElement("input");
      input.setAttribute("id", "predo");
      input.setAttribute("type", "hidden");
      }
      return input;
    };

////////////////************POR CI******/////

function evalu1(data){
DWRUtil.setValue("yo",data); 
}

function predonacionT1(data) {
DWRUtil.setValue("yo1",data); 
}

function inmunohematologiaIH1(data) {
DWRUtil.setValue("yo2",data); 
}

function inmunoserelogiaIS1(data) {
DWRUtil.setValue("yo3",data); 
}

/////////////***********FIN DE CI************////////////

function mostrarBusqueda(data) {
  aux=1;                        							 
  DWRUtil.addRows("campostodos",data,[ id_aten,fecha_a,cod_do,nom,apepa,apema,gs_rh,edad,evaluacion,predonacion,inmunohematologia,inmunoserelogia],{
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

/// INICIO---- LISTA TAMIZAJE //////
function ListarPre(cod_do,id_aten)
 {
 DWRUtil.removeAllRows("camposTamizaje");
 $("resultado-Predonacion").style.display='none';
 $("resultado-Tamizaje-Medico").style.display='';
 $("resultado-Serelogia").style.display='none';
 $("resultado-Hematologia").style.display='none';
 BusquedaDAO.mostrarResultadosPre(mostrarListaTamizaje,cod_do,id_aten);
  }


function mostrarListaTamizaje(data) {
  aux=1; 
  DWRUtil.addRows("camposTamizaje",data,[fecha_a,hora_a,id_aten,cod_do,resultado,rechazo,numeral,obs],{
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
////FIN DE TAMIZAJE//////

//// INICIO DE PREDONACION //////
function ListarPredo(cod_do,id_aten)
 {
 DWRUtil.removeAllRows("camposPredonacion");
 $("resultado-Tamizaje-Medico").style.display='none';
 $("resultado-Predonacion").style.display='';
 $("resultado-Serelogia").style.display='none';
 $("resultado-Hematologia").style.display='none';
BusquedaDAO.mostrarResultadosPredo(mostrarListaPredo,cod_do,id_aten);
  }


function mostrarListaPredo(data) {
  aux=1; 
  DWRUtil.addRows("camposPredonacion",data,[fecha_prueba_1,nombre_tp_1,resultado_1],{
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
/// FIN DE PREDONACION////////


//// INICIO DE SEROLOGIA //////
function ListarSere(cod_do,id_aten)
 {
 DWRUtil.removeAllRows("camposSerelogia");
 $("resultado-Tamizaje-Medico").style.display='none';
 $("resultado-Predonacion").style.display='none';
 $("resultado-Serelogia").style.display='';
 $("resultado-Hematologia").style.display='none';
BusquedaDAO.mostrarResultadosSere(mostrarListaSere,cod_do,id_aten);
  }


function mostrarListaSere(data) {
  aux=1; 
  DWRUtil.addRows("camposSerelogia",data,[fecha_prueba_2,nombre_tp_2,resultado_2],{
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
/// FIN DE SERELOGIA////////


//// INICIO DE HEMATOLOGIA //////
function ListarHema(cod_do,id_aten)
 {
 DWRUtil.removeAllRows("camposHematologia");
 $("resultado-Tamizaje-Medico").style.display='none';
 $("resultado-Predonacion").style.display='none';
 $("resultado-Serelogia").style.display='none';
 $("resultado-Hematologia").style.display='';
BusquedaDAO.mostrarResultadosHema(mostrarListaHema,cod_do,id_aten);
  }


function mostrarListaHema(data) {
  aux=1; 
  DWRUtil.addRows("camposHematologia",data,[fecha_prueba_3,nombre_tp_3,resultado_3],{
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
/// FIN DE HEMATOLOGIA////////
///////////////////*********busqueda por codigo/******///////////
var v1 = '1';
var v2 = '1';
var v3 = '1';

function BusquedaCodigo(){ 
    v1 = validarString1("cod_do", "EmC", "codigo invalido");
    if (v1=='0'){
       var cod_do = DWRUtil.getValue("cod_do");
       BusquedaDAO.contCodigo( mostrarContarCodigo, cod_do );
    }
}

function mostrarContarCodigo(data){
    DWRUtil.setValue("total",data);
    
    DWRUtil.setValue("yo",""); 
    DWRUtil.setValue("yo1",""); 
    DWRUtil.setValue("yo2",""); 
    DWRUtil.setValue("yo3",""); 
    
    if ( data > 0 ){
       DWRUtil.setValue("EmC","");
       var cod_do=DWRUtil.getValue("cod_do"); 
       var apepa=DWRUtil.getValue("apepa");   
       var ci=DWRUtil.getValue("ci"); 
       $("busqueda1").style.display='none';
       $("resultado-todo").style.display='';
	
       ListaMedicaDAO.cuentaTami(evalu,cod_do);
       ListaMedicaDAO.cuentaPr(predonacionT,cod_do);
       ListaMedicaDAO.cuentaIH(inmunohematologiaIH,cod_do);
       ListaMedicaDAO.cuentaIS(inmunoserelogiaIS,cod_do);
//       setTimeout("BusquedaDAO.mostrarBusqueda(mostrarBusqueda,"+cod_do+","+apepa+","+ci+")",500);        
       BusquedaDAO.mostrarBusqueda(mostrarBusqueda,cod_do,apepa,ci);
//       setTimeout("ListaPreDAO.mostrarLista4  (nivel0,"+data.id_prueba+"                  )",p);	       
    }
    else{

       DWRUtil.setValue("EmC","<font color='red'><b>*codigo inexistente</b></font>");
    }     
}
////////////////****************busqueda por ci*****************////////
function BusquedaCi(){  
    v2 = validarNumero ("ci", "EmCi", "CI invalido");
    if (v2=='0'){
       var ci = DWRUtil.getValue("ci"); 
       BusquedaDAO.contCi( mostrarContarCi, ci );
    }
}
function mostrarContarCi(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmCi","");
       var ci = DWRUtil.getValue("ci"); 
       
       busqueda();
    }
    else{
       DWRUtil.setValue("EmCi","<font color='red'><b>*CI inexistente</b></font>");
    }
     
}

///////////////**********************************************************
//////////////////***********BUSQUEDA APELLIDO*********////////
function BusquedaApellido(){  
    v3 =  validarString("apepa", "EmA", "Apellido invalido");
    if (v3=='0'){
       var apepa = DWRUtil.getValue("apepa"); 
       BusquedaDAO.contAp( mostrarContarApellido, apepa );
    }
}

function mostrarContarApellido(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmA","");
       var apepa = DWRUtil.getValue("apepa"); 
      
        DWRUtil.setValue("yo",""); 
        DWRUtil.setValue("yo1",""); 
	DWRUtil.setValue("yo2",""); 
	DWRUtil.setValue("yo3",""); 
       
       BusquedaDAO.Cantidad(mostrarCantidad,apepa);
       BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa);
       $("busqueda1"          ).style.display ='none';
       $("resultado_apellido").style.display ='';
    }
    else{

       DWRUtil.setValue("EmA","<font color='red'><b>*Apellido inexistente</b></font>");
    }
     
}

//*********paginacion********/////
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
     DWRUtil.removeAllRows("campos_de_apellido");
     var apepa = DWRUtil.getValue("apepa"); 
       var  atendido='A';
       var atendidop='A';
       var atendidoe='A';
       var atendidoh='A';
       var atendidos='A';
     BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa,atendido,atendidop,atendidoe,atendidoh,atendidos);
     $("busqueda1").style.display='none';
     $("resultado_apellido").style.display='';
}
/////////******fin de paginacion************////////////
///inicio Borrar////
function Borrar(){
    DWRUtil.setValue("cod_do",""); 
    DWRUtil.setValue("ci",""); 
    DWRUtil.setValue("apepa",""); 
}
///fin Borrar///


function mostrarBusqueda_apellido(data) {
  aux=1; 
  DWRUtil.addRows("campos_de_apellido",data,[cod_do,apepa,apema,nom,ingresar1],

  {rowCreator:function(options){
         var tr = document.createElement("tr");	
         if ((aux%2)==0){tr.style.backgroundColor = "#eeeeff";tr.style.border="1px solid #00008B";}
	            else{tr.style.backgroundColor = "#ffffff";tr.style.border="1px solid #00008B";}
	 aux++;
	 if ( ( aux-1 >= ini )&&( aux-1<=fin ) ) return tr;
      }
     } );
}



var ingresar1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/ingresar.png");
      input.setAttribute("onclick","ListadoCodigo('"+data.cod_do+"');");
      return input;
};
function ListadoCodigo(coddo){  
var apepa="";   
var ci=""; 
       ListaMedicaDAO.cuentaTami(evalu,coddo);
       ListaMedicaDAO.cuentaPr(predonacionT,coddo);
       ListaMedicaDAO.cuentaIH(inmunohematologiaIH,coddo);
       ListaMedicaDAO.cuentaIS(inmunoserelogiaIS,coddo);
$("busqueda1").style.display='none';
$("resultado-todo").style.display='';
$("resultado_apellido").style.display='none';
BusquedaDAO.mostrarBusqueda(mostrarBusqueda,coddo,apepa,ci);
}

//////////////////*************////////////
