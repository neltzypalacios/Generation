package com.algoritmospractica9.application;

import com.algoritmospractica9.model.Cadenitas;

public class AlgoritmosPractica9 {

	public static void main(String[] args) {
		String miCadena = new String("Este es un texto de prueba pra testear la clase cadena de la API de Java Version 12.");
		
		String[] miCadena2 = {"Esta es otra forma de declarar una cadena"};
		miCadena2[0] = "Hola.";
		
		byte[] numeritos = miCadena.getBytes(); // Conversion de una cadena en un arreglo de bytes con su respectivo codigo ascii
		
		System.out.println(Cadenitas.dameCaracterIndice(miCadena, 6));
		System.out.println(miCadena.codePointAt(6)); //Regresa el codigo ascii del caracter 
		System.out.println(miCadena.codePointCount(5,8)); //Regresa el numero de caracteres ascii en el rango dado 
		System.out.println(miCadena.compareTo(miCadena2[0])); // Comparacion Lexicografica
		System.out.println(miCadena.equals(miCadena2[0])); //Comparacion de cadenas regresa True o False
		System.out.println(miCadena.endsWith(".")); //Comparar la terminacion de una cadena
		System.out.println(miCadena.startsWith("E")); //Comparar como inicia una cadena
		
		int operador1 = 3, operador2 = 4, resultado = operador1 + operador2;
		System.out.println(String.format("La sumatoria de %d y %d es igual a %d", operador1, operador2, resultado)); // Formateo de salidas
		
		for(int i = 0; i < numeritos.length; i++)
			System.out.print(numeritos[i]+",");
		
		System.out.println("");
		
		for(byte b:numeritos)  // Foreach en Java
			System.out.print(b+",");
		
		// Non Greedy = Tecnica de busqueda, se detiene cuando encuentra la primer incidencia
		// Greddy = Tecnica de busqueda, continua buscando incidencias y regresa la ultima
		
		System.out.println("");
		System.out.println("La u se encuentra en la posicion: "+miCadena.indexOf('u')); //Busqueda de caracteres * Non Greedy
		System.out.println("La u se encuentra en la posicion: "+miCadena.indexOf("texto")); //Busqueda de cadenas
		System.out.println(miCadena.isEmpty()); //Comprobar si una cadena esta vacia
		
		System.out.println("La ultima u se encuentra en la posicion: "+miCadena.lastIndexOf('u')); //Busqueda de caracteres * Greedy
		
		System.out.println(miCadena.length()); // En este caso se trata de un metodo de la clase String
		System.out.println(miCadena2.length); // En este caso se trata de un atributo de la clase String[]
		
		String cadenaEvaluar = "      micorreo@outlook.com         ";
		System.out.println(cadenaEvaluar.matches("[A-Za-z]+@[A-Za-z]+.[A-Za-z]{3}"));
		
		System.out.println(miCadena.replace('u', 'a')); // Reemplazo de caracteres en una cadena (caracter viejo, caracter nuevo)
		
		String[] miTexto = cadenaEvaluar.split("[@]"); //Partir una cadena cuando se encuentre dicho caracter
		for(String cadena : miTexto)
		{
			System.out.println(cadena.strip()); // Retira los espacios en blanco de una cadena
		}
		
		System.out.println(miCadena.substring(10,20)); //Extrae una parte de la cadena (inicio,fin)
		
		char[] miCadenaChars = miCadena.toCharArray(); //Convertir la cadena en un arreglo de caracteres
		int cont = 0;
		for(int i=0;i<miCadenaChars.length;i++)
		{
			if(miCadenaChars[i] == 'e')
				cont++;
		}
		System.out.println("La cantidad de e es:"+cont);
		
		System.out.println(miCadena.toLowerCase()); //Convertir toda la cadena en minusculas
		System.out.println(miCadena.toUpperCase()); //Convertir toda la cadena en mayusculas
		System.out.println(String.valueOf('C')); //Convierte un caracter en una cadena
	}

}
