var id_horario = 	function(data) { return data.id_horario };
var semana = 	function(data) { return data.semana };
var hrs_entrada = 	function(data) { return data.hrs_entrada };
var hrs_salida = 	function(data) { return data.hrs_salida };

function listar(){
ListaExtraDAO.horario(conteo1);
}
function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_horario,hrs_entrada,hrs_salida,semana],{
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
