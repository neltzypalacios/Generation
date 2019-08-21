package com.singleton.model;

import java.io.FileNotFoundException;

public class Empleado 
{

	private String nombreEmpleado;
	private Empleado instanciaEmpleado=null;
	
	private Empleado() {}
	
	public Empleado getInstancia()
	{
		if(instanciaEmpleado==null)
		{
			instanciaEmpleado = new Empleado();
		}
		return instanciaEmpleado;
	}
	
	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}
	
	public void setNombre(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}
	
}
