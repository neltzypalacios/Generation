package com.subrutinaspractica2.application;

public class SubrutinasPractica2Application {

	public static void main(String[] args) 
	{
		System.out.println("La suma de 2+2="+sumaNumeros(2,2));

	}
	
	public static void saludo()
	{
		System.out.println("Hola Mundo");
	}
	public static void saludoConNombre(String nombre)
	{
		System.out.println("Hola "+nombre);
	}
	public static int sumaNumeros(int numero1,int numero2)
	{
		int suma = 0;
		suma = numero1 + numero2;
	    return suma;
	}

}
