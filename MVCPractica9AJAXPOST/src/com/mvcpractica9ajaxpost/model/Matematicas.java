package com.mvcpractica9ajaxpost.model;
/**
 * Esta clase matematicas me suve para demostrar el paso de parametros por el metodo porst mediante ajax.
 * Es el ejercicio 10 de practicas de MVC.
 * 
 * @author Neltzy
 * @version 1.0
 * @since 06 Agosto 2019
 * 
 */
public class Matematicas {
	
	/**
	 * El presete metrodo caclcula la potencia de un numero tomando como valores su nase y su exponente. La idea es calcular una potencia de tipo entera
	 *
	 * @param base Es la base de la potencia
	 * @param exponente Es el exponente de la potencia
	 * @return 
	 * @return Es la potencia de tipo entero calculada 
	 */

	public static int calculaPotencia(int base, int exponente)
	{
		return (int) Math.pow(base, exponente);
	}
	
}

