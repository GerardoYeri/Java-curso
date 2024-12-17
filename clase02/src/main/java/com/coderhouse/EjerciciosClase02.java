package com.coderhouse;

import java.util.Scanner;

public class EjerciciosClase02 {

	public static void main(String[] args) {
		
		//Ejercicios con if
		
		//1. Determina si un número es positivo. Declara un número y usa if para verificar si es mayor que 0.
		
		int numero = 20;
		
		if(numero > 0) {
			System.out.println("El numero "+ numero+ " es positivo");
		}else {
			System.out.println("El numero es negativo");
		}
		
		//2. Verifica si una persona es mayor de edad (>= 18 años).

		String persona = "Juan";
		int edadPersona = 29;
		
		if(edadPersona >= 18) {
			System.out.println("La persona "+ persona + " tiene " + edadPersona
					+ " años y es MAYOR DE EDAD");
		}else {
			System.out.println("La persona "+ persona + " tiene " + edadPersona
					+ " años y es MENOR DE EDAD");
		}
		
		//3. Comprueba si un número es impar usando el operador %.
		
		int numA = 5;
		
		if(numA % 2 != 0) {
			System.out.println("El numero "+ numA + " es IMPAR");
		}else {
			System.out.println("El numero "+ numA + " es PAR");
		}
		
		//4. Revisa si una cadena está vacía usando if con string.isEmpty().
		
		String cadena = "";
		
		if(cadena.isEmpty()) {
			System.out.println("La cadena esta vacia");
		}else {
			System.out.println("La cadena esta NO esta vacia");
		}
		
		//5. Determina si un número es divisible por 5.
		
		int numB = 20;
		
		if(numB % 5 == 0) {
			System.out.println("El numero "+ numB + " es divisible por 5");
		}else {
			System.out.println("El numero "+ numB + " NO es divisible por 5");
		}
		
		// Ejercicios con if-else
		
		//6. Verifica si un número es par o impar y muestra un mensaje correspondiente.
		
		int numC = 1948;
		
		if(numC % 2 == 0) {
			System.out.println("El numero "+ numC + " es PAR");
		}else {
			System.out.println("El numero "+ numC + " es IMPAR");
		}
		
		//7. Determina si una persona puede votar (mayor de 18 años) o no.
		
		String nombrePersona2 = "Mateo";
		int edadPersona2 = 17;
		
		if(edadPersona2 >= 18) {
			System.out.println(nombrePersona2+" tiene "+ edadPersona2 + " años y SI puede votar");
		}else {
			System.out.println(nombrePersona2 +" tiene "+ edadPersona2 + " años y NO puede votar");
		}
		
		//8. Verifica si una letra es vocal o consonante (para simplificar, considera solo las letras en minúsculas).
		
		char letra = 'l';
		
		if(letra == 'a' && letra == 'e' && letra == 'i'
				&& letra == 'o' && letra == 'u') {
			System.out.println("La letra "+ letra + " ES VOCAL");
		}else {
			System.out.println("La letra "+ letra + " ES CONSONANTE");
		}
		
		//9. Revisa si un número es positivo, negativo o cero.
		
		int numD = -1231;
		
		if(numD > 0) {
			System.out.println("El numero "+ numD+ " es POSITIVO");
		}else if(numD <0) {
			System.out.println("El numero "+ numD+ " es NEGATIVO");
		}else {
			System.out.println("El numero "+ numD+ " es CERO");
		}
		
		//10. Determina si un año es bisiesto. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
		
		int anio = 1996;
		
		if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
			System.out.println("El año "+ anio + " ES BICIESTO");
		}else {
			System.out.println("El año "+ anio + " NO ES BICIESTO");
		}
		
		//Ejercicios con if-else if-else
		
		//11. Determina la categoría de una persona según su edad: bebé (<2), niño (2-12), adolescente (13-18), adulto (19-64), anciano (65+).
		
		int edadPersona3 = 70;
		String categoria = "";
		
		if(edadPersona3 < 2) {
		categoria = "BEBE";
		System.out.println("La persona tiene "+ edadPersona3+ " años y pertenece "
				+ "a la categoria "+ categoria);
		}else if(edadPersona3 >= 2 && edadPersona3 <= 12) {
			categoria = "NIÑO";
			System.out.println("La persona tiene "+ edadPersona3+ " años y pertenece "
					+ "a la categoria "+ categoria);
			}else if(edadPersona3 >= 13 && edadPersona3 <= 18) {
				categoria = "ADOLECENTE";
				System.out.println("La persona tiene "+ edadPersona3+ " años y pertenece "
						+ "a la categoria "+ categoria);
			}else if (edadPersona3 >= 19 && edadPersona3 <= 64){
				categoria = "ADULTO";
				System.out.println("La persona tiene "+ edadPersona3+ " años y pertenece "
						+ "a la categoria "+ categoria);
			}else if (edadPersona3 >= 65) {
				categoria = "ANCIANO";
				System.out.println("La persona tiene "+ edadPersona3+ " años y pertenece "
						+ "a la categoria "+ categoria);
			}else { 
				System.err.println("La edad es incorrecta");
			}
		
		//12. Calcula el precio de una entrada al cine según la edad: niño (5€), adulto (10€), anciano (7€).
		
		
		double precioEntradaCine = 0.0d;
		
		if(categoria.equals("NIÑO")) {
			precioEntradaCine = 5;
			System.out.println("La persona pertenece a la categoria "+ categoria+ " y el precio de la entrada es "+ precioEntradaCine);
		}else if(categoria.equals("ADULTO") || categoria.equals("ADOLECENTE")) {
			precioEntradaCine = 10;
			System.out.println("La persona pertenece a la categoria "+ categoria+ " y el precio de la entrada es "+ precioEntradaCine);
		}else if(categoria.equals("ANCIANO")) {
			precioEntradaCine = 7;
			System.out.println("La persona pertenece a la categoria "+ categoria+ " y el precio de la entrada es "+ precioEntradaCine);
		}else if(categoria.equals("BEBE")) {
			System.err.println("La persona pertenece a la categoria "+ categoria+ " NO ES APTO PARA INGRESAR");
		}else {
			System.err.println("EDAD INCORRECTA");
		}
		
		//13. Asigna una nota en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
		
		char nota = ' ';
		double calificacion = 75.60d;
		
		if(calificacion >= 90 && calificacion <= 100) {
			nota = 'A';
			System.out.println("La nota del alumno es "+ nota);
		} else if(calificacion >= 80 && calificacion < 90) {
			nota = 'B';
			System.out.println("La nota del alumno es "+ nota);
		}else if (calificacion >= 70 && calificacion < 80) {
			nota = 'C';
			System.out.println("La nota del alumno es "+ nota);
		}else if(calificacion >= 60 && calificacion < 70) {
			nota = 'D';
			System.out.println("La nota del alumno es "+ nota);
		}else if(calificacion < 60 && calificacion >= 0) {
			nota = 'F';
			System.out.println("La nota del alumno es "+ nota);
		}else {
			System.err.println("La calificacion es INCORRECTA");
		}
		
		//14. Evalúa un número si es negativo, positivo, o cero, mostrando un mensaje en cada caso.
		
		float num2 = 0.0000f;
		
		if(num2 > 0) {
			System.out.println("El numero es "+ num2+ " y es POSITIVO");
		}else if(num2 < 0) {
			System.out.println("El numero es "+ num2+ " y es NEGATIVO");
		}else{
			System.out.println("El numero es "+ num2+ " y es CERO");
		}
		
		//15. Determina el nivel de peligro de un volcán según su estado (dormido, activo, erupción inminente)
		
		String estadoVolcan = "activo";
		String nivelPeligro = " ";
		
		if(estadoVolcan.equalsIgnoreCase("DORMIDO")) {
			nivelPeligro = "BAJO";
			System.out.println("El volcan se encuenta "+ estadoVolcan + ", el nivel de peligro es "
					+nivelPeligro);
		}else if(estadoVolcan.equalsIgnoreCase("ACTIVO")) {
			nivelPeligro = "ALTO";
			System.out.println("El volcan se encuenta "+ estadoVolcan + ", el nivel de peligro es "
				+nivelPeligro);
		}else if(estadoVolcan.equalsIgnoreCase("ERUPCION INMINENTE")) {
			nivelPeligro = "MUY ALTO";
			System.out.println("El volcan se encuenta "+ estadoVolcan + ", el nivel de peligro es "
					+nivelPeligro);
		}else {
			System.err.println("ESTADO INCORRECTO");
		}
		
		//Ejercicios con switch
		//16. Asigna un día de la semana según un número del 1 al 7.
		
		int numeroDia = 5;
		String diaSemana = "";
		
		switch(numeroDia) {
		case 1 :
			diaSemana = "Lunes";
		break;
		case 2 : 
			diaSemana = "Martes";
		break;
		case 3:
			diaSemana = "Miercoles";
		break;
		case 4:
			diaSemana = "Jueves";
		break;
		case 5:
			diaSemana = "Viernes";
		break;
		case 6:
			diaSemana = "Sabado";
		break;
		case 7:
			diaSemana = "Domingo";
		break;
		default :
			diaSemana = "INCORRECTO";
		}
		
		System.out.println("El numero del dia de la semana es "+ numeroDia+ " y es el dia "
				+ diaSemana);
		
		//17.Muestra el nombre de un mes según un número del 1 al 12.
		
		int numeroMes = 5;
		String nombreMes = " ";
		
		switch(numeroMes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default: 
			nombreMes ="INCORRECTO";
			break;
		}
		System.out.println("El numero de mes es "+ numeroMes+ " y el nombre del mes es "
				+ nombreMes);
			
		//18.Determina el nombre de una estación del año según un número (1: invierno, 2: primavera, 3: verano, 4: otoño).
		
		int numeroEstacion = 3;
		String nombreEstacion = "";
		
		switch(numeroEstacion) {
		case 1:
			nombreEstacion = "Invierno";
			break;
		case 2: 
			nombreEstacion = "Primavera";
			break;
		case 3:
			nombreEstacion = "Verano";
			break;
		case 4:
			nombreEstacion ="Otoño";
			break;
		default:
			nombreEstacion = "INCORRECTO";
			break;
		}
		
		System.out.println("El numero de estacion es "+ numeroEstacion + " el nombre de la estacion es "
				+ nombreEstacion);
		//19.Calcula operaciones aritméticas básicas (suma, resta, multiplicación, división) según un operador ingresado (+, -, *, /).
		
		double numE = 5;
		double numF = 7;
		double resultado = 0.000d;
		char operador = '/';
		
		switch(operador) {
		case '+' :
			resultado = numE + numF;
			break;
		case '-' :
			resultado = numE - numF;
			break;
		case '*' :
			resultado = numE * numF;
			break;
		case '/' :
			if(numF != 0) {
			resultado = numE / numF;
			} else {
				System.err.println("NO SE PUEDE DIVIDIR POR CERO");
					return;
			}
			break;
		default:
			System.out.println("La operacion es INCORRECTA");
			break;
		}
		
		System.out.println("La operacion entre el numero "+numE+ " y el numero "+ numF
				+ " es "+ operador +" y el resultado es " +resultado);
		
		//20.Verifica el tipo de fruta según su código: 1: manzana, 2: plátano, 3: naranja, 4: uva.
		
		int codigo = 2;
		String fruta = "";
		
		switch(codigo) {
		case 1:
			fruta = "Manzana";
			break;
		case 2:
			fruta = "Platano";
			break;
		case 3:
			fruta = "Naranja";
			break;
		case 4:
			fruta = "Uva";
			break;
		default: 
			fruta = "INCORRECTO";
			break;
		}
		
		System.out.println("El codigo es "+ codigo + " y la fruta es "+ fruta);
	
		//Ejercicios con Operadores Ternarios
		
		//21.Verifica si un número es par o impar usando un operador ternario.
		
		int numG = 14;
		
		String esPar = "";
		
		esPar = (numG % 2 == 0) ? "ES par" : "NO es par";
		
		System.out.println("El numero "+ numG + " " + esPar );
		
		//22.Determina si una persona es mayor de edad con un operador ternario.
	
		int edadUs = 18;
		
		String mayorDeEdad = "";
		
		mayorDeEdad = (edadUs >= 18) ? "ES mayor de edad" : "NO es mayor de edad";
		
		System.out.println("El usuario tiene "+ edadUs+ " años y "+ mayorDeEdad);
		
		//23.Asigna el valor "Positivo" o "Negativo" a una variable según el valor de un número.
		
		int valor = 1800;
		
		String positivoNegativo = "";
		
		positivoNegativo = (valor > 0) ? "Positivo" : "Negativo";
		
		System.out.println("El valor es "+ valor + " y es "+ positivoNegativo);
	
		//24.Calcula el mayor de dos números usando un operador ternario.
		
		float valorA = 1908.982f;
		float valorB = 1908.234f;
		
		String esMayor = "";
		
		esMayor = (valorA > valorB) ? "ES mayor" : "NO es MAYOR";
		
		System.out.println("El numero "+ valorA + " "+ esMayor+ " al numero "+ valorB);
		
		//25.Asigna un valor "Aprobado" o "Reprobado" a una variable en función de una nota.
		
		double notaAlumno = 8;
		
		String condicion = "";
		
		condicion = (notaAlumno >= 6) ? "Aprobado" : "Desaprobado";
		
		System.out.println("La nota del alumno es "+ notaAlumno + " y esta "+ condicion);
		
		//Ejercicios con Math.random()
		
		//26.Genera un número aleatorio entre 1 y 10 y muestra un mensaje si es mayor que 5.
		
		int numMin = 1;
		int numMax = 10;
		
		int rango = numMax - numMin + 1;
	
		int random =(int) (Math.random() * rango) + numMin;
		
		if(random > 5) {
			System.out.println("El numero "+ random + " es MAYOR a 5");
		}else {
			System.out.println("EL numero "+ random + " NO es MAYOR a 5");
		}
		
		//27.Simula el lanzamiento de un dado con Math.random() y muestra el resultado.
		
		int dadoMin = 1;
		int dadoMax = 6;
		
		int dadoRango = dadoMax - dadoMin + 1;
		
		int dadoRandom = (int) (Math.random() * dadoRango) + dadoMin;
		
		System.out.println("El numero del dado es "+ dadoRandom);
		
		//28.Genera un número aleatorio entre 0 y 100 y determina si es mayor, menor o igual a 50.
		
		int numeroMinimo = 0;
		int numeroMaximo = 100;
		
		int numeroRango = numeroMaximo - numeroMinimo;
		
		int numeroRandom = (int)(Math.random()*numeroRango)+numeroMinimo;
		
		if(numeroRandom > 50) {
			System.out.println("El numero "+numeroRandom+ " es Mayor a 50");
		}else if(numeroRandom < 50) {
			System.out.println("El numero "+numeroRandom+ " es Menor 50");
		}else {
			System.out.println("El numero "+numeroRandom+ " es 50");
		}
		
		//29.Simula una moneda (cara o cruz) usando Math.random().
		
		int monedaMin = 1;
		int monedaMax = 2;
		
		int monedaRango = monedaMax - monedaMin +1;
		
		int monedaRandom = (int)(Math.random()*monedaRango)+ monedaMin;
		
		if(monedaRandom == 1) {
			System.out.println("El valor de la moneda es cara");
		}else {
			System.out.println("El valor de la moneda es cruz");
		}
		
		//30.Genera un número aleatorio entre 1 y 100 y determina si es múltiplo de 10.
		
		int aleatorioMax = 100;
		int aleatorioMin = 1;
		
		int aleatorioRango = aleatorioMax - aleatorioMin + 1;
		
		int aleatorioRandom = (int)(Math.random()*aleatorioRango)+ aleatorioMin;
		
		if(aleatorioRandom % 10 == 0) {
			System.out.println("El numero "+ aleatorioRandom+ " es multiplo de 10");
		}else {
			System.out.println("El numero "+ aleatorioRandom+ " NO es multipo de 10");
		}
		
		//Ejercicios combinando condicionales.
		
		//31.Determina si un número es positivo, negativo o cero usando un operador ternario.
		
		int numeroJ = -0;
		
		String valorPosNeg = "";
		
		valorPosNeg = (numeroJ > 0) ? "Positivo" : (numeroJ < 0) ? "Negativo" : "Cero";
		System.out.println("El numero "+ numeroJ + " es "+ valorPosNeg);
		
		//32.Simula un semáforo. Muestra el estado (verde, amarillo, rojo) según un número aleatorio del 1 al 3.
		
		int semaforoMax = 3;
		int semaforoMin = 1;
		
		int semaforoRango = semaforoMax - semaforoMin + 1;
		
		int semaforoAleatorio = (int)(Math.random()*semaforoRango)+ semaforoMin;
		
		if(semaforoAleatorio == 1) {
			System.out.println("El semaforo  esta en ROJO");
			}else if(semaforoAleatorio == 2) {
				System.out.println("El semaforo esta en AMARILLO");
			}else {
				System.out.println("El semaforo esta en VERDE");
			}
		
		//33.Crea un programa que simule una lotería. Genera un número aleatorio y verifica si es igual a un número predeterminado.
		
		int loteriaMax = 100;
		int loteriaMin = 0;
		
		int loteriaRango = loteriaMax - loteriaMin;
		
		int loteriaAleatorio = (int)(Math.random()*loteriaRango) + loteriaMin;
		
		int numeroPredeterminado = 10;
		
		if(loteriaAleatorio == numeroPredeterminado) {
			System.out.println("El numero "+ loteriaAleatorio + " es igual a " + numeroPredeterminado);
		}else { 
			System.out.println("El numero "+ loteriaAleatorio + " es DISTINTO a " + numeroPredeterminado);
		}
		
		//34.Genera un número aleatorio entre 1 y 100 y evalúa si es divisible por 3 o por 5.
		
		int numeroAleatorioMax = 100;
		int numeroAleatorioMin = 1;
		
		int numeroAleatorioRango = numeroAleatorioMax - numeroAleatorioMin + 1;
		
		int numeroAleatorio = (int)(Math.random()*numeroAleatorioRango) + numeroAleatorioMin;
		
		if(numeroAleatorio % 3 == 0 || numeroAleatorio % 5 == 0) {
			System.out.println("El numero "+ numeroAleatorio+ " es divisible por 3 o por 5");
		}else {
			System.out.println("El numero "+ numeroAleatorio+ " NO es divisible por 3 o por 5");
		}
		
		//35.Simula un dado y determina si el número obtenido es mayor o igual a 4.
		
		int dadoMaximo = 6;
		int dadoMinimo = 1;
		
		int rangoDado = dadoMaximo - dadoMinimo + 1;
		
		int numeroDado = (int)(Math.random()*rangoDado)+ dadoMinimo;
		
		if(numeroDado > 4 || numeroDado == 4) {
			System.out.println("El numero del dado es "+ numeroDado + " y ES mayor o igual a 4");
		}else {
			System.out.println("El numero del dado es "+ numeroDado + " y NO es mayor o igual 4");
		}
		
		//36.Genera un número aleatorio entre 1 y 100 y clasifícalo en categorías: bajo (<30), medio (>=30 y <=70), alto (>70).
		
		int numAleMax = 100;
		int numAleMin = 1;
		
		int numAleRango= numAleMax - numAleMin + 1;
		
		int numAle = (int)(Math.random()*numAleRango)+ numAleMin;
		
		if(numAle < 30) {
			System.out.println("El numero es "+numAle+" y es de la categoria BAJO");
		}else if(numAle >= 30 && numAle <= 70) {
			System.out.println("El numero es "+numAle+" y es de la categoria MEDIO");
		}else if(numAle>70) {
			System.out.println("El numero es "+numAle+" y es de la categoria ALTO");
		}
		
		//37.Determina si un número generado aleatoriamente entre 1 y 100 es primo o no.
		
		int primoMax = 100;
		int primoMin = 1;
		
		int primoRango = primoMax - primoMin + 1;
		
		int primo= (int)(Math.random()*primoRango)+ primoMin;
		
		boolean esPrimo = true;
		if(primo <= 1) {
			esPrimo = false;
		}else {
			for(int i = 2; i <= Math.sqrt(primo); i++) {
				if (primo % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		
		if(esPrimo) {
			System.out.println("El numero "+ primo + " ES primo");
		}else {
			System.out.println("El numero "+ primo + " NO es primo");
		}
		
		//38.Simula una adivinanza de un número entre 1 y 10. El usuario ingresa un número y el programa le dice si acertó o no.
		
		int adivinanzaMax = 1;
		int adivinanzaMin = 10;
		
		int adivinanzaRango = adivinanzaMax - adivinanzaMin + 1;
		
		int adivinanza = (int)(Math.random()*adivinanzaRango)+ adivinanzaMin;
		
		int ingresoUsuario = 0;
		Scanner usuario = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 10");
		ingresoUsuario = usuario.nextInt();
		
		if(adivinanza == ingresoUsuario) {
			System.out.println("El numero de la adivinanza es "+ adivinanza+ " y acertaste");
		}else {
			System.out.println("El numero de la adivinanza es "+ adivinanza+ " y NO acertaste");
		}
		
		
		
		//39.Genera un número aleatorio entre 1 y 50 y verifica si está en el rango de [20, 30].
		
		int aleatorioNumMax = 50;
		int aleatorioNumMin = 1;
		
		int aleatorioNumRango = aleatorioNumMax - aleatorioNumMin + 1;
		
		int aleatorioNumRandom = (int)(Math.random()*aleatorioNumRango)+ aleatorioNumMin;
		
		if(aleatorioNumRandom >= 20 && aleatorioNumRandom <= 30) {
			System.out.println("El numero "+ aleatorioNumRandom + " ESTA en el rango entre 20 y 30");
		}else {
			System.out.println("El numero "+ aleatorioNumRandom + " NO esta en el rango entre 20 y 30");
		}
		
		//Ejercicios avanzados básicos
		
		//40.Simula un lanzamiento de tres dados y verifica si la suma de los resultados es mayor que 10.
		
		int valorDadoMax= 6;
		int valorDadoMin= 1;
		
		int valorDadoRango = valorDadoMax - valorDadoMin + 1;
		
		int valorDado1 = (int)(Math.random()*valorDadoRango)+ valorDadoMin;
		int valorDado2 = (int)(Math.random()*valorDadoRango)+ valorDadoMin;
		int valorDado3 = (int)(Math.random()*valorDadoRango)+ valorDadoMin;
		
		System.out.println("El valor del dado 1 es "+ valorDado1 +", el valor del dado 2 es "+ valorDado2 +" y el valor del dado 3 es "+ valorDado3);
		
		int sumaDados = valorDado1 + valorDado2 + valorDado3;
		
		if (sumaDados > 10) {
			System.out.println("La suma de los dados es "+ sumaDados+ " y ES mayor a 10");
		}else {
			System.out.println("La suma de los dados es "+ sumaDados+ " y NO es mayor a 10");
		}
		
		//41.Simula una ruleta de colores: genera un número aleatorio del 1 al 5 y asigna un color.
		
		int numColorMax = 1;
		int numColorMin = 5;
		
		int colorRango = numColorMax - numColorMin + 1;
		
		int colorNum = (int)(Math.random()*colorRango) + numColorMin;
		
		String color = "";
		
		switch(colorNum) {
		case 1: 
			color = "Rojo";
			break;
		case 2:
			color = "Azul";
			break;
		case 3:
			color = "Rosa";
			break;
		case 4:
			color = "Verde";
			break;
		case 5:
			color = "Amarillo";
			break;
		default :
			color = "INCORRECTO";
			break;
		}
		
		System.out.println("El numero es "+ colorNum+ " y el color es " + color);
		
		//42.Calcula el descuento en una tienda dependiendo del tipo de cliente: 1. Normal (sin descuento), 2. Miembro (10% de descuento), 3. VIP (20% de descuento).
		
		int cliente = 3;
		
		int descuento = 0;
		
		if(cliente == 1) {
			descuento = 0;
			System.out.println("El cliente tiene "+descuento+"% de descuento");
			}else if (cliente == 2) {
				descuento = 10;
				System.out.println("El cliente tiene "+descuento+ "% de DESCUENTO");
			}else if (cliente == 3) {
				descuento = 20;
				System.out.println("El cliente tiene "+descuento+ "% de DESCUENTO");
			}else {
				System.out.println("Numero de tipo de cliente INCORRECTO");
			}
		
		//43.Evalúa el clima: genera un número aleatorio y asigna un estado del tiempo (soleado, nublado, lluvioso, nevando).
		
		int tiempoMax = 4;
		int tiempoMin = 1;
		
		int rangoTiempo = tiempoMax - tiempoMin + 1;
		
		int randomTiempo = (int)(Math.random()*rangoTiempo)+ tiempoMin;
		
		if(randomTiempo == 1) {
			System.out.println("El tiempo esta SOLEADO");
		}else if(randomTiempo == 2) {
			System.out.println("El tiempo esta NUBLADO");
		}else if(randomTiempo == 3) {
			System.out.println("El tiempo esta LLUVIOSO");
		}else if(randomTiempo == 4) {
			System.out.println("El tiempo esta NEVADO");
		}
		
		//44.Determina el ganador de un juego de piedra, papel o tijera usando números aleatorios y switch.
		
		int juegoMax = 3;
		int juegoMin = 1;
		
		int juegoRango= juegoMax - juegoMin +1;
		
		int juego1 = (int)(Math.random()*juegoRango)+ juegoMin;
		int juego2 = (int)(Math.random()*juegoRango)+ juegoMin;
		
		String jugador1 = "";
		String jugador2 = "";
		
		switch(juego1) {
		case 1:
			jugador1 = "Piedra";
			break;
		case 2:
			jugador1 = "Papel";
			break;
		case 3:
			jugador1 = "Tijera";
			break;
		}
		
		switch(juego2) {
		case 1:
			jugador2 = "Piedra";
			break;
		case 2:
			jugador2 = "Papel";
			break;
		case 3:
			jugador2 = "Tijera";
			break;
		}
		
		System.out.println("El jugador 1 saco: " +jugador1);
		System.out.println("EL jugador 2 saco: " +jugador2);
		
		String ganador = "";
	
		switch (juego1) {
	    case 1: // Jugador 1 sacó Piedra
	        if (juego2 == 1) {
	            ganador = "EMPATE"; // Piedra vs Piedra
	        } else if (juego2 == 2) {
	            ganador = "Jugador 2"; // Piedra vs Papel
	        } else if (juego2 == 3) {
	            ganador = "Jugador 1"; // Piedra vs Tijera
	        }
	        break;

	    case 2: // Jugador 1 sacó Papel
	        if (juego2 == 1) {
	            ganador = "Jugador 1"; // Papel vs Piedra
	        } else if (juego2 == 2) {
	            ganador = "EMPATE"; // Papel vs Papel
	        } else if (juego2 == 3) {
	            ganador = "Jugador 2"; // Papel vs Tijera
	        }
	        break;

	    case 3: // Jugador 1 sacó Tijera
	        if (juego2 == 1) {
	            ganador = "Jugador 2"; // Tijera vs Piedra
	        } else if (juego2 == 2) {
	            ganador = "Jugador 1"; // Tijera vs Papel
	        } else if (juego2 == 3) {
	            ganador = "EMPATE"; // Tijera vs Tijera
	        }
	        break;
	}
		
		
		System.out.println("El ganador es: " + ganador);
		
		//45.Simula un juego de adivinanza: el usuario tiene que adivinar un número entre 1 y 5 generado aleatoriamente.
		
		int adivinaMax = 5;
		int adivinaMin = 1;
		
		int adivinaRango = adivinaMax - adivinaMin + 1;
		
		int adivinaRandom = (int)(Math.random()*adivinaRango) + adivinaMin;
		
		System.out.println("Ingresa un numero del 1 al 5");
		
		Scanner usuario2 = new Scanner(System.in);
		
		int numeroUsuario = usuario2.nextInt();
		
		if (numeroUsuario == adivinaRandom) {
			System.out.println("El numero es "+ adivinaRandom +" adivinaste");
		}else {
			System.out.println("El numero es "+ adivinaRandom +" No adivinaste");
		}
		
		//cierro Scanner
		usuario2.close();
		//cierro el primer Scanner
		usuario.close();
		//46.Crea un programa que asigne una beca: si la nota es >= 85 y la edad < 25, el estudiante recibe una beca.
		
		double notaEstudiante = 85;
		int edadEstudiante = 25;
		String estadoBeca = "";
		
		if(notaEstudiante >= 85 && edadEstudiante < 25) {
			estadoBeca = "BECA OTORGADA";
			System.out.println(estadoBeca);
		}else {
			estadoBeca = "BECA NO OTORGADA";
			System.out.println(estadoBeca);
		}
		
		//47.Determina si un número generado aleatoriamente entre 1 y 100 es un número perfecto (la suma de sus divisores propios es igual al número).
		
		int numeroPerfectoMax = 100;
		int numeroPerfectoMin = 1;
		
		int numeroPerfectoRango= numeroPerfectoMax - numeroPerfectoMin + 1;
		int numeroPerfectoRandom = (int)(Math.random()*numeroPerfectoRango) + numeroPerfectoMin;
		
		System.out.println("El numero generado es "+ numeroPerfectoRandom);
		
		int sumaDivisores  = 0;
		
		for(int i= 1; i <= numeroPerfectoRandom/2 ; i++) {
			if (numeroPerfectoRandom % i == 0) {
				sumaDivisores = sumaDivisores + i;
			}
		}
		
		if(sumaDivisores == numeroPerfectoRandom) {
			System.out.println("El numero "+ numeroPerfectoRandom+" ES PERFECTO");
		}else {
			System.out.println("El numero "+ numeroPerfectoRandom+" NO ES PERFECTO");
		}
		
		
		//48.Genera dos números aleatorios entre 1 y 100 y muestra cuál es mayor.
		
		int numeroMaxim = 100;
		int numeroMinim = 1;
		
		int intervalo = numeroMaxim - numeroMinim + 1;
		
		int numeroAzar = (int)(Math.random()* intervalo) + numeroMinim;
		int numeroAzar2 = (int)(Math.random()* intervalo) + numeroMinim;
		
		if(numeroAzar > numeroAzar2) {
			System.out.println("El primer numero  "+numeroAzar+ " es MAYOR al segundo numero "+ numeroAzar2);
		}else {
			System.out.println("El segundo numero  "+numeroAzar2+ " es MAYOR al primer numero "+ numeroAzar);
		}
		
		//49.Genera un número aleatorio entre 1 y 100 y evalúa si es mayor que 75 usando un operador ternario.
		
		String mayor75 = numeroAzar > 75 ? " es MAYOR a 75" : " NO es MAYOR a 75";
		
		System.out.println("EL numero "+numeroAzar+mayor75);
		//50.Simula un juego de dados: si la suma de dos dados es 7 o 11, el jugador gana.
		
		int dadoValorMaximo = 6;
		int dadoValorMinimo = 1;
		
		int dadoValorRango = dadoValorMaximo - dadoValorMaximo + 1;
		int dado1ValorRandom = (int)(Math.random()*dadoValorRango)+ dadoValorMinimo;
		int dado2ValorRandom = (int)(Math.random()*dadoValorRango)+ dadoValorMinimo;
	
		int sumaValorDados = dado1ValorRandom + dado2ValorRandom;
		
		if (sumaValorDados == 7 || sumaValorDados == 11) {
			System.out.println("La suma de los dados es "+sumaValorDados+ " y Ganaste");
		}else {
			System.out.println("La suma de los dados es "+sumaValorDados+ " y Perdiste");
		}
	}
}
