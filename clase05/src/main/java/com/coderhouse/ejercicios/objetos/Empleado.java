//5.Crea una clase Empleado con un atributo sueldo y una subclase Gerente que tenga un método para calcular bonificaciones
//20.Crea una clase Empleado con un método trabajar, y una subclase Desarrollador que sobrescriba el método y agregue un método adicional para programar.
package com.coderhouse.ejercicios.objetos;

public class Empleado {
		protected double sueldo;

		public double getSueldo() {
			return sueldo;
		}

		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		
		public void trabajar(){
			System.out.println("El empleado esta trabajando");
		}
		
}
