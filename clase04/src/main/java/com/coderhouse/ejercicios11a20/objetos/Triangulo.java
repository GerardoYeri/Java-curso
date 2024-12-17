package com.coderhouse.ejercicios11a20.objetos;

public class Triangulo {
		private int base;
		private int altura;
		private int area;
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public int getArea() {
			return area;
		}
		public void setArea(int area) {
			this.area = area;
		}
		
		public int calcularArea(int base, int altura) {
			area = (base*altura)/2;
			return area;
		}
		
		public void mostrarArea() {
			System.out.println("El area del Triangulo es "+area);
		}
		
		
}
