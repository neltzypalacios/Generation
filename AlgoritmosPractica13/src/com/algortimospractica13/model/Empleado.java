package com.algortimospractica13.model;

public class Empleado 
{
	private int idEmpleado;
	private String nombreEmpleado;
	private Domicilio domicilio;
	
	public Empleado()
	{
		idEmpleado = 000;
		nombreEmpleado = "Sin nombre";
		//domicilio = new Domicilio(); //Mala practica ya que incrementa el acoplamiento
	}
	public Empleado(int idEmpleado, String nombreEmpleado, Domicilio domicilio)
	{
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.domicilio = domicilio;
	}
	public int getIdEmpleado()
	{
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}
	public Domicilio getDomicilio()
	{
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio)
	{
		this.domicilio = domicilio;
	}
}
