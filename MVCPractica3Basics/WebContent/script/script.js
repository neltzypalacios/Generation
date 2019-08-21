window.onload = ()=>
{
    document.getElementById("btnMensaje").addEventListener("click", mostrarMensaje);
    document.getElementById("btnSuma").addEventListener("click", sumaNumeros);

    document.getElementById("btnPotencia").onclick = function()
    {
    let base = parseInt(document.querySelector("#txtBase").value);
    let potencia = parseInt(document.querySelector("#txtPotencia").value);
    document.getElementById("resultadoPotencia").innerHTML = "La potencia de los números es "+(Math.pow(base, potencia));
    }

    var cajasTexto = document.querySelectorAll("input[type=text]");
    for(let i=0; i<cajasTexto.length;i++)
    {
        cajasTexto[i].onfocus = colorVerde;
    }
    for(let i=0; i<cajasTexto.length;i++)
    {
        cajasTexto[i].onblur = colorRojo;
    }
    console.log(cajasTexto);
}

function mostrarMensaje()
{
    let strNombre = document.getElementById("txtNombre").value;
    alert("Hola "+strNombre+"Bienvenido a JavaScript.");
}

function sumaNumeros()
{
    /*A la antigüita
    let numNumero1 = parseInt(document.getElementById("txtNumero1").value);
    let numNumero2 = parseInt(document.getElementById("txtNumero2").value);

    document.getElementById("resultadoSuma").innerHTML = "La suma de los números es :"+(numNumero1+numNumero2);*/
    
    //con querySelector
    let numNumero1 = parseInt(document.querySelector("#txtNumero1").value);
    let numNumero2 = parseInt(document.querySelector("#txtNumero2").value);

    document.getElementById("resultadoSuma").innerHTML = "La suma de los números es :"+(numNumero1+numNumero2);

/* 
1-.que con un boton se cambie el estilo de algo en html
2.-fonde de cagjas de texto cambiaen de color al seleccionarlas
*/

}

function colorVerde()
{
    document.getElementById(this.id).style.backgroundColor = "green";
}

function colorRojo()
{
    document.getElementById(this.id).style.backgroundColor = "red";
}
