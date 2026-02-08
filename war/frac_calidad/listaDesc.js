/////////////esta opcion es para mostrar la lista del descarte(saque de la modificacion)///////////////
var gel=new Array(20);
var j=1;
var a=0;
var a1=0;
var Pr= function(data) {
gel[j]=data.id_prueba;
j++;
     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id",""+data.id_prueba+"");
      input.setAttribute("value",data.resultado);
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 18);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);     
      DWRUtil.setValue("id_aten",data.id_aten);     
      DWRUtil.setValue("cod_do",data.cod_do);     
      ListaDescarteDAO.contd(mostrarpruebas);
    
     } 

     if(data.tipo_componente=='3'){
	    if (data.resultado=='false'){
      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      input.setAttribute("onblur","ddd('"+data.id_prueba+"');");
	    }
	    else{
		var input =" <input type='checkbox' id='"+data.id_prueba+"'onblur='ddd('"+data.id_prueba+"');'  checked>";	    
	    } 
     }
         
      if(data.tipo_componente=='2'){
	var input="<select id='"+data.id_prueba+"'> <option  selected='selected'>"+data.resultado+"</option> </select>";
	d[a]=data.id_prueba;
	a++;
	a1=a1+500;
setTimeout("ListaDescarteDAO.mostrarLista4(nivel0,"+data.id_prueba+",'"+data.instancia+"')",a1);	
      }    
 return input;                             
};
var d=new Array(100);
var c=0;
function nivel0(data)
{
DWRUtil.addOptions(''+d[c]+'',data,'valores','valores');
c++;
}


function mostrarpruebas(data)
{
DWRUtil.setValue("bb",data);
};

function ListarDes(cod_do,instancia)
{
ListaDescarteDAO.contd(mostrarpruebas,instancia);
ListaDescarteDAO.mostrarResultado_prueba(nivel1,cod_do,instancia);
$("extra2").style.display ='';
$("extra1").style.display ='none';
}

function nivel1(data) {
 aux=1; 
  DWRUtil.addRows("camposp",data,[id_aten,id_prueba,cod_do,Pr],{
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


function Listar()
{        
$(extra1).style.display='';                
ListaDescarteDAO.mostrarLista(mostrarListaDonantes);
}

var fecha_prueba = function(data) { return data.fecha_prueba };	
var cod_do = function(data) { return data.cod_do };
var id_aten = function(data) { return data.id_aten };
var instancia = function(data) { return data.instancia };

var nombre_tp = function(data) { return data.nombre_tp };
var resultado = function(data) { return data.resultado };
var id_prueba = function(data) { return data.id_prueba };
var tipo_componente = function(data) { return data.tipo_componente };


var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Detalle-Pruebas");
      input.setAttribute("onclick","ListarDes('"+data.cod_do+"','"+data.instancia+"');");
      return input;                             
    };


function mostrarListaDonantes(data) {      
  aux=1; 
  DWRUtil.addRows("campos",data,[fecha_prueba,cod_do,instancia,Predonacion],{
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

function mostrarLista(data) {      
  aux=1; 
  DWRUtil.addRows("camposL",data,[nombre_tp,resultado,cod_do],{
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

