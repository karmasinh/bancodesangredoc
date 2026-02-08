// INICIO VALIDACION
var v3 = '0';
var v4 = '1';
var v5 = '1';
var v6 = '1';
var v7 = '1';
var v8 = '0';
var v9  = '0';
var v10 = '1';
var v11 = '1';
var v12 = '1';
var v13 = '0';
var v14 = '0';
var v15 = '0';
var v16 = '0';
var v17 = '0';
var v18 = '0';
var v19 = '0';
var v20 = '0';
var v21 = '0';
var v22 = '0';
var v23 = '0';
var v24 = '0';
var v25 = '0';
var v26 = '0';
var v27 = '0';
var v28 = '1';
var v290 = '1';
var v300 = '1';
var v310 = '1';
var v320 = '1';
var v311 = '1';

function validarDomicilio(){ 
    if (v18=='0'){
      DWRUtil.setValue("num1","<input id='num' onBlur='validarEntero5();'>");



     }  
     else{
      DWRUtil.setValue("num1","");
     }
}


function validar(){
//     if ( (v4=='0')&&(v5=='0')&&(v6=='0')&&(v7=='0')&&(v8=='0')&&(v9=='0')&&(v10=='0')&&(v11=='0')&&(v12=='0')&&(v13=='0')&&(v14=='0')&&(v15=='0')&&(v16=='0')&&(v17=='0')&&(v18=='0')&&(v19=='0')&&(v20=='0')&&(v21=='0')&&(v22=='0')&&(v23=='0')&&(v24=='0')&&(v25=='0')&&(v26=='0')&&(v27=='0')&&(v28=='0') ){
    // if ( (v4=='0')&&(v5=='0')&&(v6=='0')&&(v7=='0')&&(v9=='0')&&(v10=='0')&&(v11=='0')&&(v12=='0')&&(v28=='0')&&(v311=='0') ){
     if ( (v4=='0')&&(v5=='0')&&(v6=='0')&&(v7=='0')&&(v8=='0')&&(v9=='0')&&(v10=='0')&&(v11=='0')&&(v12=='0')&&(v13=='0')&&(v14=='0')&&(v15=='0')&&(v16=='0')&&(v17=='0')&&(v18=='0')&&(v19=='0')&&(v20=='0')&&(v21=='0')&&(v22=='0')&&(v23=='0')&&(v24=='0')&&(v25=='0')&&(v26=='0')&&(v27=='0')&&(v28=='0')&&(v311=='0') ){ 
     DWRUtil.setValue("agregar","<input type='submit' value='Agregar' onclick='insertar();'>");
     }  
     else{
      DWRUtil.setValue("agregar","");
     }
}

function validartodo( valorCampo, spanCampo, mensaje  ){
     var valor = DWRUtil.getValue( valorCampo );
     var ce='1';
     if ( valor=="" ){
         DWRUtil.setValue(spanCampo, ""); 
          ce='0';
     }
     else{
    
          ce='1';
     }
     return ce;
}

function mostrarContarCi(data){
    if ( data > 1 ){
    DWRUtil.setValue("EmCi","<pre><font color='red'><b>*    ci existente</b></font></pre>");
    v9='1';
    }else{
     DWRUtil.setValue("EmCi"," ");
     v9='0';
     }
}
function validarEntero()
{  
 v9= validartodo("ci", "EmCi","*");
    if(v9=='1')
    { 
	v9 = validarNumero("ci", "EmCi", "*");validar();
	if (v9=='0'){

       var ci = DWRUtil.getValue("ci"); 
       NuevoDAO.contCi( mostrarContarCi, ci );
	}
    }
}


function validarCadena(){  v4 = validarString("nom",	  	  "EmN",        "*");validar();}
function validarCadena1(){v5 = validarString("apepa",	   	  "EmA",        "*");validar();}
function validarCadena2(){
       v6 = validarString("apema",	   	  "EmAp",       "*");
       validar();
       DWRUtil.setValue("cod_do",DWRUtil.getValue("nom").charAt(0)+DWRUtil.getValue("apepa").charAt(0)+DWRUtil.getValue("apema").charAt(0)+"-"+DWRUtil.getValue("id_per"));
}
function validarCadena3(){ v7 = validarString1("cod_do",   	  "EmC",        "*");validar();}
function validarCadena4(){v8= validartodo("pasaporte",	  "EmP",        "*"); 		if(v8=='1'){ v8 = validarString1("pasaporte",	  "EmP",        "*");}}
//function validarEntero(){ v9= validartodo("ci",        	  "EmCi",       "*"); 			if(v9=='1'){ v9 = validarNumero("ci",        	  "EmCi",       "*");validar();}}
function validarCombos(){ v10 = validarCombo ("sexo",      	  "EmCombos",   "*");validar();}
function validarCombos1(){ v11= validarCombo ("tipo_proce",	  "EmCombos1",  "*");validar();}
function validarCadena5(){ v12 = validarString("calle_residencia","EmCa",       "*");validar();}
function validarEntero1(){v13= validartodo("num",        	  "EmNum",      "*"); 			if(v13=='1'){ v13 = validarNumero("num",        	  "EmNum",      "*");}}
function validarCadena6(){v14= validartodo("zona",	 	  "EmZo",       "*"); 			if(v14=='1'){ v14 = validarString("zona",	 	  "EmZo",       "*");}}
function validarEntero3(){v15= validartodo("cel",        	  "EmCel",      "*"); 			if(v15=='1'){ v15 = validarNumero("cel",        	  "EmCel",      "*");}}
function validarEmail1(){ v16= validartodo("email",	 	  "EmE",        "*"); 			if(v16=='1'){ v16 = validarEmail("email",	 	  "EmE",        "*");}}
function validarEntero4(){v17= validartodo("fono_vec",     	  "EmFov",      "*"); 		if(v17=='1'){ v17 = validarNumero("fono_vec",     	  "EmFov",      "*");}}
function validarCadena7(){v18= validartodo("lugar_tra", 	  "EmLu",       "*"); 		if(v18=='1'){ v18 = validarString("lugar_tra", 	  "EmLu",       "*");}}
function validarCadena8(){v19= validartodo("calle_residencia","EmCare",     "*"); 	if(v19=='1'){ v19 = validarString("calle_residencia","EmCare",     "*");}}
function validarEntero5(){v20= validartodo("num",        	  "EmNu",       "*"); 			if(v20=='1'){ v20 = validarNumero("num",        	  "EmNu",       "*");}}
function validarEntero6(){v21= validartodo("fono_tra",     	  "EmFt",       "*"); 		if(v21=='1'){ v21 = validarNumero("fono_tra",     	  "EmFt",       "*");}}
function validarCadena9(){v22= validartodo("fono_tra",     	  "EmFt",       "*"); 			if(v22=='1'){ v22 = validarString("zona",		  "EmZ",        "*");}}
function validarCadena10(){v23= validartodo("fax",		  "EmFa",       "*"); 			if(v23=='1'){v23 = validarString("fax",		  "EmFa",       "*");}}
function validarCadena11(){v24= validartodo("casilla",	  "EmCasi",     "*"); 		if(v24=='1'){v24 = validarString("casilla",	  "EmCasi",     "*");}}
function validarCadena12(){v25= validartodo("prof",		  "EmProf",     "*"); 			if(v25=='1'){v25 = validarString("prof",		  "EmProf",     "*");}}
function validarCadena13(){v26= validartodo("ocu",		  "EmOcu",      "*"); 			if(v26=='1'){v26 = validarString("ocu",		  "EmOcu",      "*");}}
function validarEntero2(){ v27= validartodo("fono_pro",        "EmFo",       "*"); 		if(v27=='1'){v27 = validarNumero("fono_pro",        "EmFo",       "*");}}
function validarCadena44(){v28 = validarString("procedencia",	  "EmPro",      "*");validar();}

function validarCombos290(){ v290 = validarCombo ("dia",	  "EmDiaA",  "*");validar232();cambiar12();}
function validarCombos300(){ v300 = validarCombo ("mes",	  "EmMesA",  "*");validar232();cambiar12();}
function validarEntero310(){ v310 = validarNumero("ano",     	  "EmAnoA",  "*");validar232();cambiar12();}
//function validarFechas(){ v311 = validarFecha("fecha_naci",   "EmFF",  "*");}

function cambiar12(){ 
    if ((v290=='0')&&(v300=='0')&&(v310=='0')){ 
    fecha_a= new Date();
    dia_a=fecha_a.getDate();
    mes_a=fecha_a.getMonth();
    ano_a=fecha_a.getYear()+1900;
     var dia3 = parseInt(dia_a);
     var mes3 = parseInt(mes_a);
     var ano3 = parseInt(ano_a);
     var a=DWRUtil.getValue( "dia");
     var m=DWRUtil.getValue( "mes");
     var n=DWRUtil.getValue( "ano");
     var dia2 = parseInt(a);
     var mes2 = parseInt(m);
     var ano2 = parseInt(n);
    if ((ano2+17) < ano3)
    { 
    v311 = validarFecha("fecha_naci",   "EmFF",  "*");
    cambiar();
    var edad=parseInt(DWRUtil.getValue("uno"));
    if ((edad <='17')||(edad >= '46')){
    alert("Donante No Apto");
    //var p='t';
    DWRUtil.setValue(ano, "");
    }
    }
    else{ 
    alert("Donante No Apto");
    //var p='t';
    DWRUtil.setValue(ano, "");    
    }
    }
    }


function validar232(){

     if ((v290=='0')&&(v300=='0')&&(v310=='0'))
     {
     var a=DWRUtil.getValue( "dia");
     var m=DWRUtil.getValue( "mes");
     var n=DWRUtil.getValue( "ano");
     var fecha_naci1=a+'-'+m+'-'+n;
     document.getElementById("fecha_naci").innerHTML = fecha_naci1;     
     }
}



/*//////////////// PRIMERA-----------------------------*/
function cambiar()
{
/*var c=DWRUtil.getValue("fecha_naci");
var total="";
var p="";
var i=0;

var dia1="";
var ano="";
var mes="";

while(i<10)
{
if ((c[i]!="-") && (i<2))
{dia1=dia1+c[i];
i=i+1;
}
else
{
if (i>=5)
{i=i+1;
ano=ano+c[i];
}
else
{
if ( (i >= 2) && (i<5) )
{i=i+1;
mes=mes+c[i];}
}
}
}
*/
/*
dia1  = valor.split("-")[0];
mes  = valor.split("-")[1];
ano = valor.split("-")[2];
*/
 var dia1=DWRUtil.getValue( "dia");
 var mes=DWRUtil.getValue( "mes");
 var ano=DWRUtil.getValue( "ano");
var ano1 = 0;
var mes2 = parseInt(mes);
var dia2 = parseInt(dia1);
fecha_a= new Date();
dia_a=fecha_a.getDate();
mes_a=fecha_a.getMonth();
ano_a=fecha_a.getYear()+1900;

if (parseInt(ano) == parseInt(ano_a))
{var ap=0;
document.getElementById("uno").innerHTML =ap;}
else
{
    if (parseInt(ano)< parseInt(ano_a))
    {
	if (parseInt(mes2) < parseInt(mes_a))
	{ano1 = parseInt(ano_a)-parseInt(ano);
	document.getElementById("uno").innerHTML = ano1;}

	else
	{
	    if (parseInt(mes2) > parseInt(mes_a))
	    {
	    ano1 = parseInt(ano_a)-parseInt(ano);
	    var ano2 = ano1-1;
//	    alert("hola");
	    document.getElementById("uno").innerHTML = ano2;}

	    else
	    {
		if (parseInt(mes2) == parseInt(mes_a))
		{	    
    		if (dia2 <= parseInt(dia_a)) 
		{ano1 = parseInt(ano_a)-parseInt(ano);
		document.getElementById("uno").innerHTML = ano1;}

		else
		{ano1 = parseInt(ano_a)-parseInt(ano);
		ano1 = ano1-1;
		document.getElementById("uno").innerHTML = ano1;}
		}
	    }
	}
    }
  } 
}

function horas()
{  
var timeday;
var horas;
today=new Date();
sec=today.getSeconds();
hr=today.getHours();
min=today.getMinutes();

if(hr<12){timeday="AM";}
else {timeday="PM";}
if (hr>12) hr=hr-12;
if (hr<=9) hr="0"+hr;
if (min<=9) min="0"+min;
if (sec<=9) sec="0"+sec;
horas=hr+":"+min+":"+sec+timeday;
document.getElementById("hora_a").innerHTML =horas;
//document.relojito.hora_a.value=horas;
setTimeout("horas()",1000);
}


function mostrar(data)
{document.getElementById("total").innerHTML = data;}

function visualizar(){
$("aviso").style.display='none';
$("formulario").style.display='none';
$("formulario_examenFisico").style.display='';
horas();
conteo1();
}

function insertar()
{
var dia1=DWRUtil.getValue( "dia");
var mes=DWRUtil.getValue( "mes");
var ano=DWRUtil.getValue( "ano");

var fecha_naci=ano+'-'+mes+'-'+dia;
var edad=DWRUtil.getValue("uno");
var nom=DWRUtil.getValue("nom");
var apepa=DWRUtil.getValue("apepa");
var apema=DWRUtil.getValue("apema");
var ci=DWRUtil.getValue("ci");
var prof=DWRUtil.getValue("prof");
var ocu=DWRUtil.getValue("ocu");
//var fecha_naci=DWRUtil.getValue("fecha_naci");
var sexo=DWRUtil.getValue("sexo");
var casilla=DWRUtil.getValue("casilla");
var lugar_tra=DWRUtil.getValue("lugar_tra");
var pasaporte=DWRUtil.getValue("pasaporte");
var fax=DWRUtil.getValue("fax");
var procedencia=DWRUtil.getValue("procedencia");
var email=DWRUtil.getValue("email");

var cod_do = DWRUtil.getValue("cod_do");

var fono_pro=DWRUtil.getValue("fono_pro");
var cel=DWRUtil.getValue("cel");
var fono_vec=DWRUtil.getValue("fono_vec");
var fono_tra=DWRUtil.getValue("fono_tra");

var calle_residencia =DWRUtil.getValue("calle_residencia");
var num=DWRUtil.getValue("num");
var zona=DWRUtil.getValue("zona");

var calle_residenciat =DWRUtil.getValue("calle_residenciat");
var numt=DWRUtil.getValue("numt");
var zonat=DWRUtil.getValue("zonat");

var tipo_dom=DWRUtil.getValue("tipo_dom");
var tipo_domt=DWRUtil.getValue("tipo_domt");
/*
var fecha_a=DWRUtil.getValue("fecha_a");
var hora_a=DWRUtil.getValue("hora_a");
var id_aten=DWRUtil.getValue("id_aten");
var tipo_do=DWRUtil.getValue("tipo_do");
var veces=DWRUtil.getValue("veces");*/
NuevoDAO.adicionarPersona(insertarDatos,edad,nom,apepa,apema,ci,prof,ocu,fecha_naci,sexo,casilla,lugar_tra,pasaporte,fax,procedencia,email,cod_do,fono_pro,cel,fono_vec,fono_tra,calle_residencia,num,zona,tipo_dom,tipo_domt,calle_residenciat,numt,zonat);
//NuevoDAO.adicionarPersona(insertarDatos,nom,apepa,apema,ci,prof,ocu,fecha_naci,sexo,casilla,lugar_tra,pasaporte,fax,procedencia,email,cod_do,fono_pro,cel,fono_vec,fono_tra,calle_residencia,num,zona,tipo_dom,tipo_domt,fecha_a,hora_a,id_aten,tipo_do,veces);
}

function insertarDatos()
{
$(aviso).style.display='';
$(formulario).style.display='none';
}
function conteo()
{
$(aviso).style.display='none';
NuevoDAO.countRegistro_datos(conteoDatos);
NuevoDAO.countpersonal(conteoDatos1);
}
function conteoDatos(data) {
//var ID_PER ={id_per1:data,id_aten:data};
alert(data);
DWRUtil.setValue("id_per",data);
// DWRUtil.setValue("id_per",data);  
//document.getElementById("id_per").innerHTML = data;
}

function conteoDatos1(data) {
//var ID_PER ={id_per1:data,id_aten:data};
//alert(data);
DWRUtil.setValue("cod_per",data);
// DWRUtil.setValue("id_per",data);  
//document.getElementById("id_per").innerHTML = data;
}

function conteo1()
{
    NuevoDAO.countRegistro(conteoDatos1);
}
function conteoDatos1(data) {
    document.getElementById("id_aten").innerHTML = data;
}


////*************PRIMERA PAGINA****************////////
