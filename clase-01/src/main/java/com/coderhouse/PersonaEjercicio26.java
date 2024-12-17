package com.coderhouse;

import java.util.ArrayList;

/* Ejercicios sobre Variables Primitivas y No Primitivas
  	
  	Ejercicio numero 26 Crear una clase Persona que tenga variables primitivas como edad y altura.
 */
public class PersonaEjercicio26 {
	

	public static void main(String[] args) {
		
		int edad = 35;
		double altura = 1.80d;
		mostrarInfoPersona(edad, altura);
	
		//27 Declarar un arreglo de String para almacenar los nombres de los días de la semana.
		
		String diaSemana[] = new String[7];
		
		diaSemana[0] = "Lunes";
		diaSemana[1] = "Martes";
		diaSemana[2] = "Miercoles";
		diaSemana[3] = "Jueves";
		diaSemana[4] = "Viernes";
		diaSemana[5] = "Sabado";
		diaSemana[6] = "Domingo";
		
		//mostrar dias de la semana
		
		mostrarDiaSemana(diaSemana);
		
		//28 Definir un ArrayList<Integer> para almacenar las edades de varios estudiantes.
		
		ArrayList<Integer> edadEstudiantes = new ArrayList<>();
		
		edadEstudiantes.add(30);
		edadEstudiantes.add(32);
		edadEstudiantes.add(18);
		mostrarEdadEstudiantes(edadEstudiantes);
		
		
		 
	}
		//Metodo para mostrar la info de la persona
		public static void mostrarInfoPersona(int edad, double altura) {
			System.out.println("La edad de la persona es: "+ edad+ " y la altura es: "+altura+"mts");
		}
		
		//Metodo para mostrar los dias de la semana
		public static void mostrarDiaSemana(String[] diaSemana) {
			for(int i = 0; i<diaSemana.length; i++) {
				System.out.println(diaSemana[i]);
			}
		}
		
		//Metodo para mostra la edad de los estudiantes
		public static void mostrarEdadEstudiantes(ArrayList<Integer> edadEstudiantes) {
			System.out.println(edadEstudiantes);
		}
		
}
