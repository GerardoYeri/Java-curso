//3.Sobrecarga un método sumar() en una clase Calculadora que acepte enteros, doubles, y floats.

package com.coderhouse.ejercicios.entidades;

public class Calculadora {
	
	public void sumar(int numeroA, int numeroB) {
		double resultado = numeroA + numeroB ; 
		System.out.println("El numero "+ numeroA+" mas el numero "+numeroB+" es igual a: "+ resultado);
	}
	
	public void sumar(double numeroA, double numeroB) {
			double resultado = numeroA + numeroB ; 
			System.out.println("El numero "+ numeroA+" mas el numero "+numeroB+" es igual a: "+ resultado);
	}
	
	public void sumar(float numeroA, float numeroB) {
		double resultado = numeroA + numeroB ; 
		System.out.println("El numero "+ numeroA+" mas el numero "+numeroB+" es igual a: "+ resultado);
	}

}
