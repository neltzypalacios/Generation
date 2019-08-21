package com.crudmvspractica2.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransaccionesPrepareServlet")
public class TransaccionesPrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Properties props = new Properties();
		InputStream myStream=null;
		String myPropsFile = "config.properties";
		myStream = getClass().getClassLoader().getResourceAsStream(myPropsFile);
		
		if(myStream!=null)
		{
			props.load(myStream);
		}
		else
		{
			throw new FileNotFoundException("Properties file: "+myPropsFile+"isMissing.");
		}
		
		//Paso 1. Declarar variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String driver = props.getProperty("driver");
		
		//Paso 2. Declarar objetos conexion
		Connection conn=null;
		PreparedStatement pstmnt = null;
		String insert1 = "INSERT INTO productos VALUES ('10', 'Cebolla', 1.00, 3)";
		String insert2 = "INSERT INTO productos VALUES ('11', 'Chorizo', 2.00, 5)" ;
		String insert3 = "INSERT INTO productos VALUES ('12', 'Chocolate', 3.00, 4)";
		String insert4 = "INSERT INTO productos VALUES ('13', 'Jitomate', 4.00, 5)";
		String insert5 = "INSERT INTO productos VALUES ('14', 'Manzana', 5.00, 6)";
		
		//Paso 3. Instanciar el Driver
		try
		{
			Class.forName(driver).getDeclaredConstructor().newInstance();
			
			//Paso 4. Abrir la conexion
			
			conn = DriverManager.getConnection(urlServidor, user, pass);
			conn.setAutoCommit(false);
			
			//Paso 5. Configurar los parametros al Prepared Statement
			pstmnt = conn.prepareStatement(insert1);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert2);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert3);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert4);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert5);
			pstmnt.executeUpdate();
			conn.commit();
			
			pstmnt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//Paso 7. Cerrar las conexiones
				pstmnt.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	
	}

}
