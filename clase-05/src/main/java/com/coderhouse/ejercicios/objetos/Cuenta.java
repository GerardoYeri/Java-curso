//13.Crea una clase Cuenta con un método depositar, y una subclase CuentaAhorros que implemente una tasa de interés.

package com.coderhouse.ejercicios.objetos;

public class Cuenta {
		
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void consultarSaldo() {
		System.out.println("El saldo de la cuenta es "+ getSaldo());
	}
	
	public void depositar(double deposito) {
		if(deposito > 0) {
			saldo += deposito;
			System.out.println("Deposito exitoso en cuenta, saldo actual: "+ saldo);
		}else {
			System.err.println("El monto a depositar debe ser positivo");
		}
	}

	
	
}
