
window.onload = ()=>
{
    let miBoton = document.getElementById("btnSaludo");
    
    miBoton.onclick = mostrarSaludo;
    console.log("Primer Boton")
    alert("Mensaje");
    
    document.getElementById("bntSaludo2").onclick = mostrarSaludo;

    let miBoton3 = document.getElementById("btnSaludo3");
    console.log("Valores de boton3"+miBoton3);
    miBoton3.addEventListener("click",mostrarSaludo);
    
    document.getElementById("titulo").addEventListener("click",mostrarSaludo);

    console.log(miBoton3);
}

function mostrarSaludo()
{
    alert("Hola Mundo");
}