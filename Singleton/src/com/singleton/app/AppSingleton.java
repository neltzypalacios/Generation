package com.singleton.app;

import com.singleton.model.Empleado;

public class AppSingleton {

	public static void main(String[] args) {
		Empleado miObjeto = Empleado.getInstancia();
		miObjeto.setNombre("Neltzy");
		System.out.printline("Nombre de Empleado: "+miObjeto.getNombreEmpleado());
		
		Empleado miObjeto2 = Empleado.getInstancia();
		x
		
	}

}
