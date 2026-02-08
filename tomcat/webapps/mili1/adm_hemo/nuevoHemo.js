var v1 = '1';
var v2 = '1';

function vali(){
     if ( (v1 =='0')&&(v2 =='0') ){
      DWRUtil.setValue("agregar","<input type='image' src='../imagenes/aceptar.png' onclick='insertar();'>");

     }  
     else{
      DWRUtil.setValue("agregar","");
     }
}

function v11()   {v1 = validarString("nombre","E1","*");vali();}

function v22()   {v2 = validarString("descripcion","E2","*");vali();  }

