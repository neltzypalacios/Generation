package com.mvcpractica4gson.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvcpractica4gson.model.Perro;


@WebServlet("/perroServlet")
public class perroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// mime type
		response.setContentType("application/Gson");
		//asignar el printwriter
		PrintWriter salida = response.getWriter();
		 //declarar valores
		String nombre = request.getParameter("txtNombre");
		String color = request.getParameter("txtColor");
		String raza = request.getParameter("txtRaza");
		int edad = Integer.parseInt(request.getParameter("txtEdad"));
	/*	String strFecha;
		Date fechaNacimiento = null;
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-DD");
	
		strFecha =  request.getParameter("txtFechaNacimiento");
	

		try {
			 fechaNacimiento = (Date) formato.parse("strFecha");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	
		Perro objPerro = new Perro();
		objPerro.setNombre(nombre);
		objPerro.setColor(color);
		objPerro.setRaza(raza);
		objPerro.setEdad(edad);

		Gson miObjetoGson = new Gson();
		String miCadenaJson = miObjetoGson.toJson(objPerro);
		
		
	}

}
