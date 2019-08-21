package com.algorimospractica3.model;

public class Alumnos 
{
	private String codigoAlumno;
	private String nombreAlumno;
	private double calificacionAlumno;
	
	public Alumnos()
	{
		
	}
	public Alumnos(String codigoAlumno, String nombreAlumno, double calificacionAlumno)
	{
		this.codigoAlumno = codigoAlumno;
		this.nombreAlumno = nombreAlumno;
		this.calificacionAlumno = calificacionAlumno;
	}
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno = nombreAlumno;
	}
	public String getCodigoAlumno()
	{
		return codigoAlumno;
	}
	public void setCodigoAlumno(String codigoAlumno)
	{
		this.codigoAlumno = codigoAlumno;
	}
	public double getCalificacionAlumno()
	{
		return calificacionAlumno;
	}
	public void setCalificacionAlumno(double calificacionAlumno)
	{
		this.calificacionAlumno = calificacionAlumno;
	}
}
