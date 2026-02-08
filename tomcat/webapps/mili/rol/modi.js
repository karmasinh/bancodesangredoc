var aux;
var cont=0;
var vec=new Array();
var contv=0;

var nombre = function(data) { return data.nombre };
var id_rol = function(data) { return data.id_rol };

function listar(){
cont=0;
DWRUtil.removeAllRows("listamod"); 
$("f").style.display='none';
$("lista").style.display='';
$("mensaje").style.display='none';
    NuevoHemoDAO.listaRol(listar1);
}
function listar1(data){
  aux=1; 
  DWRUtil.addRows("listamod",data,[c,nombre,Mod1],{
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
var c=function(){ cont++;    
      return cont;
};
var Mod1=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/modificar.png");
      input.setAttribute("onclick","Mod('"+data.id_rol+"','"+data.nombre+"')");
      return input;
};
function Mod(id_rol,nombre){
DWRUtil.setValue("nombre",nombre);
DWRUtil.setValue("id_rol",id_rol);
$("lista").style.display='none';
$("f").style.display='';
//NuevoHemoDAO.insertaRol(ya,n);
}
function Modificar(){
var nombre=DWRUtil.getValue("nombre");
var id_rol=DWRUtil.getValue("id_rol");
//alert(nombre+id_rol);
NuevoHemoDAO.modificarRol(ya,nombre,id_rol);
}
function ya() {
$("f").style.display='none';
$("mensaje").style.display='';
}
///validaciones
var v1 = '1';
var v2 = '1';
function validar(){
// if ( (v1=='0')&&(v2=='0')){
     if (v1=='0'){
      DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='Modificar();'>"); 
     }  
     else{
      DWRUtil.setValue("mili","");
     }
}
                                 
function ca(){ v1 =validarString("nombre","N","*");validar();}

//modificar
