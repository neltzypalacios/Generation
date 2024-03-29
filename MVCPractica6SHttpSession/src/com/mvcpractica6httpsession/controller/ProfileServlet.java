package com.mvcpractica6httpsession.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		RequestDispatcher miDespachador = request.getRequestDispatcher("link.html");
		miDespachador.include(request, response);
		
		HttpSession miSesion = request.getSession();
		if(miSesion.getAttribute("nombre")!=null)
		{
			String nombreUsuario = (String)miSesion.getAttribute("nombre");
			salida.println("Bienvenido "+nombreUsuario+"a tu perfil");
		}
		else
		{
			salida.println("No est�s logeado, inicia sesi�n por favor.");
			miDespachador = request.getRequestDispatcher("link.html");
			miDespachador.include(request, response);
		}
		
		salida.close();
	}

}
