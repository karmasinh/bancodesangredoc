function listar()
{
$("lista").style.display='';
$("lista1").style.display='none';
$("lista2").style.display='none';
DWRUtil.removeAllRows("campos");       

NuevoPersonalDAO.listaPersonal(conteo1);
NuevoPersonalDAO.cuentaRol(conteoRol);
}

var P= function(data) {
var xml="<parametros >";
    xml=xml+"<hola >"+data.nom+"<\/hola >";
    xml=xml+"<hol >"+ +"<\/hol >";
    xml=xml+"<hol >"+data.apepa+"<\/hol >";
    xml=xml+"<\/parametros >";
return xml;
}

var ingresar = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/ingresar.png");
      input.setAttribute("onclick","Ingresa('"+data.nom+"','"+data.apepa+"','"+data.cod_per+"');");
      return input;
};

var cod_per1 = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "hidden");
      input.setAttribute("value",data.cod_per);
      input.setAttribute("id","cod_per");
      return input;
};

function Ingresa(nom,apepa,cod_per){
DWRUtil.removeAllRows("campos1");       
$("lista").style.display='none';
$("lista1").style.display='';
DWRUtil.setValue("cod_per3",cod_per);
DWRUtil.setValue("nom",nom);
DWRUtil.setValue("apepa",apepa);
NuevoPersonalDAO.listaAsigRol(conteo,cod_per);
//  codigo();
}

function conteoRol(data){
DWRUtil.setValue("total",data);
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


function conteo(data){
  aux=1;                        
  j=0;
  DWRUtil.addRows("campos1",data,[id_rol,nombre,Pr],{
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
var gel=new Array();
var j=0;

var Pr= function(data) {
gel[j]=data.id_rol;
j++; 
      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_rol+"");
      input.setAttribute("onblur","vali("+data.id_rol+");");
      return input;                             

};

function Insertar(){
var cod_per=DWRUtil.getValue("cod_per3");
for (i=0;i<gel.length;i++){
    var valores=DWRUtil.getValue( ""+gel[i]+"");
    if(valores!=false){
    //alert("aqui"+valores+"cantidad i"+i+" "+cod_per);
    NuevoPersonalDAO.InsertarTiene5(Resultado,gel[i],cod_per);
    }
    }
}

function Resultado(){
$("lista").style.display='none';
$("lista1").style.display='none';
$("lista2").style.display='';
}

var va=new Array(20);
    for(i=0;i<=10;i++) va[i]=1;


function vali(id_rol){
var valores=DWRUtil.getValue(""+id_rol+"");
if(valores==0){
    va[id_rol]=0;
}
      else{ 
          va[id_rol]=1;
	}

if((va[0]==1)&&(va[1]==1)&&(va[2]==1)&&(va[3]==1)&&(va[4]==1)&&(va[5]==1)&&(va[6]==1)&&(va[7]==1)&&(va[8]==1)&&(va[9]==1)&&(va[10]==1)){
DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='Insertar();'>");
	sval=1;
}
     else{
      DWRUtil.setValue("mili","");
     }

}
