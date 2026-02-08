var tipo_componente = function(data) { return data.gs_rh;};
var fecha_expi = function(data) { return data.fecha_expi;};
var nombre_tp = function(data) { return data.nombre_tp;};
var valores = function(data) { return data.valores;};
var id_prueba = function(data) { return data.id_prueba;};
var id_valor = function(data) { return data.id_valor;};

var tubuladora = function(data) { return data.tubuladora;};
var gs_rh = function(data) { return data.gs_rh;};
var id_prod = function(data) { return data.id_prod;};
var cod_do = function(data) { return data.cod_do;};
var nombre = function(data) { return data.nombre;};




var a=new Array(6);
var combo=new Array(30);
var conteo=0;
var k=1;
var nombre = function(data) { return data.nombre};
var id_hemo = function(data) { return data.id_hemo};
var gel=new Array(20);



function Listar()
{     
$(salida1).style.display='';         
$(sangre).style.display='none';         
ListarSalidaDAO.mostrarCombo(mostrarCombo1);
ListarSalidaDAO.cambiarEstado(cambiarEstado);
ListarSalidaDAO.contd(mostrarpruebas);
}
////////////////////////FUNCIONES QUE CREAN INPUT///////////

var GS= function(data) {
 var input="<select id='"+data.id_hemo+"' onblur='valorcombo()' ><option value='O-'>O-</option><option value='O+'>O+</option> <option value='A-'>A-</option> <option value='A+'>A+</option> <option value='B-'>B-</option> <option value='B+'>B+</option> <option value='AB-'>AB-</option> <option value='AB+'>AB+</option> <option value='0' selected='selected'>~</option> </select>";
//    alert(data.id_hemo);
    combo[conteo]=data.id_hemo;
    conteo++;
 return input;                             
};

function valorcombo(){
var i;
for (i=0;i<1;i++){
var gs_rh=DWRUtil.getValue(""+combo[i]+"");
if(gs_rh!="0")
$(salida2).style.display='';
else
$(salida2).style.display='none';
}
}

var caja= function(data) {
      var ff=100+data.id_hemo;
      var input = document.createElement("input");
      input.setAttribute("type", "text");
      input.setAttribute("id", ""+ff+"");
      a[k]=ff;
      k=k+1;
      input.setAttribute("size","5");
return input;                             
};

var informacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/informacion.png");
    //  input.setAttribute("id", data.nombre);
      input.setAttribute("onclick","cuentaGs_rh("+data.id_hemo+",'"+data.nombre+"');");
return input;                             
};


////////////////////funciones///////////////
function cambiar()
{
DWRUtil.removeAllRows("camposP");  
$(salida1).style.display='none';         
$(salida2).style.display='none';         
$(Fin).style.display='none';         
$(salida3).style.display='';         
var i;
for (i=0;i<5;i++){
var gs_rh=DWRUtil.getValue(""+combo[i]+"");
//var id_hemo =DWRUtil.getValue(com[i]);
//alert(gs_rh+" hol "+combo[i]+" "+i);
if(gs_rh!="0"){
ListarSalidaDAO.listarChec(listarChe,gs_rh,combo[i]);
}
}
//p=p+5;
//setTimeout("ListarSalidaDAO.listarChec(listarChe,"+gs_rh+")",p);	
}


//////////////////FUNCIONE QU MUESTRAN LAS FILAS///////////////
function mostrarCombo1(data) {      
  aux=1; 				
  DWRUtil.addRows("campos",data,[id_hemo,nombre,GS,caja,informacion],{
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


  
function listarChe(data) {      
  aux=1; 			
  DWRUtil.addRows("camposP",data,[id_prod,cod_do,nombre,gs_rh,tubuladora,fecha_expi,Pruebas],{
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
///////////////////////pruebas////////////////////////////
var Pr= function(data) {
gel[j]=data.id_prueba;

     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id", "EmCi");
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 30);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);
      gel[j]="EmCi";     
      return input;
    
     } 
j++; 
     if(data.tipo_componente=='3'){

      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
    //  input.setAttribute("onclick","Insertar('"+data.id_prueba+"');");
    //  gel[j]=data.id_prueba;     
      return input;                             
     }
        
      if(data.tipo_componente=='2'){
      var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='0' selected='selected'>~</option> </select>";
      mes[d]=""+data.id_prueba+"";
       va[data.id_prueba]=0;
       p=p+500;
      setTimeout("ListarSalidaDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p);	
      d++;

 return input;                             

    }
};

var a1=0;
function nivel0(data)
{
DWRUtil.addOptions(''+mes[a1]+'',data,'valores','valores');
a1++;
}

var Pruebas= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ListarEva("+data.id_prod+",'"+data.cod_do+"','"+data.nombre+"','"+data.gs_rh+"');");
      return input;                             
    };
var j=1;
function ListarEva(id_prod,cod_do,nombre,gs_rh)
{  
DWRUtil.removeAllRows("campospe");  
DWRUtil.setValue("id_prod",id_prod);     
DWRUtil.setValue("cod_do",cod_do);     
$(salida4).style.display='';
$(salida3).style.display='none';
ListarSalidaDAO.mostrarLista3(mostrarListaDonantes1);
fechas();
horas();
    DWRUtil.setValue("codigo_donante",cod_do); 
    DWRUtil.setValue("nom",nombre); 
    DWRUtil.setValue("gs_rh",gs_rh); 
}

function mostrarListaDonantes1(data) {
  aux=1; 
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
//////////////////aqui inserta  ////////////////////////
function InsertarC(){
var a1=0;
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var bba=DWRUtil.getValue("bb");
var v = (parseInt(bba));
for (i=1;i<=v;i++){
var valores=DWRUtil.getValue(""+gel[i]+"");
    if(gel[i]!="EmCi"){
	ListarSalidaDAO.InsertarC(Resultado,gel[i],valores,id_aten,cod_do);
    }	
}
ListarSalidaDAO.cont2(mostrarCantidad,cod_do,id_aten);
$(Fin).style.display='';
}

function Resultado(data)
{
}
function mostrarCantidad(data)
{
if (data > 0){
     DWRUtil.setValue("EmCi","Hemocomponente No Aprobado");
     DWRUtil.setValue("resultado","Hemocomponente No Aprobado");
     DWRUtil.setValue("agregar","<input type='submit' value='Volver' onclick='updateTT();'>");
}
else{
   DWRUtil.setValue("EmCi","Hemocomponente Aprobado");
   DWRUtil.setValue("resultado","Hemocomponente Aprobado");
   DWRUtil.setValue("agregar","<input type='submit' value='Volver' onclick='updateTT();'>");
    }
}

function updateTT()
{
var valores = DWRUtil.getValue("resultado");
var id_prueba=DWRUtil.getValue("id_pruebaF");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");

ListarSalidaDAO.InsertarC(Find,id_prueba,valores,id_aten,cod_do);
var id_prod=DWRUtil.getValue("id_prod");
ListarSalidaDAO.FinalizarTodo(qq,id_prod);
cambiar();
}

function qq()
{

$(salida4).style.display='none';
}
function Find()
{
//$(lista).style.display='none';
}
/////////////////////fin/////////////////////////
function cuentaGs_rh(id_hemo,nombre)
{
DWRUtil.setValue("id_hemo1",nombre);
ListarSalidaDAO.gs_rh1(muestraGs,id_hemo);
ListarSalidaDAO.gs_rh2(muestraGs1,id_hemo);

ListarSalidaDAO.gs_rh3(muestraGs2,id_hemo);
ListarSalidaDAO.gs_rh4(muestraGs3,id_hemo);

ListarSalidaDAO.gs_rh5(muestraGs4,id_hemo);
ListarSalidaDAO.gs_rh8(muestraGs7,id_hemo);

ListarSalidaDAO.gs_rh6(muestraGs5,id_hemo);
ListarSalidaDAO.gs_rh7(muestraGs6,id_hemo);

$(sangre).style.display='';
$(salida1).style.display='none';
};

function muestraGs(data)
{
DWRUtil.setValue("gs1",data);
};
function muestraGs1(data)
{
DWRUtil.setValue("gs2",data);
};


function muestraGs2(data)
{
DWRUtil.setValue("gs3",data);
};
function muestraGs3(data)
{
DWRUtil.setValue("gs4",data);
};


function muestraGs4(data)
{
DWRUtil.setValue("gs5",data);
};
function muestraGs7(data)
{
DWRUtil.setValue("gs8",data);
};


function muestraGs5(data)
{
DWRUtil.setValue("gs6",data);
};
function muestraGs6(data)
{
DWRUtil.setValue("gs7",data);
};

function Volver()
{
//alert('hola');     
DWRUtil.removeAllRows('campos');
$(salida1).style.display='';         
$(sangre).style.display='none';         
ListarSalidaDAO.mostrarCombo(mostrarCombo1);
ListarSalidaDAO.cambiarEstado(cambiarEstado);
ListarSalidaDAO.contd(mostrarpruebas);
}

////////////////////////////////////////////////////////////
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

///////////////////////fin///////////////////////////////