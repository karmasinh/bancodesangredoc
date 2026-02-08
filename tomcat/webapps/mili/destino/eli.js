function listar()
{
$(eliminar).style.display='none';         
$(adios).style.display='none';         
$(lista).style.display='';  
DWRUtil.removeAllRows("campos");       
NuevoHemoDAO.listaDestino(conteo1);
}

var id_destino = function(data) { return data.id_destino };
var nombre = 	function(data) { return data.nombre };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_destino,nombre,modi],{
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
modi = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/eliminar1.png");
      input.setAttribute("onclick","si('"+data.id_destino+"');");
      return input;
};
function si(id_destino)
{
DWRUtil.setValue("id_destino",id_destino);
$(lista).style.display='none';         
$(eliminar).style.display='';         
}

function eli()
{
var id=DWRUtil.getValue("id_destino");
NuevoHemoDAO.eliminarDestino(ahora,id);
}

function ahora(data)
{
$(eliminar).style.display='none';         
$(adios).style.display='';         
}


