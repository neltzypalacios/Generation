package com.algoritmopractica8.model;

public class Auto extends Vehiculo 
{
	private String modelo;
	
	public void giroIzq()
	{
		
	}
	public void giroDer()
	{
		
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String getModelo()
	{
		return modelo;
	}
	@Override
	public String toString()
	{
		return super.toString()+" Modelo: "+modelo;
		//return "MaxFuel: "+maxFuel+" Max Numero Pasajeros: "+maxNroPasajeros+" Velocidad: "+velocidad+" Modelo: "+modelo;
	}
}
