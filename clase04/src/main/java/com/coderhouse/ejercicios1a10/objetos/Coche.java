//2.Crea un objeto Coche con atributos marca, modelo y año e imprime los valores.

package com.coderhouse.ejercicios1a10.objetos;

public class Coche {
	
	private String marca;
	private String modelo;
	private int anio;
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void imprimirValores() {
		System.out.println( "Coche marca: " + getMarca() + ", modelo: " + getModelo() + ", anio: " + getAnio() );
	}
	
}
