package com.crudrest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crudrest.model.Productos;
import com.google.gson.Gson;

@Path("/productos")
public class ProductosService {

	@DELETE
	@Path("/{idProducto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String borrarProducto(@PathParam("idProducto") String idProducto) throws IOException
	{
        /*
        En props:
        crearRegistro = INSERT INTO Productos values (?,?,?,?)
        borrarREgistro DELETE FROM productos WHERE idProduct=?
        */

		Properties props = new Properties();
		InputStream miStream=null;
		String miArchivoProps = "config.properties";
		miStream = getClass().getClassLoader().getResourceAsStream(miArchivoProps);
		if(miStream!=null)
		{
			props.load(miStream);
		}
		else
		{
			throw new FileNotFoundException("Archivo de Propiedades:"+miArchivoProps+" no se encuentra");
		}
		
		//Paso 1. Declarar variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String miDriver = props.getProperty("driver");
		String sentenciaSQL = props.getProperty("borrarRegistro");
		String resultadoJson="";
		
		//Paso 2. Declarar objetos conexión
		Connection conn = null;
		PreparedStatement pstmnt = null;
        int nRegistros = 0;
		Productos miProducto = new Productos(idProducto,null,0.0,0);
		
		try {
			//Paso 3. Instanciar el driver
			Class.forName(miDriver).getDeclaredConstructor().newInstance();
			//Paso 4. Abrir la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			//Paso 5. Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(sentenciaSQL);
			//Paso 6. Pasar los parámetros al Prepared Statement
			pstmnt.setString(1, miProducto.getIdProducto());
			//Paso 7. Ejecutar la consulta
			nRegistros = pstmnt.executeUpdate();
			//Paso 8. Mostrar resultados
            Gson miGson = new Gson();
            if(nRegistros>0)
            {
                resultadoJson = "Registros borrados: "+nRegistros;
            }
            
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
            try 
            {
				pstmnt.close();
				conn.close();
            } catch (SQLException e) 
            {
				e.printStackTrace();
			}
		}
		return resultadoJson;
	}