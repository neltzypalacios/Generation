package com.algoritmopractica8.model;

public abstract class Vehiculo implements Vehicleable, NavesEspacialeable// Clase abstracta (No es semanticamente correcto instanciarla
{
	protected double maxFuel;
	protected int maxNroPasajeros;
	protected double velocidad;
	
	public void acelerar(double ratio)
	{
		velocidad = velocidad + ratio;
	}
	public void desacelerar(double ratio)
	{
		velocidad = velocidad - ratio;
	}
	public void setMaxFuel(double maxFuel)
	{
		this.maxFuel = maxFuel;
	}
	public double getMaxFuel()
	{
		return maxFuel;
	}
	public void setMaxNroPasajeros(int maxNroPasajeros)
	{
		this.maxNroPasajeros = maxNroPasajeros;
	}
	public double getMaxNroPasajeros()
	{
		return maxNroPasajeros;
	}
	public void setVelocidad(double velocidad)
	{
		this.velocidad = velocidad;
	}
	public double getVelocidad()
	{
		return velocidad;
	}
	@Override     //Notacion para referenciar que se esta sobreescribiendo el metodo toString
	public String toString() //Nomenclatura o Convencionalismo para dicho metodo
	{
		return "MaxFuel: "+maxFuel+" Max Numero Pasajeros: "+maxNroPasajeros+" Velocidad: "+velocidad;
	}
}
