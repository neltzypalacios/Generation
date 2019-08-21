package com.algoritmospractica2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;

public class StreamsApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new FileReader("archivos.txt"));
		
		String s, s2 = new String();
		while((s = lector.readLine())!=null)
		{
			s2 += s + "\n";
			System.out.println(s2);
		}
		
		lector.close();
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Line");
		System.out.println(stdin.readLine());
		
		/* Otra forma de trabajar con archivos*/
		File miArchivo = new File("archivos.txt");
		FileReader reader = null;
		BufferedReader buffer = null;
		String linea;
		try
		{
			reader = new FileReader(miArchivo);
			buffer = new BufferedReader(reader);
			
			while((linea = buffer.readLine())!=null)
			{
				System.out.println(linea);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			buffer.close();
			reader.close();
		}
		
	}

}
