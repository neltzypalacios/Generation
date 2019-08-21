package com.mvcpractica3basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvcpractica3basics.model.Persona;

/**
 * Servlet implementation class PersonasServlet
 */
@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Persona objPersona = new Persona();
		objPersona.setNombre(request.getParameter("txtNombre"));
		objPersona.setApellido(request.getParameter("txtApellido"));
		objPersona.setPassword(request.getParameter("txtPassword"));
		objPersona.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
		objPersona.setTelefono(Double.parseDouble(request.getParameter("txtTelefono")));
		
		response.setContentType("application/json");
		PrintWriter salida = response.getWriter();
		salida.append("{"
					+"\"nombre\":\""+objPersona.getNombre()+"\","
					+"\"apellido\":"+objPersona.getApellido()+","
					+"\"password\":"+objPersona.getPassword()+","
					+"\"edad\":"+objPersona.getEdad()+","
					+"\"telefono\":\""+objPersona.getTelefono()
					+"\"}"
					);
					
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Estamos en el Post");
	}

}
