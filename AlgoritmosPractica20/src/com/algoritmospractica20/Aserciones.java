package com.algoritmospractica20;

import java.util.Scanner;

public class Aserciones {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unchecked") //Anotacion para eliminar warnings
		Scanner escaner = new Scanner(System.in);
		
		int edad = 0;
		
		System.out.println("Introduce tu edad: ");
		edad = escaner.nextInt();
		
		assert (edad>=18): "Edad no valida"; // Para hacer pruebas
		
		System.out.println("La edad es: "+edad);
	}

}
