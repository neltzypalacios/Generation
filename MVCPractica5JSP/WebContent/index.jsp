<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Práctica MVC JSP</title>
<!-- LINKS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    
</head>
<body>
	<h2>Hola desde JSP</h2>
	<%String nombre="El macho"; %>	
		
	<%
	for(int i=0; i<1000;i++)
	{
		out.println(String.format("<p>%s</p>", nombre));
	}
	%>
	
	<hr/>
	<h2>Práctica de MVC</h2>
	<p>
		<label for="txtMensaje">Mensaje:</label>
		<input type="text" id="txtMensaje" name="txtMensaje" value="<%=nombre%>">
	</p>

</body>
<!-- LINKS -->
 	<script src="script/jquery-3.4.1.min.js"></script>    
    <script src="script/popper.min.js"></script>
    <script src="script/bootstrap.min.js"></script>
    <script src="script/script.js"></script>
</html>