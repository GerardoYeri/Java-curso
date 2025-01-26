package com.coderhouse.models;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Detalle_de_Venta")
@Data
public class DetalleDeVenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "venta_id", nullable = false)
	@JsonBackReference
	private Venta venta;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_id", nullable = false)
	private Producto producto;
	
	@Column(name = "Cantidad", nullable = false)
	private int cantidad;
	
	@Column(name = "Precio Unitario", nullable = false)
	private double precioUnitario;
	
	@Column(name = "Sub Total", nullable = false)
	private double subTotal;
	
}
