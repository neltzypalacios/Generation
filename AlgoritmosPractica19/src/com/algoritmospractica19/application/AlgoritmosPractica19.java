package com.algoritmospractica19.application;

import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class AlgoritmosPractica19 {

	public static void main(String[] args) {
		PriorityQueue<String> miQueue = new PriorityQueue<String>(); //FIFO Ordenada
		
		miQueue.add("Hola");
		miQueue.add("Mundo");
		miQueue.add("con");
		miQueue.add("Queue");
		miQueue.add("Java");
		
		System.out.println(miQueue.poll());
		System.out.println(miQueue.remove());
		System.out.println(miQueue.remove());
		System.out.println(miQueue.remove());
		System.out.println(miQueue.remove());
		
		while(!miQueue.isEmpty())
		{
			System.out.println(miQueue.poll());
		}
		
		ArrayDeque<String> miDeque = new ArrayDeque<String>(); //FIFO
		
		miDeque.add("Hola");
		miDeque.add("Mundo");
		miDeque.add("con");
		miDeque.add("Queue");
		miDeque.add("Java");
		
		System.out.println(miDeque.poll());
		System.out.println(miDeque.remove());
		System.out.println(miDeque.remove());
		System.out.println(miDeque.remove());
		System.out.println(miDeque.remove());
		
		
	}

}
