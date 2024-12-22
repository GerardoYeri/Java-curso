package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.DetalleDeVenta;
import com.coderhouse.repositories.DetalleDeVentaRepository;

import jakarta.transaction.Transactional;

@Service
public class DetalleDeVentaService {
	
	@Autowired
	private DetalleDeVentaRepository detalleDeVentaRepository;
	
	public List<DetalleDeVenta> getAllDetalleDeVentas(){
		return detalleDeVentaRepository.findAll();
	}
	
	public DetalleDeVenta getDetalleDeVentaById(Long id) {
		return detalleDeVentaRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Detalle de venta no encontrado"));
	}
	
	@Transactional
	public DetalleDeVenta saveDetalleDeVenta(DetalleDeVenta detalleDeVenta) {
		return detalleDeVentaRepository.save(detalleDeVenta);
	}
	
	@Transactional
	public DetalleDeVenta upDetalleDeVentaById(Long id, DetalleDeVenta detalleDeVentaDetails) {
		DetalleDeVenta detalleDeVentaModificado = detalleDeVentaRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Detalle de venta no encontrado"));
		detalleDeVentaModificado.setCantidad(detalleDeVentaDetails.getCantidad());
		detalleDeVentaModificado.setPrecioDeVentaUnitario(detalleDeVentaDetails.getPrecioDeVentaUnitario());
		detalleDeVentaModificado.setProducto(detalleDeVentaModificado.getProducto());
		detalleDeVentaModificado.setVenta(detalleDeVentaDetails.getVenta());
		return detalleDeVentaRepository.save(detalleDeVentaModificado);
	}
	
	@Transactional
	public void deleteDetalleDeVentaById(Long id) {
		detalleDeVentaRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Detalle de venta no encotrado"));
		detalleDeVentaRepository.deleteById(id);
	}
	
	
}
