package com.coderhouse.exception;

public class ExcepcionesProyecto extends Exception {

	public ExcepcionesProyecto(String mensaje) {
		super(mensaje);
	}
	
	
	public static class PrecioSinIvaNoCalculado extends ExcepcionesProyecto {
		public PrecioSinIvaNoCalculado (String mensaje) {
		super(mensaje);
		}
	}
	
	public static class GananciaNoMayorACero extends ExcepcionesProyecto{
		public GananciaNoMayorACero(String mensaje) {
			super(mensaje);
		}
	}
	
}