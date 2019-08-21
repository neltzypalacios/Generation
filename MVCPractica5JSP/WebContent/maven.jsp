<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Practica 6: MAVEN</title>
</head>
<body>
	 <c:out value="Mi Testo"></c:out>
	 <%! double salario=3.14; %>
	 <!-- MAKING A VARIABLE -->
	 <c:set var="miNombre" scope="session" value="neltzy"></c:set>
	 <c:set var="miSalario" scope="session" value="3.14"></c:set>
	 
	 <!-- USING VARIABLE -->
	 <c:out value="${miSalario}"></c:out>
	 
	 <!-- FOR EACH -->
	 <c:forEach var="i" begin="1" end="5">
	 	<table>
	 	<tr>
	 	<c:out value="${miNombre}"></c:out>
	 	</tr>
	 	</table>
	 </c:forEach>
	 	
	 	
	<!-- TWO NUMBERS --> 	
	<form action="maven.jsp" method="post">
		<p>
			<label for="txtNumero1">Número 1:</label>
			<input type="text" id="txtNumero1" name="txtNumero1"> 
		</p>
		<p>
			<label for="txtNumero2">Numero 2:</label>
			<input type="text" id="txtNumero2" name="txtNumero2"> 
		</p>
		<c:set var="suma" value="${param.txtNumero1+param.txtNumero2}"></c:set>
		<div>
			<c:out value="${suma}"></c:out>
		</div>
		<p>
			<input type="submit" value="Suma los numeros">
		</p>
	</form>


</body>
</html>