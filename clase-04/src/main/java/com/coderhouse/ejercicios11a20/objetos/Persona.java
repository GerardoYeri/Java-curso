package com.coderhouse.ejercicios11a20.objetos;

public class Persona {
	private String nombre;
	private int edad;
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		super();
		
	}
	
	public void saludarPersona() {
		System.out.println("Hola soy "+nombre);
	}
	//19.Crea un método en una clase Persona que imprima si la persona es mayor de edad o no.
	
	public void mostrarMayorEdad(int edad) {
		if(edad >= 18) {
			System.out.println("La persona es mayor de edad");
		}else if(edad < 18) {
			System.out.println("La persona es menor de edad");
		}
	}
	
	
}
