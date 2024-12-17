package com.coderhouse;
//29 Crear un objeto de la clase Persona y asignar valores a sus variables.

public class Persona2Ejercicio29 {
	static Persona2Ejercicio29 personaA = new Persona2Ejercicio29("Martin", "Depetris", 6, 1.30);
	
	public static void main(String[] args) {
		personaA.mostrarInfo();
	}
	String nombre;
	String apellido;
	int edad;
	double altura;
	
	public Persona2Ejercicio29(String nombre, String apellido, int edad, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		}
	public void mostrarInfo() {
		System.out.println("El nombre es: "+ nombre);
		System.out.println("El apellido es: "+ apellido);
		System.out.println("El edad es: "+ edad);
		System.out.println("La altura es: "+ altura);
	}
}
