package com.restpractica3crud;
import java.util.Properties;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Productos")
public class Productos {
	
		@GET
		@Path("/{idProducto}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.TEXT_PLAIN)
		public String leerProducto(@PathParam("idProducto") String id_Producto)
		{
			Properties props = new Properties();
			InputStream myStream = null;
			String myPropsFile = "config.properties";
			myStream = GET.class.getClassLoader().getResourceAsStream(myPropsFile);
			
			if(myStream!=null)
			{
				props.load(myStream);
			}
			else
			{
				throw new FileNotFoundException("Properties file: "+myPropsFile+"is missing");
			}
			
			//Paso 1 Declarar variables
			String user = props.getProperty("user");
			String pass = props.getProperty("pass");
			String urlServidor = props.getProperty("urlServidor");
			String driver = props.getProperty("driver");
			String sentenciaSQLString = props.getProperty("leerProducto");
			
			//Paso 2 Declarar objetos
			Connection conn=null;
			PreparedStatement pstmnt = null;
			ResultSet rs = null;
			Productos miProducto = new Productos();
			
			//Paso 3 Inicializar driver jdbc
			//Paso 4 Abrir conexion
			
			//Paso 8 Generar una salida
			
			
			
			return "";
		}

}
