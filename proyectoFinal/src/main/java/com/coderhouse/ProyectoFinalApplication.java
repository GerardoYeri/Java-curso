package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
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
			
			Cliente cliente1 = new Cliente("Alejandro", "Perez", 11333888,
					"35415088279","Los reales 22", "Cordoba");
			Cliente cliente2 = new Cliente("Leandro", "Garcia", 22444888, 
					"35414088279","Los algarrobos 444", "Cordoba");
			Cliente cliente3 = new Cliente("Marcelo", "Lazos", 33444333, 
					"35413088279","Los lapachos 321", "Cordoba");
			Cliente cliente4 = new Cliente("Catalina", "Sanchez", 44555999, 
					"35412088279","Rucci 134", "Cordoba");
			Cliente cliente5 = new Cliente("Romina", "Funes", 55333222, 
					"35411088279","Rioja 22", "Cordoba");
			
			
			producto1.prosesarProducto(producto1, 0, 0);
			producto2.prosesarProducto(producto2, 0, 10);
			
			producto3.prosesarProducto(producto3, 40000, 25);
			producto4.prosesarProducto(producto4, 50000, 10);
			producto5.prosesarProducto(producto5, 60000, 20);
		
			
			

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
