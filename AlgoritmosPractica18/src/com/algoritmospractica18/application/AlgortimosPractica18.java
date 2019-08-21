package com.algoritmospractica18.application;

//import java.util.Iterator;
import java.util.Stack;

public class AlgortimosPractica18 {

	public static void main(String[] args) {
		Stack<String> miPila = new Stack<String>();
		
		miPila.push("Magda");
		miPila.push("Omar");
		miPila.push("Neltzy");
		miPila.push("Nicole");
		miPila.push("Jebus");
		
		/*Iterator<String> miIterator = miPila.iterator(); //Recorrido por la pila sin vaciarla
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}*/
		
		while(!miPila.empty()) //Recorrer la pila
		{
			System.out.println(miPila.pop());
		}
		
		/*System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());*/
		
	}

}
