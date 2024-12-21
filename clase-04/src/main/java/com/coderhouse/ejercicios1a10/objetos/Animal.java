//7.Crea una clase Animal con atributos especie y edad, y un método para mostrar la especie del animal.
package com.coderhouse.ejercicios1a10.objetos;

public class Animal {
	private String especie;
	private int edad;
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarEspecie() {
		System.out.println("La especie del animal es: "+getEspecie());
	}
}
