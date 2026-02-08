function fechas()
{  
//var timeday;
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
var a=dia+"de"+mes[today.getMonth();]+"del"+anno;
document.fechita.fecha_a.value=a;
//setTimeout("horas()",1000);
}
window.onload=fechas





