function conteo()
{
NuevoHemoDAO.cuentaDestino(conteoDatos);
}

function conteoDatos(data) {
document.getElementById("id_destino").innerHTML = data;
}


var v1 = '1';
function validar(){
     if (v1=='0'){
      DWRUtil.setValue("mili","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>"); 
     }  
     else{
      DWRUtil.setValue("mili","");
     }
}
                                 
function ca(){  v1 =validarString("nombre","N","*");validar();}
//function di(){alert('dir');  v2 =validarDireccion("direccion","D","*");validar();}
///////////////otra vali

function insertar() {
var n=DWRUtil.getValue("nombre");
NuevoHemoDAO.insertarDestino(ya,n);
}
function ya() {
$("lista").style.display='none';
$("aviso").style.display='';
}