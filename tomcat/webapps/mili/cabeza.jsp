<html>
<head>
    <style>
	.cabeza {
	position: absolute;
	top:12%;
	right: 2%;
	z-index:50;
	
}   
    </style>  
<script>      
function dospaginas(){
parent.izquierdaAnalisis2.location.href="index.jsp"
parent.derecha.location.href="derecha.jsp"
document.getElementById("desconectar").style.display="none";
}
</script>      
</head>

<body>
<img src="./imagenes/titulo.jpg" align="center" width="100%">

<input class="cabeza" id="desconectar" type='image' style="display:none"  src="imagenes/desconectarse.png"  width="15%" onclick="dospaginas()">
</body>
</html>