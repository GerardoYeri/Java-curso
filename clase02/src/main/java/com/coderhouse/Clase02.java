package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		/*
		int numeroA = 1;
		int numeroB = 2;
		
		if(numeroA > numeroB) { //(condicion) puede ser true o false
			System.out.println("El numero "+ numeroA+" es mayor que " + numeroB );
		} else {
			System.out.println("El numero "+ numeroA+" es menor que " + numeroB );
		}
		
		System.out.println("Si llegamos hasta aca, es porque se ejecuto el if");
		*/
	
		//Calculadora
		/*
		float numeroA = 1.5f;
		float numeroB = 5.0f;
		
		float resultado = numeroA / numeroB;
		
		if (numeroB != 0) {
			System.out.println("El resultado es "+ resultado);
		} else {
			System.err.println("Error, no se puede dividir por cero");
		}
		*/
		/*
		int ingreseUnNumero = 0;
		
		if(ingreseUnNumero > 0) {
			System.out.println("El numero ingresado es positivo");
		} else if(ingreseUnNumero < 0) {
			System.out.println("El numero ingresado es negativo");
		} else if (ingreseUnNumero == 0) {
			System.out.println("El numero ingresado es cero");
		} else {
			System.err.println("El dato ingresado no es un numero");
		}
		*/
		/*
		int diaDeLaSemana = -1;

		if (diaDeLaSemana == 1) {
			System.out.println("El dia actual es Lunes");
		} else if (diaDeLaSemana == 2) {
			System.out.println("El dia actual es Martes");
		} else if (diaDeLaSemana == 3) {
			System.out.println("El dia actual es Miercoles");
		} else if (diaDeLaSemana == 4) {
			System.out.println("El dia actual es Jueves");
		} else if (diaDeLaSemana == 5) {
			System.out.println("El dia actual es Viernes");
		} else if (diaDeLaSemana == 6) {
			System.out.println("El dia actual es Sabado");
		} else if (diaDeLaSemana == 7) {
			System.out.println("El dia actual es Domingo");
		} else {
			System.err.println("Dia incorrecto");
		}
		*/
		
		/*
		int ingreseSuEdad = 18;
		
		if(ingreseSuEdad >= 18 && ingreseSuEdad <= 100) {
			System.out.println("Puede ingresar");
		} else if (ingreseSuEdad > 0 && ingreseSuEdad < 18) {
			System.err.println("Ud es menor de edad y No puede ingresar");
		} else {
			System.out.println("Ud ingreso una edad incorrecta");
		}
		*/
		/*
		int diaDeLaSemana = 8;
		String nombreDelDiaDeLaSemana = null;
		switch(diaDeLaSemana) {
		
		case 1:
			nombreDelDiaDeLaSemana = "Lunes";
			break;
		case 2:
			nombreDelDiaDeLaSemana = "Martes";
			break;
		case 3:
			nombreDelDiaDeLaSemana = "Miercoles";
			break;
		case 4:
			nombreDelDiaDeLaSemana = "Jueves";
			break;
		case 5:
			nombreDelDiaDeLaSemana = "Viernes";
			break;
		case 6:
			nombreDelDiaDeLaSemana = "Sabado";
			break;
		case 7:
			nombreDelDiaDeLaSemana = "Domingo";
			break;
		default :
			nombreDelDiaDeLaSemana = "Dia incorrecto";
			break;
		}
		System.out.println("El dia de la semana correspondiente al Numero "+ diaDeLaSemana+ " es el " + nombreDelDiaDeLaSemana);
		*/
		
		/*
		String dia = "LALA";
		
		switch(dia.toLowerCase()) { //lo convierte en minuscula
		case "lunes" :
			System.out.println("Hoy es "+ dia);
			break;
		case "martes" :
			System.out.println("Hoy es "+ dia);
			break;
		case "miercoles" :
			System.out.println("Hoy es "+ dia);
			break;
		case "jueves" :
			System.out.println("Hoy es "+ dia);
			break;
		case "viernes" :
			System.out.println("Hoy es "+ dia);
			break;
		case "sabado" :
			System.out.println("Hoy es "+ dia);
			break;
		case "domingo" :
			System.out.println("Hoy es "+ dia);
			break;
		default :
			System.err.println("El dia ingresado fue "+ dia + " y es incorrecto");
			break;
		}
		
		System.out.println("Fin del switch");
		*/
		
		// Operador ternario
		
		/*
		int numeroA = 1;
		int numeroB = 2;
		
		boolean condicion = numeroA > numeroB; // Esto puede ser true o false 
		
		boolean resultado = condicion ? true : false; // el valor de verdad de condicion es false
		
		System.out.println(resultado);
		*/
		
		// Datos Aleatorios
		
		//double random = 0.0d;
		int random = 0;
		//random = Math.random();
		
		//System.out.println(random);
		
		int minimo = 1;
		int maximo = 100;
		
		int rango = maximo - minimo +1; // de 1 a 100
		
		random = (int)(Math.random() * rango) + minimo;
		
		System.out.println(random);
		
		final double PI = Math.PI;
		
		System.out.println(PI);
		
	}
}