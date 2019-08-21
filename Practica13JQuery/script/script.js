

//Segundo metodo
$(document).ready(
    ()=>
    {
        var botonOculta  = document.querySelector("#btnOculta");
        $("#btnOculta").click(funcionOculta);
        $("#btnMuestra").click(funcionMuestra);
        $("#btnAgrega").click(funcionAgrega);
        $("#btnAmarillo").click(funcionAmarillo);
        $("#btnRojo").click(funcionRojo);
        $("#btnAzul").click(funcionAzul);
    }
);

function funcionOculta()
{
    $("#parrafo1").hide();
}

function funcionMuestra()
{
    $("#parrafo1").show();
}

function funcionAgrega()
{
    $("#parrafo1").append ("Lorem ipsum dolor sit amet consectetur, adipisicing elit. Earum nostrum ipsa distinctio aspernatur praesentium voluptates reiciendis quae atque culpa sit, adipisci corrupti iste dolores quas illo enim impedit rerum illum?");
}

function funcionBorrar()
{
    $("parrafo1").empty();
}

function funcionAzul()
{
    $("#parrafo2").css("color","#0000FF");
}


/* OTRA MANERA DE ESCONDER EL BOTON
$(document).ready(
    ()=>
    {
        $("#btnOculta").click(funcionOculta);
    }
);
*/

/*
Primer metodo
window.onload = function()
{

}

Tercer metodo
$(document).ready(
    main()
);
function main()
{

}
*/