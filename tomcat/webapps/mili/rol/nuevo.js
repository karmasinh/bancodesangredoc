function conteo()
{
NuevoHemoDAO.cuentaRol(conteoDatos);
}

function conteoDatos(data) {
DWRUtil.setValue("id_rol",data); 
}


var v1 = '1';
var v2 = '1';
function validar(){
// if ( (v1=='0')&&(v2=='0')){
     if (v1=='0'){
      DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>"); 
     }  
     else{
      DWRUtil.setValue("mili","");
     }
}
                                 
function ca(){ v1 =validarString("nombre","N","*");validar();}
//function di(){alert('dir');  v2 =validarDireccion("direccion","D","*");vali();}

var m1 = '0';
var m2 = '0';
var m3 = '0';
var m4 = '0';
var m5 = '0';
var m6 = '0';

function q1(){m1 =1 ;vali();}
function q2(){m2 =1 ;vali();}
function q3(){m3 =1 ;vali();}
function q4(){m4 =1 ;vali();}
function q5(){m5 =1 ;vali();}
function q6(){m6 =1 ;vali();}

function vali(){
     if ((m1=='1')||(m2=='1')||(m3=='1')||(m4=='1')||(m5=='1')||(m6=='1')){
      v2='0';
      validar();
     }  
}




function insertar() {
var n=DWRUtil.getValue("nombre");
var id_rol=DWRUtil.getValue("id_rol");
NuevoHemoDAO.insertaRol(ya,n);
/*var semana=new Array(6);
        semana[0]=DWRUtil.getValue( "s1");
	semana[1]=DWRUtil.getValue( "s2");
	semana[2]=DWRUtil.getValue( "s3");
	semana[3]=DWRUtil.getValue( "s4");
	semana[4]=DWRUtil.getValue( "s5");
	semana[5]=DWRUtil.getValue( "s6");
for(i=0;i<6;i++){
    if(semana[i]!=false){
    NuevoHemoDAO.insertaModulo(ya,id_rol,semana[i]);
    }
}*/
}
function ya() {
$("lista").style.display='none';
$("aviso").style.display='';
}