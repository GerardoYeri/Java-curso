//10.Crea una clase Empleado con atributos nombre y sueldo, y un método para calcular el sueldo anual.
package com.coderhouse.ejercicios1a10.objetos;

public class Empleado {
		
		private String nombre;
		private double sueldo;
		
		
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getSueldo() {
			return this.sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		
	
		public Empleado(String nombre, double sueldo) {
			super();
			this.nombre = nombre;
			this.sueldo = sueldo;
			
		}
		
		public double calcularSueldoAnual() {
			 return sueldo * 12;
			
		}
		
}
