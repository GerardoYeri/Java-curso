//1.Crea una clase Animal con un método hacerSonido, y una subclase Perro que sobrescriba este método.
package com.coderhouse.ejercicios.objetos;

public class Perro extends Animal {
	
	@Override
	public void hacerSonido() {
		System.out.println("El perro Ladra");
	}
	

}
