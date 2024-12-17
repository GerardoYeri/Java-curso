package com.coderhouse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjerciciosClase03 {

	public static void main(String[] args) {
		
		//1.Crea un array de enteros de tamaño 5 y asigna valores a cada elemento.
		
		int numeroEnteros[] = new int[5];
		
		numeroEnteros[0] = 1;
		numeroEnteros[1] = 2;
		numeroEnteros[2] = 3;
		numeroEnteros[3] = 4;
		numeroEnteros[4] = 5;
		
		for(int numeros : numeroEnteros)
			System.out.println(numeros);
		
		//2.Suma todos los elementos de un array de enteros y muestra el resultado.
		int suma = 0;
		for(int i = 0; i < numeroEnteros.length ; i++) {
			suma = suma + numeroEnteros[i];
		}
		System.out.println("El total de la suma de todos los numeros es: "+suma);
			
//		for (int suma : numeroEnteros) {
//			
//			System.out.println(suma);
//		}
		
		//3.Encuentra el número mayor en un array de enteros.
		
		int mayor = numeroEnteros[0];
		int posicionMayor = 0;
		for(int i = 0; i < numeroEnteros.length; i++) {
			if ( numeroEnteros[i] > mayor) {
				mayor = numeroEnteros[i];
				posicionMayor = i;
			}
		}
		
		System.out.println("El numero MAYOR es: "+mayor+ " en la posicion "+ posicionMayor);
		
		//4.Encuentra el número menor en un array de enteros
		
		int menor = numeroEnteros[0];
		int posicionMenor = 0;
		for(int i = 0; i < numeroEnteros.length; i++) {
			if ( numeroEnteros[i] < menor) {
				menor = numeroEnteros[i];
				posicionMenor = i;
			}
		}
		
		System.out.println("El numero MENOR es: "+menor+ " en la posicion "+ posicionMenor);
		
		//5.Cuenta cuántos números pares hay en un array.
		
		int numeroPares = 0;
		
		for(int i = 0; i <numeroEnteros.length; i++) {
			if(numeroEnteros[i] % 2 == 0) {
				numeroPares = numeroPares + 1;
			}
		}
		
		System.out.println("La cantidad de numero pares es "+ numeroPares);
		
		//6.Invierte los elementos de un array de enteros.
		
		for(int i = 0; i < numeroEnteros.length/2; i++) {
			numeroEnteros[i] = numeroEnteros[i] + numeroEnteros[numeroEnteros.length-1-i];
			numeroEnteros[numeroEnteros.length-1-i] = numeroEnteros[i] - numeroEnteros[numeroEnteros.length-1 -i];
			numeroEnteros[i] = numeroEnteros[i] - numeroEnteros[numeroEnteros.length-1-i];
			}
		System.out.println("Array invertido");
		for(int numeros : numeroEnteros) {
			System.out.println(numeros);
		}
		
		//7.Crea un array de cadenas y muestra sus elementos.
		
		String[] cadenas = {"Lucas", "Gerardo", "Mateo"};
		
		for(String nombre : cadenas) {
			System.out.println(nombre);
		}
		
		//8.Ordena un array de enteros en orden ascendente.
		
		int[] numeros = {20,10,30};
		
		Arrays.sort(numeros);
		
		System.out.println("Array ordenado acendente");
		for(int num : numeros) {
			System.out.println(num);
		}
		
		//9.Encuentra si un número está en un array y muestra su índice.
		
		int[] valores = {40, 60 ,10};
		
		int indiceNumero = 0;
		
		for(int i = 0; i< valores.length;i++) {
		if(valores[i]== 10) {
			 indiceNumero = i;
		}
		}
		System.out.println("El numero 10 esta en el indice "+indiceNumero);
		
		//10.Muestra los elementos de un array en orden inverso.
		
		String[] usuarios = {"Lucas", "Pedro", "Juan"};
		
		System.out.println("Elementos en el orden inverso:");
		
		for(int i = usuarios.length -1; i >= 0;i--) {
			System.out.println(usuarios[i]);
		}
		
		
		//List
		
		//11.Crea una List de números enteros y añade 5 valores.
		
		List<Integer> listaEnteros = new ArrayList<>();
		
		listaEnteros.add(10);
		listaEnteros.add(20);
		listaEnteros.add(30);
		listaEnteros.add(40);
		listaEnteros.add(50);
		
		for(int enteros : listaEnteros) {
			System.out.println(enteros);
		}
		
		//12.Elimina el primer elemento de una List de enteros.
		
		System.out.println("Nueva lista:");
		listaEnteros.remove(posicionMenor);
		for(int enteros : listaEnteros) {
			System.out.println(enteros);
		}
		
		//13.Encuentra el tamaño de una List de enteros.
		
		System.out.println("El tamaño de la lista es: "+listaEnteros.size());
		
		//14.Suma todos los elementos de una List de enteros.
		int sumaNumerosLista = 0;
		for(int sumaLista : listaEnteros) {
			sumaNumerosLista = sumaNumerosLista + sumaLista; 
			}
		System.out.println("La suma de todos los elementos de la lista es "+ sumaNumerosLista);
	
	
		//15.Encuentra el número mayor en una List de enteros.
		
		int mayorLista = listaEnteros.get(0);
		
		for(int numero : listaEnteros) {
			if (numero > mayorLista) {
				mayorLista = numero;
			}
		}
		
		System.out.println("El numero mayor de la lista es: "+mayorLista);
		
		//16.Verifica si un valor está presente en una List de enteros.
		
		int valor = 30;
		boolean elValorEstaEnLaLista = false;
		for(int numero : listaEnteros) {
			if(numero == 30) {
				elValorEstaEnLaLista = true;
			}
		}
		
		System.out.println("El valor "+valor+" esta en la lista? "+elValorEstaEnLaLista);
		
		//17.Convierte una List en un array y muestra sus elementos.
	
		List<Integer> numerosLista = new ArrayList<>();
		
		numerosLista.add(120);
		numerosLista.add(150);
		numerosLista.add(130);
		
		Integer[] arrayNumeros = numerosLista.toArray(new Integer[0]);
		
		System.out.println("Los elementos del array son: "+ Arrays.toString(arrayNumeros));
		
		//18.Crea una List de cadenas y añade nombres de frutas.
		
		List<String> frutas = new ArrayList<>();
		
		frutas.add("Manzana");
		frutas.add("Banana");
		frutas.add("Frutilla");
		frutas.add("Pera");
		frutas.add("Cereza");
		
		//19.Recorre una List de cadenas y muestra cada elemento.
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		//20.Elimina todos los elementos de una List.
		
		frutas.clear();
		System.out.println("Actualizacion Lista");
		for(String fruta : frutas) {
			System.out.println("Los elementos de la lista son: "+fruta);
		}
		
		//Iterable
		
		//21.Crea una List de números y utiliza Iterable para recorrerla.
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		System.out.println("Los elementos de la lista son:");
		for(int elementos : numbers) {
			System.out.println(elementos);
		}
		
		//22.Implementa una clase que implemente la interfaz Iterable y recorra un array.
		
		int[] arrayValores = {500, 600, 3000};
		
		for(int numerosDelArray : arrayValores) {
			System.out.println(numerosDelArray);
		}
		
		//23.Utiliza Iterable para recorrer una colección de cadenas y mostrar los elementos.
		
		List<String> alumnos = new ArrayList<>();
		
		alumnos.add("Jose");
		alumnos.add("Agostina");
		alumnos.add("Catalina");
		
		System.out.println("Los alumnos son:");
		for(String nombreAlumnos : alumnos) {
			System.out.println(nombreAlumnos);
		}
		
		//24.Crea una clase que tenga un método que devuelva un Iterable de enteros.
		
		//25.Convierte una List en un Iterable y úsala en un ciclo for.
		
		List<String> animales = new ArrayList<>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Pez");
		
		Iterable<String> iterableAnimales = animales;
		
		System.out.println("Los animales son:");
		for(String tipoAnimales : iterableAnimales) {
			System.out.println(tipoAnimales);
		}
		
		//26.Implementa un Iterable que permita recorrer un array de enteros.
		
		Integer[] resultados = {10, 8 , 7};
		
		List<Integer> listaResultados = Arrays.asList(resultados);
		
		System.out.println("Los elementos del array son:");
		for(int elementosResultados : listaResultados ) {
			System.out.println(elementosResultados);
		}
		
		//27.Crea un Iterable de números impares y recorre los valores.
		
		List<Integer> numerosImpares = new ArrayList<>();
		
		numerosImpares.add(3);
		numerosImpares.add(5);
		numerosImpares.add(7);
		
		Iterable<Integer> iterableImpares = numerosImpares;
		
		System.out.println("Los numeros impares son:");
		for(Integer impares : iterableImpares) {
			System.out.println(impares);
		}
		
		//28.Usa un Iterable para recorrer una lista de palabras y contar cuántas tienen más de 5 letras.
		
		List<String> paises = new ArrayList<>();
		
		paises.add("Argentina");
		paises.add("Chile");
		paises.add("Peru");
		
		Iterable<String> iterablePaises = paises;
		
		int contadorPalabras = 0;
		System.out.println("Los pises son:");
		for(String palabra : iterablePaises) {
			System.out.println(palabra);
			if(palabra.length()>5) {
				contadorPalabras += 1;
				}
		}
		
		System.out.println("Los paises que tiene mas de 5 letras son "+ contadorPalabras);
		
		//29.Crea una colección de números y úsala en un Iterable para encontrar cuántos son pares.
		
		List<Integer> notas = new ArrayList<>();
		
		notas.add(8);
		notas.add(4);
		notas.add(5);
		notas.add(7);
		
		Iterable<Integer> iterablePares = notas;
		int contadorPares = 0;
		
		System.out.println("Las notas son:");
		for(Integer numerosPares : iterablePares) {
			
			System.out.println(numerosPares);
			if(numerosPares %2 == 0) {
				contadorPares += 1;
			}
		}
		
		System.out.println("La cantidad de numeros Pares es: "+contadorPares);
		
		//30.Implementa un Iterable para recorrer una matriz bidimensional.
		
	}
}
