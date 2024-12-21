//4.Crea una clase Figura con el método calcularArea y subclases Cuadrado y Círculo que implementen este método.
package com.coderhouse.ejercicios.objetos;

public class Circulo extends Figura {
	
		public final double PI = 3.1416;
		
		private double radio;
		private double area;
		
		
		public double getRadio() {
			return radio;
		}


		public void setRadio(double radio) {
			this.radio = radio;
		}


		public double getArea() {
			return area;
		}


		public void setArea(double area) {
			this.area = area;
		}

		
		@Override
		public double calcularArea() {
			area = PI * (radio * radio);
			return getArea();
		}
		
		public void mostrarAreaCirculo() {
			System.out.println("El area del circulo es: "+getArea());
		}
}
