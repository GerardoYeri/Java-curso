//5.Crea una clase Producto con atributos nombre y precio, y un método para calcular el precio con impuestos.
package com.coderhouse.ejercicios1a10.objetos;

public class Producto {
public static final double IVA = 1.21;
	
	private String nombre;
	private double precioSinImpuesto;
	private double precioConImpuesto;
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioSinImpuesto() {
		return precioSinImpuesto;
	}



	public void setPrecioSinImpuesto(double precioSinImpuesto) {
		this.precioSinImpuesto = precioSinImpuesto;
	}



	public double getPrecioConImpuesto() {
		return precioConImpuesto;
	}



	public void setPrecioConImpuesto(double precioConImpuesto) {
		this.precioConImpuesto = precioConImpuesto;
	}
	
	public double CalculoPrecioConImpuesto() {
		precioConImpuesto = precioSinImpuesto * IVA;
		return precioConImpuesto;
	}

}
