package com.restpractica4cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClienteRestApp {

	public static void main(String[] args) {
		System.out.println("Introduce el id del Producto a Buscar:");
		Scanner entrada = new Scanner(System.in);
		String idProducto = entrada.next();
		
		String uri = "http://localhost:8080/CRUDRest/productos/"+idProducto;
		URL miURLEndpoint = null;
		
		try 
		{
			miURLEndpoint = new URL(uri);
			HttpURLConnection miConexion = (HttpURLConnection) miURLEndpoint.openConnection();
			miConexion.setRequestMethod("GET");
			miConexion.setRequestProperty("Accept", "application/json; charset=UTF-8");
			
			if (miConexion.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ miConexion.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(miConexion.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				miConexion.disconnect();
			
		} catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
