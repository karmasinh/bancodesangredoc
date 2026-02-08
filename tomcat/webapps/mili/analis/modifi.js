function ListaCod_per()
{
//alert('hola');
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  
}


// INICIO VALIDACION
var v1 = '1';
var v2 = '1';
var v3 = '1';
var codigo;
var m=new Array(12);

var cod_do = 	function(data) { return data.cod_do };
var id_per = 	function(data) { return data.id_per };
var apepa  = 	function(data) { return data.apepa };
var apema  = 	function(data) { return data.apema };
var nom    = 	function(data) { return data.nom };
var gs_rh  = 	function(data) { return data.gs_rh };

var id_aten  = 	function(data) { return data.id_aten };
var fecha_a  = 	function(data) {DWRUtil.setValue("fecha_a",data.fecha_a);return data.fecha_a };
var edad     = 	function(data) { return data.edad };
var resultado=	function(data) { return data.resultado };
var ci = 	function(data) { return data.ci };
var tipo_componente = 	function(data) { return data.tipo_componente };
var id_prueba = 	function(data) { return data.id_prueba };


var pp = function(data) {
    DWRUtil.setValue("cod_do",data.cod_do); 
    DWRUtil.setValue("apepa8",data.apepa); 
    DWRUtil.setValue("apema8",data.apema); 
    DWRUtil.setValue("nom8",data.nom); 
};

function mostrarBusqueda(data){
  aux=1;                        
  DWRUtil.addRows("campostodos",data,[cod_do,apepa,apema,nom,gs_rh,pp],{
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
/*
function mostrarBusqueda_R(data){
  aux=1;                        	   
  DWRUtil.addRows("camposResultados",data,[id_aten,fecha_a,edad,resultado],{
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

*/
////////////////**********LLAMADA DE BUSQUEDA POR CI COD_DO************/////////////////////
function mostrarpruebas(data)
{
DWRUtil.setValue("bb",data);
};


function Modificar(){
ListaSereDAO.contd(mostrarpruebas);
var cod_do = DWRUtil.getValue("cod_do"); 
//ListaPreDAO.mostrarResultado_prueba(nivel1,cod_do);
var fecha_a = DWRUtil.getValue("fecha_a"); 
ListaSereDAO.mostrarResultado_prueba(nivel1,cod_do);

	 $("busqueda"          ).style.display ='none';
         $("resultado_todo"    ).style.display ='none';
         $("resultado_apellido").style.display ='none';
	 $("modi").style.display ='';
         $("resultado_donacion").style.display ='none';

fechas();
horas();
 var nom = DWRUtil.getValue("nom8"); 
 var apepa = DWRUtil.getValue("apepa8"); 
 var apema = DWRUtil.getValue("apema8"); 
 DWRUtil.setValue("nom",nom); 
 DWRUtil.setValue("apepa",apepa);
 DWRUtil.setValue("apema",apema);
 DWRUtil.setValue("codigo_donante",cod_do);     
}

//////////////////////////**********************************/////////////////
function mostrarContarCodigo(data){
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmC","");
       var cod_do = DWRUtil.getValue("cod_do"); 
//
       BusquedaDAO.mostrarBusqueda_DonantesCodigo (mostrarBusqueda,cod_do);
//       BusquedaDAO.resultado_2(mostrarBusqueda_R,cod_do);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
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
      // BusquedaDAO.resultado (mostrarBusqueda_R  ,ci);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
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
alert(cod_do);
codigo=cod_do;
    DWRUtil.setValue("codigo_donante",cod_do); 
    DWRUtil.setValue("nom",nom); 
    DWRUtil.setValue("apepa",apepa); 
    DWRUtil.setValue("apema",apema); 
ListaSereDAO.mostrarResultado_prueba(nivel1,cod_do);
       $("busqueda"          ).style.display ='none';
       $("modi").style.display ='';
       $("resultado_apellido").style.display ='none';
       $("resultado_donacion").style.display ='none';
fechas();
horas();
}


var ingresarC = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      
      input.setAttribute("onclick","ListadoCodigo('"+data.cod_do+"','"+data.nom+"','"+data.apepa+"','"+data.apema+"');");
      return input;
};
function mostrarBusqueda_apellido(data) {
  aux=1; 
  DWRUtil.addRows("campos_de_apellido",data,[cod_do,apepa,apema,nom,ingresarC],{
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
      ListaSereDAO.contd(mostrarpruebas);
    
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
setTimeout("ListaSereDAO.mostrarLista4(nivel0,"+data.id_prueba+")",a1);	
//      var input = document.createElement("select");
//      input.setAttribute("value", ""+data.resultado+"");
//      input.setAttribute("id", data.id_prueba);      

      }    
      
//ListaPreDAO.mostrarResultado_prueba(mostrarListaDonantes4,codigo);

//c=0;
//ListaPreDAO.mostrarLista3(mostrarListaDonantes4);

 return input;                             
};

var creare= function(data) {
DWRUtil.setValue("mili","<input type='submit' value='Modificar' onclick='InsertarC();'>");

//if(data.tipo_componente=='2'){

//ListaPreDAO.mostrarLista4(nivel0,data.id_prueba);
//DWRUtil.addOptions(""+data.id_prueba+"",data,'valores','valores');
//ListaPreDAO.mostrarLista4(nivel0,data.id_prueba);
//}
};
function ddd(dato){

//alert(DWRUtil.getValue(dato));
}
function nivel0(data)
{
//alert(data.id_prueba+"VALORES"+data.valores);
//a--;
DWRUtil.addOptions(''+d[c]+'',data,'valores','valores');
c++;
//a=a;
//a=a-1;
//DWRUtil.addOptions(''+mes[a]+'',data,'valores','valor');

}
function nivel1(data) {
 aux=1; 
//  DWRUtil.addRows("camposp",data,[resultado,id_prueba,tipo_componente,id_aten,cod_do,Pr],{
  DWRUtil.addRows("camposp",data,[id_aten,id_prueba,cod_do,Pr],{
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
    var va = DWRUtil.getValue("fecha_prueba" );
    var dia  = va.split("-")[0];
    var mes  = va.split("-")[1];
    var anyo = va.split("-")[2];
    var fecha_prueba=anyo+'-'+mes+'-'+dia;
var hora_prueba=DWRUtil.getValue("hora_prueba");
var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");

var i;
var a1=0;
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var bba=DWRUtil.getValue("bb");

var v = (parseInt(bba));
for (i=1;i<=v;i++){
var valores=DWRUtil.getValue(""+gel[i]+"");
	if(i==v){
	    if(gel[i]!=24){ ListaSereDAO.ModificarC(Resultado,gel[i],valores,id_aten,cod_do,hora_prueba,fecha_prueba,cod_per,id_horario); }
	    if(a1>0){
	    valores="Donante no Apto";
	    DWRUtil.setValue("24",valores);     
	    ListaSereDAO.ModificarC(Resultado,"24",valores,id_aten,cod_do,hora_prueba,fecha_prueba,cod_per,id_horario); }
	    else{
	    valores="Donante Apto";
	    DWRUtil.setValue("24",valores);     
	    ListaSereDAO.ModificarC(Resultado,"24",valores,id_aten,cod_do,hora_prueba,fecha_prueba,cod_per,id_horario); }
	}
	else{
	if(valores=='on'){ a1++;}
	if(gel[i]!=24){ ListaSereDAO.ModificarC(Resultado,gel[i],valores,id_aten,cod_do,hora_prueba,fecha_prueba,cod_per,id_horario); }
	}


}
$(busqueda).style.display='none';
$(resultado_apellido).style.display='none';
$(modi).style.display='none';
$(resultado_todo).style.display='none';
$(resultado_donacion).style.display='none';
$(mensaje).style.display='none';
$(examenFisico).style.display='none';
$(adios).style.display='';

}

function Resultado(data)
{
//$(resultado_apellido).style.display='none';
//$(lista1).style.display='';
}


//////////////////////////***********************************//////////
function mostrarContarApellido(data){
var atendido='A';
var atendidop='A';
var atendidoe='A';
var atendidoh='A';
var atendidos='A';
    DWRUtil.setValue("total",data);
    if ( data > 0 ){
       DWRUtil.setValue("EmA","");
       var apepa = DWRUtil.getValue("apepa1"); 
         BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa,atendido,atendidop,atendidoe,atendidoh,atendidos);
//       BusquedaDAO.mostrarBusqueda_apellidos (mostrarBusqueda_apellido  ,apepa);
       $("busqueda"          ).style.display ='none';
       $("resultado_todo"    ).style.display ='none';
       $("resultado_apellido").style.display ='';
       $("resultado_donacion").style.display ='none';
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
/////////**************FECHAS HORAS***********////////////////////
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
DWRUtil.setValue("fecha_prueba",a);
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
