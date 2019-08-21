//Paso 1 - Crear el objeto XHR
let xhr = new XMLHttpRequest();

window.onload = function()
{  
    //Metodo dos para obtener el boton del DOM
     var miBoton = document.querySelector("#btnPicale")

     miBoton.onclick = enviarPeticionAjax;
}

function enviarPeticionAjax()
{
   //Paso 2 - Abrir la conexion
   xhr.open("GET","resultadoAjax.html");

   //Paso 3 - Asignamos la funcion Call Back cuando la peticion
   //fue completada con exito
   xhr.onload = functionCallBack;

   //Paso 4 - Enviamos la solicitud Asincrona
   xhr.send(null);
}

//Paso 5 - Crear la funcion CallBack
function functionCallBack()
{
    if(xhr.status == 200)
    {
        document.getElementById("divResultado").innerHTML += xhr.responseText;
    }
}
