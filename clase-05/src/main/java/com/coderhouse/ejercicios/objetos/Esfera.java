package com.coderhouse.ejercicios.objetos;

public class Esfera extends Figura3D {
	
	private double radio;
	
	
	
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}



	@Override
	public double calcularVolumen() {
		double volumenEsfera = 4.0/3.0 * Math.PI * Math.pow(radio, 3);
		setVolumen(volumenEsfera);
		return volumenEsfera;
		}
	
	public void mostrarVolumen() {
		System.out.println("El volumen de la esfera es "+ getVolumen());
	}
}
