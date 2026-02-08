function InsertarC(){
var a1=0;
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
var bba=DWRUtil.getValue("bb");
var v = (parseInt(bba));
for (i=1;i<=v;i++){
var valores=DWRUtil.getValue(""+gel[i]+"");

	if(i==v){
	
	    if(a1>0){
	    valores="Donante no Apto";
	    DWRUtil.setValue(""+gel[i]+"",valores);     
	    ListarSalidaDAO.InsertarC(Resultado,""+gel[i]+"",valores,id_aten,cod_do);
	    
	    }
	    else{
	    valores="Donante Apto";
	    DWRUtil.setValue(""+gel[i]+"",valores);     
	    ListarSalidaDAO.InsertarC(Resultado,""+gel[i]+"",valores,id_aten,cod_do);
	    }	
	}
	else{
	if(valores=='on'){ a1++;}
	ListarSalidaDAO.InsertarC(Resultado,gel[i],valores,id_aten,cod_do);
	}
}
ListarSalidaDAO.cont2(mostrarCantidad,cod_do,id_aten);
}
function mostrarCantidad(data)
{
if (data > 0){
     DWRUtil.setValue("EmCi","Hemocomponente No Aprobado");
     DWRUtil.setValue("resultado","Hemocomponente Aprobado");
     DWRUtil.setValue("agregar","<input type='submit' value='Finalizar' onclick='updateTT();'>");
}
else{
   DWRUtil.setValue("EmCi","Hemocomponente Aprobado");
   DWRUtil.setValue("resultado","Hemocomponente Aprobado");
   DWRUtil.setValue("agregar","<input type='submit' value='Finalizar' onclick='updateTT();'>");
    }
}


function updateTT()
{
var valores = DWRUtil.getValue("resultado");
var id_prueba=DWRUtil.getValue("id_pruebaF");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");

ListarSalidaDAO.InsertarC(Find,id_prueba,valores,id_aten,cod_do);
var id_prod=DWRUtil.getValue("id_prod");
ListarSalidaDAO.FinalizarTodo(qq,id_prod);
}

function qq()
{
$(Fin).style.display='';
$(salida4).style.display='none';
}
function Find()
{
//$(lista).style.display='none';
}

//***********************
function Insertar(id_prueba){
var valores='N';
var cod_do=DWRUtil.getValue("cod_do");
var id_aten=DWRUtil.getValue("id_aten");
ListarSalidaDAO.InsertarC(Resultado,id_prueba,valores,id_aten,cod_do);
}
function Resultado(data)
{
}

////////*********lista
var j=1;
function ListarEva(id_prod,cod_do)
{  
DWRUtil.setValue("id_prod",id_prod);     
DWRUtil.setValue("cod_do",cod_do);     
$(salida4).style.display='';
$(salida3).style.display='none';
ListarSalidaDAO.mostrarLista3(mostrarListaDonantes1);
}

var mes=new Array(20);
var gel=new Array(20);
var va=new Array(20);
    for(i=0;i<=20;i++) va[i]=1;
var d=0;
var p=0;

var Pr= function(data) {
gel[j]=data.id_prueba;
j++;
     if(data.tipo_componente=='1'){
      var input = document.createElement("input");
      input.setAttribute("id", "EmCi");
      input.setAttribute("readonly", "true");
      input.setAttribute("size", 30);
      DWRUtil.setValue("id_pruebaF",data.id_prueba);     
      return input;
    
     } 

     if(data.tipo_componente=='3'){

      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", ""+data.id_prueba+"");
      input.setAttribute("onclick","Insertar('"+data.id_prueba+"');");
      return input;                             
     }
         
      if(data.tipo_componente=='2'){
      var input="<select id='"+data.id_prueba+"' onblur='validarcaja("+data.id_prueba+");'> <option value='0' selected='selected'>~</option> </select>";
      mes[d]=""+data.id_prueba+"";
       va[data.id_prueba]=0;
       p=p+500;
      setTimeout("ListarSalidaDAO.mostrarLista4(nivel0,"+data.id_prueba+")",p);	
      d++;

 return input;                             

    }
};

var a1=0;
function nivel0(data)
{
DWRUtil.addOptions(''+mes[a1]+'',data,'valores','valores');
a1++;
}

function mostrarListaDonantes1(data) {
  aux=1; 
  DWRUtil.addRows("campospe",data,[id_prueba,nombre_tp,tipo_componente,Pr],{
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
  

////***************
function cambiar()
{
//alert('yoyo');
$(salida1).style.display='none';         
$(salida2).style.display='none';         
$(salida3).style.display='';         
ListarSalidaDAO.listarChec(listarChe);
}

function cambiar1()
{
DWRUtil.removeAllRows("camposP");  
cambiar();
}



function insertarValor()
{
var n1=DWRUtil.getValue("n1");
var n0=DWRUtil.getValue("n0");
var id_aten=DWRUtil.getValue("id_aten");
var cod_do=DWRUtil.getValue("cod_do");
ListarSalidaDAO.adicionarR(insertarDatosV,n1,n0,id_aten,cod_do);
}

var resultado = function(data) { return data.resultado;};
var cod_do = function(data) { return data.cod_do;};
var tubuladora = function(data) { return data.tubuladora;};
var nombre = function(data) { return data.nombre;};
var nombre_tp = function(data) { return data.nombre_tp;};
var fecha_expi = function(data) { return data.fecha_expi;};
var gs_rh = function(data) { return data.gs_rh;};
var tipo_componente = function(data) { return data.gs_rh;};
var id_aten = function(data) { return data.id_aten;};

var id_prod = function(data) { return data.id_prod;};
var valores = function(data) { return data.valores};
var id_prueba = function(data) { return data.id_prueba};
var id_valor = function(data) { return data.id_valor};

var Pruebas= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "submit");
      input.setAttribute("value", "Pruebas");
      input.setAttribute("onclick","ListarEva("+data.id_prod+",'"+data.cod_do+"');");
      return input;                             
    };


function listarChe(data) {      
  aux=1; 			
  DWRUtil.addRows("camposP",data,[id_prod,cod_do,nombre,gs_rh,tubuladora,Pruebas],{
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






function Chec(id_hemo,id_aten)
{
ListarSalidaDAO.controlar(controlar1,id_hemo);
var aa={id_hemol:id_hemo};
DWRUtil.setValue(aa);
DWRUtil.setValue("id_aten",id_aten);
document.getElementById("aa").innerHTML = id_hemo;
ListarSalidaDAO.insertar(insertarChec,id_hemo,cont);
}



function controlar1(data)
{
if (data >= 1)
{
var id_hemo=DWRUtil.getValue("aa");
ListarSalidaDAO.insertar2(insertarChec2,id_hemo);}
else
{
var id_hemo=DWRUtil.getValue("aa");
ListarSalidaDAO.insertar(insertarChec,id_hemo);}
}

function insertarChec2()
{
$(salida1).style.display='';         
$(salida2).style.display='';         
}

function insertarChec()
{
$(salida1).style.display='';         
$(salida2).style.display='';         
}


function Listar()
{     
//alert('hello');
$(salida1).style.display='';         
ListarSalidaDAO.mostrarCombo(mostrarCombo1);
}


var nombre = function(data) { return data.nombre};
var id_hemo = function(data) { return data.id_hemo};



var Predonacion= function(data) {
      var input = document.createElement("input");
      input.setAttribute("type", "checkbox");
      input.setAttribute("id", "id_hemo");
      input.setAttribute("onclick","Chec('"+data.id_hemo+"','"+data.id_aten+"');");
      return input;                             
    };

function mostrarCombo1(data) {      
  aux=1; 				
  DWRUtil.addRows("campos",data,[id_aten,id_hemo,nombre,gs_rh,fecha_expi,Predonacion],{
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
