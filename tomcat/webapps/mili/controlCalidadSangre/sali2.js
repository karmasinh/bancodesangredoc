function mostrarpruebas(data)
{
//alert(data);
DWRUtil.setValue("bb",data);
};


function InsertarC(){
var a1=0;

var cod_per=DWRUtil.getValue("cod_per");
var id_horario=DWRUtil.getValue("id_horario");
var fecha_a=DWRUtil.getValue("fecha_a");
var hora_a=DWRUtil.getValue("hora_a");

var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var bba=DWRUtil.getValue("bb");
var v = (parseInt(bba));
//alert("v es"+v);
for (i=1;i<=v;i++){
//alert(v);

//	    alert(gel[i]);
	if(gel[i]!='EmCi'){
var valores=DWRUtil.getValue(""+gel[i]+"");
//	    alert(gel[i]+"valores"+valores);
	ListaControlDAO.InsertarC(Resultado,gel[i],valores,id_aten,cod_do,fecha_a,hora_a,cod_per,id_horario);
	}
}
ListaControlDAO.cont2(mostrarCantidad,cod_do,id_aten);
}

function mostrarCantidad(data)
{
if (data > 0){
     DWRUtil.setValue("EmCi","Hemocomponente No Aprobado");
     DWRUtil.setValue("resultado","Hemocomponente Aprobado");
     DWRUtil.setValue("agregar","<input type='submit' value='Finalizar' onclick='updateTT();'>");
}
else{
   DWRUtil.setValue("EmCi","Hemocomponente Aprobado");
   DWRUtil.setValue("resultado","Hemocomponente Aprobado");
   DWRUtil.setValue("agregar","<input type='submit' value='Finalizar' onclick='updateTT();'>");
    }
}


function updateTT()
{
var valores = DWRUtil.getValue("resultado");
var id_prueba=DWRUtil.getValue("id_pruebaF");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");

ListaControlDAO.InsertarC(Find,id_prueba,valores,id_aten,cod_do);
var id_prod=DWRUtil.getValue("id_prod");
ListaControlDAO.FinalizarTodo(qq,id_prod);
}

function qq()
{
$(Fin).style.display='';
$(salida4).style.display='none';
}
function Find()
{
//$(lista).style.display='none';
}

//***********************
function Insertar(id_prueba){
var valores='N';
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
ListaControlDAO.InsertarC(Resultado,id_prueba,valores,id_aten,cod_do);
}
function Resultado(data)
{
}

////////*********lista
var j=1;
function ListarEva(id_prod,cod_do,nombre)
{  
DWRUtil.setValue("id_prod",id_prod);     
DWRUtil.setValue("cod_do",cod_do);     
$(salida4).style.display='';
$(salida3).style.display='none';
ListaControlDAO.mostrarLista3(mostrarListaDonantes1,nombre);
ListaControlDAO.contd(mostrarpruebas,nombre);
}

var mes=new Array(50);
var gel=new Array(50);
var va=new Array(20);
    for(i=0;i<=20;i++) va[i]=1;
var d1=0;
var p1=0;

var Pr= function(data) {
gel[j]=data.id_prueba;
j++;
     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id", "EmCi");
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 10);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);     
     j--;
      gel[j]="EmCi";
      return input;
    
     } 

     if(data.tipo_componente=='3'){

      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      input.setAttribute("onclick","Insertar('"+data.id_prueba+"');");
      return input;                             
     }
         
      if(data.tipo_componente=='2'){
      var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='0' selected='selected'>~</option> </select>";
      mes[d1]=""+data.id_prueba+"";
//	alert(mes[d1]+"el d _"+d1);
       va[data.id_prueba]=0;
       p1=p1+1000;
       setTimeout("ListaControlDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p1);	
      d1++;

 return input;                             

    }
};

var a11=0;
function nivel0(data)
{
//alert(mes[a11]+"el a es_"+a11);
DWRUtil.addOptions(''+mes[a11]+'',data,'valores','valores');
a11++;
}

function mostrarListaDonantes1(data) {
  aux=1; 
//  DWRUtil.addRows("campospe",data,[id_prueba,nombre_tp,tipo_componente,Pr],{
  DWRUtil.addRows("campospe",data,[id_prueba,nombre_tp,tipo_componente,Pr],{
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
  

////***************
function cambiar(id_hemo)
{

//alert('yoyo');
$(salida1).style.display='none';         
$(salida2).style.display='none';         
$(salida3).style.display='';         
ListaControlDAO.mostrarLista(listarChe,id_hemo);
}

function cambiar1()
{
DWRUtil.removeAllRows("camposP");  
cambiar();
}



function insertarValor()
{
var n1=DWRUtil.getValue("n1");
var n0=DWRUtil.getValue("n0");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");
ListaControlDAO.adicionarR(insertarDatosV,n1,n0,id_aten,cod_do);
}

var resultado = function(data) { return data.resultado;};
var cod_do = function(data) { return data.cod_do;};
var tubuladora = function(data) { return data.tubuladora;};
var nombre = function(data) { return data.nombre;};
var nombre_tp = function(data) { return data.nombre_tp;};
var fecha_expi = function(data) { return data.fecha_expi;};
var gs_rh = function(data) { return data.gs_rh;};
var tipo_componente = function(data) { return data.tipo_componente;};
var id_ext = function(data) { return data.id_ext;};

var id_prod = function(data) { return data.id_prod;};
var valores = function(data) { return data.valores};
var id_prueba = function(data) { return data.id_prueba};
var id_valor = function(data) { return data.id_valor};

var Pruebas= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Pruebas");
      input.setAttribute("onclick","ListarEva("+data.id_prod+",'"+data.cod_do+"','"+data.nombre+"');");
      
      return input;                             
    };



function listarChe(data) {      
  aux=1; 
   DWRUtil.addRows("camposP",data,[id_ext,id_prod,cod_do,fecha_expi,nombre,Pruebas],{
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







function Chec(id_hemo)
{
ListaControlDAO.insertar(insertarChec,id_hemo);
}



function controlar1(data)
{
if (data >= 1)
{
var id_hemo=DWRUtil.getValue("aa");
ListaControlDAO.insertar2(insertarChec2,id_hemo);}
else
{
var id_hemo=DWRUtil.getValue("aa");
ListaControlDAO.insertar(insertarChec,id_hemo);}
}

function insertarChec2()
{
$(salida1).style.display='';         
$(salida2).style.display='';         
}

function insertarChec()
{
$(salida1).style.display='';         
$(salida2).style.display='';         
}


function Listar()
{     
$(salida1).style.display='';         
ListaControlDAO.mostrarCombo(mostrarCombo1);

DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  
horas();
fechas();
}


var nombre = function(data) { return data.nombre};
var id_hemo = function(data) { return data.id_hemo};



var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Control");
      input.setAttribute("id", "id_hemo");
      input.setAttribute("onclick","cambiar('"+data.id_hemo+"');");
      return input;                             
    };
var  p=0;
var  d=0;
var tot=new Array(50);
var total= function(data) {

      var input = document.createElement("input");
      input.setAttribute("type", "text");
      input.setAttribute("id", data.id_hemo);
      input.setAttribute("readonly","true");
      input.setAttribute("size","3");
      tot[d]=""+data.id_hemo+"";
 p=p+200;
 
      setTimeout("ListaControlDAO.contar(mostrarConteo,"+data.id_hemo+")",p);	
    d=d+1;
return input;                             

};

var m=0;
function mostrarConteo(data) {      
DWRUtil.setValue(tot[m],data);
m=m+1;
}
function mostrarCombo1(data) {    
//alert('paso');  
  aux=1; 
//  DWRUtil.addRows("campos",data,[id_ext,id_hemo,nombre,gs_rh,total,Predonacion],{
   DWRUtil.addRows("campos",data,[id_hemo,nombre,gs_rh,total,Predonacion],{
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
