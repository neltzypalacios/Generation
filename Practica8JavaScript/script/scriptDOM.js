window.onload = function()
{
    let miTitulito = document.getElementById("titulo1");
    console.log(miTitulito);
    let miTextitu = window.prompt("Dame el título: ");
    miTitulito.innerHTML += miTextitu;

    let miParrafito = document.getElementById("parrafo1");
    console.log(miParrafito);
    let miTextitu2 = window.prompt("Dame el parrafo");
    miParrafito.innerText += miTextitu2;

    let misParrafos = document.getElementsByClassName("parrafitus");
    console.log(misParrafos);
    let misParrafos2 = document.getElementsByTagName("parrafitus");
    console.log(misParrafos2);

/*    for(let i=0;i<misParrafos.length;i++)
    {
        console.log("Elemento["+i+"]:"+misParrafos[i].innerHTML);
    }*/

    for(let i=0;i<misParrafos2.length;i++)
    {
        console.log("Elemento["+i+"]:"+misParrafos2[i].innerHTML);
    }
}