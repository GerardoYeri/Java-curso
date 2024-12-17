package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {
	
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistirCliente(Cliente cliente) {
		em.persist(cliente);
	}
	
	@Transactional
	public void persistirProducto(Producto producto) {
		if(producto.getPrecioConIva() > 0 && producto.getPrecioSinIva() > 0) {
			em.persist(producto);
		}else {
			System.err.println("No se puede persistir "+ producto + " : precios no calculados correctamente.");
		}
		
	
	
	}
}
