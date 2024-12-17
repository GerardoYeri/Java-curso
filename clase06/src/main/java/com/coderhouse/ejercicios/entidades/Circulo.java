//4. Crea una clase `Circulo` con un método `calcularArea()` que calcule el área según el radio. Sobrecarga el método para aceptar diferentes tipos de valores (int, double).

package com.coderhouse.ejercicios.entidades;

public class Circulo {
	
	
	
	public void calcularArea(int radio) {
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: "+ area );
	}
	
	public void calcularArea(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: "+ area );
	}
}
