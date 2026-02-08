var c=0;
var mes=new Array(12);
var va=new Array(20);
    for(i=0;i<=20;i++) va[i]=1;
var d=0;
var a=0;
var sval=0;
var kk=0;
var da='';
var er='';
var p=0;
//
var gel=new Array(20);
var j=1;
var a1=0;
/////*****validaciones*********************
function validarcaja(id_prueba){
var ca=DWRUtil.getValue("a");

sval=sval+1;
var valores=DWRUtil.getValue(""+id_prueba+"");
if(valores==0){
    va[id_prueba]=0;
}
      else{ 
          va[id_prueba]=1;
	}

if((va[0]==1)&&(va[1]==1)&&(va[2]==1)&&(va[3]==1)&&(va[4]==1)&&(va[5]==1)&&(va[6]==1)&&(va[7]==1)&&(va[8]==1)&&(va[9]==1)&&(va[10]==1)&&(va[11]==1)&&(va[12]==1)&&(va[13]==1)&&(va[14]==1)&&(va[15]==1)&&(va[16]==1)&&(va[17]==1)&&(va[18]==1)&&(va[19]==1)&&(va[20]==1)){
DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='InsertarC();'>");
	sval=1;
}
     else{
      DWRUtil.setValue("mili","");
     }

}

/////*****fin validaciones*********************
function validar(data){
}

function validarC(id_prueba,d){
var valores=DWRUtil.getValue(mes[d]);
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var fecha="12-12-12";
ListaHemaDAO.conteo(validar,id_prueba,valores,id_aten,cod_do);
}

function updateTT()
{
var valores = DWRUtil.getValue("resultado");
var id_prueba=DWRUtil.getValue("id_pruebaF");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");

var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");

    var va = DWRUtil.getValue("fecha_prueba" );
    var dia  = va.split("-")[0];
    var mes  = va.split("-")[1];
    var anyo = va.split("-")[2];
    var fecha_prueba=anyo+'-'+mes+'-'+dia;
var hora_prueba=DWRUtil.getValue("hora_prueba");


ListaHemaDAO.InsertarC(Find,id_prueba,valores,id_aten,cod_do,cod_per,id_horario,hora_prueba,fecha_prueba);
var id_aten=DWRUtil.getValue("id_aten");
ListaHemaDAO.FinalizarTodo(qq,id_aten);
}
function qq()
{
$(lista).style.display='none';
$(lista1).style.display='none';
$(Fin).style.display='';
} 
function Find()
{
$(lista).style.display='none';
}



function mostrarCantidad(data)
{
if (data > 0){
     DWRUtil.setValue("EmCi","Donante No Apto");
     DWRUtil.setValue("resultado","Donante No Apto");
     DWRUtil.setValue("agregar","<input type='image' src='../imagenes/salir.png' onclick='updateTT();'>");
}
else{
   DWRUtil.setValue("EmCi","Donante  Apto");
   DWRUtil.setValue("resultado","Donante  Apto");
   DWRUtil.setValue("agregar","<input type='image' src='../imagenes/salir.png' onclick='updateTT();'>");
    }
DWRUtil.setValue("mili","<input type='image' src='../imagenes/atras.png'  onclick='ListarOtravez();'>");
 p=p+500;
 setTimeout("$(Fin).style.display=''",p);	
//$(Fin).style.display='';
}

function ListarOtravez()
{
var valores = DWRUtil.getValue("resultado");
var id_prueba=DWRUtil.getValue("id_pruebaF");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");

var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");

    var va = DWRUtil.getValue("fecha_prueba" );
    var dia  = va.split("-")[0];
    var mes  = va.split("-")[1];
    var anyo = va.split("-")[2];
    var fecha_prueba=anyo+'-'+mes+'-'+dia;
var hora_prueba=DWRUtil.getValue("hora_prueba");



ListaHemaDAO.InsertarC(nada,id_prueba,valores,id_aten,cod_do,cod_per,id_horario,hora_prueba,fecha_prueba);
ListaHemaDAO.FinalizarTodo(listar1,id_aten);
}

function nada()
{
 c=0;
 //mes=new Array(12);
    for(i=0;i<=20;i++) va[i]=1;
 d=0;
 a=0;
 sval=0;
 kk=0;
 da='';
 er='';
 p=0;
 //gel=new Array(20);
 j=1;
 a1=0;
}

function listar1()
{
DWRUtil.removeAllRows("campos"); 
DWRUtil.removeAllRows("camposp"); 
$(lista).style.display='';
$(Fin).style.display='none';
$(lista1).style.display='none';
ListaHemaDAO.mostrarLista(mostrarListaDonantes);
ListaHemaDAO.cont1(mostrarconteocombos);
ListaHemaDAO.contd(mostrarpruebas);
}
function Listar()
{
$(lista).style.display='';
ListaHemaDAO.mostrarLista(mostrarListaDonantes);
ListaHemaDAO.cont1(mostrarconteocombos);
ListaHemaDAO.contd(mostrarpruebas);
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  
}

function mostrarconteocombos(data)
{
DWRUtil.setValue("a",data);
};

function mostrarpruebas(data)
{
DWRUtil.setValue("bb",data);
};

		
var tipo_componente = function(data) { return data.tipo_componente };
var cod_do = function(data) { return data.cod_do };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var nom = function(data) { return data.nom };
var id_aten = function(data) { return data.id_aten};
var resultado = function(data) { return data.resultado};

var valores = function(data) { return data.valores};
var id_prueba = function(data) { return data.id_prueba};

var nombre_tp = function(data) { return data.nombre_tp};
var resultado = function(data) { return data.resultado};

var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ListarEva('"+data.id_aten+"','"+data.cod_do+"','"+data.nom+"','"+data.apepa+"','"+data.apema+"');");
      return input;
    };

function ListarEva(id_aten,cod_do,nom,apepa,apema)
{
fechas();
horas();  
c=0;
d=0;
DWRUtil.setValue("id_aten",id_aten);     
DWRUtil.setValue("cod_do",cod_do);     
DWRUtil.setValue("nom",nom);     
DWRUtil.setValue("apepa",apepa);     
DWRUtil.setValue("apema",apema);     
DWRUtil.setValue("codigo_donante",cod_do);     
$(lista).style.display='none';
$(lista1).style.display='';
//ListaHemaDAO.mostrarLista3(mostrarListaDonantes1);
setTimeout("ListaHemaDAO.mostrarLista3(mostrarListaDonantes1)",500);	
ListaHemaDAO.mostrarResultado(mostrarResultado1,cod_do);
}

function mostrarResultado1(data){
DWRUtil.setValue("gs_rh",data);     
}
///
var resultado_gs_rh='';

var Pr= function(data) {
gel[j]=data.id_prueba;

     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id", "EmCi");
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 18);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);
      gel[j]="EmCi";     
      return input;
     } 
j++; 
     if(data.tipo_componente=='3'){

      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      return input;                             
     }
        
      if(data.tipo_componente=='2'){

	if (data.id_prueba==10){
	resultado_gs_rh = DWRUtil.getValue("gs_rh" );
//alert('');
        var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='1' selected='selected'>~</option> </select>";
        mes[d]=""+data.id_prueba+"";
	va[data.id_prueba]=1;
        p=p+500;
	setTimeout("ListaHemaDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p);	
        d++;
      }else{
      var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='0' selected='selected'>~</option> </select>";
      mes[d]=""+data.id_prueba+"";
       va[data.id_prueba]=0;
       p=p+500;
      setTimeout("ListaHemaDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p);	
      d++;
      }
 return input;                             
      }
};

///

function listarp(id_prueba){
 ListaHemaDAO.mostrarLista4(nivel1,id_prueba);
}

/////
function InsertarC(){
var a1=0;
    var va = DWRUtil.getValue("fecha_prueba" );
    var dia  = va.split("-")[0];
    var mes  = va.split("-")[1];
    var anyo = va.split("-")[2];
    var fecha_prueba=anyo+'-'+mes+'-'+dia;
var hora_prueba=DWRUtil.getValue("hora_prueba");

var id_horario=DWRUtil.getValue("id_horario");
var cod_per=DWRUtil.getValue("cod_per");

var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var bba=DWRUtil.getValue("bb");
var v = (parseInt(bba));
for (i=1;i<=v;i++){
var valores=DWRUtil.getValue(""+gel[i]+"");
    if(gel[i]!="EmCi"){
    //saque la fecha y la hora porq tengo q meter a otra tabla
    	ListaHemaDAO.InsertarC(Resultado,gel[i],valores,id_aten,cod_do,cod_per,id_horario,hora_prueba,fecha_prueba);
	ListaHemaDAO.conteo(validar,i,valores,id_aten,cod_do);
    }	
}
ListaHemaDAO.cont2(mostrarCantidad,cod_do,id_aten);
}

/////////////
/////

function Resultado(data)
{
$(lista).style.display='none';
$(lista1).style.display='';
//$(Fin).style.display='';
}

function Insertar(id_prueba){
var valores='N';
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");


    var va = DWRUtil.getValue("fecha_prueba" );
    var dia  = va.split("-")[0];
    var mes  = va.split("-")[1];
    var anyo = va.split("-")[2];
    var fecha_prueba=anyo+'-'+mes+'-'+dia;
var hora_prueba=DWRUtil.getValue("hora_prueba");

var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");

ListaHemaDAO.InsertarC(Resultado,id_prueba,valores,id_aten,cod_do,cod_per,id_horario,hora_prueba,fecha_prueba);
}


function nivel0(data)
{
//ert(data);
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
//////////////////////////////fechas*******************/////
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

