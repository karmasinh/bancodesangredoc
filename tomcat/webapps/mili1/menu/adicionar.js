	var c=1;
	var sub=0;
	var cod=function(unit){return unit.cod};
	var nombre=function(unit){return unit.nombre};
	var enlace=function(unit){return unit.enlace};
	var tipo=function(unit){return unit.tipo};
		////////////********cargar lista**********/////////
		var cont=function(){return c++;}
		function cargar(){
			GestionarMenu.ListaMenu(lista);			
		}
		function lista(datos){
			DWRUtil.addRows("listamenu",datos,[cont,nombre,modificar,eliminar]);
		}
		var modificar=function(dato){ var a='<input type="submit" value="Modificar" onclick="modrecuperar('+dato.cod+')">';
			return a;}
			
		var eliminar=function(dato){ var a='<input type="submit" value="Eliminar" onclick="elirecuperar('+dato.cod+')">';
		return a;}
		////////////////********fin cargar lista**********///////
		/////////////******adicionar menu*********/////////////
		function formadd(){
			c=1;
			sub=0;
			$("menu").style.display = 'none';
			$("adicionar").style.display='';
			GestionarMenu.ListaRol(listarol);
		}
		function listarol(dato){
			DWRUtil.addOptions("asigrol",dato,'cod','nombre');
		}
		function adicionar(tabla,valor){
		var tipo=0;		
		var enlace=""
		if(sub==0){ 
		var nombre=DWRUtil.getValue("nombre");
		var codrol=DWRUtil.getValue("asigrol");
		$("nuevomenu").style.display="none"
		$("nuevosubmenu").style.display="";
		tipo=1;
		GestionarMenu.AdicionarMenu(add1,nombre,enlace,tipo,codrol);
		}
		else{
			var a=sub-1;
			var nombre=DWRUtil.getValue(valor+a);
			var enlace=DWRUtil.getValue(valor+"a"+a);
			tipo=2;
			GestionarMenu.AdicionarMenu(add2,nombre,enlace,tipo);
			setTimeout("adicionarsub()",1000);
		}
		nuevafila(tabla,valor);
		sub++;		
		}
		function add1(dato){
			DWRUtil.setValue("acodmenu",dato);
			$("mensaje").style.display="";		
		}	
		function add2(dato){
			DWRUtil.setValue("acodsubmenu",dato);
			$("mensaje").style.display="none";
			$("mensajesubmenu").style.display="";
		}
		function adicionarsub(){
			var codmenu=DWRUtil.getValue("acodmenu");
			var codsubmenu=DWRUtil.getValue("acodsubmenu");
			GestionarMenu.AdicionarSubmenu(add3,codmenu,codsubmenu);
		}
		function add3(){}
	function nose(dato,p){
		var elementos = document.getElementsByName(dato);
		if(elementos[0].checked) $(p+"escogermenu").style.display='';
		else $(p+"escogermenu").style.display='none';		
		$("mensajefalta").style.display='none';
	}
	
	function nuevafila(tabla,tipo){
		$(tabla).style.display="";
		var ele=document.getElementById(tabla);
		var frag=document.createDocumentFragment();
		var tr = document.createElement("tr");	
				
		var td = document.createElement("td");
		var text = document.createTextNode("Submenu");
			td.appendChild(text);
			tr.appendChild(td);
		
			td = document.createElement("td");
			text = document.createElement("input");
			text.setAttribute("type","text");
			text.setAttribute("id",tipo+sub);
			td.appendChild(text);
			tr.appendChild(td);
			
			td = document.createElement("td");
			text = document.createTextNode("Enlace");
			td.appendChild(text);
			tr.appendChild(td);
			
			td = document.createElement("td");
			text = document.createElement("input");
			text.setAttribute("type","text");
			text.setAttribute("id",tipo+"a"+sub);
			text.setAttribute("size","48");
			td.appendChild(text);
			tr.appendChild(td);

frag.appendChild(tr);
ele.appendChild(frag);
	}
	//////////////********fin adicionar menu***********///////
	////*******MODIFICAR MENU**********//////////
	function modrecuperar(dato){
		GestionarMenu.ModRecuperar(modmostrar,dato);
		GestionarMenu.ModRecuperarSub(modmostrarsub,dato);
	}
	function modmostrar(dato){
		$("menu").style.display="none";
		$("modificar").style.display="";
	//	DWRUtil.addRows("mlistamenu",dato,["Nombre:",mnom,mod1]);
	DWRUtil.setValue("acodmenu",dato[0]['cod']);
	DWRUtil.setValue("mcod",dato[0]['cod']);
		DWRUtil.setValue("mnombre",dato[0]['nombre']);		
		var opt = new Option(dato[0]["nom_rol"], dato[0]["codrol"]);
$("masigrol").options[0] = opt;
	GestionarMenu.ListaRol(mlistarol);
		}
		function mlistarol(dato){
			DWRUtil.addOptions("masigrol",dato,'cod','nombre');
		}
	function modmostrarsub(dato){
		$("menu").style.display="none";
		$("modificar").style.display="";
		DWRUtil.addRows("mlistasubmenu",dato,["Submenu:",mnom,"Enlace:",men,mod1]);
	}
	var mnom=function(dato){
		var a="<input type='text' id='mn"+dato.cod+"' value='"+dato.nombre+"'>";
		return a;
	}
	var men=function(dato){
		var a="<input type='text' id='me"+dato.cod+"' value='"+dato.enlace+"'>";
		return a;
	}
	var mod1=function(dato){
		var a="<input type='button' value='Modificar' onclick='modificar11("+dato.cod+","+dato.tipo+")'>";
		return a;
	}
	
	function modificar11(dato,tipo){
		var enlace="";	
		enlace=DWRUtil.getValue("me"+dato);
		var nombre=DWRUtil.getValue("mn"+dato);
		GestionarMenu.ModificarMenu(mod,dato,nombre,enlace);
		}
		
		function modificar2(){
		var enlace="";	
		dato=DWRUtil.getValue("mcod"); 
		var nombre=DWRUtil.getValue("mnombre");
		var codrol=DWRUtil.getValue("masigrol");
		GestionarMenu.ModificarMenu(mod,dato,nombre,enlace,codrol);
		}
		function mod(){
			$("mensaje").style.display="";
		}	
	function mnuevosub(){
		sub=1;
		nuevafila("mlistasubmenu","m");
		$("mnuevosubmenu").style.display="none";
		$("menviarsubmenu").style.display="";
		sub=2;
	}
	//////**FIN MODIFICAR MENU*******////////	
	/////////******eliminar menu*******////////////
	function elirecuperar(dato){
		DWRUtil.setValue("eorigen",dato);
		GestionarMenu.ModRecuperar(elimostrar,dato);
		GestionarMenu.ModRecuperarSub(elimostrarsub,dato);
	}
	function elimostrar(dato){
		$("menu").style.display="none";
		$("eliminar").style.display="";
		DWRUtil.addRows("elistamenu",dato,[nombre,eli1]);
	}
	var eli1=function(dato){
		var a="<input type='button' value='Eliminar' onclick='seguroeli("+dato.cod+","+dato.tipo+")'>";
		return a;
	}
	function elimostrarsub(dato){
				c=1;
		DWRUtil.addRows("elistasubmenu",dato,[cont,nombre,enlace,eli1]);
	}
	function seguroeli(dato,tipo){
		var borrar=document.getElementById("eli");
		borrar.setAttribute("value",dato);
		DWRUtil.setValue("etipo",tipo)
		$("menu").style.display="none";
		$("eliminar").style.display="none";
		$("eliminarmensaje").style.display="";
	}
	function eliminar1(){
		var borrar=DWRUtil.getValue("eli");
		var tipo=DWRUtil.getValue("etipo");
		GestionarMenu.EliminarMenu(eliver,borrar,tipo);
	}
	function eliver(){
		$("eliminarmensaje").style.display="none";
		$("eliminar").style.display="none";
		$("menu").style.display="";
		DWRUtil.removeAllRows("listamenu");
		DWRUtil.removeAllRows("elistamenu");
		DWRUtil.removeAllRows("elistasubmenu");
		var origen=DWRUtil.getValue("eorigen");
	cargar();
	}
	function eliver1(){
		$("eliminarmensaje").style.display="none";
		$("eliminar").style.display="";
	}
	//////********fin eliminar menu***********///////////