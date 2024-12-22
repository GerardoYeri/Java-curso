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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "Productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Column(name = "Stock")
	private int stock;
	
	@Column(name = "Costo con IVA")
	private double costoConIva;
	
	@Column(name = "Costo sin IVA")
	private double costoSinIva;
	
	@Column(name = "Porcentaje de ganancia")
	private double porcentajeGanancia;
	
	@Column(name = "Precio de venta SIN IVA")
	private double precioDeVentaSinIva;
	
	@Column(name = "Precio de venta CON IVA")
	private double precioDeVentaConIva;
	
	@Column(name = "Fecha de Creacion")
	private LocalDateTime fechaDeCreacion;
	
	@ManyToMany(mappedBy = "productos", fetch = FetchType.EAGER)
	private List<Cliente> clientes = new ArrayList<>();
	
	@OneToMany(mappedBy = "producto")
	private List<DetalleDeVenta> detalleDeVentas = new ArrayList<>();

	
	public List<DetalleDeVenta> getDetalleDeVentas() {
		return detalleDeVentas;
	}

	public void setDetalleDeVentas(List<DetalleDeVenta> detalleDeVentas) {
		this.detalleDeVentas = detalleDeVentas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getCostoConIva() {
		return costoConIva;
	}

	public void setCostoConIva(double costoConIva) {
		this.costoConIva = costoConIva;
	}

	public double getCostoSinIva() {
		return costoSinIva;
	}

	public void setCostoSinIva(double costoSinIVa) {
		this.costoSinIva = costoSinIVa;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public double getPrecioDeVentaSinIva() {
		return precioDeVentaSinIva;
	}

	public void setPrecioDeVentaSinIva(double precioDeVentaSinIva) {
		this.precioDeVentaSinIva = precioDeVentaSinIva;
	}

	public double getPrecioDeVentaConIva() {
		return precioDeVentaConIva;
	}

	public void setPrecioDeVentaConIva(double precioDeVentaConIva) {
		this.precioDeVentaConIva = precioDeVentaConIva;
	}

	public LocalDateTime getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Producto(long id, String nombre, int stock, double costoConIva, double costoSinIva,
			double porcentajeGanancia, double precioDeVentaSinIva, double precioDeVentaConIva,
			LocalDateTime fechaDeCreacion, List<Cliente> clientes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
		this.costoConIva = costoConIva;
		this.costoSinIva = costoSinIva;
		this.porcentajeGanancia = porcentajeGanancia;
		this.precioDeVentaSinIva = precioDeVentaSinIva;
		this.precioDeVentaConIva = precioDeVentaConIva;
		this.fechaDeCreacion = fechaDeCreacion;
		this.clientes = clientes;
	}

	public Producto() {
		super();
		this.fechaDeCreacion = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", stock=" + stock + ", costoConIva=" + costoConIva
				+ ", costoSinIva=" + costoSinIva + ", porcentajeGanancia=" + porcentajeGanancia
				+ ", precioDeVentaSinIva=" + precioDeVentaSinIva + ", precioDeVentaConIva=" + precioDeVentaConIva
				+ ", fechaDeCreacion=" + fechaDeCreacion + ", clientes=" + clientes + "]";
	}
	
	
	
}
