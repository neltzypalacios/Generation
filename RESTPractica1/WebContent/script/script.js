
 let  xhr =  new XMLHttpRequest();
 
window.onload = function ()
	{
	 var hola = documentQuerySelector("#nombre")
	 hola.onlick = sendAjaxPetition;
	}

function senAjaxPetition(){
	xhr.open("GET", "holaAjax.html");
	xhr.onload = CallBack;
	xhr.send(null);
}

function CallBack(){
	if(xhr.status==200){
		document.getElementById("divResult");
		innerHTML += xhr.responsetexxt;
	}
}