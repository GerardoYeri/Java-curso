//1.Crea una clase Persona con atributos nombre y edad y un método para imprimir los datos.

package com.coderhouse.ejercicios1a10.objetos;

public class Persona {
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimirDatos () {
		System.out.println("El nombre de la persona es: "+getNombre()+" y la edad es: "+getEdad());
	}

	
		// TODO Auto-generated method stub
		
	
}
