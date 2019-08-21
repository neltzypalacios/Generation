package com.algoritmospractica21.application;

public class AlgoritmosPractica21Enums {

	public enum Temporada
	{
		PRIMAVERA,
		VERANO,
		OTONO,
		INVIERNO
	}
	public static void main(String[] args) 
	{
		for(Temporada tempo : Temporada.values())
		{
			System.out.println(tempo);
		}
		
		Temporada miTemporada = Temporada.PRIMAVERA;
		System.out.println(miTemporada.name() + miTemporada.ordinal());

	}

}
