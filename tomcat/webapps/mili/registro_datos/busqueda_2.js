///////////INICIO  toda busqueda con Ci/////////////

///////// busqueda_CODIGO///////////
var cod_do = 	function(data) { return data.cod_do };
var id_per = 	function(data) { return data.id_per };
var apepa = 	function(data) { return data.apepa };
var apema = 	function(data) { return data.apema };
var nom = 	function(data) { return data.nom };
var gs_rh = 	function(data) { return data.gs_rh };
/////////////////

///////// ///////////RESULTADOS
var id_aten = 	function(data) { return data.id_aten };
var fecha_a = 	function(data) { return data.fecha_a };
var edad = 	function(data) { return data.edad };
var resultado=	function(data) { return data.resultado };
/////////////////

///////// ///////////MODIFICAR
var ci = 	function(data) { return data.ci };
var prof = 	function(data) { return data.prof };
var ocu = 	function(data) { return data.ocu };
var lugar_tra =	function(data) { return data.lugar_tra };
var email = 	function(data) { return data.email };
var fono_pro = 	function(data) { return data.fono_pro };
var cel = 	function(data) { return data.cel };
var fono_vec = 	function(data) { return data.fono_vec };
var fono_tra = 	function(data) { return data.fono_tra };
var calle_residencia = 	function(data) { return data.calle_residencia };		
var num = 	function(data) { return data.num };
var zona = 	function(data) { return data.zona };
//var tipo_dom = 	function(data) { return data.tipo_dom };
////////

var tipo_dom1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_domt");
      input.setAttribute("value",data.tipo_dom );
      return input;
    };


var tipo_dom2= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "tipo_dom");
      input.setAttribute("value",data.tipo_dom );
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
      return input;
    };

var cel1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cel");
      input.setAttribute("value",data.cel );
      input.setAttribute("size","9" );
      return input;
    };

var fono_vec1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_vec");
      input.setAttribute("value",data.fono_vec );
      input.setAttribute("size","9" );
      return input;
    };

var fono_tra1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_tra");
      input.setAttribute("value",data.fono_tra );
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



//// inicio de agregar donante////////
function agregar_donante_ci()
{  
    var ci=DWRUtil.getValue("ci"); 
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='none';
    $("resultado-todo1").style.display='none';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='none';
    $("resultado-todo3").style.display='';
    $("resultado-todo4").style.display='';
    $("resultado-todo5").style.display='';
    $("resultado-todo6").style.display='';
    $("resultado-por-apellido").style.display='none';
    BusquedaDAO.agregar_donante1(mostrarDonante,ci);
    BusquedaDAO.agregar_donante_11(mostrarDonante_1,ci);
    BusquedaDAO.agregar_donante_22(mostrarDonante_2,ci);
}    
/////////


//// inicio de busqueda////////

function busqueda_ci()
{  
    var ci=DWRUtil.getValue("ci"); 
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='';
    $("resultado-todo1").style.display='';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='';
    $("resultado-por-apellido").style.display='none';
    BusquedaDAO.mostrarBusqueda_Donantes1(mostrarBusqueda,ci);
    BusquedaDAO.mostrarBusqueda_Resultados1(mostrarResultados,ci);
}

function mostrarDonante1(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes",data,[ id_per,cod_do,nom,apepa,apema,gs_rh,ci,prof1,ocu1],{
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


function mostrarDonante_11(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes_1",data,[ lugar_tra1,email1,fono_pro1,cel1,fono_vec1,fono_tra1],{
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
function mostrarDonante_22(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes_2",data,[calle_residencia1,num1,zona1,tipo_dom],{
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

function mostrarDonante_2_2(data) {
  aux=1;                        
  DWRUtil.addRows("campos_Donantes_2_2",data,[calle_residencia2,num2,zona2,tipo_dom1],{
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



///////////inicio de modificar

function modificar_valor()
{
//var tipo_dom=DWRUtil.getValue("tipo_dom");
var id_per=DWRUtil.getValue("id_per");
var prof=DWRUtil.getValue("prof");
var ocu=DWRUtil.getValue("ocu");
var lugar_tra=DWRUtil.getValue("lugar_tra");
var email=DWRUtil.getValue("email");
var fono_pro=DWRUtil.getValue("fono_pro");
var cel=DWRUtil.getValue("cel");
var fono_vec=DWRUtil.getValue("fono_vec");
var fono_tra=DWRUtil.getValue("fono_tra");

var calle_residencia=DWRUtil.getValue("calle_residencia");
var num=DWRUtil.getValue("num");
var zona=DWRUtil.getValue("zona");

var calle_residenciat=DWRUtil.getValue("calle_residenciat");
var numt=DWRUtil.getValue("numt");
var zonat=DWRUtil.getValue("zonat");

//BusquedaDAO.modificar_Datos_Donante(insertarDatos,tipo_dom,id_per,prof,ocu,lugar_tra,email,fono_pro,cel,fono_vec,fono_tra,calle_residencia,num,zona);
BusquedaDAO.modificar_Datos_Donante(insertarDatos,id_per,prof,ocu,lugar_tra,email,fono_pro,cel,fono_vec,fono_tra,calle_residencia,num,zona,calle_residenciat,numt,zonat);
}

function insertarDatos()
{
    $("resultado-todo").style.display='none';
    $("resultado-todo1").style.display='none';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='none';
    $("resultado-todo3").style.display='none';
    $("resultado-todo4").style.display='none';
    $("resultado-todo5").style.display='none';
    $("resultado-todo6").style.display='none';
    $("resultado-todo7").style.display='';
    $("resultado-por-apellido").style.display='none';
}
////fin de modificar


///// FIN DE BUSQUEDA CON CI
