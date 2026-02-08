var total_filas;
var numer_filas;
var total_enlaces;
var numer_enlaces;
var incremento;
function inicio( n ){
     total_filas = n;
     numer_filas = 10;
     total_enlaces = ( n - (n%numer_filas) ) / numer_filas;
     if ( (n%numer_filas) != 0 ){ total_enlaces = total_enlaces + 1; }
     numer_enlaces = 5;
     incremento = 1;
}
function fabrica(n){
     var izq = "";
     var der = "";
     var cad = "";
     if ( n > 1 ){
         izq = "<input type='image' src='../imagenes/all_left.png'  onclick='fabrica("+(n-incremento)+");'>";
     }else{n = 1;}
     if ( n < total_enlaces-numer_enlaces+1 ){
         der = "<input type='image' src='../imagenes/all_right.png' onclick='fabrica("+(n+incremento)+");'>";
     }else{n = total_enlaces - numer_enlaces + 1;}
     for( i=n; i<=( n + numer_enlaces - 1 ); i++ ){
	if ( (i>=1) && (i<=total_enlaces) ){cad = cad + " <a href='#' onclick='tabla("+i+","+numer_filas+");' > "+i+" </a> ";}
     }
     document.getElementById("enlaces").innerHTML = izq + cad + der;
}