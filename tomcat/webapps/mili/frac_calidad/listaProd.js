//***********iNicio VALIDACION***************

function validarFechae()   { validarFecha("fecha_produccion",  	  "EmFechae",    "*");}
function validarFechae2(){
     if ( DWRUtil.getValue( "fecha_produccion")!=""  )  validarFecha ("fecha_produccion",  "EmFechae",   "*");
}


function validarFechae()   { validarFecha("fecha_expi",  	  "EmFechae",    "*");}
function validarFechae2(){
     if ( DWRUtil.getValue( "fecha_expi")!=""  )  validarFecha ("fecha_expi",  "EmFechae",   "*");
}

//***********FiN VALIDACION***************
