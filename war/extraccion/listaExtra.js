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
document.getElementById("hora").innerHTML =horas;
setTimeout("horas()",1000);
}


function insertar()
{
var valor = DWRUtil.getValue("fecha_extra" );
var dia  = valor.split("-")[0];
var mes  = valor.split("-")[1];
var anyo = valor.split("-")[2];
var fecha_extra=anyo+'-'+mes+'-'+dia;
var hora=DWRUtil.getValue("hora");
var id_aten=DWRUtil.getValue("id_aten");
var bolsa=DWRUtil.getValue("bolsa");
var tubuladora=DWRUtil.getValue("tubuladora");
var cant_extra=DWRUtil.getValue("cant_extra");
var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");
ListaExtraDAO.adicionarExtra(insertarDatos,fecha_extra,hora,id_aten,bolsa,tubuladora,cant_extra,cod_per,id_horario);
}

function insertarDatos()
{
DWRUtil.setValue("agregar","<input type='image' src='../imagenes/atras.png'  onclick='Listar();'>");
DWRUtil.removeAllRows("campos"); 
$(extra2).style.display='';
//$(extra).style.display='';
//$(extra1).style.display='none';
}

  
function ListarEva(id_aten)
{         
DWRUtil.setValue("cant_extra","");
DWRUtil.setValue("tubuladora","");
DWRUtil.setValue("bolsa","");
DWRUtil.setValue("fecha_extra","");
DWRUtil.setValue("agregar","");

 v3 = '1';
 v4 = '1';
 v5 = '1';

$(extra1).style.display='none';
$(extra).style.display='';
ListaExtraDAO.codigo(mostrar1,id_aten);
ListaExtraDAO.cont(mostrar,id_aten);
DWRUtil.setValue("id_aten",id_aten);
horas();
fechas();
}

function mostrar(data)
{
document.getElementById("total").innerHTML = data;
}

function mostrar1(data)
{
document.getElementById("codigo").innerHTML = data;
}

function Listar()
{        
$(extra).style.display='none';
$(extra1).style.display='';
$(extra2).style.display='none';
ListaExtraDAO.mostrarLista(mostrarListaDonantes);
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  

}

var cod_do = function(data) { return data.cod_do };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var nom = function(data) { return data.nom };
var id_aten = function(data) { return data.id_aten};
var resultado = function(data) { return data.resultado};

var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ListarEva('"+data.id_aten+"');");
      return input;                             
    };

function mostrarListaDonantes(data) {
  aux=1; 
  DWRUtil.addRows("campos",data,[id_aten,cod_do,apepa,apema,nom,resultado,Predonacion],{
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
//////////////////*************fehcas*********************////////////
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
