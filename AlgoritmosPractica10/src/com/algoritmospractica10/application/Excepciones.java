package com.algoritmospractica10.application;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones 
{
	public static void main(String[] args)
	{
		Scanner entradaTeclado = new Scanner(System.in);
		int numero;
		char respuesta = 's';
		while(respuesta == 's')
		{	
			try 
			{
				System.out.println("Introduce un numero entero");
				numero = entradaTeclado.nextInt();
				System.out.println(String.format("El numero introducido es: %d",numero*numero));
				
			}
			catch (InputMismatchException e)
			{
				//e.printStackTrace();
				entradaTeclado.next();
				System.out.println("Entrada No Valida.");
			}
			System.out.println("Deseas calcular otro numero (s/n)");
			respuesta = entradaTeclado.next().charAt(0);
		}		
		
	}
}
