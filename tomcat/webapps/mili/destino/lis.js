function listar()
{
NuevoHemoDAO.listaDestino(conteo1);
}

var id_destino = function(data) { return data.id_destino };
var nombre = 	function(data) { return data.nombre };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_destino,nombre],{
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
