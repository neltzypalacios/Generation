//alert("Este es un texto");
var numero = 5;
var cadena = "Hola Mundo";
var salario = 2500.5;
var isCasada = false;
var caracter = 'H';

const NUMERO_VUELTAS = 10;

var nose;
console.log("Valor de la variable número: "+numero);
console.log("Valor de la variable número: "+cadena);
console.log("Valor de la variable salario: "+salario);
console.log("Valor de la variable isCasada: "+isCasada);
console.log("Valor de la variable carácter: "+caracter);
console.log("Valor de la constante NUMERO DE VUELTAS: "+NUMERO_VUELTAS);
console.log("Valor de la variable nose: "+nose);
for(var i= 0; i<NUMERO_VUELTAS; i++)
{
    console.log(i);
}

if(10<20)
{
    console.log("10 es menor que 20");
}

switch(caracter)
{
    case 'A': console.log("Es una A");
    break;
    case 'B': console.log("Es una B");
    break;
    case 'C': console.log("Es una C");
    break;
    case 'H': console.log("Es la respuesta correcta");
    break;
    default:
        console.log("No lo sé");
}

cadena = window.prompt("Introduce un nombre: ");
alert("La cadena introducida fué: "+cadena);

var cantidadesVueltas = window.prompt("¿Cuántos ciclos quieres?");
var i = 0;
while(i<cantidadesVueltas)
{
    alert("Vuelta"+i);
    i++;
}

var numero1 = parseInt(window.prompt("Dame un número: "));
var numero2 = parseInt(window.prompt("Dame otro número"));
var resultado = numero1 + numero2;
alert("Resultado:  "+resultado);

//Subrutina 1
alert(diHolaMundo());
alert(miMensaje("5 min more"));
alert(`La suma de ${numero1} más ${numero2} es: `+sumaNumeros(numero1,numero2));
function diHolaMundo()
{
    return "Hola Mundo"
}

//Subrutina 2
function miMensaje(mensaje)
{
    return "Hola mis silvestres, este es mi mensaje: "+mensaje;
}

//Subrutina 3
function sumaNumeros(num1, num2)
{
    return num1+num2;
}