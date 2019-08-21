package com.algoritmospractica14.application;

import java.util.ArrayList;
import java.util.Iterator;

public class TDA {

	public static void main(String[] args) {
		ArrayList<String> miLista = new ArrayList<String>();
		
		miLista.add("Miguel Angel");
		miLista.add("Gerardo");
		miLista.add("Magda");
		miLista.add("Jani");
		
		Iterator<String> miIterator = miLista.iterator();
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}
		
		ArrayList<Integer> miLista2 = new ArrayList<Integer>();
		miLista2.add(1);
		miLista2.add(2);
		miLista2.add(100);
		miLista2.add(255);
		miLista2.add(356);
		
		for(Integer miEntero: miLista2) //Foreach para recorrer un TDA
		{
			System.out.println(miEntero);
		}
		
		Iterator<Integer> miIterator2 = miLista2.iterator(); //Iterator para recorrer un TDA
		while(miIterator2.hasNext())
		{
			System.out.println(miIterator2.next());
		}
	}

}
