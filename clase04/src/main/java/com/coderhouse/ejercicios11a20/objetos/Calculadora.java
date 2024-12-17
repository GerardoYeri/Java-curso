package com.coderhouse.ejercicios11a20.objetos;

public class Calculadora {
	
	private double primerNumero;
	private double segundoNumero;
	private double suma;
	private double resta;

	public Calculadora() {
		super();
	}

	public double getPrimerNumero() {
		return primerNumero;
	}

	public void setPrimerNumero(double primerNumero) {
		this.primerNumero = primerNumero;
	}

	public double getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}
	
	public double sumar() {
		suma = primerNumero + segundoNumero;
		return suma;
	}
	
	
	
	public double getResta() {
		return resta;
	}

	public void setResta(double resta) {
		this.resta = resta;
	}

	public double restar() {
		resta = primerNumero - segundoNumero;
		return resta;
	}
	
	//18.Crea un método multiplicar en una clase Calculadora que multiplique dos números enteros.
	
	private double multiplica;
	
	
	
	public double getMultiplica() {
		return multiplica;
	}

	public void setMultiplica(double multiplica) {
		this.multiplica = multiplica;
	}

	public double multiplicar(int numero1, int numero2) {
		return multiplica = numero1 * numero2;
	}
	
	public void mostrarMutiplicacion() {
		System.out.println("El resultado de la mutiplicacion del numero es : " + multiplica);
	}

}
