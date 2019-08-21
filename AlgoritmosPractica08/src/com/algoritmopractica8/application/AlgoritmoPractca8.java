package com.algoritmopractica8.application;

import com.algoritmopractica8.model.Vehiculo;
import com.algoritmopractica8.model.Auto;
import com.algoritmopractica8.model.Avion;

public class AlgoritmoPractca8 
{
	public static void main(String[] args) 
	{
		Vehiculo miVehiculo;
		miVehiculo = new Auto();
		
		Auto miAuto = new Auto();
		Avion miAvion = new Avion();
		
		miVehiculo.setMaxFuel(100);
		miVehiculo.setMaxNroPasajeros(5);
		miVehiculo.setVelocidad(100);
		
		System.out.println(miVehiculo.toString());
		
		miAuto.setMaxFuel(200);
		miAuto.setMaxNroPasajeros(4);
		miAuto.setVelocidad(80);
		miAuto.setModelo("2016");
		
		System.out.println(miAuto.toString());
		
		miAvion.setMaxFuel(1000);
		miAvion.setMaxNroPasajeros(150);
		miAvion.setVelocidad(1500);
		miAvion.setMaximaAltitud(170);
		miAvion.setNumeroMotores(6);
		
		System.out.println(miAvion.toString());
		
	}

}
