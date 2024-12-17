//4.Crea una clase CuentaBancaria con atributos saldo y titular, y un método para mostrar el saldo.
package com.coderhouse.ejercicios1a10.objetos;

public class CuentaBancaria {
	
	private double saldo;
	private String titular;
	
	

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void mostrarSaldo() {
		System.out.println("El saldo es: "+ getSaldo());
	}

}
