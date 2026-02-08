var v88 = '1';
var v89 = '1';
function vali(){
     if ( (v88=='0')&&( v89=='0') ){
         var r1=DWRUtil.getValue("fecha_inicio");
	 var r2=DWRUtil.getValue("fecha_final");
     
         var dia1  = r1.split("-")[0];
         var mes1  = r1.split("-")[1];
         var ano1 = r1.split("-")[2];

         var dia2  = r2.split("-")[0];
         var mes2  = r2.split("-")[1];
         var ano2 = r2.split("-")[2];

	 var d=parseInt(dia1)+7;

         if  (ano2>ano1){
             DWRUtil.setValue("agregar","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>"); 
    	    }  

	 else{ if  ((ano2==ano1)&&(mes2>mes1)){
             DWRUtil.setValue("agregar","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>"); 
    	      }  


         else {
	     if ( (ano2==ano1)&&(mes2>=mes1)&&(dia2>=d) ){
             DWRUtil.setValue("agregar","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>"); 
    	    }  
	    
         else{
	  DWRUtil.setValue("agregar","");
         }
}
}
}
}


function v1(){
//alert('v1');
 if ( DWRUtil.getValue( "fecha_inicio")!=""  ){
 v88='0';
 vali();
 }else{
// alert('else');
 DWRUtil.setValue("E1", "<font color='red'><b>* "+mensaje+"</b></font>");
 }
}

function v2(){
//alert('v2');
 if ( DWRUtil.getValue( "fecha_final")!=""  ){
 v89='0';
 vali();
 }else{
  DWRUtil.setValue("E2", "<font color='red'><b>* "+mensaje+"</b></font>");
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
DWRUtil.setValue("fecha_final",a);
fechas2();
}  

function fechas2()
{
var m=new Array(12);
m[0]="Enero";
m[1]="Febrero";
m[2]="Marzo";
m[3]="Abril";
m[4]="Mayo";
m[5]="Junio";
m[6]="Julio";
m[7]="Agosto";
m[8]="Septiembre";
m[9]="Octubre";
m[10]="Noviembre";
m[11]="Diciembre";

today=new Date();
dia=today.getDate();
anno=today.getYear()+1900;
t="Tarija,";
var a=t+" "+m[today.getMonth()]+"  "+dia+" de "+anno;
//document.getElementById("fecha").innerHTML = a;
DWRUtil.setValue("fecha1",a);
}  
