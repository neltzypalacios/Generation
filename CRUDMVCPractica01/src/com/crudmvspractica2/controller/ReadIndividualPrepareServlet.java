package com.crudmvspractica2.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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

import com.crudmvc.model.Productos;




@WebServlet("/ReadIndividualPrepareServlet")
public class ReadIndividualPrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String idProducto = request.getParameter("txtIdProducto");
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
			throw new FileNotFoundException("Properties file:"+myPropsFile+"is missing.");
		}
		
		//Paso 1. Declarar Variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String driver = props.getProperty("driver");
		String sentenciaSQLString = props.getProperty("sentenciaSQLReadIndividualProductos");
		
		//Paso 2, Declarar objetos conexion
		Connection conn=null;
		PreparedStatement pstmnt = null;
		ResultSet rs = null;
		Productos miProducto = new Productos(idProducto, null, 0.0, 0);
		 //Cantidad minima de filas  a ser modificadas
		final int MIN_ROWS=0;
		int nRows=MIN_ROWS;
		
		//Paso 3. Instanciar el Driver
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
			
			//Paso 4. Abrir la conexion
			conn = DriverManager.getConnection(urlServidor, user, pass);
			
			//Paso 5. Configurar el Prepared Statement 
			pstmnt = conn.prepareStatement(sentenciaSQLString);
			
			//Paso 6. Pasar los parametros al Prepared Statement
			pstmnt.setString(1, miProducto.getIdProducto());
			
			//Paso 7. Ejecutar la consulta
			rs = pstmnt.executeQuery();
			
			//Paso 8. Mostrar los resultados
			while(rs.next()) {
				response.getWriter().append("Id Producto: "+rs.getString("idProducto")+"<br/>");
				response.getWriter().append("NombreProducto: "+rs.getString("nombreProducto")+"<br/>");
				response.getWriter().append("PrecioProducto: "+rs.getString("precioProducto")+"<br>");
				response.getWriter().append("ExistenciasProducto"+rs.getString("existenciasProducto"));
				
				
			}
			
		} catch (Exception e)
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
