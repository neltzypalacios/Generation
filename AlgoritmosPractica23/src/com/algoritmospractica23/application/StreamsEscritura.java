package com.algoritmospractica23.application;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamsEscritura {

	public static void main(String[] args) throws IOException {
		String[] s = {"Hola","Mundo","Que","Tal"};
		
		PrintWriter escribe = new PrintWriter(new BufferedWriter(new FileWriter("archivoescritura.txt")));
		
		int lineCount = 1;
		for(int i=0; i<s.length;i++)
		{
			escribe.println(lineCount++ + ":" + s[i]);
		}
		escribe.close();
		
		/*Otra Manera de trabajar con escritura de archivos*/
		File miArchivo = new File("archivosescritura.txt");
		FileWriter miWriter = null;
		BufferedWriter miBuffer = null;
		Scanner entradaTeclado = new Scanner(System.in);
		
		try
		{
			miWriter = new FileWriter(miArchivo, true);
			miBuffer = new BufferedWriter(miWriter);
			miBuffer.write("Hola Mundo");
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				miBuffer.close();
				miWriter.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
