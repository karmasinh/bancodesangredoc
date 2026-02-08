// INICIO VALIDACION
var v2;
var v3;
var v4;

function validar(){
     if  ( (v3=='0')&&(v4=='0')&&(v5=='0') ){
      DWRUtil.setValue("ejecutarM","<input type='submit' value='Ejecutar' onclick='ejecutarModificar();'>");
     }  
     else{
      DWRUtil.setValue("ejecutarM","");
     }
}
function valCantidad() { v3 = validarNumero("cantidad"  ,"EmCantidad" , "*");validar();}
function valCost_unit(){ v4 = validarReales("cost_unit" ,"EmCost_unit", "*");validar();}
function valObser()    { v5 = validarString("obser"     ,"EmObser"    , "*");validar();}
// FIN VALIDACION

var aux;
var ini;
var fin;
// inicio de primera
function mostrarListar(data){
     aux = 1;
     DWRUtil.addRows("frente_01", data, [
          function(data) {return data.b1;}, 
          function(data) {return revertir(data.f1);}, 
          function(data) {return data.i1;}, 
          function(data) {return data.b2;},
          function(data) {return data.b3;},
          function (data){
               var input = document.createElement("input");
	       input.setAttribute("type", "submit");
	       input.setAttribute("value", "Modificar");
	       input.setAttribute("onclick", "Listar(0,'"+data.b1+"','"+data.f1+"',"+data.i1+",'"+data.b2+"','"+data.b3+"');");
               return input;
          }, 
          function (data){
               var input = document.createElement("input");
	       input.setAttribute("type", "submit");
	       input.setAttribute("value", "Eliminar");
	       input.setAttribute("onclick", "Listar(1,'"+data.b1+"','"+data.f1+"',"+data.i1+",'"+data.b2+"','"+data.b3+"');");
               return input;
          } 
     ],
     {rowCreator:function(options){
         var tr = document.createElement("tr");	
         if ((aux%2)==0){tr.style.backgroundColor = "#eeeeff";tr.style.border="1px solid #00008B";}
	            else{tr.style.backgroundColor = "#ffffff";tr.style.border="1px solid #00008B";}
	 aux++;
	 if ( ( aux-1 >= ini )&&( aux-1<=fin ) ) return tr;
      }
     }
     );
}
function mostrarCantidad(data){
     DWRUtil.setValue("total",data);
     inicio(data);
     ini = 1;
     fin = numer_filas;
     fabrica(1);
}
function ejecutarListar(){
     DWRUtil.removeAllRows("frente_01");
     VariosDAO.Cantidad(mostrarCantidad);
     VariosDAO.Listar(mostrarListar);    
     $("cara_01").style.display='';
     $("cara_02").style.display='none';
     $("cara_03").style.display='none';
     $("cara_04").style.display='none';
     $("cara_05").style.display='none';     
}
function tabla(ii,nf){
     ini = ii * nf - nf + 1;
     fin = ii * nf;
     DWRUtil.removeAllRows("frente_01");
     VariosDAO.Listar(mostrarListar);    
     $("cara_01").style.display='';
     $("cara_02").style.display='none';
     $("cara_03").style.display='none';
     $("cara_04").style.display='none';
     $("cara_05").style.display='none';     
}
// fin de primera 

// inicio de segunda y tercera
function Listar(d0,d1,d2,d3,d4,d5){
     DWRUtil.setValue("cod_v",d1);//asigna por primera vez
     if (d0 == 1){
          DWRUtil.setValue("ejecutarE","<input type='submit' value='Ejecutar' onclick='ejecutarEliminar();'>");
          var set_values ={e1:d1, e2:revertir(d2), e3:d3, e4:d4, e5:d5};
          DWRUtil.setValues(set_values);
          $("cara_02").style.display='';
          $("cara_03").style.display='none';
     }
     else{
          v3 = '0'; v4 = '0'; v5 = '0';
          DWRUtil.setValue("ejecutarM","<input type='submit' value='Ejecutar' onclick='ejecutarModificar();'>");
          var Mset_values ={m1:d1, fechac:revertir(d2), cantidad:d3, cost_unit:d4, obser:d5};
          DWRUtil.setValues(Mset_values);
          $("cara_02").style.display='none';
          $("cara_03").style.display='';
     }
     $("cara_01").style.display='none';
     $("cara_04").style.display='none';
     $("cara_05").style.display='none';     
}
// fin de segunda y tercera

// inicio de cuarta
function mostrarEliminar(data){
     var men = "DATO NO ELIMINADO";
     if (data==1){men = "DATO ELIMINADO";}
     DWRUtil.setValue("resultadoE", men);	       
}
function ejecutarEliminar(){
     var n1 = DWRUtil.getValue("cod_v");
     VariosDAO.Eliminar(mostrarEliminar, n1);
     $("cara_01").style.display='none';
     $("cara_02").style.display='none';
     $("cara_03").style.display='none';     
     $("cara_04").style.display='';     
     $("cara_05").style.display='none';     
}
// fin de cuarta

// inicio de quinta
function mostrarModificar(data){
     var man = "DATO NO MODIFICADO";
     if (data==1){man = "DATO MODIFICADO";}
     DWRUtil.setValue("resultadoM", man);
}
function ejecutarModificar(){
     var n1 = DWRUtil.getValue("cod_v");
     var n2 = DWRUtil.getValue("fechac");
     var n3 = DWRUtil.getValue("cantidad");
     var n4 = DWRUtil.getValue("cost_unit");
     var n5 = DWRUtil.getValue("obser");
     VariosDAO.Modificar(mostrarModificar,n1,invertir(n2),n3,n4,n5);
     $("cara_01").style.display='none';
     $("cara_02").style.display='none';
     $("cara_03").style.display='none';     
     $("cara_04").style.display='none';     
     $("cara_05").style.display='';     
}
// fin de quinta
