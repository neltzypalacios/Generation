package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.hibernatepractica1.model.Productos;


@WebServlet("/ReadProductServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json charset='utf-8'");
		PrintWriter salida = response.getWriter();
		
		Configuration  cfg = new Configuration();
		
		//Patron de diseño builder: va creando por partes
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		//en Configure no hay necesidad de que poner el xml pa
		
		Session miSesion = miFactory.openSession();
		Transaction miTransaction = miSesion.beginTransaction();
		
		//Ejecutamos la busqueda
		String idProducto = request.getParameter("txtProducto");
		Productos miProducto = new Productos();
		miProducto = miSesion.get(Productos.class, idProducto);
		/*	ObjectMapper miJackson = new ObjectMapper();
			String objetoJsonJackson = miJackson.writeValueAsString(miProducto);
			salida.append(objetoJsonJackson);
		*/
		Gson miGson = new Gson();
		salida.append(miGson.toJson(miProducto));
		miTransaction.commit();
		miSesion.close();
		
	}

}
