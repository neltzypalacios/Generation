let xhr = new XMLHttpRequest();

window.onload = function()
{  
     //Metodo dos para obtener el boton del DOM
     var miBoton = document.querySelector("#btnPicale")

    //Metodo uno para obtener el boton del DOM
    var miBoton2 = document.getElementById("btnPicale2");

   
    
    //Metodo para arignar un evento al objeto boton
    miBoton.addEventListener("click", enviarSolicitudAjax);

    //Metodo 2 para asignar un evento al objeto Boton2
    miBoton2.onclick = enviarSolicitudAjax;
    

}

function enviarSolicitudAjax()
{
    xhr.open("GET","resultadoAJAX.html", true); //sincrono con false, true es asincrono
    xhr.onreadystatechange = functionCallBack;
    xhr.send();
}

function functionCallBack()
{
   // console.log(xhr.readyState);
    if(xhr.readyState == 1)
    {
        console.log(xhr.readyState);
    }
    if(xhr.readyState == 2)
    {
        console.log(xhr.readyState);
    }
    if(xhr.readyState == 3)
    {
        console.log(xhr.readyState);
    }
    if(xhr.readyState == 4 && xhr.status == 200)
    {
        document.getElementById("divRes").innerHTML = xhr.responseText;
    }
}

