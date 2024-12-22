package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.DetalleDeVenta;
import com.coderhouse.services.DetalleDeVentaService;

@RestController
@RequestMapping("/api/detallesdeventas")
public class DetalleDeVentaController {
	
	@Autowired
	private DetalleDeVentaService detalleDeVentaService;
	
	@GetMapping
	public ResponseEntity<List<DetalleDeVenta>> getAlldetalleDeVenta(){
		try {
			List<DetalleDeVenta> detalleDeVentas = detalleDeVentaService.getAllDetalleDeVentas();
			return ResponseEntity.ok(detalleDeVentas);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DetalleDeVenta> getDetalleDeVentaByID(@PathVariable Long id){
		try {
			DetalleDeVenta detalleDeVenta = detalleDeVentaService.getDetalleDeVentaById(id);
			return ResponseEntity.ok(detalleDeVenta);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping
	public ResponseEntity<DetalleDeVenta> createDetalleDeVenta(@RequestBody DetalleDeVenta detalleDeVenta){
		try {
			DetalleDeVenta detalleDeVentaCreado = detalleDeVentaService.saveDetalleDeVenta(detalleDeVenta);
			return ResponseEntity.status(HttpStatus.CREATED).body(detalleDeVentaCreado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<DetalleDeVenta> updateDetalleDeVentaById(@PathVariable Long id, DetalleDeVenta detalleDeVenta){
		try {
			DetalleDeVenta detalleDeVentaModificado = detalleDeVentaService.upDetalleDeVentaById(id, detalleDeVenta);
			return ResponseEntity.ok(detalleDeVentaModificado);
		}catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDetalleDeVentaById(@PathVariable Long id){
		try {
			detalleDeVentaService.deleteDetalleDeVentaById(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();		
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
