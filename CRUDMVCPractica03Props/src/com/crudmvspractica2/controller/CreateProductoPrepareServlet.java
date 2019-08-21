package com.crudmvspractica2.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudmvc.model.Productos;


@WebServlet("/CreateProductoPrepareServlet")
public class CreateProductoPrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idProducto = request.getParameter("txtIdProducto");
		String nombreProducto = request.getParameter("txtNombreProducto");
		double precioProducto = Double.parseDouble(request.getParameter("txtPrecioProducto"));
		int existencias = Integer.parseInt(request.getParameter("txtExistenciasProducto"));
		
		Productos miProducto = new Productos(idProducto, nombreProducto, precioProducto, existencias);
		
		//Pasos para conectar a la base de datos
		
		
		//Paso 1. Declarar las variables de acceso
		String user="root";
		String pass="root";
		String urlServidor="jdbc:mysql://localhost:3306/mydb_2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		//Paso 2. Declarar los objetos conexión
		Connection conn=null;
		PreparedStatement pstmnt=null;
		String sentenciaSQL = "INSERT INTO Productos (id_Producto, nombre_Producto, precio_Producto, existencias_Producto) VALUES (?,?,?,?)";
		
		//Paso 3. Inicializar el driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//Paso 4. Abrir la conexión
			conn =  DriverManager.getConnection(urlServidor, user, pass);
			
			//Paso 5. Configurar el prepared statement
			pstmnt = conn.prepareStatement (sentenciaSQL);
			//Paso 6. Configurar la sentencia SQL
			pstmnt.setString(1, miProducto.getIdProducto());
			pstmnt.setString(2, miProducto.getNombreProducto());
			pstmnt.setDouble(3, miProducto.getPrecioProducto());
			pstmnt.setInt(4, miProducto.getExistencias());
			
			//Paso 7- Ejecutar el Prepared Statement
			int nRegistros = pstmnt.executeUpdate();
			if(nRegistros>0)
				response.getWriter().append("Registro si fue creado con exito");
			//Paso 8. Mostrar resultados
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				
				//Paso 7. Cerrar las conexiones.
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}


}
