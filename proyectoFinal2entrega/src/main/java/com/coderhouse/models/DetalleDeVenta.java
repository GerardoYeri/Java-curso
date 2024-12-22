package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Detalle_de_ventas")
public class DetalleDeVenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Cantidad")
	private int cantidad;
	
	@Column(name = "Precio De Venta Unitario")
	private double precioDeVentaUnitario;
	
	@Column(name = "Precio de venta TOTAL")
	private double precioDeVentaTotal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "venta_id")
	private Venta venta;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_id")
	private Producto producto;

	
	
	
	public double getPrecioDeVentaUnitario() {
		return precioDeVentaUnitario;
	}

	public void setPrecioDeVentaUnitario(double precioDeVentaUnitario) {
		this.precioDeVentaUnitario = precioDeVentaUnitario;
	}

	public double getPrecioDeVentaTotal() {
		return precioDeVentaTotal;
	}

	public void setPrecioDeVentaTotal(double precioDeVentaTotal) {
		this.precioDeVentaTotal = precioDeVentaTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
	
	public DetalleDeVenta(Long id, int cantidad, double precioDeVentaUnitario, double precioDeVentaTotal, Venta venta,
			Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precioDeVentaUnitario = precioDeVentaUnitario;
		this.precioDeVentaTotal = precioDeVentaTotal;
		this.venta = venta;
		this.producto = producto;
	}

	public DetalleDeVenta() {
		super();
	}
	
	
	
	
}
