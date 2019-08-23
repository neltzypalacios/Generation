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

import com.hibernatepractica1.model.Productos;


@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter salida = response.getWriter();
				
		salida.append("Estoy en el altas");
		
		Productos miProducto = new Productos();
		miProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
		miProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		miProducto.setPrecioProducto(Integer.parseInt(request.getParameter("txtExistenciasProducto")));
		
		//Creamos el objeto configuracion
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//Se crea el sessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Se inicia el objeto session
		Session sesion = factory.openSession();
		
		//Se inicia la transacci�n
		Transaction transac = sesion.beginTransaction();
		
		//Se crea el objeto no persosistido
		//Ya creanmis el objeto en lineas de cfigo m�s arrribs
		
		//Persistimos el objeto
		sesion.persist(miProducto);
		
		//Hacemos el commit
		transac.commit();
		
		//Cerramos los objetos+sesion.close()
		sesion.close();
		salida.close();
		
		
	}

}
