package com.coderhouse.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Column(name = "Costo con IVA")
	private double costoConIva;
	
	@Column(name = "Costo Sin IVA")
	private double costoSinIva;
	
	@Column(name = "Porcentaje de ganancia")
	private int porcentajeGanancia;
	
	@Column(name = "Precio de venta sin IVA")
	private double precioDeVentaSinIva;
	
	@Column(name = "Precio de Venta con IVA")
	private double precioDeVentaConIva;
	
	
	@Column(name = "Stock", nullable = false)
	private int stock;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
	private List<Venta> ventas;
	
	
}
