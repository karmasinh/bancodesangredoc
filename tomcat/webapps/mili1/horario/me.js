var id_horario = 	function(data) { return data.id_horario };
var semana = 	function(data) { return data.semana };
var hrs_entrada = 	function(data) { return data.hrs_entrada };
var hrs_salida = 	function(data) { return data.hrs_salida };

function listar(){
$("modificar").style.display ='none';
$("lista").style.display ='';
$("aceptar").style.display ='none';
ListaExtraDAO.horario(conteo1);
}
var P = function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src","../imagenes/modificar.png");
      input.setAttribute("onclick","listarE('"+data.id_horario+"','"+data.semana+"');");
      return input;
};
function conteo1(data){
  aux=1;                        
  DWRUtil.addRows("campos",data,[id_horario,hrs_entrada,hrs_salida,semana,P],{
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
function listarE(id_horario,semana){
document.getElementById("sem").innerHTML = semana;
document.getElementById("sem1").innerHTML = semana;
DWRUtil.setValue("id_horario",id_horario);
DWRUtil.setValue("semanak",semana);
$("lista").style.display ='none';
$("modificar").style.display ='';
$("aceptar").style.display ='';
ListaExtraDAO.horario1(conteo2,id_horario);
semana1();
//ListaExtraDAO.horario1(conteo3,id_horario);
}
function conteo2(data){
  aux=1;                        
  DWRUtil.addRows("campos55",data,[entradah,entradam,salidah,salidam],{
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

function conteo3(data){
  aux=1;                        
  DWRUtil.addRows("campos55",data,[entradah,entradam],{
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

var entradah = function(data) {
    var hh=data.hrs_entrada
    horas2  = hh.split(":")[0];
    minutos2  =hh.split(":")[1];
    var input="<select id='hora_e'><option  value="+horas2+">"+horas2+"</option><option value=01>01</option><option value=02>02</option><option value=03>03</option><option value=04>04</option><option value=05>05</option><option value=06>06</option><option value=07>07</option><option value=08>08</option><option value=09>09</option><option value=10>10</option><option value=11>11</option><option value=12>12</option><option value=13>13</option><option value=14>14</option><option value=15>15</option><option value=16>16</option><option value=17>17</option><option value=18>18</option><option value=19>19</option><option value=20>20</option><option value=21>21</option><option value=22>22</option><option value=23>23</option><option value=24>24</option></select>";
return input;                             
}

var entradam = function(data) {
    var hu=data.hrs_entrada
    horas2  = hu.split(":")[0];
    minutos2  =hu.split(":")[1];
    var input="<select id='min_e'><option  value="+minutos2+">"+minutos2+"</option><option value=00>00</option><option value=05>05</option><option value=10>10</option><option value=15>15</option><option value=20>20</option><option value=25>25</option><option value=30>30</option><option value=30>35</option><option value=30>40</option><option value=31>45</option><option value=30>50</option><option value=30>55</option><option value=31>60</option></select>";
return input;                             
}

var salidah = function(data) {
var h=data.hrs_salida
horas  = h.split(":")[0];
minutos  =h.split(":")[1];
var input="<select id='hora_s'><option  value="+horas+">"+horas+"</option><option value=01>01</option><option value=02>02</option><option value=03>03</option><option value=04>04</option><option value=05>05</option><option value=06>06</option><option value=07>07</option><option value=08>08</option><option value=09>09</option><option value=10>10</option><option value=11>11</option><option value=12>12</option><option value=13>13</option><option value=14>14</option><option value=15>15</option><option value=16>16</option><option value=17>17</option><option value=18>18</option><option value=19>19</option><option value=20>20</option><option value=21>21</option><option value=22>22</option><option value=23>23</option><option value=24>24</option></select>";
return input;                             
}
var salidam = function(data) {
var h=data.hrs_salida
horas  = h.split(":")[0];
minutos  =h.split(":")[1];
var input="<select id='min_s'><option  value="+minutos+">"+minutos+"</option><option value=00>00</option><option value=05>05</option><option value=10>10</option><option value=15>15</option><option value=20>20</option><option value=25>25</option><option value=30>30</option><option value=30>35</option><option value=30>40</option><option value=31>45</option><option value=30>50</option><option value=30>55</option><option value=31>60</option></select>";
return input;                             
}


function semana1() {
var semana=DWRUtil.getValue(semanak);
if((semana=="Lunes a Viernes")||(semana=="Lunes a Jueves")||(semana=="Lunes a Sabado")||(semana=="Lunes a Domingo"))
{$("semana").style.display ='';}
else
{$("semana1").style.display ='';}
}
////////////////////////
var wa='';
var t='';
function modi()
{
var semana=DWRUtil.getValue("semanak");
var s3=DWRUtil.getValue("s3");
var s4=DWRUtil.getValue("s4");
var s5=DWRUtil.getValue("s5");
var s6=DWRUtil.getValue("s6");
var s7=DWRUtil.getValue("s7");
var s8=DWRUtil.getValue("s8");
var s9=DWRUtil.getValue("s9");
var s1=DWRUtil.getValue("s1");
var s2=DWRUtil.getValue("s2");

alert(s3);
if ((s1=="")||(s2=="")||(s3=="")||(s4=="")||(s5=="")||(s6=="")||(s7=="")||(s8=="")||(s9=="")){
//if (s3==""){
    alert('ya esta adentro');
    var t=semana;
    }

else{
    alert('ya esta en else');
    if ((semana=="Lunes a Viernes")||(semana=="Lunes a Jueves")||(semana=="Lunes a Miercoles")||(semana=="Lunes a Sabado")){
        alert('insertar1');
	insertar1();
	}
    else{
    var s3=DWRUtil.getValue( "s3");
    var s4=DWRUtil.getValue( "s4");
    var s5=DWRUtil.getValue( "s5");
    var s6=DWRUtil.getValue( "s6");
    var s7=DWRUtil.getValue( "s7");
    var s8=DWRUtil.getValue( "s8");
    var s9=DWRUtil.getValue( "s9");
//////////////////////////////////////solo uno
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s4;
    }
    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s5;
    }
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s6;
    }
    
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s7;
    }
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="")){
    t=s8;
    }
    
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="Domingo")){
    t=s9;
    }
    
//////////////////////////////////////solo dos lunes y..
    if ((s3=="Lunes")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s4;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s5;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s6;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s7;
    }
    
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="")){
    t=s3+'-'+s8;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="Domingo")){
    t=s3+'-'+s9;
    }
//////////////////////////////////////solo dos martes y..

    if ((s3=="")&&(s4=="Martes")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s4+'-'+s5;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s4+'-'+s6;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s4+'-'+s7;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="")){
    t=s4+'-'+s8;
    }
    
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="Domingo")){
    t=s4+'-'+s9;
    }

//////////////////////////////////////solo dos miercoles y..

    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s5+'-'+s6;
    }
    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s5+'-'+s7;
    }
    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="")){
    t=s5+'-'+s8;
    }
    
    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="")&&(s9=="Domingo")){
    t=s5+'-'+s9;
    }

//////////////////////////////////////solo dos jueves y..

    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s6+'-'+s7;
    }
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="Sabado")&&(s9=="")){
    t=s6+'-'+s8;
    }
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="Domingo")){
    t=s6+'-'+s9;
    }

//////////////////////////////////////solo dos viernes y..

    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="")){
    t=s7+'-'+s8;
    }
    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="Domindo")){
    t=s7+'-'+s9;
    }
////////////////////////////////////// tres lunes y..
    if ((s3=="Lunes")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s5+'-'+s7;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="Miercoles")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s5+'-'+s6;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s6+'-'+s7;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="")){
    t=s3+'-'+s7+'-'+s8;
    }
    
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s3+'-'+s8+'-'+s9;
    }
    if ((s3=="Lunes")&&(s4=="Martes")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s4+'-'+s6;
    }
    

//////////////////////////////////////solo tres martes y..


    if ((s3=="")&&(s4=="Martes")&&(s5=="Miercoles")&&(s6=="Jueves")&&(s7=="")&&(s8=="")&&(s9=="")){
    t=s4+'-'+s5+'-'+s6;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s4+'-'+s6+'-'+s7;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="")){
    t=s4+'-'+s7+'-'+s8;
    }
    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s4+'-'+s8+'-'+s9;
    }
//////////////////////////////////////solo tres miercoles y..

    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="")){
    t=s5+'-'+s7+'-'+s8;
    }
    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s5+'-'+s8+'-'+s9;
    }
    
//////////////////////////////////////solo tres jueves y..

    if ((s3=="")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s6+'-'+s8+'-'+s9;
    }

//////////////////////////////////////solo tres viernes y..

////////////////////////////////////// cuatro lunes y..
    if ((s3=="Lunes")&&(s4=="")&&(s5=="Miercoles")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="")&&(s9=="")){
    t=s3+'-'+s5+'-'+s6+'-'+s7;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="")){
    t=s3+'-'+s6+'-'+s7+'-'+s8;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s3+'-'+s7+'-'+s8+'-'+s9;
    }
    if ((s3=="Lunes")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="Viernes")&&(s8=="")&&(s9=="Domingo")){
    t=s3+'-'+s5+'-'+s7+'-'+s9;
    }
//////////////////////////////////////solo cuatro martes y..

    if ((s3=="")&&(s4=="Martes")&&(s5=="")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s4+'-'+s7+'-'+s8+'-'+s9;
    }
//////////////////////////////////////solo cuatro miercoles y..

    if ((s3=="")&&(s4=="")&&(s5=="Miercoles")&&(s6=="")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s5+'-'+s7+'-'+s8+'-'+s9;
    }
////////////////////////////////////// cinco lunes y..
    if ((s3=="Lunes")&&(s4=="")&&(s5=="")&&(s6=="Jueves")&&(s7=="Viernes")&&(s8=="Sabado")&&(s9=="Domingo")){
    t=s3+'-'+s6+'-'+s7+'-'+s8+'-'+s9;
    }
}
}    
    var h=DWRUtil.getValue( "hora_e");
    alert(h);
    var m=DWRUtil.getValue( "min_e");
    var hora_e=h+':'+m;

    var h1=DWRUtil.getValue( "hora_s");	
    var m1=DWRUtil.getValue( "min_s");
    var hora_s=h1+':'+m1;	

    p=p+1000;
    var id_horario=DWRUtil.getValue( "id_horario");
    setTimeout("ListaExtraDAO.modi_Horario(ya,'"+t+"','"+hora_e+"','"+hora_s+"',"+id_horario+")",p);
//    ListaExtraDAO.adi_Horario(yaesta,t,t1,t2);
}
var p=1;

function insertar1()
{
    var s1=DWRUtil.getValue( "s1");
    var s2=DWRUtil.getValue( "s2");
    var w=s1+' a '+s2;
    var h=DWRUtil.getValue( "hora_e");
    var m=DWRUtil.getValue( "min_e");
    var w1=h+':'+m;

    var h1=DWRUtil.getValue( "hora_s");	
    var m1=DWRUtil.getValue( "min_s");
    var w2=h1+':'+m1;	

    var id_horario=DWRUtil.getValue( "id_horario");
    ListaExtraDAO.modi_Horario(ya,w,w1,w2,id_horario);
}

function ya(){
$("lista").style.display ='none';
$("modificar").style.display ='none';
$("semana").style.display ='none';
$("semana1").style.display ='none';
//$("semana2").style.display ='none';
$("aceptar").style.display ='none';
$("adios").style.display ='';
}

function sacar(){
$("semana").style.display='none';
$("semana1").style.display='';
}
function sacar1(){
$("semana").style.display='';
$("semana1").style.display='none';
}