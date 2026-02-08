var id_prod =function(data) {DWRUtil.setValue("id_prod",data.id_prod);return data.id_prod };

function ListarMod()
{     
var id_prod=DWRUtil.getValue("id_prod");
//alert(id_prod);
ListaFracDAO.Eliminar(Eliminado,id_prod);
}

function si(id_prod)
{
DWRUtil.setValue("id_prod",id_prod);      
$(siono).style.display='';         
$(prod1).style.display='none';   
}

function Eliminado()
{
$(prod1).style.display='none';         
$(prod3).style.display='';         
$(siono).style.display='none';         

}         


var id_prod = function(data) { return data.id_prod};
var cod_do = function(data) { return data.cod_do };
var gs_rh = function(data) { return data.gs_rh };
var fecha_expi = function(data) { return data.fecha_expi };
var fecha_a= function(data) { return data.fecha_a };
var nombre = function(data) { return data.nombre };



var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "image");
      input.setAttribute("src", "../imagenes/eliminar1.png");
      input.setAttribute("onclick","si('"+data.id_prod+"');");
      return input;                             
    };



function Listar()
{
$(siono).style.display='none';              
$(prod1).style.display='';         
DWRUtil.removeAllRows("campos");
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
     $("prod1").style.display='';
     $("prod3").style.display='none';
     $("siono").style.display='none';
}




function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[id_prod,cod_do,nombre,gs_rh,fecha_expi,fecha_a,Predonacion],
       {rowCreator:function(options){
         var tr = document.createElement("tr");	
         if ((aux%2)==0){tr.style.backgroundColor = "#eeeeff";tr.style.border="1px solid #00008B";}
	            else{tr.style.backgroundColor = "#ffffff";tr.style.border="1px solid #00008B";}
	 aux++;
	 if ( ( aux-1 >= ini )&&( aux-1<=fin ) ) return tr;
      }
     } );
}

