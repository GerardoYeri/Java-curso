package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.exception.ExcepcionesProyecto.GananciaNoMayorACero;
import com.coderhouse.exception.ExcepcionesProyecto.PrecioSinIvaNoCalculado;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;

@SpringBootApplication
public class ProyectoFinalApplication implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			Producto producto1 = new Producto("Teclado");
			Producto producto2 = new Producto("Mouse");
			Producto producto3 = new Producto("Monitor");
			Producto producto4 = new Producto("Joystick");
			Producto producto5 = new Producto("Auriculares");
			
			Cliente cliente1 = new Cliente("Alejandro", "Perez", 11333888);
			Cliente cliente2 = new Cliente("Leandro", "Garcia", 22444888);
			Cliente cliente3 = new Cliente("Marcelo", "Lazos", 33444333);
			Cliente cliente4 = new Cliente("Catalina", "Sanchez", 44555999);
			Cliente cliente5 = new Cliente("Romina", "Funes", 55333222);
			
			try {
				
				producto1.calcularPrecioSinIva(0000, 0);
				
			} catch (GananciaNoMayorACero error) {
				System.err.println("Error "+ error.getMessage());
			}
			
			producto1.calcularPrecioConIva();
			
			dao.persistirProducto(producto1);
			dao.persistirProducto(producto2);
			dao.persistirProducto(producto3);
			dao.persistirProducto(producto4);
			dao.persistirProducto(producto5);
			
			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			dao.persistirCliente(cliente3);
			dao.persistirCliente(cliente4);
			dao.persistirCliente(cliente5);
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}	
		
	}
	
}
