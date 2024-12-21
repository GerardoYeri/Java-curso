//6.Crea un objeto Alumno con atributos nombre, matricula y promedio, e imprime los datos del alumno.
package com.coderhouse.ejercicios1a10.objetos;

public class Alumno {
	
	private String nombre;
	private int matricula;
	private double promedio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	public void mostrarDatosAlumno() {
		System.out.println("Nombre: "+getNombre()+" Matricula: "+getMatricula()+ " Promedio: "+getPromedio());
	}
	

}
