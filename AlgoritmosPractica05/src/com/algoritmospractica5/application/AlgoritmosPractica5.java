package com.algoritmospractica5.application;

import java.util.Random;

public class AlgoritmosPractica5 {

	public static void main(String[] args) 
	{
		final int MAX_ELEMENTOS_VECTOR = 100;
		int[] arregloEnteros = new int[MAX_ELEMENTOS_VECTOR];
		double[] arregloDouble = new double[MAX_ELEMENTOS_VECTOR];
		char[] arreglochar = new char[MAX_ELEMENTOS_VECTOR];
		//char[] arreglochar = {'P','E','R','R','O'};
		//char arreglochar[] = {'P','E','R','R','O'};
		String[] arregloCadena = new String[MAX_ELEMENTOS_VECTOR];
		boolean[] arregloBooleanos = new boolean[MAX_ELEMENTOS_VECTOR];
		
		// Generacion de numeros pseudoaleatorios
		Random rand = new Random(System.nanoTime());
		double miNumeroAleatorio = 0.0;
		int miNumeroAleatorioEntero = 0;
		double mediaAritmetica = 0;
		double sumatoria = 0;
		
		//miNumeroAleatorioEntero = rand.nextInt(100);
		//System.out.println("Numero pseudo aleatorio entero"+miNumeroAleatorioEntero);
		
		//miNumeroAleatorio = rand.nextDouble();
		//System.out.println("Numero pseudo aleatorio double"+miNumeroAleatorio);
		
		// Llenado del vector de enteros mediante la funcion random
		for(int i = 0; i < arregloEnteros.length; i++)
		{
			arregloEnteros[i] = rand.nextInt(100);
		}
		// Procesado del vector
		for(int i = 0; i < arregloEnteros.length; i++)
		{
			sumatoria = sumatoria + arregloEnteros[i];
		}
		
		mediaAritmetica = sumatoria / arregloEnteros.length;
		System.out.println("La media es: "+mediaAritmetica);
		
		// Visualizacion del vector
		for(int i = 0; i < arregloEnteros.length; i++)
		{
			System.out.print(arregloEnteros[i]+" "); 
		}
	}

}
