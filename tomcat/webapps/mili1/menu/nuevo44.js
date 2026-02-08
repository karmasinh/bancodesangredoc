function enviar()
{
var modulo=DWRUtil.getValue("nom");
var id_rol=DWRUtil.getValue("rol");
    GestionarMenu.AdicionarModulo(adicionar1,id_rol,modulo);
}
function adicionar1(data) {
 DWRUtil.setValue("id_mod",data);
//$("fmodulo").style.display='none';
$("fmenu").style.display='';
$("boton").style.display='none';
}

function listar() {
    GestionarMenu.ListarRoles(mostraRoles);
}
function mostraRoles(data)
{
DWRUtil.addOptions('rol',data,'id_rol','nombre');
}

function addmenu(){
var menu=DWRUtil.getValue("menu");
var enlace=DWRUtil.getValue("enlace");
var id_mod=DWRUtil.getValue("id_mod");
    GestionarMenu.AdicionarMenu(addmenu1,enlace,id_mod,menu);
}
function addmenu1(){
nuevafila("dentromenu");
 DWRUtil.setValue("menu","");
 DWRUtil.setValue("enlace","");
}
///INSERTA UNA NUEVA FILA///////
	function nuevafila(tabla){
		$(tabla).style.display="";
		var ele=document.getElementById(tabla);
		var frag=document.createDocumentFragment();
		var tr = document.createElement("tr");	
				
		var td = document.createElement("td");
		var text = document.createTextNode(DWRUtil.getValue("menu"));
			td.appendChild(text);
			tr.appendChild(td);
		
			td = document.createElement("td");
			text = document.createTextNode(DWRUtil.getValue("enlace"));
			td.appendChild(text);
			tr.appendChild(td);
			
frag.appendChild(tr);
ele.appendChild(frag);
	}