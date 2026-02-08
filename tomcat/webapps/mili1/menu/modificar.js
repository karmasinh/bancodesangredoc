var aux;
var cont=0;
var vec=new Array();
var contv=0;

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
cont=0;
DWRUtil.removeAllRows("listamod"); 
$("lista").style.display='';
$("mensaje").style.display='none';
    GestionarMenu.ListarModulo(listar1);
}
function listar1(data){
  aux=1; 
  DWRUtil.addRows("listamod",data,[c,nombre,Mod],{
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
var Mod=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "button");
      input.setAttribute("value","Modificar");
      input.setAttribute("onclick","Modmodulo('"+data.id_mod+"','"+data.nombre+"','"+data.id_rol+"','"+data.enlace+"');");
      return input;
};
//listas para modificar
function Modmodulo(id_mod,nombre,id_rol,enlace)
{
$("afmenu").style.display='';
$("fmodulo").style.display='';
$("lista").style.display='none';
//alert(id_mod+" "+nombre+" "+id_rol+" "+enlace);
 DWRUtil.setValue("nom",nombre);
 DWRUtil.setValue("id_mod",id_mod);
var x=document.getElementById("rol");
x.options[0]=new Option(enlace,id_rol);
    GestionarMenu.ListarRoles(mostraRoles);
    GestionarMenu.ListarMenu(menu1,id_mod);    
//    GestionarMenu.ModificarModulo(adicionar1,id_rol,modulo);
}
function menu1(data){
cont=0;
  aux=1; 
  if(data!=""){$("fmenu").style.display='';
  DWRUtil.addRows("mmenu",data,[c,N,E],{
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
var N=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "text");
      input.setAttribute("id","n"+contv);     
      input.setAttribute("value",data.nombre);
//      input.setAttribute("value","n"+contv);
      return input;
};
var E=function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "text");
      input.setAttribute("id","e"+contv);   
      input.setAttribute("value",data.enlace);              
//      input.setAttribute("value","e"+contv);
      vec[contv]=data.codmenu;
      contv++;
//      input.setAttribute("value",data.enlace);
      return input;
};

//modificar modulo
function Modificarmodulo(){
$("fmodulo").style.display='';
$("lista").style.display='none';
var nombre=DWRUtil.getValue("nom");
var id_mod=DWRUtil.getValue("id_mod");
var rol=DWRUtil.getValue("rol");
//alert(id_mod+" "+nombre+" "+rol);
GestionarMenu.ModificarModulo(modificarmenu1,id_mod,rol,nombre);    
}
function modificarmenu1(data){
$("mensaje").style.display='';
}
//modifica menu
function Modificarmenu(){
//alert(vec.length);
for(var i=0;i<vec.length;i++){
var nombre=DWRUtil.getValue("n"+i);
var enlace=DWRUtil.getValue("e"+i);
var id_mod=DWRUtil.getValue("id_mod");
//alert(i);
//alert(vec[i]+" "+nombre+" "+enlace+" "+id_mod);
    GestionarMenu.ModificarMenu(mmenu1,vec[i],nombre,enlace,id_mod);
}
}
function mmenu1(){
//$("mensaje").style.display='';
}
//lista los roles
function listarRoles() {
    GestionarMenu.ListarRoles(mostraRoles);
}
function mostraRoles(data)
{
DWRUtil.addOptions('rol',data,'id_rol','nombre');
}
//insertar un nuevo menu
function addmenu(){
var amenu=DWRUtil.getValue("amenu");
var aenlace=DWRUtil.getValue("aenlace");
var aid_mod=DWRUtil.getValue("id_mod");
    GestionarMenu.AdicionarMenu(addmenu1,aenlace,aid_mod,amenu);
}
function addmenu1(){
nuevafila("adentromenu");
 DWRUtil.setValue("amenu","");
 DWRUtil.setValue("aenlace","");
}
///INSERTA UNA NUEVA FILA///////
	function nuevafila(tabla){
		$(tabla).style.display="";
		var ele=document.getElementById(tabla);
		var frag=document.createDocumentFragment();
		var tr = document.createElement("tr");	
				
		var td = document.createElement("td");
		var text = document.createTextNode(DWRUtil.getValue("amenu"));
			td.appendChild(text);
			tr.appendChild(td);
		
			td = document.createElement("td");
			text = document.createTextNode(DWRUtil.getValue("aenlace"));
			td.appendChild(text);
			tr.appendChild(td);
			
frag.appendChild(tr);
ele.appendChild(frag);
	}