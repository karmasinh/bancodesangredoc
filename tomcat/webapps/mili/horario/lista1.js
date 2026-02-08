function listar()
{
DWRUtil.removeAllRows("campos");
$(lista).style.display='';   
$(lista1).style.display='none';   
NuevoPersonalDAO.listaPersonal1(conteo1);
NuevoPersonalDAO.countHorario(valorcito);
fechas();
}
function valorcito(data)
{
DWRUtil.setValue("w",data);
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
$(lista).style.display='none';
$(lista1).style.display='';
DWRUtil.setValue("cod_per3",cod_per);
DWRUtil.setValue("nom",nom);
DWRUtil.setValue("apepa",apepa);
ListaExtraDAO.horario(conteo);
}

var id_horario = 	function(data) { return data.id_horario };
var semana = 	function(data) { return data.semana };
var hrs_entrada = 	function(data) { return data.hrs_entrada };
var hrs_salida = 	function(data) { return data.hrs_salida };


function conteo(data){
  aux=1;                        
  DWRUtil.addRows("campos1",data,[id_horario,hrs_entrada,hrs_salida,semana,hola],{
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
var gel=new Array(7);
var j=1;

var hola= function(data) {
gel[j]=data.id_horario;
j++; 
      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_horario+"");
      input.setAttribute("onblur","vali("+data.id_horario+");");
      return input;                             

};

function insertar() {
var cod_per=DWRUtil.getValue("cod_per3");
var valor = DWRUtil.getValue("fecha_a" );
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_a=anyo+'-'+mes+'-'+dia;
var w=DWRUtil.getValue("w");
for(i=1;i<w;i++){
    var valores=DWRUtil.getValue( ""+gel[i]+"");
   // alert(valores+"el valor"+i);
    if(valores!=false){
    NuevoPersonalDAO.InsertarAsiste(Resultado,gel[i],cod_per,fecha_a);
    }
}
}

function Resultado(){
$(lista).style.display='none';
$(lista1).style.display='none';
$(lista2).style.display='';
}

var va=new Array(20);
    for(i=0;i<=10;i++) va[i]=1;

function vali(id_horario){
var valores=DWRUtil.getValue(""+id_horario+"");
if(valores==0){
    va[id_horario]=0;
}
      else{ 
          va[id_horario]=1;
	}

if((va[0]==1)&&(va[1]==1)&&(va[2]==1)&&(va[3]==1)&&(va[4]==1)&&(va[5]==1)&&(va[6]==1)&&(va[7]==1)&&(va[8]==1)&&(va[9]==1)&&(va[10]==1)){
DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>");
	sval=1;
}
     else{
      DWRUtil.setValue("mili","");
     }

}
function fechas()
{
var m=new Array(12);
m[0]="01";
m[1]="02";
m[2]="03";
m[3]="04";
m[4]="05";
m[5]="06";
m[6]="07";
m[7]="08";
m[8]="09";
m[9]="10";
m[10]="11";
m[11]="12";

today=new Date();
dia=today.getDate();
anno=today.getYear()+1900;
var a=dia+"-"+m[today.getMonth()]+"-"+anno;
//document.getElementById("fecha").innerHTML = a;
DWRUtil.setValue("fecha_a",a);
}  
