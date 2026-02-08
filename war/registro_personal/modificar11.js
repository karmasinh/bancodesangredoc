function modificarC()
{
var id_per=DWRUtil.getValue("id_per");
var nom=DWRUtil.getValue("nom");
var apepa=DWRUtil.getValue("apepa");
var apema=DWRUtil.getValue("apema");
var cod_per=DWRUtil.getValue("contraseña");
var usuario=DWRUtil.getValue("usuario");
var ci=DWRUtil.getValue("ci");
var cel=DWRUtil.getValue("cel");
var fono_pro=DWRUtil.getValue("fono_pro");
var profesion=DWRUtil.getValue("profesion");
var grado=DWRUtil.getValue("grado");
var calle_residencia=DWRUtil.getValue("calle_residencia");
var num=DWRUtil.getValue("num");
var zona=DWRUtil.getValue("zona");

ListaAdmPersonalDAO.modificarPersonal(insertarDatos,id_per,nom,apepa,apema,cod_per,usuario,ci,cel,fono_pro,profesion,grado,calle_residencia,num,zona);
}
function insertarDatos()
{
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='none';
$(lista3).style.display='none';
$(listaT).style.display='';
}  
  
function ModificarP(id_per)
{
$(lista).style.display='none';
$(lista1).style.display='';
$(lista2).style.display='';
$(lista3).style.display='';
ListaAdmPersonalDAO.mostrarLista1(mostrarListaPrueba1,id_per);
ListaAdmPersonalDAO.mostrarLista1(mostrarListaPrueba2,id_per);
ListaAdmPersonalDAO.mostrarLista2(mostrarListaPrueba3,id_per);
ListaAdmPersonalDAO.mostrarLista2(mostrarListaPrueba4,id_per);
//ListaAdmPersonalDAO.mostrarLista1(mostrarListaPrueba3,id_per);
}

var modificarM= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","insertar('"+data.id_per+"','"+data.id_horario+"');");
      return input;
    };

var grado1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "grado");
      input.setAttribute("value",data.grado );
      input.setAttribute("maxlength",15 );
      return input;
    };

var profesion1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "profesion");
      input.setAttribute("value",data.profesion );
      input.setAttribute("maxlength",15 );
      return input;
    };

var fono_pro1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_pro");
      input.setAttribute("value",data.fono_pro );
      input.setAttribute("maxlength",7 );
      return input;
    };

var cel1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cel");
      input.setAttribute("value",data.cel );
      input.setAttribute("maxlength",8 );
      return input;
    };

var zona1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "zona");
      input.setAttribute("value",data.zona );
      input.setAttribute("maxlength",10 );
      return input;
    };

var num1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "num");
      input.setAttribute("value",data.num );
      input.setAttribute("maxlength",5 );
      return input;
    };


var calle_residencia1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "calle_residencia");
      input.setAttribute("value",data.calle_residencia );
      input.setAttribute("maxlength",15 );
      return input;
    };

var usuario1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "usuario");
      input.setAttribute("value",data.usuario );
      input.setAttribute("maxlength",10 );
      return input;
    };

  

var nom1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "nom");
      input.setAttribute("value",data.nom );
      input.setAttribute("maxlength",15 );
      return input;
    };


var apepa1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "apepa");
      input.setAttribute("value",data.apepa );
      input.setAttribute("maxlength",15 );
      return input;
    };
  
var apema1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "apema");
      input.setAttribute("value",data.apema );
      input.setAttribute("maxlength",15 );
      return input;
    };

var cod_per1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "contraseña");
      input.setAttribute("value",data.contraseña );
      input.setAttribute("maxlength",10 );
      return input;
    };


var ci1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "ci");
      input.setAttribute("value",data.ci );
       input.setAttribute("maxlength",9 );
      return input;
    };


function Listar()
{   
DWRUtil.removeAllRows("campos");
$(lista).style.display='';
$(lista1).style.display='none';
$(lista2).style.display='none';
$(lista3).style.display='none';
$(listaT).style.display='none';
ListaAdmPersonalDAO.mostrarLista(mostrarListaPrueba);
}

var contraseña = function(data) { return data.contraseña };
var nom = function(data) { return data.nom };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var cod_per = function(data) { return data.cod_per};
var id_per = function(data) {DWRUtil.setValue("id_per",data.id_per); return data.id_per };
var id_horario = function(data) { return data.id_horario };

var modificar= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/ingresar.png");
      input.setAttribute("onclick","ModificarP('"+data.id_per+"');");
      return input;
    };

function mostrarListaPrueba(data) {
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_per,cod_per,nom,apepa,apema,modificar],{
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


function mostrarListaPrueba1(data) {
  aux=1;                        
  DWRUtil.addRows("camposM",data,[nom1,apepa1,apema1],{
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
function mostrarListaPrueba2(data) {
  aux=1;                        
  DWRUtil.addRows("camposM1",data,[cod_per1,usuario1,ci1],{
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


function mostrarListaPrueba3(data) {
  aux=1;                        
  DWRUtil.addRows("camposM2",data,[calle_residencia1,num1,zona1],{
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

function mostrarListaPrueba4(data) {
  aux=1;                        
  DWRUtil.addRows("camposM3",data,[cel1,fono_pro1,profesion1,grado1],{
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
