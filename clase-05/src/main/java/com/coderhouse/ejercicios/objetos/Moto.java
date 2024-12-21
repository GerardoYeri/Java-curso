//11.Crea una clase Vehiculo con el método acelerar, y una subclase Moto que lo sobrescriba con mayor velocidad.

package com.coderhouse.ejercicios.objetos;

public class Moto extends Vehiculo{
	
	@Override
	public void  acelerar(){
		System.out.println("La moto esta acelerando a una velocidad de 120 km/h");
	}

}
