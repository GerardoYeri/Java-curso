package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Producto;
import com.coderhouse.repositories.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> getAllProductos(){
		return productoRepository.findAll();
	}
	
	public Producto getProductoById(Long id) {
		return productoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Producto no encontrado"));
	}
	
	@Transactional
	public Producto createProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	@Transactional
	public Producto updateProductoById(Long id, Producto productoDetails) {
		Producto productoModificado = productoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Producto no encontrado"));
		productoModificado.setNombre(productoDetails.getNombre());
		productoModificado.setStock(productoDetails.getStock());
		productoModificado.setCostoConIva(productoDetails.getCostoConIva());
		productoModificado.setCostoSinIva(productoDetails.getCostoSinIva());
		productoModificado.setPorcentajeGanancia(productoDetails.getPorcentajeGanancia());
		productoModificado.setPrecioDeVentaSinIva(productoDetails.getPrecioDeVentaSinIva());
		productoModificado.setPrecioDeVentaConIva(productoDetails.getPrecioDeVentaConIva());
		
		return productoRepository.save(productoModificado);
	}
 	
	@Transactional
	public void deleteProductoById(Long id) {
		productoRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Producto no encontrado"));
		productoRepository.deleteById(id);
	}
	
	private final double IVA = 0.21;
	
	public double costoSinIva(double costoConIVa) {
		return costoConIVa / (1 + IVA);
	}
	
	public double precioDeVentaSinIva(double costoSinIva, double porcentajeDeGanancia) {
		double ganancia = costoSinIva * (porcentajeDeGanancia/100);
		return ganancia + costoSinIva;
	}
	
	public double precioDeVentaConIva(double precioDeVentaSinIva) {
		return precioDeVentaSinIva * (1+ IVA);
	}
	
	public Producto calcularPrecios(Producto producto) {
		
		double costoSinIva = costoSinIva(producto.getCostoConIva());
		double precioDeVentaSinIva = precioDeVentaSinIva(costoSinIva, producto.getPorcentajeGanancia());
		double precioDeVentaConIva =  precioDeVentaConIva(precioDeVentaSinIva);
		
		producto.setCostoSinIva(costoSinIva);
		producto.setPrecioDeVentaSinIva(precioDeVentaSinIva);
		producto.setPrecioDeVentaConIva(precioDeVentaConIva);
		
		return productoRepository.save(producto);
	}
}
