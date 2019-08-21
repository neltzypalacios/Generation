package com.algoritmospractica4.application;

import com.algoritmospractica4.model.OperacionesMatematicas;
import java.util.Scanner;

public class SumadorPractica4 
{
	public static void main(String[] args) 
	{
		
		Scanner entradaDatos = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Dame el primer numero: ");
		num1 = entradaDatos.nextInt();
		//System.out.println("Dame el segundo numero: ");
		//num2 = entradaDatos.nextInt();
		
		OperacionesMatematicas calculadora = new OperacionesMatematicas();
				
		//System.out.println("La s "+num1+" + "+num2+" = "+calculadora.getPotencia(num1, num2));
		System.out.println("El numero es primo "+calculadora.getisPrimo(num1));
		entradaDatos.close();
	}

}
