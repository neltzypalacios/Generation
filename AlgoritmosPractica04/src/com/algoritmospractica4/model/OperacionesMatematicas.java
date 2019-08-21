package com.algoritmospractica4.model;

public class OperacionesMatematicas 
{	
	private double numero1;
	private double numero2;
	
	public void setNumero1(double numero1)
	{
		this.numero1 = numero1;
	}
	public double getNumero1()
	{
		return numero1;
	}
	public void setNumero2(double numero2)
	{
		this.numero2 = numero2;
	}
	public double getNumero2()
	{
		return numero2;
	}
	public OperacionesMatematicas()
	{
		
	}
	public OperacionesMatematicas(double numero1, double numero2)
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public double getSumaNumeros(double numero1, double numero2)
	{
		return numero1+numero2;
	}
	public int getPotencia(int base, int exponente)
	{
		int potencia = 1;
		for(int i = 0; i < exponente; i++)
		{
			potencia *= base;
		}
		return potencia;
	}
	public int getFactorial(int rango)
	{
		int resultadoFactorial = 1;
		for(int i = rango; i > 1; i--)
		{
			resultadoFactorial *= i;
		}
		return resultadoFactorial;
	}
	public boolean getisPar(int numero)
	{
		if((numero%2)==0)
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean getisPrimo(int numero)
	{
		for (int i = 2; i < numero; i++)
		{
			if((numero%i)==0)
			{
				
				return false;
			}
		}
		return true;
		
	}
	public int getFibonacci()
	{
		int limite = 0;
		int acumulador = 0;
	    int numeroAnterior = 1;
	    int numeroSerie = 1;
	    
		int[] miArray = new int[100];
		
		for(int i = 0; i < limite; i++)
		{
			acumulador = numeroAnterior + numeroSerie;
			
		}
	}
}
