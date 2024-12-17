package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		System.out.println("Hola coders!!!");
		
		//Declaracion de variables
		
		byte numeroChico = 100;
		
		System.out.println(numeroChico);
		
		int numeroGrande = 123225;
		
		System.out.println(numeroGrande);
		
		char caracter = 'G';
		
		double numeroConDecimal = 123.43d;
		
		System.out.println(numeroConDecimal);
		
		float numeroConDecimaFloat = 1434.121f;
		
		System.out.println(numeroConDecimaFloat);
		
		long numeroMuyLargo = 423252453;
		
		System.out.println(numeroMuyLargo);
		
		short numeroCorto = 1343;
		
		boolean verdadero = false;
		
		System.out.println(verdadero);
		
		String cadenaDeTexto = "Mi primer string";
		
		System.out.println(cadenaDeTexto);
		
		System.out.println(caracter + cadenaDeTexto);
		
		System.out.println(caracter + " " + numeroCorto);
		
		int numeroUno = 10;
		int numeroDos = 20;
		
		int resultado = numeroUno + numeroDos;
		
		System.out.println("la suma es: "+resultado);
		
		
		
		resultado = numeroUno - numeroDos;
		
		System.out.println("la resta es: "+resultado);
		
		resultado = numeroUno % numeroDos;
		
		System.out.println("el RESTO es: "+resultado);
		
		//Incrementar
		
		int contador = 0;
		System.out.println(contador);
		contador = 1; //reasignar el valor
		System.out.println(contador);
		// contador = contador; // se reasigna a si mismos el valor que tenia antes
		System.out.println(contador);
		contador = contador + 1; //incrementar el valor
		System.out.println(contador);
		contador++; //incrementa el valor
		System.out.println(contador);
		contador = contador -1; //decrementa el valor
		System.out.println(contador);
		contador--; //decrementa su valor
		
		//operadores
		
		int numA= 20;
		int numB= 30;
		
		System.out.println(numA == numB); //son iguales?
		System.out.println(numA != numB); //son distintos?
		
		System.out.println(numA < numB); // numA es MENOR a numB?
		System.out.println(numA > numB); // numA es MAYOR a numB?
		
		System.out.println(numA <= numB); // numA es MENOR IGUAL a numB
		System.out.println(numA >= numB); // numA es MAYOT IGUAL a numB
		
		final int NUMERO_CONSTANTE = 1000;
		
		System.out.println(NUMERO_CONSTANTE);
		
		
		
		

	}

}
