function si(id_per,cod_per)
{
DWRUtil.setValue("id_per",id_per);      
DWRUtil.setValue("cod_per",cod_per);      
$(siono).style.display='';         
$(lista).style.display='none';         
}


function insertar()
{
var id_per=DWRUtil.getValue("id_per");
var cod_per=DWRUtil.getValue("cod_per");
ListaAdmPersonalDAO.eliminarPersonal(insertarDatos,id_per,cod_per);
}

function insertarDatos()
{
$(lista).style.display='none';
$(siono).style.display='none';
$(listaT).style.display='';
}  
  

var modificarM= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/eliminar1.png");
      input.setAttribute("onclick","si("+data.id_per+",'"+data.cod_per+"');");
      return input;
    };

  

function Listar()
{              
$(lista).style.display='';
$(siono).style.display='none';
$(listaT).style.display='none';
DWRUtil.removeAllRows("campos");
ListaAdmPersonalDAO.mostrarLista(mostrarListaPrueba);
}

var nom = function(data) { return data.nom };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var usuario = function(data) { return data.usuario};
var cod_per = function(data) { return data.cod_per};
var id_per = function(data) { return data.id_per };
var id_horario = function(data) { return data.id_horario };



function mostrarListaPrueba(data) {
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_per,nom,apepa,apema,cod_per,usuario,modificarM],{
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
