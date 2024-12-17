package com.coderhouse.exception;

public class ExcepcionesProyecto extends Exception {

	public ExcepcionesProyecto(String mensaje) {
		super(mensaje);
	}
	
	
	public static class PrecioSinIvaNoCalculado extends ExcepcionesProyecto {
		public PrecioSinIvaNoCalculado () {
		super(" el precio sin iva no fue calculado previamente");
		}
	}
	
	public static class GananciaNoMayorACero extends ExcepcionesProyecto{
		public GananciaNoMayorACero() {
			super(" la ganancia deben ser mayor a cero");
		}
	}
	
}