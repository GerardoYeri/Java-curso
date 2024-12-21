package com.coderhouse.ejercicios;

import com.coderhouse.ejercicios11a20.objetos.Calculadora;
import com.coderhouse.ejercicios11a20.objetos.Coche;
import com.coderhouse.ejercicios11a20.objetos.Estudiante;
import com.coderhouse.ejercicios11a20.objetos.Persona;
import com.coderhouse.ejercicios11a20.objetos.Rectangulo;
import com.coderhouse.ejercicios11a20.objetos.Tienda;
import com.coderhouse.ejercicios11a20.objetos.Triangulo;


public class EjerciciosClase04del11al20 {
	
	public static void main(String[] args) {
		
		//11.Crea una clase Calculadora con un método sumar que sume dos números enteros.
		Calculadora calculadora1 = new Calculadora();
		
		calculadora1.setPrimerNumero(10);
		calculadora1.setSegundoNumero(18);
		
		calculadora1.sumar();
		
		System.out.println("El resultado de la suma entre "+calculadora1.getPrimerNumero()+" y "+calculadora1.getSegundoNumero()+" es "+calculadora1.getSuma());
		
		//12.Crea un método en una clase Persona que salude con el nombre de la persona.
		
		Persona persona1 = new Persona();
		
		persona1.setNombre("Rodrigo");
		
		persona1.saludarPersona();
		
		//13.Crea un método restar en una clase Calculadora que reste dos números enteros.
			
		calculadora1.restar();
		
		System.out.println("El resultado de la resta entre "+calculadora1.getPrimerNumero()+" y "+calculadora1.getSegundoNumero()+" es "+calculadora1.getResta());
	
		//14.Crea una clase Rectangulo con un método que calcule el área dada su base y altura.
		
		Rectangulo rectangulo1 = new Rectangulo();
		
		rectangulo1.setAltura(20);
		rectangulo1.setBase(10);
		rectangulo1.calcularArea();
		
		System.out.println("El rectangulo tiene de altura: "+rectangulo1.getAltura()+" , su base es: "+rectangulo1.getBase()+ " y su area: "+rectangulo1.getArea());
		
		//15.Crea un método en una clase Estudiante que calcule la calificación promedio de tres materias.
			
		Estudiante estudiante1 = new Estudiante();
		
		
		estudiante1.setNombre("Valentina");
		
		estudiante1.asignarPromedios();
		
		System.out.println("Promedios de "+estudiante1.getNombre());
		System.out.println("Historia "+estudiante1.getPromedioHistoria());
		System.out.println("Lengua "+estudiante1.getPromedioLengua());
		System.out.println("Matematicas "+estudiante1.getPromedioMatematicas());
		
		//16.Crea una clase Coche con un método que calcule el combustible necesario para recorrer una distancia.
		
		Coche coche1 = new Coche();
		

		
		
		System.out.println("Los Litros de combustible necesario son: "+coche1.calculoDecombustible(54.5));
	
		//17.Crea un método en una clase Tienda que calcule el total de una compra aplicando un descuento.
		
		Tienda miTienda = new Tienda();
		
		miTienda.totalCompra(400, 600);
		miTienda.mostrarTotalCompra();
		
		miTienda.totalCompraConDescuento(10);
		miTienda.mostrarTotalcompraConDescuento();
		
		miTienda.totalCompraConDescuento(15);
		miTienda.mostrarTotalcompraConDescuento();
		
		//18.Crea un método multiplicar en una clase Calculadora que multiplique dos números enteros.
		
		calculadora1.multiplicar(4, 2);
		calculadora1.mostrarMutiplicacion();
		
		//19.Crea un método en una clase Persona que imprima si la persona es mayor de edad o no.
		
		persona1.mostrarMayorEdad(18);
		persona1.mostrarMayorEdad(20);
		persona1.mostrarMayorEdad(17);
		
		//20.Crea una clase Triangulo con un método que calcule el área dado su base y altura.
	
		Triangulo miTriangulo = new Triangulo();
		
		miTriangulo.calcularArea(10, 25);
		miTriangulo.mostrarArea();
		
		
	}
	
}
