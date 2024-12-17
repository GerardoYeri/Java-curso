//13.Crea una clase Cuenta con un método depositar, y una subclase CuentaAhorros que implemente una tasa de interés.

package com.coderhouse.ejercicios.objetos;

public class CuentaAhorros extends Cuenta {
	

	public double calcularInteres(double tasaInteres) {
		return  tasaInteres / 100;  
	}
	
	public void aplicarInteres(double tasaInteres) {
		double interes = 100 * calcularInteres(tasaInteres);
		setSaldo(getSaldo()+interes);
		System.out.println("Interes aplicado "+ interes + "% Saldo actual: "+ getSaldo());
	}
	

	
	@Override
	public void depositar(double deposito) {
		double saldo;
		if(deposito > 0) {
			saldo = getSaldo(); 
			setSaldo( saldo+= deposito);
			System.out.println("Deposito exitoso en cuenta de Ahorro, saldo actual: "+ getSaldo());
		}else {
			System.err.println("El monto a depositar debe ser positivo");
		}
	}
	
}