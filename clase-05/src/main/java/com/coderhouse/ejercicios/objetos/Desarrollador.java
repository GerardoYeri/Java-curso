//20.Crea una clase Empleado con un método trabajar, y una subclase Desarrollador que sobrescriba el método y agregue un método adicional para programar.
package com.coderhouse.ejercicios.objetos;

public class Desarrollador extends Empleado {
	
	@Override
	public void trabajar(){
		System.out.println("El Desarrollador esta trabajando");
	}
	
	public void programar() {
		System.out.println("El Desarrollador esta Programando");
	}
}
