function listar()
{
DWRUtil.setValue("id_destino","");
DWRUtil.removeAllRows("campos");
DWRUtil.removeAllRows("campos1");
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
      input.setAttribute("src","../imagenes/modificar.png");
      input.setAttribute("onclick","si('"+data.id_destino+"');");

      return input;
};
nombre1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "text");
      input.setAttribute("id", "nombre");
      input.setAttribute("value", data.nombre);
      return input;
};
function si(id_destino)
{
DWRUtil.removeAllRows("campos1");
DWRUtil.setValue("id_destino",id_destino);
$(lista).style.display='none';         
$(modificar).style.display='';         
NuevoHemoDAO.listaDestino1(ya,id_destino);
}
function ya(data){
  aux=1;                        
  DWRUtil.addRows("campos1",data,[id_destino,nombre1],{
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

function InsertMo()
{
var n=DWRUtil.getValue("nombre");
var id=DWRUtil.getValue("id_destino");
NuevoHemoDAO.modificarDestino(ahora,n,id);
}

function ahora(data)
{
$(modificar).style.display='none';         
$(aviso).style.display='';         
}


