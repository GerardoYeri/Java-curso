
package com.coderhouse.ejercicios;

import com.coderhouse.ejercicios1a10.objetos.Alumno;
import com.coderhouse.ejercicios1a10.objetos.Animal;
import com.coderhouse.ejercicios1a10.objetos.Coche;
import com.coderhouse.ejercicios1a10.objetos.CuentaBancaria;
import com.coderhouse.ejercicios1a10.objetos.Empleado;
import com.coderhouse.ejercicios1a10.objetos.Libro;
import com.coderhouse.ejercicios1a10.objetos.Persona;
import com.coderhouse.ejercicios1a10.objetos.Producto;
import com.coderhouse.ejercicios1a10.objetos.Punto;
import com.coderhouse.ejercicios1a10.objetos.Vehiculo;

public class EjerciciosClase04del1al10{
	
	public static void main(String[] args) {
	
		//1.Crea una clase Persona con atributos nombre y edad y un método para imprimir los datos.
		
		Persona persona1 = new Persona();
		
		persona1.setNombre("Gerardo");
		persona1.setEdad(30);
	
		persona1.imprimirDatos();
		
		//2.Crea un objeto Coche con atributos marca, modelo y año e imprime los valores.

		Coche coche1 = new Coche();
		
		coche1.setAnio(2008);
		coche1.setMarca("Fiat");
		coche1.setModelo("Idea");
		
		coche1.imprimirValores();
		
		//3.Crea una clase Libro con atributos titulo y autor y un método que imprima la información del libro.

		
		Libro libro1 = new Libro();
		
		libro1.setTitulo("Planeta");
		libro1.setAutor("Ricardo Mariño");
		
		libro1.informacionLibro();

		//4.Crea una clase CuentaBancaria con atributos saldo y titular, y un método para mostrar el saldo.
		
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		
		cuentaBancaria1.setSaldo(1000000);
		cuentaBancaria1.setTitular("Alejandro");
		
		cuentaBancaria1.mostrarSaldo();
		
		//5.Crea una clase Producto con atributos nombre y precio, y un método para calcular el precio con impuestos.
		
		Producto producto1 = new Producto();
		
		producto1.setNombre("Mouse");
		producto1.setPrecioSinImpuesto(10000);
		producto1.CalculoPrecioConImpuesto();
		System.out.println("EL precio del producto con impuesto es: "+producto1.getPrecioConImpuesto());
		
		//6.Crea un objeto Alumno con atributos nombre, matricula y promedio, e imprime los datos del alumno.
		
		Alumno alumno1 = new Alumno();
		
		alumno1.setNombre("Marcos");
		alumno1.setMatricula(123144);
		alumno1.setPromedio(8.5);
		
		alumno1.mostrarDatosAlumno();
		
		//7.Crea una clase Animal con atributos especie y edad, y un método para mostrar la especie del animal.
		
		Animal animal1 = new Animal();
		
		animal1.setEdad(10);
		animal1.setEspecie("Felino");
		
		animal1.mostrarEspecie();
		
		//8.Crea una clase Punto con atributos x y y que represente un punto en un plano cartesiano.
		
		Punto punto = new Punto(5,10);
		
		
		
		punto.coordenadasDelPunto();
		
		//9.Crea una clase Vehiculo con atributos velocidad y combustible, y un método que disminuya el combustible.
		
		Vehiculo auto = new Vehiculo(90, 100);
		
		
		auto.consumoDeCombustible();
		
		System.out.println("El combustible del auto es: "+auto.getCombustible());
	
		//10.Crea una clase Empleado con atributos nombre y sueldo, y un método para calcular el sueldo anual.
		
		Empleado roberto = new Empleado("Roberto", 800000.12);
		
		roberto.calcularSueldoAnual();
		
		System.out.println("EL sueldo Anual del empleado es: "+roberto.calcularSueldoAnual());
	
		
	}
	
}
