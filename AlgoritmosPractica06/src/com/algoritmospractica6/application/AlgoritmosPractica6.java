package com.algoritmospractica6.application;

import java.util.Random;
import com.algoritmospractica6.model.AlgoritmosArreglitos;

public class AlgoritmosPractica6 
{
	public static void main(String[] args) 
	{
		final int MAX_ARRAY_ELEMENTS = 5;
		final int TOP_LIMIT = 100;
		int cantidadPares;
		
		int[] miVector = new int[MAX_ARRAY_ELEMENTS];
		Random pseudoaleatorios = new Random(System.nanoTime());
		
		// Pasada 1 - Inicializacion de valores
		for (int i=0;i<miVector.length;i++)
		{
			miVector[i] = pseudoaleatorios.nextInt(TOP_LIMIT);
		}
		// Pasada 2 - Procesado 
		
		cantidadPares = AlgoritmosArreglitos.cantidadPares(miVector);
		System.out.println("La cantidad de pares es: "+cantidadPares);
		// Pasada 3 - Visualizacion
		for (int i=0;i<miVector.length;i++)
		{
			System.out.print(miVector[i]+" ");
		}
	}
}
