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


@WebServlet("/SerializaServlet")
public class SerializaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Estas en doPost");
		
		String miJson = request.getParameter("txtJson");
		
		Gson miGson = new Gson();
		Perro miPerro = new Perro();
		
		miGson.fromJson(miJson, miPerro.getClass());
		
		PrintWriter salida = response.getWriter();
		salida.append("id:"+miPerro.getRaza());
		salida.append("Nombre:"+miPerro.getNombre());
	}

}
