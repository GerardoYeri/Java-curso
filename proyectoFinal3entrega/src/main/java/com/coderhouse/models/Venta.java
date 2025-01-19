package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Ventas")
@Data
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	@Column(name = "Cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "Precio Unitario", nullable = false)
	private double precioUnitario;
	
	@Column(name = "Precio Total", nullable = false)
	private double precioTotal;
	
	@ManyToOne
	@JoinColumn(name = "detalleDeVenta_id")
	private DetalleDeVenta detalleDeVenta;
	
	
	
	
	
	
	
	
}
