//3.Crea una clase Libro con atributos titulo y autor y un método que imprima la información del libro.
package com.coderhouse.ejercicios1a10.objetos;



public class Libro {
	
	private String titulo;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}


	
	public void informacionLibro() {
		System.out.println("El titulo del libro es: "+getTitulo()+" y el autor es: "+getAutor());
	}

}
