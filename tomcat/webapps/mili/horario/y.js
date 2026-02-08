function Listar(){
$("horario").style.display='';
$("horario1").style.display='';
$("semana").style.display='';
$("avisoEF").style.display='none';
ListaExtraDAO.conta(unoo);
}
function unoo(data) {
    document.getElementById("pp").innerHTML = data;
}


//////////////////////////////////////////////////////////
var wa='';
var u='';
function insertar()
{
var otro=DWRUtil.getValue( "otro");
var h3=DWRUtil.getValue( "h3");
var m4=DWRUtil.getValue( "m4");
var w1=h3+':'+m4;
var h55=DWRUtil.getValue( "h5");
var m66=DWRUtil.getValue( "m6");
var w2=h55+':'+m66;

    if (otro=='1'){
    var cadena="";
    var semana=new Array(7);
        semana[0]=DWRUtil.getValue( "s3");
	semana[1]=DWRUtil.getValue( "s4");
	semana[2]=DWRUtil.getValue( "s5");
	semana[3]=DWRUtil.getValue( "s6");
	semana[4]=DWRUtil.getValue( "s7");
	semana[5]=DWRUtil.getValue( "s8");
	semana[6]=DWRUtil.getValue( "s9");
//////////////////////////////////////solo uno
var cargar=false;    
for(i=0;i<7;i++){
    if((semana[i]!=false)&&(cargar==true)){
    cadena=cadena+"-"+semana[i];
    }
    if((semana[i]!=false)&&(cargar==false)){  
    cadena=semana[i];
    cargar=true;
    }
    }
    var w=cadena;
    }
    else{
    var s1=DWRUtil.getValue( "s1");
    var s2=DWRUtil.getValue( "s2");
    var w=s1+' a '+s2;
    }
ListaExtraDAO.adi_Horario(yaesta,w,w1,w2);
}
var p=1;

function insertar1()
{
}

function yaesta(data)
{
$("aceptar").style.display='none';
$("semana").style.display='none';
$("semana1").style.display='none';
$("horario").style.display='none';
$("horario1").style.display='none';
$("avisoEF").style.display='';
}



function sacar()
{
$("semana").style.display='none';
$("semana1").style.display='';
DWRUtil.setValue("otro","1");
}
function volver()
{
$("semana").style.display='';
$("semana1").style.display='none';
}


