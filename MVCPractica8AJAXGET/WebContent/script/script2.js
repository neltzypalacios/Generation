let xhr2 = new XMLHttpRequest();

window.onload = function ()
{
	var sumar = document.querySelector("#btnSuma").addEventListener("click",enviarPeticionAsincrona);
}

function enviarPeticionAsincrona()
{
	var miNumero1 = document.getElementById("txtNumero1");
	var miNumero2 = document.getElementById("txtNumero2");
	xhr2.open("GET","SumaServlet?txtNumero1="+miNumero1.value+ "&txtNumero2="+miNumero2.value);
	xhr2.onload = functionCallBack;
	xhr2.send(null);
}

function functionCallBack()
{
    if(xhr2.status == 200)
    {
        document.getElementById("divResultado2").innerHTML += xhr2.responseText;
    }
}


