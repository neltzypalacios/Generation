package com.junitpractica1.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.junitpractica1.model.Operaciones;

public class OperacionesTest {

	Operaciones objOperaciones = new Operaciones();
	
	@Test
	public void testSumaEnteros() {

		
		int resultadoReal;
		int resultadoEsperado=20;
		
		resultadoReal = objOperaciones.sumaEnteros(10, 10);
		
		assertEquals(resultadoEsperado, resultadoReal,0.01);
		//Margen de error 0.01 y como es double lleva "," antes
	}
	
	public void testSumaDoble() {
		
		int resultadoReal;
		int resultadoEsperado;
		
		resultadoReal = objOperaciones.sumaDoubles(10.0, 10.0);
		
		assertEquals(resultadoEsperado, resultadoReal,0.01);
	}
	
	

}
