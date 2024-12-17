package com.coderhouse.ejercicios.entidades;

//1. Crea una clase `Producto` con atributos `nombre` y `precio`. Agrega métodos para modificar y obtener sus valores. Implementa los métodos `getNombre()`, `setNombre()`, `getPrecio()`, y `setPrecio()`.

public class Producto {
	
	private String nombre;
	private double precio;
	
	
	
	
	public Producto() {
		super();
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
