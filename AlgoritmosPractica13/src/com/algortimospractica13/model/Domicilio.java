package com.algortimospractica13.model;

public class Domicilio 
{
	private String nombreCalle;
	private String numeroInterior;
	private String numeroExterior;
	
	public Domicilio()
	{
		nombreCalle = "No especificado";
		numeroInterior = "N/A";
		numeroExterior = "N/A";
	}
	public String getNombreCalle()
	{
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle)
	{
		this.nombreCalle = nombreCalle;
	}
	public String getNumeroExterior()
	{
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior)
	{
		this.numeroExterior = numeroExterior;
	}
	public String getNumeroInterior()
	{
		return numeroInterior;
	}
	public void setNumeroInterior(String numeroInterior)
	{
		this.numeroInterior = numeroInterior;
	}
}
