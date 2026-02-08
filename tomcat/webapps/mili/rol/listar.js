function listar()
{
NuevoHemoDAO.listaRol(conteo1);
//NuevoHemoDAO.listaModulo(conteo2);
}

var id_rol = 	function(data) { return data.id_rol };
var nombre = 	function(data) { return data.nombre };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_rol,nombre],{
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

function conteo2(data){
  aux=1;                        
  DWRUtil.addRows("campos1",data,[nombre],{
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
