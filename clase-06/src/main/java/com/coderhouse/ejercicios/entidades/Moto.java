//10.Implementa una clase Vehiculo con un método arrancar(). Crea subclases Auto y Moto, y sobrescribe el método arrancar() con comportamientos diferentes.
package com.coderhouse.ejercicios.entidades;

public class Moto extends Vehiculo{
	
	@Override
	public void arrancar() {
		System.out.println("La Moto esta arrancando");
	}
}
