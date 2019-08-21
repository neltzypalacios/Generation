package com.mvcpractica8ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumaServlet")
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		int numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		int suma = numero1+numero2;
		
		response.setContentType("text/html");
		response.getWriter().append("La suma es: "+suma);
	}

}
