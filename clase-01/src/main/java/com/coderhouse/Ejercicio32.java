package com.coderhouse;

public class Ejercicio32 {
	
	public static void main(String[] args) {
		
	//32 Definir un método estático que reciba un int y devuelva su cuadrado.
		Ejercicio32 cuadrado = new Ejercicio32(10, 0);
		
	 Ejercicio32.calculoCuadrado();
		
		System.out.println(numero1);
		System.out.println(cuadrado);
	}
	static int numero1 = 10;
	static int cuadrado;
		
		public Ejercicio32(int numero1, int cuadrado) {
			Ejercicio32.numero1 = numero1;
			Ejercicio32.cuadrado = cuadrado;
		}
	
	public static int calculoCuadrado() {
		cuadrado = numero1 * numero1;
		return cuadrado;
	}

}
