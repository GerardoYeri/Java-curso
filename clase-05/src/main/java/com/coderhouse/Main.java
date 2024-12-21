package com.coderhouse;

import com.coderhouse.exception.PerroException;
import com.coderhouse.mascotas.Mascota;
import com.coderhouse.mascotas.Perro;

public class Main {

	public static void main(String[] args) throws PerroException{
		
		Perro unPerro = new Perro();
		
		
		
		unPerro.setNombre("Firulay");
		
		try {
			unPerro.setEdad(10);
		} catch (PerroException error) {
			System.err.println("Error, "+error.getMessage());
		} finally {
			System.out.println("Finalizo la validacion de la PerroException");
		}
		
		
		
		unPerro.setColor("Beige");
		unPerro.setTamanio("Pequeño");
		
		unPerro.setRaza("Caniche");
		
		unPerro.caminar();
		unPerro.ladrar();
		
		System.out.println(unPerro);
		
		Mascota unaMascota = new Mascota();
		unaMascota.setNombre("Rex");
		unaMascota.setColor("Blanco");
		unaMascota.setTamanio("Grande");
		unaMascota.setEdad(6);
		
		unaMascota.comer();
		unaMascota.caminar();
		
		Mascota nuevaMascota = new Mascota("Godzila", "negro", "Grande",5);
		
		nuevaMascota.caminar();
		nuevaMascota.comer();
		
		Mascota nuevaNuevaMascota = new Mascota("Rodrigo",10);
		
		System.out.println(nuevaNuevaMascota);
	}

	
}
