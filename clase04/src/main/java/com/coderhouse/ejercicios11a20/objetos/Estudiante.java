//15.Crea un método en una clase Estudiante que calcule la calificación promedio de tres materias.
package com.coderhouse.ejercicios11a20.objetos;

public class Estudiante {
	
	private String nombre;
	private double promedioMatematicas;
	private double promedioLengua;
	private double promedioHistoria;
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPromedioMatematicas() {
		return promedioMatematicas;
	}



	public void setPromedioMatematicas(double promedioMatematicas) {
		this.promedioMatematicas = promedioMatematicas;
	}



	public double getPromedioLengua() {
		return promedioLengua;
	}



	public void setPromedioLengua(double promedioLengua) {
		this.promedioLengua = promedioLengua;
	}



	public double getPromedioHistoria() {
		return promedioHistoria;
	}



	public void setPromedioHistoria(double promedioHistoria) {
		this.promedioHistoria = promedioHistoria;
	}



	
	
	public double calcularPromedio(double nota1, double nota2, double nota3){
		return (nota1+nota2+nota3)/3;
	}
	
	public void asignarPromedios() {
		this.promedioHistoria = calcularPromedio(4,8,7);
		this.promedioLengua = calcularPromedio(8,7,10);
		this.promedioMatematicas = calcularPromedio(9,8,9);
	}
	


}