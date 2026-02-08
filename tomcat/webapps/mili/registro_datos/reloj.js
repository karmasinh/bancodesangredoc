function horas()
{  
var timeday;
var horas;
today=new Date();
sec=today.getSeconds();
hr=today.getHours();
min=today.getMinutes();

if(hr<12){timeday="AM";}
else {timeday="PM";}
if (hr>12) hr=hr-12;
if (hr<=9) hr="0"+hr;
if (min<=9) min="0"+min;
if (sec<=9) sec="0"+sec;
horas=hr+":"+min+":"+sec+timeday;
document.relojito.hora_a.value=horas;
setTimeout("horas()",1000);
}
window.onload=horas
/*
<script src='reloj.js'></script>

<TD>
<FORM action name='relojito'  method='post'>
<input  type='text' name='hora_a' id='hora_a' readOnly  size='15'>
</FORM>
</TD>
*/