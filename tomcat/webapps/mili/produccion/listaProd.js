//***********iNicio VALIDACION***************
var v5 = '1';
var v6 = '1';
var v7 = '1';
var v8 = '1';

function vali(){
//      DWRUtil.removeAllRows('campos233');  
     if ( (v5 =='0')&&(v6 =='0') &&(v7 =='0')&&(v8 =='0')){
      DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='insertarValor();'>");

     }  
     else{
      DWRUtil.setValue("mili","");
     }
}

function validarNum()   {v8 = validarNumero("cantidad","EmCant","*");vali();}

function validarFechae1() {   v5 = validarFecha("fecha_produccion","EmFechae1","*");vali();  }


function validarFechae21(){ 
     if ( DWRUtil.getValue( "fecha_produccion")!=""  ) v5= validarFecha ("fecha_produccion","EmFechae1","*");
     vali();
}


function validarFechae()   {v6 = validarFecha("fecha_expi","EmFechae","*");vali();}

function validarFechae2(){
     if ( DWRUtil.getValue( "fecha_expi")!=""  ) v6= validarFecha ("fecha_expi",  "EmFechae",   "*");
     vali();
}

function validarCombo(n0){
if (n0!=""){
$(prod11).style.display='none'; 
$(prod22).style.display='none'; 
var nn0 = DWRUtil.getValue("n0" );
DWRUtil.setValue("n1",nn0);
fechas();
    v7=0;
}
      else{ 
          v7=1;
	}

}
//***********FiN VALIDACION*********************************************

var cont2=0;
var cont3=0;
var cont4=0;
var cont5=0;

var p=0;

function updateTT()
{
var id_ext =DWRUtil.getValue("id_ext");
ListaFracDAO.FinalizarTodo(Listar,id_ext);
}
function qq()
{
$(prod22).style.display='';
$(prod11).style.display='none';
$(extra2).style.display='none'; 
$(extra3).style.display='none'; 
$(extra1).style.display='none'; 
} 

var w=0;
function ListaTotal()
{
DWRUtil.removeAllRows('campos233');
var cod_do =DWRUtil.getValue("cod_do");
var id_aten =DWRUtil.getValue("id_aten");
fechas();
ListaFracDAO.ListaT(mostrarTodo,cod_do,id_aten);
$(prod11).style.display='';
$(prod22).style.display=''
}

var sumaCantidad=0;

function insertarValor()
{
var bolsa=DWRUtil.getValue("bolsa");
if (bolsa=='Dobles')
    cont2=cont2+1;
else {
     if(bolsa=='Triples')
     cont3=cont3+1;
     
     else {
     if(bolsa=='Cuadruples')
     cont4=cont4+1;
     
          else {
          if(bolsa=='Quintuples')
	  cont5=cont5+1;
          }
    }
}
    
var suma =parseInt(DWRUtil.getValue("cantidad"));
sumaCantidad=suma+sumaCantidad;
if (sumaCantidad<431)
{
var n0=DWRUtil.getValue("n0");
var id_aten =DWRUtil.getValue("id_aten");
var id_ext =DWRUtil.getValue("id_ext");
var cod_do =DWRUtil.getValue("cod_do");
var resultado =DWRUtil.getValue("resultado");
var cantidad =DWRUtil.getValue("cantidad");

    var valor = DWRUtil.getValue("fecha_produccion" );
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_produccion=anyo+'-'+mes+'-'+dia;

    var valort = DWRUtil.getValue("fecha_expi" );
    var dia  = valort.split("-")[0];
    var mes  = valort.split("-")[1];
    var anyo = valort.split("-")[2];
    var fecha_expi=anyo+'-'+mes+'-'+dia;

var cod_per =DWRUtil.getValue("cod_per");
var id_horario =DWRUtil.getValue("id_horario");
ListaFracDAO.adicionarR(insertarDatosV,n0,fecha_produccion,fecha_expi,id_aten,id_ext,cod_do,resultado,cantidad,cod_per,id_horario);
var uno=1;
ListaFracDAO.CambiarEstado(insertarDatosV,n0,uno);
 v5 = '1';
 v6 = '1';
 v7 = '1';
}
else {
    $(extra2).style.display='none'; 
    $(extra3).style.display='none'; 
    $(prod11).style.display='none'; 
    $(extra2).style.display='none'; 
    $(EstaMal).style.display=''; 
 }
}

function insertarDatosV()
{
if ((2==cont2)||(3==cont3)||(4==cont4)||(5==cont5))
{
$(extra3).style.display='none';
ListaTotal();
$(prod11).style.display='';
DWRUtil.setValue("volver","<input type='image' src='../imagenes/atras.png' onclick='updateTT();'>"); 
}
else{
ListaTotal();
DWRUtil.setValue("mili","");
DWRUtil.setValue("cantidad",""); 
DWRUtil.setValue("fecha_produccion",""); 
DWRUtil.setValue("fecha_expi",""); 
$(extra2).style.display='none'; 
$(extra3).style.display=''; 
$(prod11).style.display=''; 
$(extra2).style.display='none'; 
p=p+500;
setTimeout("$(prod22).style.display=''",p);	
ListaFracDAO.mostrarCombo(mostrarListaDonantes1);
}
}

function Denuevo()
{
var bolsa8= DWRUtil.getValue("bolsa"); 
var id_aten8= DWRUtil.getValue("id_aten"); 
var id_ext8= DWRUtil.getValue("id_ext"); 
var cod_do8= DWRUtil.getValue("cod_do"); 
var resultado8= DWRUtil.getValue("resultado"); 
sumaCantidad=0;
ListarEva1(id_aten8,id_ext8,cod_do8,resultado8,bolsa8);
}

function ListarEva(id_aten,id_ext,cod_do,resultado,bolsa)
{  
sumaCantidad=0;
cont2=0;
cont3=0;
cont4=0;
cont5=0;

$(EstaMal).style.display='none'; 
$(extra1).style.display='none'; 
$(extra2).style.display='none'; 
$(extra3).style.display=''; 
DWRUtil.setValue("id_aten",id_aten); 
DWRUtil.setValue("id_ext",id_ext);
DWRUtil.setValue("cod_do",cod_do); 
DWRUtil.setValue("resultado",resultado); 
DWRUtil.setValue("bolsa",bolsa); 
DWRUtil.setValue("n0",n0);
var id_aten= DWRUtil.getValue("id_aten"); 
ListaFracDAO.mostrar(mostrarLista,id_aten);
ListaelCombo();
}

function ListaelCombo()
{
var bolsa1= DWRUtil.getValue("bolsa"); 
DWRUtil.setValue("bolsa1",bolsa1); 
var cod_do1= DWRUtil.getValue("cod_do"); 
DWRUtil.setValue("cod_do1",cod_do1); 
$(n0).style.display=''; 
ListaFracDAO.mostrarCombo(mostrarListaDonantes1);
}

//////////************
function ListarEva1(id_aten,id_ext,cod_do,resultado,bolsa)
{  
$(EstaMal).style.display='none'; 
$(extra1).style.display='none'; 
$(extra2).style.display='none'; 
$(extra3).style.display=''; 
DWRUtil.setValue("id_aten",id_aten); 
DWRUtil.setValue("id_ext",id_ext);
DWRUtil.setValue("cod_do",cod_do); 
DWRUtil.setValue("resultado",resultado); 
DWRUtil.setValue("bolsa",bolsa); 
//DWRUtil.setValue("n0",n0);
var id_aten= DWRUtil.getValue("id_aten"); 
ListaFracDAO.mostrar(mostrarLista,id_aten);
ListaelCombo1();
}

function ListaelCombo1()
{
var bolsa1= DWRUtil.getValue("bolsa"); 
DWRUtil.setValue("bolsa1",bolsa1); 
var cod_do1= DWRUtil.getValue("cod_do"); 
DWRUtil.setValue("cod_do1",cod_do1); 
var n1= DWRUtil.getValue("n1"); 
DWRUtil.setValue("n0",n1); 
$(n0).style.display=''; 
//ListaFracDAO.mostrarCombo(mostrarListaDonantes1);
}

//////////*****


function Listar()
{
DWRUtil.setValue("n1","");
$(EstaMal).style.display='none'; 
DWRUtil.removeAllRows('campos');  
$(extra1).style.display=''; 
$(extra2).style.display='none'; 
$(extra3).style.display='none'; 
$(prod11).style.display='none'; 
$(prod22).style.display='none'; 
DWRUtil.setValue("mili","");
DWRUtil.setValue("fecha_produccion",""); 
DWRUtil.setValue("cantidad",""); 
DWRUtil.setValue("fecha_expi",""); 
 fechas();
ListaFracDAO.mostrarLista(mostrarListaDonantes);
ListaFracDAO.CambiarEstadoTodos(nada);
 cont2=0;
 cont3=0;
 cont4=0;
 cont5=0;

DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  

}

function nada()
{
}
var cantidad = function(data) { return data.cantidad };
var bolsa = function(data) { return data.bolsa };
var cod_do = function(data) { return data.cod_do };
var fecha_extra = function(data) { return data.fecha_extra };
var id_ext = function(data) { return data.id_ext };
var id_aten = function(data) { return data.id_aten};
var resultado = function(data) { return data.resultado};
var id_prueba = function(data) { return data.id_prueba};

var id_hemo = function(data) { return data.id_hemo};
var nombre = function(data) { return data.nombre};
var fecha_produccion = function(data) { return data.fecha_produccion;};
var fecha_a = function(data) { return data.fecha_a;};
var fecha_expi = function(data) { return data.fecha_expi;};


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/ingresar.png");
      input.setAttribute("onclick","ListarEva('"+data.id_aten+"','"+data.id_ext+"','"+data.cod_do+"','"+data.resultado+"','"+data.bolsa+"');");
      return input;                             
    };


function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[id_aten,id_ext,cod_do,fecha_a,bolsa,Predonacion],{
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

function mostrarLista(data) {      
  aux=1; 
  DWRUtil.addRows("campos1",data,[id_ext,cod_do,resultado],{
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


function mostrarListaDonantes1(data) {
  DWRUtil.removeAllOptions('n0'); 
  DWRUtil.addOptions('n0',data,'id_hemo','nombre');
  $(prod22).style.display='none'
  }

function mostrarTodo(data) {
  aux=1; 
  DWRUtil.addRows("campos233",data,[nombre,cantidad,fecha_a,fecha_expi],{
//  DWRUtil.addRows("campos233",data,[fecha_expi],{
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
////////////************
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
DWRUtil.setValue("fecha_produccion",a);
}  
//************