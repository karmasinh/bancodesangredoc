// INICIO VALIDACION
// FIN VALIDACION
/// SEGUNDA VALIDACOIN///////////


var v81 = '1';
var v82 = '1';
var v83 = '1';
var v84 = '1';
var v85 = '1';
var v86 = '1';
var v87 = '1';
var v88 = '1';
var v89 = '1';
function vali(){
     if ( (v81=='0')&&(v82=='0')&&(v83=='0')&&(v84=='0')&&(v85=='0')&&(v86=='0')&&(v87=='0')&&(v88=='0')){
      DWRUtil.setValue("agregar12"," <input type='image' src='../imagenes/aceptar.png' onclick='insertarEF();'>"); 
     }  
     else{
      DWRUtil.setValue("agregar12","");
     }
}
                                 
function validarEntero111(){v81 =validarReales("sistolica",	  "EmSi",        "*");vali();}
function validarEntero112(){v82 =validarReales("diastolica",	  "EmDi",        "*");vali();}
function validarEntero113(){v83 =validarReales("pulso",	  	  "EmPu",        "*");vali();}
function validarEntero114(){v84 =validarReales("peso",		  "EmPe",        "*");vali();}
function validarEntero115(){v85 =validarReales("talla",		  "EmTa",        "*");vali();}
function validarEntero116(){v86 =validarReales("temperatura",	  "EmTe",        "*");vali();}
function validarCombos111(){v87 =validarCombo ("tipo_do",	  "EmCom",       "*");vali();}
function validarCombos112(){v88 = validarCombo("veces",		  "EmComb",      "*");vali();}

function validarFechae()   {v89 = validarFecha("fecha_a",  	  "EmFechae",    "*");vali();}
function validarFechae2(){
     if ( DWRUtil.getValue( "fecha_a")!=""  ) v89 = validarFecha ("fecha_a",  "EmFechae",   "*");
     vali();
}

/*//////////////// PRIMERA procedimiento*/

//////////////////////////////////////////////////////////



function insertarEF()
{
    var valor = DWRUtil.getValue("fecha_a" );
    var dia  = valor.split("-")[0];
    var mes  = valor.split("-")[1];
    var anyo = valor.split("-")[2];
    var fecha_a=anyo+'-'+mes+'-'+dia;
    var hora_a=DWRUtil.getValue("hora_a");
    var id_aten=DWRUtil.getValue("id_aten");
    var tipo_do=DWRUtil.getValue("tipo_do");
    var veces=DWRUtil.getValue("veces");
    var cod_do=DWRUtil.getValue("cod_do");
    var sistolica=DWRUtil.getValue("sistolica");
    var diastolica=DWRUtil.getValue("diastolica");
    var pulso=DWRUtil.getValue("pulso");
    var peso=DWRUtil.getValue("peso");
    var talla=DWRUtil.getValue("talla");
    var temperatura=DWRUtil.getValue("temperatura");
    var atendido=DWRUtil.getValue("atendido");
    var atendidop=DWRUtil.getValue("atendidop");
    var atendidoh=DWRUtil.getValue("atendidoh");
    var atendidos=DWRUtil.getValue("atendidos");
    var atendidoe=DWRUtil.getValue("atendidoe");
    NuevoDAO.adicionarEF(insertarDatosEF,fecha_a,hora_a,id_aten,tipo_do,veces,cod_do,sistolica,diastolica,pulso,peso,talla,temperatura,atendido,atendidop,atendidoh,atendidos,atendidoe);
}
function insertarDatosEF()
{
$("avisoEF").style.display='';
$("aviso").style.display='none';

$("formulario").style.display='none';
$("formulario_examenFisico").style.display='none';

//$("resultado-todo7").style.display='none';
//$("resultado-todo5").style.display='none';
//$("resultado-todo4").style.display='none';
//$("resultado-todo3").style.display='none';
//$("resultado-todo2").style.display='none';
//$("resultado-todo2_2").style.display='none';
//$("resultado-todo1").style.display='none';
//$("resultado-todo").style.display='none';

}



  

////*************PRIMERA PAGINA****************////////
///////////////****************fecha*/////////////////////
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
