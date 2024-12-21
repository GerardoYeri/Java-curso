package com.coderhouse.ejercicios1a10.objetos;

public class Vehiculo {
		
		private int velocidad;
		private int combustible;
		
	
		public Vehiculo(int velocidad, int combustible) {
			super();
			this.velocidad = velocidad;
			this.combustible = combustible;
		}


		public int getVelocidad() {
			return velocidad;
		}


		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}


		public int getCombustible() {
			return combustible;
		}


		public void setCombustible(int combustible) {
			this.combustible = combustible;
		}

		public int consumoDeCombustible() {
			
			if(velocidad > 0 && velocidad < 100) {
				combustible -= 10; 
			}else if(velocidad >= 100 && velocidad <200) {
					this.combustible -= 20;
					}
				return this.combustible;
		}
		
		
		
		
}
