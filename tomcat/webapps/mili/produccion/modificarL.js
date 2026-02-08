//***********iNicio VALIDACION***************
var v88 = '0';
var v89 = '0';

//function validarProd(){v81 =validarReales("sistolica",	  "EmSi",        "*");vali();}

function validarProd()   { v88 = validarFecha("fecha_produccion",  	  "EmFechae",    "*");
 if  (v88=='0'){
     }  
}


function validarExpi()   { v89 = validarFecha("fecha_expi",  	  "EmFechae1",    "*");
 if  (v89=='0'){
     }  
}
//***********FiN VALIDACION***************
/////******modificar***********************

function modificar()
{
var id_prod =DWRUtil.getValue("id_prod1");
var id_hemo=DWRUtil.getValue("flaca");
//var id_hemo =DWRUtil.getValue("id_hemo");
//alert(id_hemo);
var valort = DWRUtil.getValue("fecha_a");
    var dia  = valort.split("-")[0];
    var mes  = valort.split("-")[1];
    var anyo = valort.split("-")[2];
    var fecha_produccion=anyo+'-'+mes+'-'+dia;

var valor = DWRUtil.getValue("fecha_expi");
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_expi=anyo+'-'+mes+'-'+dia;

var id_horario=DWRUtil.getValue("id_horario");
var cod_per=DWRUtil.getValue("cod_per");

ListaFracDAO.modificado(modificarDatosV,fecha_produccion,fecha_expi,id_hemo,id_prod,cod_per,id_horario);
}

function modificarDatosV()
{

$(prod3).style.display='';
$(prod2).style.display='none';
$(prod1).style.display='none';
}

var a1=0;
var a=0;
var d=new Array(100);
var c=0;

var nombre1= function(data) {
	var id_hemo =DWRUtil.getValue("id_hemo1");
	var input="<select id='flaca'> <option  selected='selected'>"+data.nombre+"</option> </select>";
	d[a]=id_hemo;
	a++;
	ListaFracDAO.mostrarLista4(nivel0,id_hemo);
 return input;                             
};

function nivel0(data)
{
DWRUtil.addOptions('flaca',data,'id_hemo','nombre');
c++;
}

function insertarValor()
{
var nombre =DWRUtil.getValue("nombres");
var fecha_produccion =DWRUtil.getValue("fecha_produccion");
var fecha_expi =DWRUtil.getValue("fecha_expi");
var id_prod =DWRUtil.getValue("id_prod");
ListaFracDAO.modificado(modificarDatosV,fecha_produccion,fecha_expi,nombre,id_prod);
}

function modificarDatosV()
{
$(prod2).style.display='none';
$(prod1).style.display='none';
$(prod3).style.display='';
//$(boton).style.display='none';
}

         
function ListarMod(id_prod,id_hemo)
{
DWRUtil.setValue("id_prod1",id_prod);
DWRUtil.setValue("id_hemo1",id_hemo);
$(prod2).style.display='';
$(prod1).style.display='none';
$(prod3).style.display='none';
ListaFracDAO.modificarLista(mostrarMod,id_prod);
ListaFracDAO.cont(mostrar,id_prod);
}



var id_hemo = function(data) { return data.id_hemo};
var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_a = function(data) { return data.fecha_a };
var nombre = function(data) { return data.nombre };

var id_hemo = function(data) { return data.id_hemo };


var fecha_produccion1= function(data) {
    var valor =data.fecha_a;
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_a=anyo+'-'+mes+'-'+dia;

      var input = document.createElement("input");
      input.setAttribute("onBlur","validarProd();");
      input.setAttribute("size","15");
      input.setAttribute("id", "fecha_a");
      input.setAttribute("value",fecha_a );
      return input;
    };


var span1= function(data) {
      var input = document.createElement("span");
      input.setAttribute("id", "EmFechae1");
      return input;                             
    };

var fecha_expi1= function(data) {
    var valort = data.fecha_expi ;
    var dia  = valort.split("-")[0];
    var mes  = valort.split("-")[1];
    var anyo = valort.split("-")[2];
    var fecha_expi=anyo+'-'+mes+'-'+dia;

      var input = document.createElement("input");
      input.setAttribute("id", "fecha_expi");
      input.setAttribute("onBlur","validarExpi();");
      input.setAttribute("size","15");
      input.setAttribute("value",fecha_expi );
      return input;
    };

var span= function(data) {
      var input = document.createElement("span");
      input.setAttribute("id", "EmFechae");
      return input;                             
    };


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onBlur","vali();");
      input.setAttribute("onclick","ListarMod('"+data.id_prod+"','"+data.id_hemo+"');");
      return input;                             
    };


function Listar()
{     
//alert('hola');
$(prod1).style.display='';         
$(prod2).style.display='none';         
$(prod3).style.display='none';         
ListaFracDAO.ListaTotalL(mostrarListaDonantes);
//*********paginacion********/////
ListaFracDAO.Cantidad(mostrarCantidad);
DWRUtil.setValue(id_horario,parent.izquierdaAnalisis2.document.getElementById("id_horario").value);  
DWRUtil.setValue(cod_per,parent.izquierdaAnalisis2.document.getElementById("cod_per").value);  

}

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
     DWRUtil.removeAllRows("campos");
     ListaMedicaDAO.mostrarLista(mostrarListaDonantes);
     //$("busqueda").style.display='';
}

function mostrarListaDonantes(data) {      
//alert('llego');
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prod,id_hemo,cod_do,nombre,gs_rh,fecha_expi,fecha_a,Predonacion],{
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


function mostrarMod(data) {      
  aux=1; 
//  DWRUtil.addRows("campos1",data,[id_prod,nombre,fecha_expi1,span1,fecha_produccion1,span],{
   DWRUtil.addRows("campos1",data,[id_prod,nombre1,fecha_expi1,fecha_produccion1],{
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

function mostrarCombo(data) {
  DWRUtil.removeAllOptions('n0'); 
  DWRUtil.addOptions('n0',data,'id_hemo','nombre');
  }

