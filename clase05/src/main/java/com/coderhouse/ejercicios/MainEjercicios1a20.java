package com.coderhouse.ejercicios;

import com.coderhouse.ejercicios.objetos.Circulo;
import com.coderhouse.ejercicios.objetos.Cuadrado;
import com.coderhouse.ejercicios.objetos.Cuenta;
import com.coderhouse.ejercicios.objetos.CuentaAhorros;
import com.coderhouse.ejercicios.objetos.Desarrollador;
import com.coderhouse.ejercicios.objetos.Escritorio;
import com.coderhouse.ejercicios.objetos.Esfera;
import com.coderhouse.ejercicios.objetos.Gerente;
import com.coderhouse.ejercicios.objetos.Moto;
import com.coderhouse.ejercicios.objetos.Perro;
import com.coderhouse.ejercicios.objetos.Portatil;

public class MainEjercicios1a20 {

	public static void main(String[] args) {
	//1.Crea una clase Animal con un método hacerSonido, y una subclase Perro que sobrescriba este método.
		Perro miPerro = new Perro();
		
		miPerro.hacerSonido();
		
	//4.Crea una clase Figura con el método calcularArea y subclases Cuadrado y Círculo que implementen este método.
	
		Cuadrado cuadrado1 = new Cuadrado();
		
		cuadrado1.setLado(5);
		cuadrado1.calcularArea();
		cuadrado1.mostrarAreaCuadrado();
		
		Circulo circulo1 = new Circulo();
		
		circulo1.setRadio(10);
		circulo1.calcularArea();
		circulo1.mostrarAreaCirculo();
		
	//5.Crea una clase Empleado con un atributo sueldo y una subclase Gerente que tenga un método para calcular bonificaciones.	
		
		Gerente gerente = new Gerente();
		
		gerente.setSueldo(1000000);
		gerente.setBonificaciones(10);
		gerente.calcularBonificaciones();
		gerente.mostrarSueldoConBonificacion();
		
	//11.Crea una clase Vehiculo con el método acelerar, y una subclase Moto que lo sobrescriba con mayor velocidad.
		
		Moto moto1 = new Moto();
		
		moto1.acelerar();
	
	//12.Define una clase Computadora con un método encender, y subclases Portatil y Escritorio que implementen diferentes formas de encendido.
	
		Portatil portatil1 = new Portatil();
		
		portatil1.encender();
		
		Escritorio escritorio1 = new Escritorio();
		
		escritorio1.encender();
		
	//13.Crea una clase Cuenta con un método depositar, y una subclase CuentaAhorros que implemente una tasa de interés.
		
		Cuenta cuenta1 = new Cuenta();
		
		cuenta1.depositar(100);
		cuenta1.consultarSaldo();
		
		CuentaAhorros cuentaAhorro1 = new CuentaAhorros();
		
		cuentaAhorro1.depositar(100);
		cuentaAhorro1.aplicarInteres(5);
		
	//19.Crea una clase Figura3D con un método volumen, y una subclase Esfera que implemente su fórmula de volumen.
		
		Esfera esfera1 = new Esfera();
		
		esfera1.setRadio(3);
		esfera1.calcularVolumen();
		esfera1.mostrarVolumen();
		
	//20.Crea una clase Empleado con un método trabajar, y una subclase Desarrollador que sobrescriba el método y agregue un método adicional para programar.
		
		Desarrollador desarrollador1 = new Desarrollador();
		
		desarrollador1.trabajar();
		desarrollador1.programar();
	
	}

}
