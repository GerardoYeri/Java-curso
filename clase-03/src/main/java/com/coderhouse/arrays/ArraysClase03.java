package com.coderhouse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysClase03 {

	public static void main(String[] args) {
		
		int[] numerosEnteros = new int[6];
		
		numerosEnteros[0] = 10; //guardo 10 en pos 0
		
		numerosEnteros[1] = 5;
		numerosEnteros[2] = 3;
		numerosEnteros[3] = 12;
		numerosEnteros[4] = 9;
		numerosEnteros[5] = 13;
		//numerosEnteros[6] = 0; //error desbordamiento
		
		//System.out.println("Posicion en memoria: " +numerosEnteros);
		
		//System.out.println("El array numerosEnteros tiene "
		//		+ numerosEnteros.length + " Elementos");
		
/*		System.out.println("El elemento con el indice 0 es: "+ numerosEnteros[0]);
		System.out.println("El elemento con el indice 1 es: "+ numerosEnteros[1]);
		System.out.println("El elemento con el indice 2 es: "+ numerosEnteros[2]);
		System.out.println("El elemento con el indice 3 es: "+ numerosEnteros[3]);
		System.out.println("El elemento con el indice 4 es: "+ numerosEnteros[4]);
		System.out.println("El elemento con el indice 5 es: "+ numerosEnteros[5]);
		*/
	
		//System.out.println(Arrays.toString(numerosEnteros));
		
		/*String[] palabras = {
				"Hola", 
				"Mundo", 
				"Coder",
				"Java",
				"Sara",
		};
		
		//System.out.println("El array palabras tiene "
					+ palabras.length + " Elementos");
		*/
		//System.out.println(Arrays.toString(palabras));
		
		// Listas
		
		/*List<String> listaDeNombres = new ArrayList<>();
		
		
		listaDeNombres.add("Alejandro");
		listaDeNombres.add("Roberto");
		listaDeNombres.add("Sara");
		listaDeNombres.add("Marcelo");
		*/
		/*List<String> listaDeNombres2 = new ArrayList<>();
		
		listaDeNombres2.add("Rodrigo");
		listaDeNombres2.add("Gary");
		
		listaDeNombres.addAll(listaDeNombres2); //agrega los nombres de la lista 2
		
		System.out.println("LA lista listaDeNombre tiene "+listaDeNombres.size());
		*/
		//System.out.println("LA lista listaDeNombre contiene a listaDeNombres2 "
		//+ listaDeNombres.containsAll(listaDeNombres2));
	
		
		/*listaDeNombres.remove(3); //remueve marcelo
		
		System.out.println("LA lista listaDeNombre tiene "+listaDeNombres.size());
		
		System.out.println(listaDeNombres);
		*/
		/*listaDeNombres.removeAll(listaDeNombres2);
		
		System.out.println("LA lista listaDeNombre tiene "+listaDeNombres.size());
		
		System.out.println("LA lista listaDeNombre contiene a listaDeNombres2 "
				+ listaDeNombres.containsAll(listaDeNombres2));
		*/
		
		/*
		for(String nombre : listaDeNombres) {
			System.out.println("Nombre : " + nombre);
		}
		
		for(int i = 0; i <listaDeNombres.size(); i++) {
			System.out.println("Nombre "+ listaDeNombres.get(i));
		}
		
		System.out.println(listaDeNombres.isEmpty()); // false
		
		listaDeNombres.removeAll(listaDeNombres); // quita una lista dentro de otra
		listaDeNombres.clear(); //vacia la lista
		
		if (listaDeNombres.isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println(listaDeNombres);
		}
		*/
		
		/*System.out.println(listaDeNombres);
		
		int posicion = 4;
		
		System.out.println("El elemento con la posicion n° "+ posicion + " es: "
				+ listaDeNombres.get(posicion));
		
		listaDeNombres.set(posicion, "Roberto cambiado");
		
		System.out.println(listaDeNombres);
		
		String nombre = "Sara";
		
		System.out.println("El indice del nombre "+ nombre+ " es "+ listaDeNombres.indexOf(nombre));
		
		*/
		
List<String> listaDeNombres = new ArrayList<>();
		
		
		listaDeNombres.add("Alejandro");
		listaDeNombres.add("Roberto");
		listaDeNombres.add("Sara");
		listaDeNombres.add("Marcelo");
		
		/*Iterator<String> iterator = listaDeNombres.iterator();
		
		//Ciclos por condicion
		while(iterator.hasNext()){
			String nombre = iterator.next();
			System.out.println("Nombre : "+ nombre);
			iterator.remove();
		}
		*/
		
		/*do {
			System.out.println("Al menos 1 vez");
		}while (false);
		*/
		
		listaDeNombres.forEach(nombre ->{
			System.out.println("Nombre : " + nombre );
			
		});
		
		
	}
}
