//4.Crea una clase Figura con el método calcularArea y subclases Cuadrado y Círculo que implementen este método.
package com.coderhouse.ejercicios.objetos;

public class Cuadrado extends Figura {
	
	
	private double lado;
	
	
	
	public double getLado() {
		return lado;
	}
	public void setLado(double basse) {
		this.lado = basse;
	}
	
	
	
	
	@Override
	public double calcularArea() {
		area = lado*lado;
		return getArea();
	}
	
	public void mostrarAreaCuadrado() {
		System.out.println("El area del cuadrado es: "+getArea());
	}

}
