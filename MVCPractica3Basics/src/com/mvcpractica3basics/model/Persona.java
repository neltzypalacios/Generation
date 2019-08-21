package com.mvcpractica3basics.model;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String password;
	private int edad;
	private double telefono;
	
	public Persona(){}
	
	public Persona(String nombre, String apellido, String password, int edad, double telefono)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}

	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}

	public double getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(double telefono)
	{
		this.telefono=telefono;
	}

}
