function listar()
{
DWRUtil.removeAllRows("campos");
$("siono").style.display='none';         
$("lista").style.display='';   
NuevoHemoDAO.listaRol(conteo1);
}

var id_rol = 	function(data) { return data.id_rol };
var nombre = 	function(data) { return data.nombre };
var direccion =	function(data) { return data.direccion };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_rol,nombre,eli],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	if ((aux%2)==0){
        	tr.style.backgroundColor = "#eeeeff";
	        tr.style.border="1px solid #00008B";
	}
	else{
	        tr.style.backgroundColor = "#ffffff";
	        tr.style.border="1px solid #00008B";
	}
	aux=1+aux;
        return tr;
    }
  });
}
var eli = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/eliminar1.png");
      input.setAttribute("onclick","si('"+data.id_rol+"');");
      return input;
};

function si(id_rol)
{
DWRUtil.setValue("id_rol",id_rol);      
$("siono").style.display='';         
$("lista").style.display='none';   
}
function eliminar()
{     
var id_prod=DWRUtil.getValue("id_rol");
NuevoHemoDAO.eliminarRol(Eliminado,id_prod);
}
function Eliminado()
{
$("lista").style.display='none';         
$("adios").style.display='';         
$("siono").style.display='none';         
}         
