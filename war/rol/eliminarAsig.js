function listar()
{
DWRUtil.removeAllRows("campos");
$("lista1").style.display='none';         
$("lista2").style.display='none';         
$('lista3').style.display='none';   
$('lista5').style.display='none';   
$('lista').style.display='';   
NuevoPersonalDAO.listaPersonal1(conteo1);
}
var nombre = 	function(data) { return data.nombre };
var cod_per = 	function(data) { return data.cod_per };
var id_rol = 	function(data) { return data.id_rol };
var apepa = 	function(data) { return data.apepa };
var nom = 	function(data) { return data.nom };
var apema = 	function(data) { return data.apema };
var profesion =	function(data) { return data.profesion };

function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[cod_per,nom,apepa,apema,profesion,ingresar],{
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

var ingresar = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/ingresar.png");
      input.setAttribute("onclick","Ingresa('"+data.nom+"','"+data.apepa+"','"+data.cod_per+"');");
      return input;
};

function Ingresa(nom,apepa,cod_per){
DWRUtil.removeAllRows("campos1");       
$('lista').style.display='none';
$('lista1').style.display='';
DWRUtil.setValue("cod_per3",cod_per);
DWRUtil.setValue("nom",nom);
DWRUtil.setValue("apepa",apepa);
NuevoPersonalDAO.listaTiene5(conteo,cod_per);
}

function Ingresa1(){
DWRUtil.removeAllRows("campos1");       
$('lista').style.display='none';
$('lista2').style.display='none';
$('lista3').style.display='none';
$('lista1').style.display='';
NuevoPersonalDAO.listaTiene5(conteo);
}

function conteo(data){
  aux=1;                        
  DWRUtil.addRows("campos1",data,[id_rol,nombre,eli],{
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
$("lista2").style.display='';         
$('lista1').style.display='none';   
}
function eliminar()
{     
var id_rol=DWRUtil.getValue("id_rol");
var cod_per=DWRUtil.getValue("cod_per3");
NuevoPersonalDAO.eliminarTiene5(Eliminado,id_rol,cod_per);
}

function Todo()
{     
var cod_per=DWRUtil.getValue("cod_per3");
alert(cod_per);
NuevoPersonalDAO.eliminarTiene5Todo(Eliminado,cod_per);
}

function elitodo()
{     
//alert('hoa');
$(lista5).style.display='';         
$(lista1).style.display='none';   
}

function Eliminado()
{
$('lista1').style.display='none';         
$('lista3').style.display='';         
$('lista2').style.display='none';         
$('lista5').style.display='none';         
}         
function volver(){
var cod_per=DWRUtil.getValue("cod_per3");
var nom=DWRUtil.getValue("nom");
var apepa=DWRUtil.getValue("apepa");
$('lista3').style.display='none';         
Ingresa(nom,apepa,cod_per);
}
