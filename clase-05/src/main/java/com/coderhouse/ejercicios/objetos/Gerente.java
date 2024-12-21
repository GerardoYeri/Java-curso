//5.Crea una clase Empleado con un atributo sueldo y una subclase Gerente que tenga un método para calcular bonificaciones

package com.coderhouse.ejercicios.objetos;

public class Gerente extends Empleado {
		
	double bonificaciones;
	
	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}

	public double calcularBonificaciones() {
		if(bonificaciones == 10) {
			sueldo = sueldo * 1.1;
		}else if(bonificaciones == 5) {
			sueldo *= 1.05;
		}else if(bonificaciones == 0) {
			return getSueldo();
		}else {
			System.err.println("Bonificacion no Valida. No se aplicara ninguna Bonificacion");
			return getSueldo();
		}
		return  getSueldo();
	}
	
	public void mostrarSueldoConBonificacion() {
		System.out.println("El sueldo con la bonificacion es: "+ getSueldo());
	}
	
}
