
var vector=new Array();
vector[0]=0;

var A=new Array();

var B=new Array();

var C=new Array();

var nom = function(data) { return data.nom};
var nombre = function(data) { return data.nombre};
var nombre1 = function(data) { return data.nombre1};
var enlace = function(data) { return data.enlace};
var id_mod = function(data) { return data.id_mod};

var apepa = function(data) { return data.apepa};
var apema = function(data) { return data.apema};
var enlace = function(data) { return data.enlace};

var fecha_a = function(data) { return data.fecha_a};
var id_horario = function(data) { return data.id_horario};
var cod_per = function(data) { return data.cod_per};

var id_rol = function(data) { return data.id_rol};
var id_mod = function(data) { return data.id_mod};
var usuario = function(data) { return data.usuario};
var contraseña = function(data) { return data.contraseña};
var p=0;
var input;


function inicio(){
DWRUtil.removeAllRows("camposMenu");
DWRUtil.removeAllRows("campos");
var c= DWRUtil.getValue("contraseña"); 
var u= DWRUtil.getValue("usuario");
//ListaPreDAO.mostrar_Rol(colocarRol,u,c);
ListaPreDAO.mostrar_Menu(mostrar88,u,c);
//ListaPreDAO.mostrar_Mo(mostrar,u,c);
ListaPreDAO.mostrar_Apellido(mostrar_apellido,u,c);///muestra el nombre y  apellidos
ListaPreDAO.mostrar_Codper(mostrar_apellido,u,c);////saca el codigo del personal
ListaPreDAO.buscarCodigoPer(mostrarCodigo,u,c);////busca el codigo del personal
}

var datos= function(data) {
DWRUtil.setValue("fecha",data.fecha_a);
DWRUtil.setValue("cod_per",data.cod_per);
DWRUtil.setValue("id_horario",data.id_horario);
};


var Pr= function(data) {
p=p+500;
setTimeout("insertarmenu("+data.id_rol+")",p);	
};
/*
var menu= function(data) {
  var input="<A Href='"+data.enlace+"' target='derecha'>"+data.nombre+"</A>";
  return input;                             

};
*/

var u=1;
var ver=1;
var modulo= function(data) {
//var codigo= DWRUtil.getValue("cod_per"); 
var vista=-1;
    var input="<div id='cuatro"+u+"' style='display'><DL  align='left'><DT align='left'> <a href='#' onclick='prueba("+u+","+vista+");'><input type='image' src='imagenes/flecha.png' align='left'>  "+data.nombre+" </a><div id='cinco"+u+"' style='display:none'><DD  align='left'>";
for(i=0;i<A.length;i++){
var cadena=A[i];
var hasta=cadena.split("*");
    if(data.id_mod==hasta[0]){
    
    input=input+"<DD  align='left'><a href='"+hasta[2]+"' target='derecha'>"+hasta[1]+"</a>";
//    input=input+"<DD  align='left'><a href=javascript:enviando('"+hasta[2]+"'); target='derecha'>"+hasta[1]+"</a>";
    }
}

    input=input+"</div></DL>";

u++;
return input;
};
function mostrar88(data) {
  aux=1; 			
   DWRUtil.addRows("campos",data,[modulo],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
        return tr;
        }
    });
  }

/*
function horitas()
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
has=hr+":"+min+":"+sec+timeday;
//DWRUtil.setValue("hora_pri",horas);
document.getElementById("horita").innerHTML =has;
setTimeout("horas()",1000);
}
*/


function mostrarCodigo(data) {

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

var fecha=anno+"-"+m[today.getMonth()]+"-"+dia;


var timeday;
var horas;
today=new Date();
sec=today.getSeconds();
hr=today.getHours();
min=today.getMinutes();

var h1=hr;

if ((h1 >= 7 )&&(h1 < 13)){
id_horario=1;
}

if ((h1 >= 13 )&&(h1 < 19)){
id_horario=2;
}

if ((h1 >= 19 )&&(h1 < 24)){
id_horario=3;
}

ListaPreDAO.InsertarAsiste(mostrarRespuesta,data,fecha,id_horario);
}



function mostrarRespuesta(data) {
}

function mostrar_apellido(data) {
if(data!=""){
$("uno").style.display='none';
$("tres").style.display='';
DWRUtil.setValue("permitido","");
  aux=1; 
  parent.cabeza.document.getElementById("desconectar").style.display="";
    DWRUtil.addRows("camposApellido",data,[nom,apepa,apema,datos],{
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
alert('incoreccto');
else{DWRUtil.setValue("permitido","<font color='red'><b>Usuario y/o Contraseña Incorrecta</b></font>");
DWRUtil.setValue("usuario","");
DWRUtil.setValue("contraseña","");
}

  }

function insertarmenu(id_rol){
//alert(id_rol);

ListaPreDAO.mostrarMenu(mostrarM11,id_rol);
//ListaPreDAO.mostrarMenu(mostrar,id_rol);
}

function mostrarM11(data) {
$(uno).style.display='none';
var nombre=DWRUtil.getValue(nombre);
//alert(nombre);
  aux=1; 
  DWRUtil.addRows("camposMenu",data,[nombre,menu],{
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
function prueba(u,vista){
ver=vista*ver;
if(ver==1){
$("cinco"+u+"").style.display='none';
}
    else{
    $("cinco"+u+"").style.display='';
    }
}
function menu(){
alert('oooooooooooo');
var o='hola';
return o;
}


function Primero(){
ListaPreDAO.Menu(mostrar_Todo);/////////muestra todos los menus
}


function mostrar_Todo(data) {
  aux=1; 
  DWRUtil.addRows("campos_Todo",data,[todo_menu],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	
        return tr;
        }
    });
  }
var x=0;
var todo_menu= function(data) {

A[x]=data.id_mod+"*"+data.nombre1+"*"+data.enlace;
//alert(A[x]);
x++;
};

function pruebita(){
var cod_per=DWRUtil.getValue("cod_per");
alert(cod_per);
}
