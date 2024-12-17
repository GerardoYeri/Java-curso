//2. Implementa una clase `Persona` con atributos `nombre` y `edad`. Utiliza encapsulamiento para proteger el acceso a los atributos, y agrega métodos `get` y `set` para ambos.
//6.Implementa una clase Persona con un constructor que acepte parámetros para inicializar los atributos nombre y edad. Sobrecarga el constructor para aceptar diferentes combinaciones de atributos.
//7.Implementa un método compararEdades() en la clase Persona, que acepte otra instancia de Persona y devuelva true si tienen la misma edad, y false en caso contrario.


package com.coderhouse.ejercicios.entidades;

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
	
	public Persona() {
		super();
		
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	


	public boolean compararEdades(Persona otraPersona) {
		if(otraPersona.getEdad() == this.edad ) {
			System.out.println("Las personas son de la misma edad? "+ true);
			return true;
		}else {
			System.out.println("Las personas son de la misma edad? "+ false);
			return false;
		}
	}
	

}
