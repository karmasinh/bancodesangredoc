var nom=function(data) { return data.nom };
var apepa=function(data) { return data.apepa };
var apema=function(data) { return data.apema };
var hrs_entrada=function(data) { return data.hrs_entrada };
var hrs_salida=	function(data) { return data.hrs_salida };
var semana=function(data) { return data.semana };

function listar(){
DWRUtil.removeAllRows("campos");
$(siono).style.display='none';         
$(lista).style.display='';   
ListaExtraDAO.listarHorario(conteo1);
}


var Eliminar = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/eliminar1.png");
      input.setAttribute("onclick","si('"+data.id_horario+"');");
      return input;
};




function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[nom,apepa,apema,hrs_entrada,hrs_salida,semana,Eliminar],{
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
      input.setAttribute("onclick","si('"+data.id_horario+"');");
      return input;
};
function si(id_horario)
{
DWRUtil.setValue("id_horario",id_horario);      
$(siono).style.display='';         
$(lista).style.display='none';   
}
function eliminar()
{     
var id_prod=DWRUtil.getValue("id_horario");
ListaExtraDAO.Eliminar(Eliminado,id_prod);
}
function Eliminado()
{
$(lista).style.display='none';         
$(adios).style.display='';         
$(siono).style.display='none';         
}         
