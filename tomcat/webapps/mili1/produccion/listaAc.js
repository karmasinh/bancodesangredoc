var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_a = function(data) { return data.fecha_a };
var nombre = function(data) { return data.nombre };



function Listar()
{              
ListaFracDAO.ListaTotalL(mostrarListaDonantes);
//*********paginacion********/////
ListaFracDAO.Cantidad(mostrarCantidad);
}

function mostrarCantidad(data){
     DWRUtil.setValue("total",data);
     inicio(data);
     ini = 1;
     fin = numer_filas;
     fabrica(1);
}
function tabla(ii,nf){
     ini = ii * nf - nf + 1;
     fin = ii * nf;
     DWRUtil.removeAllRows("campos");
     ListaMedicaDAO.mostrarLista(mostrarListaDonantes);
     //$("busqueda").style.display='';
}
/////////******fin de paginacion************////////////



function mostrarListaDonantes(data) {      
alert('llego');
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prod,cod_do,nombre,gs_rh,fecha_expi,fecha_a],{
    rowCreator:function(options) {
	var tr = document.createElement("tr");	
	if ((aux%2)==0)
	{
	tr.style.backgroundColor = "#eeeeff";
	tr.style.border="1px solid #00008B";
	}
	else
	{
	tr.style.backgroundColor = "#ffffff";
	tr.style.border="1px solid #00008B";
	}
	aux=1+aux;
        return tr;
        }
    });
  }









var total_filas;
var numer_filas;
var total_enlaces;
var numer_enlaces;
var incremento;
function inicio( n ){
     total_filas = n;
     numer_filas = 5;
     total_enlaces = ( n - (n%numer_filas) ) / numer_filas;
     if ( (n%numer_filas) != 0 ){ total_enlaces = total_enlaces + 1; }
     numer_enlaces = 3;
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