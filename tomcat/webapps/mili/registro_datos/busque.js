////////////inicion de borraaar/////////
function Borrar(){
    DWRUtil.setValue("cod_do",""); 
    DWRUtil.setValue("ci",""); 
    DWRUtil.setValue("apepa",""); 
}
////////////fin de borrar//////



// INICIO VALIDACION
var v1 = '1';
var v2 = '1';
var v3 = '1';

//var fecha_a  = 	function(data) {DWRUtil.setValue("fecha_a",data.fecha_a);return data.fecha_a };

var cod_do = 	function(data) { DWRUtil.setValue("cod_do", data.cod_do); return data.cod_do   };
var id_per = 	function(data) { return data.id_per };
var apepa  = 	function(data) { return data.apepa };
var apema  = 	function(data) { return data.apema };
var nom    = 	function(data) { return data.nom };
var gs_rh  = 	function(data) { return data.gs_rh };

var id_aten  = 	function(data) { return data.id_aten };
var fecha_a  = function(data) { return data.fecha_a };
var edad     = 	function(data) { return data.edad };
var resultado=	function(data) { return data.resultado };
var ci = 	function(data) { return data.ci };
function mostrarBusqueda(data){
  aux=1; 
                       
   DWRUtil.addRows("campostodos",data,[cod_do,apepa,apema,nom,gs_rh],{

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

function mostrarResultados(data) {
  aux=1;                        
  DWRUtil.addRows("camposResultados",data,[ id_aten,fecha_a,edad,resultado],{
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
function mostrarContarCodigo(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmC","");
       var cod_do = DWRUtil.getValue("cod_do"); 
       BusquedaDAO.mostrarBusqueda_DonantesCodigo (mostrarBusqueda  ,cod_do);
//       BusquedaDAO.mostrarBusqueda_ResultadosCodigo(mostrarResultados,cod_do);
      
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
      // alert('hola');
        BusquedaDAO.resultado_4(mostrarResultados,cod_do);
    }
    else{

       DWRUtil.setValue("EmC","<font color='red'><b>*codigo inexistente</b></font>");
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
      // BusquedaDAO.mostrarBusqueda_ResultadosCi(mostrarResultados,ci);

       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
       BusquedaDAO.resultado_3(mostrarResultados,ci);
    }
    else{
       DWRUtil.setValue("EmCi","<font color='red'><b>*CI inexistente</b></font>");
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
       BusquedaDAO.mostrarBusqueda_DonantesCodigo (mostrarBusqueda  ,cod_do);
//       BusquedaDAO.mostrarBusqueda_ResultadosCodigo(mostrarResultados,cod_do);

       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
       BusquedaDAO.resultado_4(mostrarResultados,cod_do);
}
var ingresar1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/ingresar.png");
      input.setAttribute("onclick","ListadoCodigo('"+data.cod_do+"');");
      return input;
};

//<font color='#00008B' size='3' align='top'>  Aceptar</font></input>
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

function mostrarContarApellido(data){
    DWRUtil.removeAllRows("campos_de_apellido");
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmA","");
       var apepa = DWRUtil.getValue("apepa"); 
       BusquedaDAO.Cantidad(mostrarCantidad,apepa);
       var  atendido='A';
       var atendidop='A';
       var atendidoe='A';
       var atendidoh='A';
       var atendidos='A';
       BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa,atendido,atendidop,atendidoe,atendidoh,atendidos);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='none';
       $("resultado_apellido").style.display ='';
       $("resultado_donacion").style.display ='none';
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




//*********************************************************************
var tipo_dom1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_domt");
      input.setAttribute("value",data.tipo_dom );
      input.setAttribute("size","9" );
      input.setAttribute("readonly",true );
      return input;
    };


var tipo_dom2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_dom");
      input.setAttribute("value",data.tipo_dom );
      input.setAttribute("size","9" );
     // readonly='true'
      input.setAttribute("readonly",true );
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
      input.setAttribute("maxlength","5" );
      return input;
    };

var cel1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cel");
      input.setAttribute("value",data.cel );
      input.setAttribute("maxlength","8" );
      input.setAttribute("size","9" );
      return input;
    };

var fono_vec1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_vec");
      input.setAttribute("maxlength","5" );
      input.setAttribute("value",data.fono_vec );
      input.setAttribute("size","9" );
      return input;
    };

var fono_tra1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_tra");
      input.setAttribute("value",data.fono_tra );
      input.setAttribute("maxlength","5" );
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
      input.setAttribute("size","5" );
      input.setAttribute("maxlength","6" );
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
      input.setAttribute("size","5" );
      input.setAttribute("maxlength","6" );
      
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
function mostrarDonante_1(data) {
  aux=1;                        
  DWRUtil.addRows("campos_1",data,[ id_per1, cod_do, nom, apepa, apema, gs_rh,ci, prof1, ocu1],{
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


function mostrarDonante_2(data) {
  aux=1;                        
  DWRUtil.addRows("campos_2",data,[ lugar_tra1, email1, fono_pro1, cel1,fono_vec1, fono_tra1],{
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
function mostrarDonante_3(data) {
  aux=1;                        
//  DWRUtil.addRows("campos_Donantes_2",data,[calle_residencia2,num2,zona2,tipo_domt],{
  DWRUtil.addRows("campos_3",data,[tipo_dom2,calle_residencia1, num1,zona1],{
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
function mostrarDonante_4(data) {
  aux=1;                        
  DWRUtil.addRows("campos_4",data,[tipo_dom1,calle_residencia2, num2, zona2 ],{
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

function agregar_donante(){   
    var cod_do = DWRUtil.getValue("cod_do"); 
    BusquedaDAO.agregar_donante_1(mostrarDonante_1,cod_do);
    BusquedaDAO.agregar_donante_2(mostrarDonante_2,cod_do);
    BusquedaDAO.agregar_donante_3(mostrarDonante_3,cod_do);
    BusquedaDAO.agregar_donante_4(mostrarDonante_4,cod_do);
    $("busqueda"          ).style.display ='none';
    $("resultado_todo"    ).style.display ='none';
    $("resultado_apellido").style.display ='none';
    $("resultado_donacion").style.display ='';
    $("mensaje"         ).style.display ='none';
    $("avisoEF"           ).style.display ='none';
    
}    
//*********************************************************************
/////////****************inicio modificar******************************
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
}

function insertarDatos()
{
    $("busqueda"          ).style.display ='none';
    $("resultado_todo"    ).style.display ='none';
    $("resultado_apellido").style.display ='none';
    $("resultado_donacion").style.display ='none';
    $("mensaje"           ).style.display ='';
    $("examenFisico"      ).style.display ='none';
    $("avisoEF"           ).style.display ='none';
}

/////////****************fin modificar******************************

/////////*****EXAMEN  FISICO****************************************
function visualizar(){
    $("busqueda"          ).style.display ='none';
    $("resultado_todo"    ).style.display ='none';
    $("resultado_apellido").style.display ='none';
    $("resultado_donacion").style.display ='none';
    $("mensaje"           ).style.display ='none';
    $("examenFisico"      ).style.display ='';
    $("avisoEF"           ).style.display ='none';
    horas();
    fechas();
    conteo();
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
setTimeout("horas()",1000);
}
//***********INICIO NUMERO DE ATENCION*************
function conteo()
{
    BusquedaDAO.countRegistro_datos(conteoDatos);
}
function conteoDatos(data) {
//alert(data);
    var ID_PER ={id_per1:data,id_aten:data};
    DWRUtil.setValue("id_aten",data);  
    document.getElementById("id_aten1").innerHTML = data;
}
//***********FIN NUMERO DE ATENCION***************


//***********iNicio VALIDACION***************

var v81 = '1';
var v82 = '1';
var v83 = '1';
var v84 = '1';
var v85 = '1';
var v86 = '1';
var v87 = '1';
var v88 = '1';
var v89 = '1';
function vali(){
     if ( (v81=='0')&&(v82=='0')&&(v83=='0')&&(v84=='0')&&(v85=='0')&&(v86=='0')&&(v87=='0')&&(v88=='0')){
    //  DWRUtil.setValue("agregar12","<input type='submit' value='Agregar' onclick='insertarEF();'>");
      DWRUtil.setValue("agregar12"," <input type='image' src='../imagenes/aceptar.png' onclick='insertarEF();'>"); 
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
function validarCombos111(){ v87 =validarCombo ("tipo_do",	  "EmCom",       "*");vali();}
function validarCombos112(){ v88 = validarCombo("veces",		  "EmComb",      "*");vali();}

function validarFechae()   {v89 = validarFecha("fecha_a",  	  "EmFechae",    "*");vali();}
function validarFechae2(){
     if ( DWRUtil.getValue( "fecha_a")!=""  ) v89 = validarFecha ("fecha_a",  "EmFechae",   "*");
     vali();
}

//***********FiN VALIDACION***************

//***********iNicio VALIDACION EXAMEN FISICO***************

function insertarEF()
{
    var valor = DWRUtil.getValue("fecha_a" );
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_a=anyo+'-'+mes+'-'+dia;
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

//    var cod_per=DWRUtil.getValue("cod_per");
//    var id_horario=DWRUtil.getValue("id_horario");
    var cod_per=parent.izquierdaAnalisis2.document.getElementById("cod_per").value;
    var id_horario=parent.izquierdaAnalisis2.document.getElementById("id_horario").value;
alert(cod_per);
alert(id_horario);
    NuevoDAO.adicionarEF(insertarDatosEF,fecha_a,hora_a,id_aten,tipo_do,veces,cod_do,sistolica,diastolica,pulso,peso,talla,temperatura,atendido,atendidop,atendidoh,atendidos,atendidoe,cod_per,id_horario);
}


function insertarDatosEF()
{
    $("busqueda"          ).style.display ='none';
    $("resultado_todo"    ).style.display ='none';
    $("resultado_apellido").style.display ='none';
    $("resultado_donacion").style.display ='none';
    $("mensaje"           ).style.display ='none';
    $("examenFisico"      ).style.display ='none';
    $("avisoEF"           ).style.display ='';
}
//***********FIN VALIDACION EXAMEN FISICO***************

function fechas()
{
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
var a=dia+"-"+m[today.getMonth()]+"-"+anno;
//document.getElementById("fecha").innerHTML = a;
DWRUtil.setValue("fecha_a",a);
}  
