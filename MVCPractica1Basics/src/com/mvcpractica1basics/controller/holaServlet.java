package com.mvcpractica1basics.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class holaServlet
 */
@WebServlet("/holaServlet")
public class holaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre;
		nombre = request.getParameter("txtNombrecitu2");
		response.getWriter().append(String.format("Hola %s, bienvenido al BackEnd", nombre ));
		
		
	}

}
