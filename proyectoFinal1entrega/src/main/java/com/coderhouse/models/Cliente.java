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
import jakarta.persistence.Table;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(unique = true, nullable = false)
	private int dni;
	
	@Column(name = "Telefono")
	private String telefono;
	
	@Column(name = "Direccion")
	private String direccion;
	
	@Column(name = "Ciudad")
	private String ciudad;
	
	@Column(name = "Saldo")
	private double saldo;
	
	@ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
	private List<Producto> productos = new ArrayList<>();
	
	private LocalDateTime createdAt;

	
	//Constructor sobrecargado
	public Cliente(String nombre, String apellido, int dni, String telefono, String direccion, String ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.createdAt = LocalDateTime.now();
	}
	
	
	
	//Encapsulamiento
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public List<Producto> getProducto() {
		return productos;
	}

	public void setProducto(List<Producto> producto) {
		this.productos = producto;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	//To string
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono="
				+ telefono + ", direccion=" + direccion + ", ciudad=" + ciudad + ", saldo=" + saldo + ", productos="
				+ productos + ", createdAt=" + createdAt + "]";
	}

	//Constructor vacio
	public Cliente() {
		super();
		
	}
	
	
	
	
}
