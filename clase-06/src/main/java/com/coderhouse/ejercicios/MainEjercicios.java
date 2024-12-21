
package com.coderhouse.ejercicios;

import com.coderhouse.ejercicios.entidades.Animal;
import com.coderhouse.ejercicios.entidades.Auto;
import com.coderhouse.ejercicios.entidades.Calculadora;
import com.coderhouse.ejercicios.entidades.Circulo;
import com.coderhouse.ejercicios.entidades.Gato;
import com.coderhouse.ejercicios.entidades.Moto;
import com.coderhouse.ejercicios.entidades.Perro;
import com.coderhouse.ejercicios.entidades.Persona;
import com.coderhouse.ejercicios.entidades.Producto;
import com.coderhouse.ejercicios.entidades.Vehiculo;

public class MainEjercicios {

	public static void main(String[] args) {

		//1. Crea una clase `Producto` con atributos `nombre` y `precio`. Agrega métodos para modificar y obtener sus valores. Implementa los métodos `getNombre()`, `setNombre()`, `getPrecio()`, y `setPrecio()`.

		Producto producto1 = new Producto();
		
		producto1.setNombre("Teclado");
		producto1.setPrecio(10000);
		
		System.out.println("El producto: "+producto1.getNombre()+" tiene un precio de "+ producto1.getPrecio());
	
		//2. Implementa una clase `Persona` con atributos `nombre` y `edad`. Utiliza encapsulamiento para proteger el acceso a los atributos, y agrega métodos `get` y `set` para ambos.
		
		Persona persona1 = new Persona();
		
		persona1.setNombre("Martin");
		persona1.setEdad(8);
		
		System.out.println(persona1);
		
		//3.Sobrecarga un método sumar() en una clase Calculadora que acepte enteros, doubles, y floats.

		Calculadora calculadora1 = new Calculadora();
		
		calculadora1.sumar(10, 20);
		calculadora1.sumar(1.5d, 2.5d);
		calculadora1.sumar(2.5489f, 3.564541f);
		
		//4. Crea una clase `Circulo` con un método `calcularArea()` que calcule el área según el radio. Sobrecarga el método para aceptar diferentes tipos de valores (int, double).
		
		Circulo circulo1 = new Circulo();
		
		circulo1.calcularArea(20.4563d);
		circulo1.calcularArea(20);
		
		//.6 Implementa una clase Persona con un constructor que acepte parámetros para inicializar los atributos nombre y edad. Sobrecarga el constructor para aceptar diferentes combinaciones de atributos.
		
		Persona persona2 = new Persona("Jermias", 10);
		
		System.out.println(persona2);
		
		Persona persona3 = new Persona(10, "Catalina");
		
		System.out.println(persona3);
		
		//7.Implementa un método compararEdades() en la clase Persona, que acepte otra instancia de Persona y devuelva true si tienen la misma edad, y false en caso contrario.

		Persona persona4 = new Persona();
		
		persona4.setEdad(5);
		
		Persona persona5 = new Persona();
		
		persona5.setEdad(5);
		
		persona5.compararEdades(persona4);

		//9.Crea una clase Animal con un método hacerSonido(). Luego, crea clases Perro y Gato que hereden de Animal y sobrescriban el método hacerSonido() con sonidos específicos.
	
		Animal perro1 = new Perro();
		
		perro1.hacerSonido();
		
		Animal gato1 = new Gato();
		
		gato1.hacerSonido();
		
		//10.Implementa una clase Vehiculo con un método arrancar(). Crea subclases Auto y Moto, y sobrescribe el método arrancar() con comportamientos diferentes.
		
		Vehiculo auto1 = new Auto();
		
		auto1.arrancar();
		
		Vehiculo moto1 = new Moto();
		
		moto1.arrancar();
	}

}
