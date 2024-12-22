package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Fecha de la Venta")
	private LocalDateTime fechaDeLaVenta;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	@Column(name = "Total")
	private double total;
	
	@OneToMany(mappedBy = "venta")
	private List<DetalleDeVenta> detalleDeVentas = new ArrayList<>();
	
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaDeLaVenta() {
		return fechaDeLaVenta;
	}

	public void setFechaDeLaVenta(LocalDateTime fechaDeLaVenta) {
		this.fechaDeLaVenta = fechaDeLaVenta;
	}

	public List<DetalleDeVenta> getDetalleDeVentas() {
		return detalleDeVentas;
	}

	public void setDetalleDeVentas(List<DetalleDeVenta> detalleDeVentas) {
		this.detalleDeVentas = detalleDeVentas;
	}

	
	
	public Venta(Long id, LocalDateTime fechaDeLaVenta, Cliente cliente, double total,
			List<DetalleDeVenta> detalleDeVentas) {
		super();
		this.id = id;
		this.fechaDeLaVenta = fechaDeLaVenta;
		this.cliente = cliente;
		this.total = total;
		this.detalleDeVentas = detalleDeVentas;
	}

	public Venta() {
		super();
		this.fechaDeLaVenta = LocalDateTime.now();
	}
	
	
	
}
