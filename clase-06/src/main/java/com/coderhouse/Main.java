package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.sobrecarga.Impresora;

public class Main {

	public static void main(String[] args) {
		
	Perro miPerro = new Perro();
		
		miPerro.setNombre("Firulay");
		
		miPerro.comer();
		miPerro.emitirSonido();
		miPerro.estaVivo();
		miPerro.comer();
		miPerro.dormir();
		miPerro.jugar();
		
		System.out.println("El perro " + miPerro.getNombre() + " esta vivo?: " + miPerro.estaVivo());
	
	
		Gato miGato = new Gato();
		
		miGato.setNombre("Michi");
		
		miGato.comer();
		miGato.emitirSonido();
		miGato.estaVivo();
		miGato.comer();
		miGato.dormir();
		miGato.jugar();
		
		System.out.println(miGato);
		
		Ave miAve = new Ave();
		
		miAve.setNombre("Tweety");
		miAve.comer();
		miAve.emitirSonido();
		miAve.estaVivo();
		miAve.moverse();
		
		Auto miAuto = new Auto();
		
		miAuto.setMarca("Ford");
		miAuto.setModelo("Fiesta");
		miAuto.setRuedas(4);
		miAuto.setColor("Azul");
		miAuto.mostrarCantidadDeRuedas();
		System.out.println(miAuto);
		
		Impresora miImpresora = new Impresora();
		
		miImpresora.imprimir(3);
		miImpresora.imprimir(10, 20);
		miImpresora.imprimir("Palabra");
		miImpresora.imprimir("Primer String", "Segundo String");
		
		int[] enteros = {1,2,3,4,5,6,7,8,9,10,20};
		
		miImpresora.imprimir(enteros);
		
	}

}
