var aux;

var tipo_componente = function(data) { return data.tipo_componente };
var cod_do = function(data) { return data.cod_do };
var apepa = function(data) { return data.apepa };
var apema = function(data) { return data.apema };
var nom = function(data) { return data.nom };
var id_aten = function(data) { return data.id_aten};
var resultado = function(data) { return data.resultado};

var valores = function(data) { return data.valores};
var id_rol = function(data) { return data.id_rol};
var id_mod = function(data) { return data.id_mod};
var nombre = function(data) { return data.nombre};
var enlace = function(data) { return data.enlace};
///lista
function listar(){
DWRUtil.removeAllRows("listamod"); 
DWRUtil.removeAllRows("elimenu"); 
$("lista").style.display='';
$("seguro").style.display='none';
$("mensaje").style.display='none';
    GestionarMenu.ListarModulo(listar1);
}
function listar1(data){
  aux=1; 
  DWRUtil.addRows("listamod",data,[id_mod,nombre,Mod],{
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
var Mod=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "button");
      input.setAttribute("value","Eliminar");
      input.setAttribute("onclick","elimodulo('"+data.id_mod+"','"+data.nombre+"','"+data.id_rol+"','"+data.enlace+"');");
      return input;
};
//eliminar
/*function modmodulo(id_mod,nombre,id_rol,enlace)
{
$("fmodulo").style.display='';
$("lista").style.display='none';
alert(id_mod+" "+nombre+" "+id_rol+" "+enlace);
 DWRUtil.setValue("nom",nombre);
 DWRUtil.setValue("id_mod",id_mod);
var x=document.getElementById("rol");
x.options[0]=new Option(enlace,id_rol);
    GestionarMenu.ListarRoles(mostraRoles);
    GestionarMenu.ListarMenu(mostraRoles,id_mod);    
//    GestionarMenu.ModificarModulo(adicionar1,id_rol,modulo);
}*/
function elimodulo(id_mod,nombre,id_rol,enlace){
$("lista").style.display='none';
$("listaelimodulo").style.display='';
DWRUtil.setValue("id_mod",id_mod);
DWRUtil.setValue("nombre",nombre);
GestionarMenu.ListarMenu(menu1,id_mod);    
}
function menu1(data){
  aux=1; 
  if(data!=""){$("listaelimenu").style.display='';
  DWRUtil.addRows("elimenu",data,[nombre,enlace,Eli],{
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
    });}  
}
var Eli=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "button");
      input.setAttribute("value","Eliminar");
      input.setAttribute("onclick","Elimenu('"+data.codmenu+"');");
      return input;
};

function Elimodulo(){
$("seguro").style.display='';
DWRUtil.setValue("cual","1");
$("listaelimenu").style.display='none';
$("listaelimodulo").style.display='none';
//GestionarMenu.EliminarMenu(eliminarmenu1,codmenu);    
}
function Elimenu(codmenu){
DWRUtil.setValue("codmenu",codmenu);
DWRUtil.setValue("cual","2");
$("seguro").style.display='';
$("listaelimenu").style.display='none';
$("listaelimodulo").style.display='none';
}

function Eliminar(){
var cual=DWRUtil.getValue("cual");
if(cual=='1'){
var id_mod=DWRUtil.getValue("id_mod");
//alert(id_mod);
GestionarMenu.EliminarModulo(eliminarmenu1,id_mod);    }
else{
var codmenu=DWRUtil.getValue("codmenu");
GestionarMenu.EliminarMenu(eliminarmenu1,codmenu);    }
}

function eliminarmenu1(data){
$("mensaje").style.display='';
}