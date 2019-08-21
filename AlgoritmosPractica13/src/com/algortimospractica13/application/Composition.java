package com.algortimospractica13.application;

import com.algortimospractica13.model.Empleado;
import com.algortimospractica13.model.Domicilio;

public class Composition {

	public static void main(String[] args) 
	{
		Domicilio dom = new Domicilio();
		dom.setNombreCalle("Lopez Mateos");
		dom.setNumeroExterior("60E");
		dom.setNumeroInterior("70I");
		
		Empleado emp = new Empleado();
		emp.setIdEmpleado(101);
		emp.setNombreEmpleado("Gera");
		emp.setDomicilio(dom);
		System.out.println(emp.getDomicilio().getNombreCalle());
	}

}
