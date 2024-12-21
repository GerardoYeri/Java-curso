//14.Crea una clase Rectangulo con un método que calcule el área dada su base y altura.
package com.coderhouse.ejercicios11a20.objetos;

public class Rectangulo {
	
	private double base;
	private double altura;
	private double area;
	
	public Rectangulo() {
		super();
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public double calcularArea() {
		area = base * altura;
		return area;
	}
	
	
	
}
