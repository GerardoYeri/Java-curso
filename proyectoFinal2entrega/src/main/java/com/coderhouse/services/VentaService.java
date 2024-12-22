package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Venta;
import com.coderhouse.repositories.VentaRepository;

import jakarta.transaction.Transactional;

@Service
public class VentaService {
	
	@Autowired
	private VentaRepository ventaRepository;
	
	public List<Venta> getAllVentas(){
		return ventaRepository.findAll();
	}
	
	public Venta getVentaById(Long id) {
	return	ventaRepository.findById(id).
		orElseThrow(()-> new IllegalArgumentException("Venta no Encontrada"));
		}
	
	@Transactional
	public Venta saveVenta(Venta venta) {
		return ventaRepository.save(venta);
		}
	
	@Transactional
	public Venta updateVentaById(Long id, Venta ventaDetails) {
		Venta venta = ventaRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Venta no Encontrada"));
		
		venta.setCliente(ventaDetails.getCliente());
		venta.setTotal(ventaDetails.getTotal());
		venta.setDetalleDeVentas(ventaDetails.getDetalleDeVentas());
		
		return ventaRepository.save(venta);
	}
	
	@Transactional
	public void deleteVentaById(Long id) {
		ventaRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Venta no Encontrada"));
		ventaRepository.deleteById(id);
		}
	
}
