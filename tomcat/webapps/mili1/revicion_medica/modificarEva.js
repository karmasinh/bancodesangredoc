// INICIO VALIDACION
var v1 = '1';
var v2 = '1';
var v3 = '1';
var codigo;
var m=new Array(12);


var obs= 	function(data) { return data.obs };
var ayunas= 	function(data) { return data.ayunas };
var numeral= 	function(data) { return data.numeral };
var ingestion= 	function(data) { return data.ingestion };
var rechazo= 	function(data) { return data.rechazo };
var resultado= 	function(data) { return data.resultado };

var temperatura=function(data) { return data.temperatura };
var talla= 	function(data) { return data.talla };
var peso = 	function(data) { return data.peso };
var cod_do = 	function(data) { return data.cod_do };
var sistolica =	function(data) { return data.sistolica };
var pulso      =function(data) { return data.pulso };
var diastolica =function(data) { return data.diastolica };
var id_per = 	function(data) { return data.id_per };
var apepa  = 	function(data) { return data.apepa };
var apema  = 	function(data) { return data.apema };
var nom    = 	function(data) { return data.nom };
var gs_rh  = 	function(data) { return data.gs_rh };

var id_aten  = 	function(data) {DWRUtil.setValue("id_aten",data.id_aten);return data.id_aten };
var fecha_a  = 	function(data) {DWRUtil.setValue("fecha_a",data.fecha_a);return data.fecha_a };
var edad     = 	function(data) { return data.edad };
var hora_a   = 	function(data) { return data.hora_a };
var resultado=	function(data) { return data.resultado };
var ci = 	function(data) { return data.ci };
var tipo_componente = 	function(data) { return data.tipo_componente };
var id_prueba = 	function(data) { return data.id_prueba };


var pp = function(data) {
    DWRUtil.setValue("cod_do",data.cod_do); 
};

function mostrarBusqueda(data){
  aux=1;                        
  DWRUtil.addRows("campostodos",data,[id_aten,cod_do,apepa,apema,nom,edad,pp],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	if ((aux%2)==0){
        	tr.style.backgroundColor = "#eeeeff";
	        tr.style.border="1px solid #00008B";
	}
	else{
	        tr.style.backgroundColor = "#ffffff";
	        tr.style.border="1px solid #00008B";
	}
	aux=1+aux;
        return tr;
    }
  });
}
////////////////**********LLAMADA DE BUSQUEDA POR CI COD_DO************/////////////////////
function mostrarpruebas(data)
{
DWRUtil.setValue("bb",data);
};



//////////////////////////**********************************/////////////////
function mostrarContarCodigo(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmC","");
       var cod_do = DWRUtil.getValue("cod_do"); 
       BusquedaDAO.mostrarBusquedaEvaluacionCod(mostrarBusqueda,cod_do);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
    }
    else{
       DWRUtil.setValue("EmC","codigo inexistente");
    }
     
}

function BusquedaCodigo(){  
    v1 = validarString1("cod_do", "EmC", "codigo invalido");
    if (v1=='0'){
       var cod_do = DWRUtil.getValue("cod_do"); 
       BusquedaDAO.contCodigo( mostrarContarCodigo, cod_do );
    }
}
function mostrarContarCi(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmCi","");
       var ci = DWRUtil.getValue("ci"); 
       BusquedaDAO.mostrarBusqueda_DonantesCi  (mostrarBusqueda  ,ci);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
      // $("resultado_donacion").style.display ='none';
    }
    else{
       DWRUtil.setValue("EmCi","CI inexistente");
    }
     
}

function BusquedaCi(){  
    v2 = validarNumero ("ci", "EmCi", "CI invalido");
    if (v2=='0'){
       var ci = DWRUtil.getValue("ci"); 
       BusquedaDAO.contCi( mostrarContarCi, ci );
    }
}

function ListadoCodigo(cod_do){  
codigo=cod_do;
ListaPreDAO.mostrarResultado_prueba(nivel1,cod_do);
       $("busqueda"          ).style.display ='none';
	$("modi").style.display ='';
       $("resultado_apellido").style.display ='none';
      // $("resultado_donacion").style.display ='none';
}
var ingresar1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Ingresar");
      input.setAttribute("onclick","ListadoCodigo('"+data.cod_do+"');");

      return input;
};
function mostrarBusqueda_apellido(data) {
  aux=1; 
  DWRUtil.addRows("campos_de_apellido",data,[cod_do,apepa,apema,nom,ingresar1],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	if ((aux%2)==0){
        	tr.style.backgroundColor = "#eeeeff";
	        tr.style.border="1px solid #00008B";
	}
	else{
	        tr.style.backgroundColor = "#ffffff";
	        tr.style.border="1px solid #00008B";
	}
	aux=1+aux;
        return tr;
    }
  });
}
//////////////////////////***********************************//////////
function mostrarContarApellido(data){
    DWRUtil.removeAllRows("campos_de_apellido");
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmA","");
       var apepa = DWRUtil.getValue("apepa"); 
       BusquedaDAO.Cantidad(mostrarCantidad,apepa);
       BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='none';
       $("resultado_apellido").style.display ='';
    }
    else{

       DWRUtil.setValue("EmA","<font color='red'><b>*Apellido inexistente</b></font>");
    }
     
}
function BusquedaApellido(){  
    v3 =  validarString("apepa", "EmA", "Apellido invalido");
    if (v3=='0'){
       var apepa = DWRUtil.getValue("apepa"); 
       BusquedaDAO.contAp( mostrarContarApellido, apepa );
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
     BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa);
     $("busqueda").style.display='none';
     $("resultado_apellido").style.display='';
}
/////////******fin de paginacion************////////////
/////////////***************modificar************/////////
function Modificar(id_aten)
 {
 var id_aten = DWRUtil.getValue("id_aten"); 
 ListaMedicaDAO.mostrarResultado(mostrarCantidad,id_aten);
 ListaMedicaDAO.mostrarListaEva(mostrarExamenFisico,id_aten);
 ListaMedicaDAO.mostrarEvaluacion(mostrarEvaluacion,id_aten);
 $("busqueda").style.display='none';
 $("resultado_todo").style.display='none';
 $("evaluacion").style.display='';
 $("resultadoeva").style.display='';
 }

function mostrarCantidad(data){
     DWRUtil.setValue("tal",data);
 }
function mostrarExamenFisico(data) {
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

/////////****************variables o cajas para modificar************////////	
var obs1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "obs");
      input.setAttribute("value",data.obs );
      return input;
    };


var ayunas1= function(data) {
if(data.ayunas=='No'){var input="<select id=ayunas><option  value='No'>No<option  value='Si'>Si</select>";}
else
{var input="<select id=ayunas><option  value='Si'>"+data.ayunas+"</option><option  value='No'>No</option></select>";}
 return input;
};

var numeral1=function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "numeral");
      input.setAttribute("value",data.numeral );
      return input;
    };


var ingestion1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "ingestion");
      input.setAttribute("value",data.ingestion );
      return input;
    };


var rechazo1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "rechazo");
      input.setAttribute("value",data.rechazo );
      return input;
    };

var resultado1= function(data) {
if(data.resultado=='Donante Apto'){var input="<select id=resultado onchange='cambiar();'><option  value='Donante Apto'>"+data.resultado+"</option><option  value='Donante No Apto'>Donante No Apto</option></select>";}
else
{var input="<select id=resultado onchange='cambiar1();'><option  value='Donante No Apto'>"+data.resultado+"</option><option  value='Donante Apto'>Donante Apto</option></select>";}
return input;
};

function cambiar()
{
var dos="";
var tres="<select id='rechazo'><option value='Permanente'>Permanente</option> <option value='Temporalmente'>Temporal</option> </select>";       
var cuatro="<INPUT id='numeral'>";
var combo=DWRUtil.getValue("resultado");
 if (combo=="Donante Apto")
 {document.getElementById("uno").innerHTML = dos;}
 else if(combo=="Donante No Apto")
 {document.getElementById("uno").innerHTML = tres;
 document.getElementById("dos").innerHTML = cuatro; }
 else
  {document.getElementById("uno").innerHTML = dos;}
}

function cambiar1()
{
var combo=DWRUtil.getValue("resultado");
 if (combo=="Donante Apto")
 {DWRUtil.setValue("rechazo",""); 
  DWRUtil.setValue("numeral","");
 }
}


/////////****************fin variables o cajas para modificar************////////
function mostrarEvaluacion(data) {
  aux=1;
  DWRUtil.addRows("cam",data,[ ayunas1,ingestion1,obs1],{
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
 var po= DWRUtil.getValue("tal"); 
// alert(po);
    
    if (po=="Donante Apto"){

  DWRUtil.addRows("cam1",data,[ resultado1],{
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
    }////////////aqui termina Donante No Apto*************///////
    
  else { 
  DWRUtil.addRows("cam1",data,[rechazo1,numeral1,resultado1],{
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
 
  }
  
  ////////////**************adicionar a ala modficadad***/////////

function modificarAhora()
{
    var ayunas=DWRUtil.getValue("ayunas");
    var ingestion=DWRUtil.getValue("ingestion");
    var obs=DWRUtil.getValue("obs");
    var resultado=DWRUtil.getValue("resultado");
    var rechazo=DWRUtil.getValue("rechazo");
    var numeral=DWRUtil.getValue("numeral");
    var id_aten=DWRUtil.getValue("id_aten");
    ListaMedicaDAO.modificarRevicion(modificados1,ayunas,ingestion,obs,resultado,rechazo,numeral,id_aten);
}

function modificados1()
{
 $("busqueda"          ).style.display ='none';
 $("resultado_todo"    ).style.display ='none';
 $("resultado_apellido").style.display ='none';
 $("evaluacion"    ).style.display ='none';
 $("adios"    ).style.display ='';
 $("resultadoeva"    ).style.display ='none';
}
////////////////*************fin de modigi************////