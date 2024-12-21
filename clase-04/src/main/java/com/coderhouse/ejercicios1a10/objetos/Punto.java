//8.Crea una clase Punto con atributos x y y que represente un punto en un plano cartesiano.
package com.coderhouse.ejercicios1a10.objetos;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void coordenadasDelPunto() {
		System.out.println("El punto se encuentra en la posicion x="+getX()+" , y="+getY());
	}

}
