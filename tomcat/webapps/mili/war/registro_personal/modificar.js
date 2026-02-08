function insertar(id_per,id_horario)
{
var nom=DWRUtil.getValue("nom");
var apepa=DWRUtil.getValue("apepa");
var apema=DWRUtil.getValue("apema");
var cod_per=DWRUtil.getValue("cod_per");
var fecha=DWRUtil.getValue("fecha");
var hrs_entrada=DWRUtil.getValue("hrs_entrada");
var hrs_salida=DWRUtil.getValue("hrs_salida");
var semana=DWRUtil.getValue("semana");
var turno=DWRUtil.getValue("turno");
var cargo=DWRUtil.getValue("cargo");

ListaAdmPersonalDAO.modificarPersonal(insertarDatos,id_per,nom,apepa,apema,cod_per,fecha,hrs_entrada,hrs_salida,semana,turno,id_horario,cargo);
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
      return input;
    };

var profesion1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "profesion");
      input.setAttribute("value",data.profesion );
      return input;
    };

var fono_pro1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "fono_pro");
      input.setAttribute("value",data.fono_pro );
      return input;
    };

var cel1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cel");
      input.setAttribute("value",data.cel );
      return input;
    };

var zona1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "zona");
      input.setAttribute("value",data.zona );
      return input;
    };

var num1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "num");
      input.setAttribute("value",data.num );
      return input;
    };


var calle_residencia1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "calle_residencia");
      input.setAttribute("value",data.calle_residencia );
      return input;
    };

var usuario1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "usuario");
      input.setAttribute("value",data.usuario );
      return input;
    };

  

var nom1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "nom");
      input.setAttribute("value",data.nom );
      return input;
    };


var apepa1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "apepa");
      input.setAttribute("value",data.apepa );
      return input;
    };
  
var apema1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "apema");
      input.setAttribute("value",data.apema );
      return input;
    };

var cod_per1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "cod_per");
      input.setAttribute("value",data.cod_per );
      return input;
    };


var ci1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("id", "ci");
      input.setAttribute("value",data.ci );
      return input;
    };


function Listar()
{              
ListaAdmPersonalDAO.mostrarLista(mostrarListaPrueba);
}

var nom = function(data) { return data.nom };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var cod_per = function(data) { return data.cod_per};
var id_per = function(data) { return data.id_per };
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
  DWRUtil.addRows("camposM",data,[id_per,nom1,apepa1,apema1],{
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
