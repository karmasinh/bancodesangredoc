function fechas()
{
var mes=new Array(12);
mes[0]="Enero";
mes[1]="Febrero";
mes[2]="Marzo";
mes[3]="Abril";
mes[4]="Mayo";
mes[5]="Junio";
mes[6]="Julio";
mes[7]="Agosto";
mes[8]="Septiembre";
mes[9]="Octubre";
mes[10]="Noviembre";
mes[11]="Diciembre";

today=new Date();
dia=today.getDate();
anno=today.getYear()+1900;
var a=dia+" de "+mes[today.getMonth()]+" del "+anno;
document.getElementById("fecha_a").innerHTML = a;
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
setTimeout("horas()",1000);
}

function Listar()
{
alert('hola');
fechas();
horas();
ListaKardexDAO.cont(mostrar);
ListaKardexDAO.cont1(mostrar1);
ListaKardexDAO.cont2(mostrar2);
ListaKardexDAO.cont3(mostrar3);

ListaKardexDAO.cont4(mostrar4);
ListaKardexDAO.cont6(mostrar6);
ListaKardexDAO.cont7(mostrar7);
ListaKardexDAO.cont8(mostrar8);
ListaKardexDAO.cont9(mostrar9);
ListaKardexDAO.cont10(mostrar10);
ListaKardexDAO.cont11(mostrar11);
ListaKardexDAO.cont12(mostrar12);
ListaKardexDAO.cont13(mostrar13);
ListaKardexDAO.cont14(mostrar14);
ListaKardexDAO.cont15(mostrar15);
ListaKardexDAO.cont16(mostrar16);

ListaKardexDAO.cont17(mostrar17);
ListaKardexDAO.cont18(mostrar18);
ListaKardexDAO.cont19(mostrar19);
ListaKardexDAO.cont20(mostrar20);
ListaKardexDAO.cont21(mostrar21);
ListaKardexDAO.cont22(mostrar22);


ListaKardexDAO.cont23(mostrar23);
ListaKardexDAO.cont24(mostrar24);
ListaKardexDAO.cont25(mostrar25);
ListaKardexDAO.cont26(mostrar26);
ListaKardexDAO.cont27(mostrar27);
ListaKardexDAO.cont28(mostrar28);
ListaKardexDAO.cont29(mostrar29);
ListaKardexDAO.cont30(mostrar30);
ListaKardexDAO.cont31(mostrar31);
ListaKardexDAO.cont32(mostrar32);
ListaKardexDAO.cont33(mostrar33);
ListaKardexDAO.cont34(mostrar34);
ListaKardexDAO.cont35(mostrar35);
ListaKardexDAO.cont000(mostrar000);
ListaKardexDAO.cont111(mostrar111);
ListaKardexDAO.cont222(mostrar222);
ListaKardexDAO.cont333(mostrar333);
ListaKardexDAO.cont444(mostrar444);
ListaKardexDAO.cont666(mostrar666);
ListaKardexDAO.cont777(mostrar777);
ListaKardexDAO.cont313(mostrar313);
ListaKardexDAO.cont122(mostrar122);
 }
 
function mostrar(data)
{
document.getElementById("total1").innerHTML = data;
}

function mostrar1(data)
{
document.getElementById("total2").innerHTML = data;
}

function mostrar2(data)
{
document.getElementById("total3").innerHTML = data;
}

function mostrar3(data)
{
document.getElementById("total4").innerHTML = data;
}

function mostrar4(data)
{
document.getElementById("total5").innerHTML = data;
}


function mostrar6(data)
{
document.getElementById("total6").innerHTML = data;
}

function mostrar7(data)
{
document.getElementById("total7").innerHTML = data;
}

function mostrar8(data)
{
document.getElementById("total8").innerHTML = data;
}

function mostrar9(data)
{
document.getElementById("total9").innerHTML = data;
}
  
function mostrar10(data)
{
document.getElementById("total10").innerHTML = data;
}

function mostrar11(data)
{
document.getElementById("total11").innerHTML = data;
}

function mostrar12(data)
{
document.getElementById("total12").innerHTML = data;
}

function mostrar13(data)
{
document.getElementById("total13").innerHTML = data;
}

function mostrar14(data)
{
document.getElementById("total14").innerHTML = data;
}

function mostrar15(data)
{
document.getElementById("total15").innerHTML = data;
}

function mostrar16(data)
{
document.getElementById("total16").innerHTML = data;
}



function mostrar17(data)
{
document.getElementById("total17").innerHTML = data;
}

function mostrar18(data)
{
document.getElementById("total18").innerHTML = data;
}

function mostrar19(data)
{
document.getElementById("total19").innerHTML = data;
}

function mostrar20(data)
{
document.getElementById("total20").innerHTML = data;
}

function mostrar21(data)
{
document.getElementById("total21").innerHTML = data;
}

function mostrar22(data)
{
document.getElementById("total22").innerHTML = data;
}

function mostrar23(data)
{
document.getElementById("total23").innerHTML = data;
}

function mostrar24(data)
{
document.getElementById("total24").innerHTML = data;
}

function mostrar25(data)
{
document.getElementById("total25").innerHTML = data;
}

function mostrar26(data)
{
document.getElementById("total26").innerHTML = data;
}

function mostrar27(data)
{
document.getElementById("total27").innerHTML = data;
}

function mostrar28(data)
{
document.getElementById("total28").innerHTML = data;
}

function mostrar29(data)
{
document.getElementById("total29").innerHTML = data;
}

function mostrar30(data)
{
document.getElementById("total30").innerHTML = data;
}

function mostrar31(data)
{
document.getElementById("total31").innerHTML = data;
}

function mostrar32(data)
{
document.getElementById("total32").innerHTML = data;
}
function mostrar33(data)
{
document.getElementById("total33").innerHTML = data;
}

function mostrar34(data)
{
document.getElementById("total34").innerHTML = data;
}

function mostrar35(data)
{
document.getElementById("total35").innerHTML = data;
}

function mostrar000(data)
{
document.getElementById("total000").innerHTML = data;
}

function mostrar111(data)
{
document.getElementById("total111").innerHTML = data;
}


function mostrar222(data)
{
document.getElementById("total222").innerHTML = data;
}
function mostrar333(data)
{
document.getElementById("total333").innerHTML = data;
}
function mostrar444(data)
{
document.getElementById("total444").innerHTML = data;
}

function mostrar666(data)
{
document.getElementById("total666").innerHTML = data;
}
function mostrar777(data)
{
document.getElementById("total777").innerHTML = data;
}

function mostrar313(data)
{
document.getElementById("total313").innerHTML = data;
}

function mostrar122(data)
{
document.getElementById("total122").innerHTML = data;
}
