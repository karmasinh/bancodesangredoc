
function ListaCod_per()
{
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  
}

// INICIO VALIDACION
var v1 = '1';
var v2 = '1';
var v3 = '1';
var codigo;
var m=new Array(12);

var fecha_a = 	function(data) { return data.fecha_a };
var cod_do = 	function(data) { return data.cod_do };
var id_per = 	function(data) { return data.id_per };
var apepa  = 	function(data) { return data.apepa };
var apema  = 	function(data) { return data.apema };
var nom    = 	function(data) { return data.nom };
var gs_rh  = 	function(data) { return data.gs_rh };

//var id_aten = 	function(data) {DWRUtil.setValue("id_aten",data.id_aten);return data.id_aten };
var edad     = 	function(data) { return data.edad };
var resultado=	function(data) { return data.resultado };
var ci = 	function(data) { return data.ci };
var tipo_componente = 	function(data) { return data.tipo_componente };
var id_prueba = 	function(data) { return data.id_prueba };

var fecha_extra =function(data) { return data.fecha_extra };
var id_ext = 	function(data) {return data.id_ext };
var hora = 	function(data) { return data.hora };
var bolsa = 	function(data) { return data.bolsa };
var tubuladora = 	function(data) { return data.tubuladora };
var cant_extra = 	function(data) { return data.cant_extra };

/////////**************************


var fecha1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fecha_extra");
      input.setAttribute("type", "String");      
      input.setAttribute("value",data.fecha_extra);
      return input;
    };

var hora1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "hora");
      input.setAttribute("type", "String");      
      input.setAttribute("value",data.hora);
      return input;
    };


var bolsa1= function(data) {
if(data.bolsa=='Simples'){var input="<select id=bolsa onChange='cantidadExtraida();'><option  value="+data.bolsa+">"+data.bolsa+"<option  value='Dobles'>Dobles<option  value='Triples'>Triples<option  value='Cuadruples'>Cuadruples <option  value='Quintuples'>Quintuples</select>";}
else if(data.bolsa=='Dobles'){var input="<select id=bolsa onChange='cantidadExtraida();'><option  value="+data.bolsa+">"+data.bolsa+"<option  value='Simples'>Simples<option  value='Triples'>Triples<option  value='Cuadruples'>Cuadruples <option  value='Quintuples'>Quintuples</select>";}
else if(data.bolsa=='Triples'){var input="<select id=bolsa onChange='cantidadExtraida();'><option  value="+data.bolsa+">"+data.bolsa+"<option  value='Simples'>Simples<option  value='Dobles'>Dobles<option  value='Cuadruples'>Cuadruples <option  value='Quintuples'>Quintuples</select>";}
else if(data.bolsa=='Cuadruples'){var input="<select id=bolsa onChange='cantidadExtraida();><option  value="+data.bolsa+">"+data.bolsa+"<option  value='Simples'>Simples<option  value='Dobles'>Dobles<option  value='Triples'>Triples<option  value='Quintuples'>Quintuples</select>";}
else if(data.bolsa=='Quintuples'){var input="<select id=bolsa onChange='cantidadExtraida();'><option  value="+data.bolsa+">"+data.bolsa+"<option  value='Simples'>Simples<option  value='Dobles'>Dobles<option  value='Triples'>Triples<option  value='Cuadruples'>Cuadruples</select>";}
return input;
};
var tubuladora1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tubuladora");
      input.setAttribute("type", "String");      
      input.setAttribute("value",data.tubuladora);
      return input;
    };

var cant_extra1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cant_extra");
      input.setAttribute("type", "String");      
      input.setAttribute("value",data.cant_extra);
      return input;
    };

////////////****************************
var pp = function(data) {
    DWRUtil.setValue("cod_do",data.cod_do); 
    DWRUtil.setValue("nom",data.nom); 
    DWRUtil.setValue("apepa",data.apepa); 
    DWRUtil.setValue("apema",data.apema); 
};

function mostrarBusqueda(data){
  aux=1;                        
  DWRUtil.addRows("campostodos_1",data,[cod_do,apepa,apema,nom,gs_rh,pp],{
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


function Modificar(){
var cod_do = DWRUtil.getValue("cod_do");
var nom = DWRUtil.getValue("nom");
var apepa = DWRUtil.getValue("apepa");
var apema = DWRUtil.getValue("apema");
DWRUtil.setValue("codigo_donante",cod_do);
DWRUtil.setValue("nombre",nom);
DWRUtil.setValue("paterno",apepa);
DWRUtil.setValue("materno",apema);
fechas();
horas();
//////////////////////////////////////////////
ListaExtraDAO.mostrarListaMOD1(nivel2,cod_do);
ListaExtraDAO.mostrarListaMOD(nivel1,cod_do);
 $("busqueda"          ).style.display ='none';
 $("resultado_todo"    ).style.display ='none';
 $("resultado_apellido").style.display ='none';
 $("modi").style.display ='';
 
}

//////////////////////////**********************************/////////////////
function mostrarContarCodigo(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmC","");
       var cod_do = DWRUtil.getValue("cod_do"); 
       BusquedaDAO.mostrarBusqueda_DonantesCodigo (mostrarBusqueda,cod_do);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
      // $("resultado_donacion").style.display ='none';
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

function ListadoCodigo(cod_do,nom,apepa,apema){  
codigo=cod_do;
fechas();
horas();
DWRUtil.setValue("codigo_donante",cod_do);
DWRUtil.setValue("nombre",nom);
DWRUtil.setValue("paterno",apepa);
DWRUtil.setValue("materno",apema);
ListaExtraDAO.mostrarListaMOD(nivel1,cod_do);
ListaExtraDAO.mostrarListaMOD1(nivel2,cod_do);
 $("busqueda"          ).style.display ='none';
 $("modi").style.display ='';
 $("resultado_apellido").style.display ='none';
}
var ingresar1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ListadoCodigo('"+data.cod_do+"','"+data.nom+"','"+data.apepa+"','"+data.apema+"');");
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
////////////////****************************/////////////////
var d=new Array(100);
var a=0;
var c=0;
var a1=0;
var gel=new Array(20);
j=1;
var Pr= function(data) {
gel[j]=data.id_prueba;
j++;
     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id",""+data.id_prueba+"");
      input.setAttribute("value",data.resultado);
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 18);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);     
      DWRUtil.setValue("id_aten",data.id_aten);     
      DWRUtil.setValue("cod_do",data.cod_do);     
    
     } 

     if(data.tipo_componente=='3'){
	    if (data.resultado=='false'){
      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      input.setAttribute("onblur","ddd('"+data.id_prueba+"');");
	    }
	    else{
		var input =" <input type='checkbox' id='"+data.id_prueba+"'onblur='ddd('"+data.id_prueba+"');'  checked>";	    
	    } 
     }
         
      if(data.tipo_componente=='2'){
	var input="<select id='"+data.id_prueba+"'> <option  selected='selected'>"+data.resultado+"</option> </select>";
	d[a]=data.id_prueba;
	a++;
	a1=a1+500;
setTimeout("ListaPreDAO.mostrarLista4(nivel0,"+data.id_prueba+")",a1);	

      }    
      
 return input;                             
};

var creare= function(data) {
//DWRUtil.setValue("mili","<input type='submit' value='Modificar' onclick='InsertarC();'>");

};
function ddd(dato){

}
function nivel0(data)
{
DWRUtil.addOptions(''+d[c]+'',data,'valores','valores');
c++;
}
function nivel1(data) {
DWRUtil.setValue("id_ext",data);
}

var fecha= function(data){
    var va = data.fecha_a;
    var anyo  = va.split("-")[0];
    var mes   = va.split("-")[1];
    var dia   = va.split("-")[2];
    var fechas=dia+'-'+mes+'-'+anyo;
    DWRUtil.setValue("fecha_extra",fechas);
} 


function nivel2(data) {
 aux=1; 
  DWRUtil.addRows("camposp2",data,[bolsa1,tubuladora1,cant_extra1,fecha],{
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


  
  function mostrarListaDonantes4(data) {
  aux=1; 
  DWRUtil.addRows("camposp",data,[creare],{
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


///////////////////********************************////////////////////



//////////////////////////***************MODIFICAR RESULTADO************/////////
function InsertarC(){
var valor = DWRUtil.getValue("fecha_extra" );
var dia  = valor.split("-")[0];
var mes  = valor.split("-")[1];
var anyo = valor.split("-")[2];
var fecha_extra=anyo+'-'+mes+'-'+dia;
var id_ext=DWRUtil.getValue("id_ext");
var cod_do=DWRUtil.getValue("cod_do");
var hora=DWRUtil.getValue("hora_prueba");
var bolsa=DWRUtil.getValue("bolsa");
var cant_extra=DWRUtil.getValue("cant_extra");
var tubuladora=DWRUtil.getValue("tubuladora");

var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");
ListaExtraDAO.modificarExtra(Resultado,id_ext,cod_do,fecha_extra,hora,bolsa,tubuladora,cant_extra,cod_per,id_horario);
}


function Resultado(data)
{
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='none';
       $("resultado_apellido").style.display ='none';
       $("modi").style.display ='none';
       $("adios").style.display ='';
}


//////////////////////////***********************************//////////
function mostrarContarApellido(data){
var atendido='A';
var atendidop='A';
var atendidoe='A';
var atendidoh='T';
var atendidos='T';
//	    alert(apepa+atendido+atendidop+atendidoe+atendidoh+atendidos);
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmA","");
       var apepa = DWRUtil.getValue("apepa1"); 
//	    alert(apepa+atendido+atendidop+atendidoe+atendidoh+atendidos);
       BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa,atendido,atendidop,atendidoe,atendidoh,atendidos);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='none';
       $("resultado_apellido").style.display ='';
    }
    else{
       DWRUtil.setValue("EmA","Apellido inexistente");
    }
     
}
function BusquedaApellido(){  

    v3 =  validarString("apepa1", "EmA", "Apellido invalido");
    if (v3=='0'){
       var apepa = DWRUtil.getValue("apepa1"); 
       BusquedaDAO.contAp( mostrarContarApellido, apepa );
    }
}
/////////////***********fecha y hora***************////////
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
DWRUtil.setValue("fecha_a",a);
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
document.getElementById("hora_prueba").innerHTML =horas;
setTimeout("horas()",1000);
}
function cantidadExtraida(){
var c=DWRUtil.getValue("bolsa");
 if (c=="Simples")
 { DWRUtil.setValue("cant_extra","430+70"); }
 else  if (c=="Dobles")
 { DWRUtil.setValue("cant_extra","430+100"); }
  else  if (c=="Triples")
 { DWRUtil.setValue("cant_extra","430+150"); }
   else  if (c=="Cuadruples")
 { DWRUtil.setValue("cant_extra","430+300"); }
    else  if (c=="Quintuples")
 { DWRUtil.setValue("cant_extra","430+350"); }
}

function ejecutar(){
 DWRUtil.removeAllRows("campostodos_1");
 DWRUtil.removeAllRows("camposp2"); 
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  
 $("busqueda"          ).style.display ='';
 $("modi"    ).style.display ='none';
DWRUtil.setValue("cod_do","");  
DWRUtil.setValue("ci","");  
DWRUtil.setValue("apepa1","");  
}
