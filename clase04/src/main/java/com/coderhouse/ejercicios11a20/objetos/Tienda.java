//17.Crea un método en una clase Tienda que calcule el total de una compra aplicando un descuento.

package com.coderhouse.ejercicios11a20.objetos;

public class Tienda {
	
	double totalCompra = 0;
	
	public double totalCompra(double precioProducto1,double precioProducto2) {
		
		totalCompra = precioProducto1 + precioProducto2;
		
		return totalCompra;
	}
	
	public void mostrarTotalCompra() {
		System.out.println("El total de la compra es: "+ totalCompra);
	}
	
	public double totalCompraConDescuento( double descuento) {
		if (descuento == 10) {
			return totalCompra *= 0.9;
		}else if(descuento == 20) {
				return totalCompra *= 0.8;			
		}else if(descuento == 0) {
			return totalCompra *= 1;
		}else
			return totalCompra = 0.00;
		}
	
	
	
	public void mostrarTotalcompraConDescuento() {
		if (totalCompra == 0) {
			System.err.println("Descuento incorrecto, ingrese 10 o 20 segun corresponda");
		}else System.out.println("El total de la compra con descuento es: "+totalCompra);
	}

}
