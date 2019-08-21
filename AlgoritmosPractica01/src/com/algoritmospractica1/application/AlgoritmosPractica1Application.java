package com.algoritmospractica1.application;

import java.util.Scanner;

public class AlgoritmosPractica1Application 
{

	public static void main(String[] args) 
	{
		//Operación de aceptar entrada por parte de el usuario
		Scanner entradaTeclado = new Scanner(System.in);
		String nombre;
		int nNombre;
		int mes;
		double salarioMensual;
		int contador = 0;
		final double SALARIO_MENSUAL_PROMEDIO = 10000;
		
		//Imprimir "Dame tu nombre"
		System.out.println("Dame tu nombre");
		nombre = entradaTeclado.nextLine();
		
		//Imprimir "El nombre introducido es;xxxx"
		System.out.println("El nombre indroducido es: "+nombre);
		
		System.out.println("Introduce tu salario: ");
		salarioMensual = entradaTeclado.nextDouble();
		if(salarioMensual == 0)
		{
			System.out.println("Pauperrimo");
		}
		else if(salarioMensual > 0 && salarioMensual <= SALARIO_MENSUAL_PROMEDIO)
		{
			System.out.println("Salario minimo");
		}
		else if(salarioMensual > SALARIO_MENSUAL_PROMEDIO)
		{
			System.out.println("Salario muy bueno");
		}
		
		System.out.println("Cuantas veces quieres mostrar tu nombre: ");
		nNombre = entradaTeclado.nextInt();
		
		//Ciclo For
		for(int i=0; i < nNombre; i++)
		{
			System.out.println(nombre);
		}
		//Ciclo While
		
		while (contador < nNombre)
		{
			System.out.println(nombre);
			contador++;
		}
		//Ciclo Do-While
		contador = 0;
		do
		{
			System.out.println(nombre);
			contador++;
		}while (contador < nNombre);
		
		//Pedir los meses del a;o
		System.out.println("Introduce el numero del mes del a;o");
		mes = entradaTeclado.nextInt();
		switch(mes)
		{
			case 1: System.out.println("Enero");
				break;
			case 2: System.out.println("Febrero");
				break;
			case 3: System.out.println("Marzo");
				break;
			case 4: System.out.println("Abril");
				break;
			case 5: System.out.println("Mayo");
				break;
			case 6: System.out.println("Junio");
				break;
			case 7: System.out.println("Julio");
				break;
			case 8: System.out.println("Agosto");
				break;
			case 9: System.out.println("Septiembre");
				break;
			case 10: System.out.println("Octubre");
				break;
			case 11: System.out.println("Noviembre");
				break;
			case 12: System.out.println("Diciembre");
				break;
			default: System.out.println("Mes incorrecto");
				break;
		}
	}

}
