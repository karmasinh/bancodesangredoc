// INICIO VALIDACION
var v3 = '1';
var v4 = '1';

function validar(){
     if ( (v4=='0')&&(v3=='0') ){ 
     DWRUtil.setValue("agregar","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>");
     }  
     else{
      DWRUtil.setValue("agregar","");
     }
}

function validarCadena(){  v4 = validarCadenaNumero("tubuladora", "Emtubu", "*");validar();}
function validarCombos1(){ v3= validarCombo ("bolsa","EmComb",  "*");validar();}

////////////fin validacion

