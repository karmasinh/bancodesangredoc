///////// busqueda_apellido///////////
var cod_do = 	function(data) { return data.cod_do };
var apepa = 	function(data) { return data.apepa };
var apema = 	function(data) { return data.apema };
var nom = 	function(data) { return data.nom };

var ingresar1= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Ingresar");
      input.setAttribute("onclick","busqueda_codigo_1('"+data.cod_do+"');");
      return input;
    };


function busqueda_apellido()
{  
    var apepa=DWRUtil.getValue("apepa"); 
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='none';
    $("resultado-todo1").style.display='none';
    $("resultado-todo2").style.display='none';
    $("resultado-todo2_2").style.display='none';
    $("resultado-por-apellido").style.display='';
    BusquedaDAO.mostrarBusqueda_apellidos(mostrarBusqueda_apellido,apepa);
}

function mostrarBusqueda_apellido(data) {
  aux=1; 
  DWRUtil.addRows("campos_de_apellido",data,[cod_do,apepa,apema,nom,ingresar1],{
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

function busqueda_codigo_1(cod_do)
{  
    $("busqueda1").style.display='none';
    $("resultado-todo").style.display='';
    $("resultado-todo1").style.display='';
    $("resultado-todo2").style.display='';
    $("resultado-todo2_2").style.display='none';
    $("resultado-por-apellido").style.display='none';
    BusquedaDAO.mostrarBusqueda_Donantes(mostrarBusqueda,cod_do);
    BusquedaDAO.mostrarBusqueda_Resultados(mostrarResultados,cod_do);
}


///////////fin de busqueda//////////
