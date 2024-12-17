package com.coderhouse;

public class Ejercicios1Al24 {

	public static void main(String[] args) {
	//Ejercicios sobre Variables y Tipos de Variables
		
		//1 Crear una variable entera que almacene la edad de un usuario.
		int edadUsuario = 30;
		System.out.println("La edad del usuario es: "+ edadUsuario);
		
		//2 Definir una constante para el número de días en una semana.
		final int NUM_DIAS_SEMANA= 7;
		System.out.println("Cantidad de dias de la semana: "+ NUM_DIAS_SEMANA);
		
		//3 Declarar una variable de tipo double para almacenar el precio de un producto.
		double precioProducto = 20.20;
		System.out.println("El precio del producto es: "+ precioProducto);
		
		//4 Crear una variable booleana que indique si un estudiante está aprobado o no.
		boolean alumnoAprobado = true;
		System.out.println("el alumno esta aprobado: "+ alumnoAprobado);
		
		//5 Utilizar una variable de tipo char para almacenar la inicial del nombre de una persona.
		char inicialPersona = 'G';
		System.out.println("La inicial de la persona es: "+ inicialPersona);
		
		//6 Crear un arreglo de enteros que almacene las notas de 5 estudiantes.
		int notasAlumnos[][] = new int[5][5];
		notasAlumnos[0][0] = 7;
		
		//7 Definir una variable de tipo String que almacene el nombre completo de una persona.
		String nombrePersona = "Gerardo";
		System.out.println("El nombre de la persona es: "+ nombrePersona);
		
		//8 Crear una variable float para almacenar el peso de una persona.
		float pesoPersona= 70.50f;
		System.out.println("El peso de la persona es: "+ pesoPersona);
		
		//Ejercicios sobre Constantes
		
		//9 Declarar una constante para representar el número PI (3.14).
		final double PI = 3.14;
		System.out.println("El valor de pi es: "+ PI);
		
		//10 Crear una constante que contenga el valor máximo de estudiantes en un aula.
		final int CANT_ALUMNOS = 35;
		System.out.println("La cantidad de alumnos es: "+ CANT_ALUMNOS);
		//Ejercicios sobre Operadores
		
		//11 Realizar una suma de dos números enteros y mostrar el resultado.
		int numA = 30;
		int numB = 45;
		int resultadoSuma= numA + numB;
		System.out.println("El resultado de la suma es: "+resultadoSuma);
		
		//12 Restar dos números de tipo double y mostrar el resultado.
		double numC = 25.5;
		double numD = 15.80;
		double resultadoResta = numC - numD;
		System.out.println("El resultado de la resta es: "+ resultadoResta);
		
		//13 Multiplicar dos números y mostrar el resultado en pantalla.
		int numE = 10;
		int numF = 40;
		int resultadoMulti = numE * numF;
		System.out.println("EL resultado de la multiplicacion es: "+ resultadoMulti);
		
		//14 Dividir dos números y manejar la excepción de división por cero.
		try {
		int numG = 50;
		int numH = 0;
		int resultadoDiv = numG / numH;
		System.out.println("El resultado de la division es: "+resultadoDiv);
		} catch (ArithmeticException e) {

			System.out.println("No se puede dividir por cero");
		}
		 //preguntar sobre exepcion
		
		//15 Usar el operador % para encontrar el residuo de una división.
		int num1 = 39;
		int num2 = 48;
		double restoDiv = num1 % num2;
		System.out.println("El resto es:" + restoDiv);
		
		//Ejercicios sobre Operadores Relacionales
		
		//16 Comparar dos enteros y mostrar si el primero es mayor que el segundo.
		int primerNum = 45;
		int segundoNum = 66;
		System.out.println(primerNum > segundoNum);
		
		//17 Verificar si un número es par usando el operador %.
		int numI = 35;
		int numJ = 2;
		System.out.println(numI % numJ);
		
		//18 Comparar dos String para ver si son iguales.
		String producto1 = "cafe";
		String producto2 = "leche";
		System.out.println(producto1.equals(producto2));
		
		//19 Crear una condición que verifique si un estudiante está aprobado (nota >= 6).
		int notaAlumno = 8;
		System.out.println(notaAlumno >= 6);
		
		//20 Utilizar operadores lógicos para verificar si un número está entre 1 y 10.
		int numK = 7;
		System.out.println(numK >= 1 && numK <= 10);
		
		//Ejercicios sobre Buenas Prácticas
		
		//21 Escribir un código que declare variables siguiendo las convenciones de nomenclatura (camelCase).
		//22 Agregar comentarios explicativos a un fragmento de código que declare y utilice variables.
		
		//Declaracion de variables
		int numeroEntero ;
		double numeroDoubleDecimales;
		//Inicializacion de variables
		numeroEntero = 20;
		numeroDoubleDecimales = 345.772;
		//Mostrar por consola si hay igualdad
		System.out.println(numeroEntero == numeroDoubleDecimales);
		
		//23 Refactorizar un código para eliminar variables innecesaria
		
		//Refactorizar un código para eliminar variables innecesarias
		//float numeroFloatDecimales;
		//char unSoloCaracter;
		//boolean verdaderoFalso;
		
		//24 Organizar un código en métodos para mejorar su legibilidad.
		
		int edadCliente = 30;
		String nombreCliente = "Gerardo"; 
		
		mostrarInfoCliente(edadCliente , nombreCliente);
		
		//25 Utilizar nombres descriptivos para las variables en un pequeño programa.
		System.out.println("-------------------------------------------------------");
	
		int valorHamburguesa = 10000;
		int valorPizza = 7000;
		int valorTarta = 5000;
		System.out.println("Hamburguesa: $"+ valorHamburguesa);
		System.out.println("Pizza: $"+ valorPizza);
		System.out.println("Tarta: $"+ valorTarta);
		System.out.println("El cliente compro una Hamburguesa, una pizza y una Tarta");
		mostrarTotalCompra(valorHamburguesa, valorPizza, valorTarta);
		
		
		

	}
	//24 Organizar un código en métodos para mejorar su legibilidad.
	
		public static void mostrarInfoCliente(int edadCliente, String nombreCliente) {
			System.out.println("La edad del cliente es: "+ edadCliente + " y el nombre es: "+ nombreCliente);
		}
		
		public static void mostrarTotalCompra(int valorHamburguesa, int valorPizza, int valorTarta) {
			System.out.println("El total de la compra es: "+ (valorHamburguesa+ valorPizza + valorTarta));
			
		}
}
