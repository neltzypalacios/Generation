package com.algoritmospractica7.model;

public class Alumnos 
{
	private String nombre;
	private String domicilio;
	public static String vecindario = "Ijalti";
	public Alumnos()
	{
		
	}
	public Alumnos(String nombre, String domicilio)
	{
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getDomicilio()
	{
		return domicilio;
	}
	public void setDomicilio(String domicilio) 
	{
		this.domicilio = domicilio;
	}
	public String getVecindario()
	{
		return vecindario;
	}
}
