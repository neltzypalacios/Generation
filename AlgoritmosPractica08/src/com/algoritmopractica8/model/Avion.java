package com.algoritmopractica8.model;

public class Avion extends Vehiculo 
{
	private double maximaAltitud;
	private int numeroMotores;
	
	public void setMaximaAltitud(double maximaAltitud)
	{
		this.maximaAltitud = maximaAltitud;
	}
	public double getMaximaAltitud()
	{
		return maximaAltitud;
	}
	public void setNumeroMotores(int numeroMotores)
	{
		this.numeroMotores = numeroMotores;
	}
	public int getNumeroMoteres()
	{
		return numeroMotores;
	}
	public void ascender(double ratio)
	{
		
	}
	public void descender(double ratio)
	{
		
	}
	@Override
	public String toString()
	{
		return "MaxFuel: "+maxFuel+" Max Numero Pasajeros: "+maxNroPasajeros+" Velocidad: "+velocidad+" Maxima Altitud: "+maximaAltitud+" Numero Motores: "+numeroMotores;
	}
}
