//16.Crea una clase Coche con un método que calcule el combustible necesario para recorrer una distancia.
package com.coderhouse.ejercicios11a20.objetos;

public class Coche {
	private int combustible;

	public Coche() {
		super();
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	
	public double calculoDecombustible(double distancia) {
		return  distancia / 10;	
		 
		}
}
