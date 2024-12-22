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
	
	public Producto saveProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	@Transactional
	public Producto updateProductoById(Long id, Producto productoDetails) {
		Producto producto = productoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Producto no Encontrado"));
		producto.setNombre(productoDetails.getNombre());
		producto.setStock(productoDetails.getStock());
		producto.setPorcentajeGanancia(productoDetails.getPorcentajeGanancia());
		producto.setCostoConIva(productoDetails.getCostoConIva());
		calcularPreciosProducto(producto);
		return productoRepository.save(producto);
	}
 	
	@Transactional
	public void deleteProductoById(Long id) {
			productoRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Producto no Encontrado"));
			productoRepository.deleteById(id);
	}
	
	//metodos para calcular los valores del producto
	
	private static final double IVA = 0.21;
	
	public double calcularCostoSinIva(double costoConIva) {
		return costoConIva / (1+IVA);
	}
	
	public double calcualrPrecioDeVentaSinIva(double costoSinIva, double porcentajeDeGanancia) {
		double ganancia = costoSinIva * (porcentajeDeGanancia/100);
		return ganancia + costoSinIva;
	}
	
	public double calcularPrecioDeVentaConIva(double precioDeVentaSinIva) {
		return precioDeVentaSinIva * (1+IVA);
	}
	
	public Producto calcularPreciosProducto(Producto producto) {
		double costoSinIva = calcularCostoSinIva(producto.getCostoConIva());
		double precioDeVentaSinIva = calcualrPrecioDeVentaSinIva(costoSinIva, producto.getPorcentajeGanancia());
		double precioDeVentaConIva = calcularPrecioDeVentaConIva(precioDeVentaSinIva);
		
		producto.setCostoSinIva(costoSinIva);
		producto.setPrecioDeVentaSinIva(precioDeVentaSinIva);
		producto.setPrecioDeVentaConIva(precioDeVentaConIva);
		
		return productoRepository.save(producto);
	}
	
}
