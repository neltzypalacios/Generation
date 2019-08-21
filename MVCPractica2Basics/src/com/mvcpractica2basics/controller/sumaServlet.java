package com.mvcpractica2basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sumaServlet")
public class sumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Si jala, get");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		int resultado;
		numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		resultado = numero1 + numero2;
		response.setContentType("text/html");//mimeType
		PrintWriter salida = response.getWriter();
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Practica 2");
		salida.append("</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>");
		salida.append("Práctica 2 MVC");
		salida.append("</h2>");
		salida.append("<p>");
		salida.append("La suma de los números son: "+resultado);
		salida.append("</p>");
		salida.append("</body>");
		salida.append("</html>");
		
		
		salida.close();
	}
	
	/**
	 * SoapUI - Herramientas de texting de servicios web
	 * Postman
	 * cURL
	 */

		
}
