package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.coderhouse.exception.ExcepcionesProyecto.GananciaNoMayorACero;
import com.coderhouse.exception.ExcepcionesProyecto.PrecioSinIvaNoCalculado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
				name = "producto_cliente",
				joinColumns = @JoinColumn (name="producto_id"),
				inverseJoinColumns = @JoinColumn (name = "cliente_id")
			)
	private List<Cliente> clientes = new ArrayList<>();
	
	private LocalDateTime createdAt;
	
	@Column(name = "Precio SIN IVA")
	private double precioSinIva;
	
	//Constante IVA
	private static final double IVA = 21.0 / 100;
	
	@Column(name = "Precio CON IVA")
	private double precioConIva;
	
	@Column(name = "Stock")
	private int stock ;
	
	
	//Constructor vacio
	public Producto() {
		super();
	}
	
	//Constructor sobrecargado
	public Producto(String nombre) {
		super();
		this.nombre = nombre;
		this.createdAt = LocalDateTime.now();
	}

	
	//Encapsulamiento
	public double getPrecioConIva() {
		return precioConIva;
	}

	public void setPrecioConIva(double precioConIva) {
		this.precioConIva = precioConIva;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}
	
	public void setPrecioSinIva(double precio) {
		this.precioSinIva = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
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

	public List<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(List<Cliente> cliente) {
		this.clientes = cliente;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	
	//To String
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", createdAt=" + createdAt
				+ ", precioSinIva=" + precioSinIva + ", precioConIva=" + precioConIva + ", stock=" + stock + "]";
	}
	
	
	//Metodos
	
	public double calcularPrecioSinIva(double costo, double ganancia) throws GananciaNoMayorACero {
		if (ganancia <= 0 ) {
			throw new GananciaNoMayorACero();
		}else {						
			double precioConGanancia = costo *(1+ ganancia /100); 
			double precioConGananciaRedondeado = Math.round(precioConGanancia*100.0)/100.0;
			setPrecioSinIva(precioConGananciaRedondeado);
			return precioConGananciaRedondeado;
		}
	}
	
	
	
	public double calcularPrecioConIva() throws PrecioSinIvaNoCalculado {
			if(precioSinIva == 0) {
				throw new PrecioSinIvaNoCalculado();
			}
		double precioConIva = precioSinIva * (1 + IVA);
		double precioConIvaRedondeado = Math.round(precioConIva*100.0)/100;
		setPrecioConIva(precioConIvaRedondeado);
		return precioConIvaRedondeado;
	}

	
	public void prosesarProducto(Producto producto, double costo, double ganancia) {
		try {
			calcularPrecioSinIva(costo, ganancia);
			calcularPrecioConIva();
		} catch (GananciaNoMayorACero error) {
			System.err.println("En el producto "+ getNombre() + error.getMessage());
		}catch (PrecioSinIvaNoCalculado error) {
			System.err.println("En el producto "+ getNombre() + error.getMessage());
		}
	}

	
	
}
