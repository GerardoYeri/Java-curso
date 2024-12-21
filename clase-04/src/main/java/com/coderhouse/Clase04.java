package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
		Perro primerPerro = new Perro();
		
		primerPerro.setNombre("Firulais");
		primerPerro.setColor("gris");
		primerPerro.setRaza("caniche");
		primerPerro.setTamanio("chico");
		primerPerro.setEdad(3);
		
		System.out.println(primerPerro);
		
		System.out.println(primerPerro.getNombre());
		System.out.println(primerPerro.getColor());
		System.out.println(primerPerro.getRaza());
		System.out.println(primerPerro.getTamanio());
		System.out.println(primerPerro.getEdad());
		
		primerPerro.caminar();
		primerPerro.comer();
		primerPerro.ladrar();
		
		
		String[] nombres = new String[] {
		"Gabriel",
		"Oclivar",
		"Sara",
		"Matias",
		"Marcelo",
		"Alejandro"
		};
		
		imprimirListaDeNombres(nombres);
		
		int radio = 3; //Variable local dentro del main
		calcularAreaDelCirculo(radio);
		System.out.println("El area del circulo con radio "+ radio
				+ " cm, es de "+calcularAreaDelCirculo(radio));
	}
		
	private static void imprimirListaDeNombres(String[] nombresDePersonas) {
		for(String nombre : nombresDePersonas) {
			System.out.println("Nombre: "+ nombre);
		}
	}
	static final double PI ;
	static {
		PI = 3.14159653589793;
	}
	
	private static double calcularAreaDelCirculo(int radio) { //este radio es variable local de este metodo
		return PI * Math.pow(radio, 2);
	}
}
	
