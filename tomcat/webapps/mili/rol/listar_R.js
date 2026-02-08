function listar()
{
NuevoPersonalDAO.lista_Rol(conteo1);
}


var nombre = 	function(data) { return data.nombre };
var cod_per = 	function(data) { return data.cod_per };
var apepa = 	function(data) { return data.apepa };
var nom = 	function(data) { return data.nom };
var apema = 	function(data) { return data.apema };
var profesion =	function(data) { return data.profesion };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[cod_per,nom,apepa,apema,profesion,nombre],{
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

