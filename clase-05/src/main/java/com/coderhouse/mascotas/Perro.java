package com.coderhouse.mascotas;

public class Perro extends Mascota {
	
	private String raza;
	
	public Perro() {
		super();
	}
	
	
	public void ladrar() {
		System.out.println("El perro "+getNombre()+" esta ladrando");
	}
	
	@Override // Sobreescritura de metodo => POLIMORFISMO
	public void caminar() {
		System.out.println("El perro "+ getNombre()+ " esta Caminando en el parque");
	}
	
	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}



	@Override
	public String toString() {
		return "Perro raza=" + raza;
	}
	
	
	
}
