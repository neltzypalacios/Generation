package com.algorimospractica3.application;

import com.algorimospractica3.model.Alumnos;

public class AlgoritmosPractica3Application 
{
	public static void main(String[] args) 
	{
	    //Instanciacion
		Alumnos emmanuel; //Reserva de espacio en memoria RAM
		emmanuel = new Alumnos(); // Creo, instancio o concretizo a la clase
		
		Alumnos gera = new Alumnos("22345678","Gera",8.5);
		
		emmanuel.setCodigoAlumno("123"); //emmanuel.codigoAlumno = "123";
		emmanuel.setNombreAlumno("Emmanuel");//emmanuel.nombreAlumno = "Emmanuel";
		emmanuel.setCalificacionAlumno(8.0);//emmanuel.calificacionAlumno = 8.0;
		
		System.out.println("Codigo de Emmanuel: "+emmanuel.getCodigoAlumno());
		System.out.println("Nombre de Emmanuel: "+emmanuel.getNombreAlumno());
		System.out.println("Calificacion de Emmanuel: "+emmanuel.getCalificacionAlumno());
		
		System.out.println("Codigo de Gera: "+gera.getCodigoAlumno());
		System.out.println("Nombre de Gera: "+gera.getNombreAlumno());
		System.out.println("Calificacion de Gera: "+gera.getCalificacionAlumno());
	}

}
