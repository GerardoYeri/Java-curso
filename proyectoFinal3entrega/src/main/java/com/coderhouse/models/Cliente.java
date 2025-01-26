package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Clientes")
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Column(name = "Apellido", nullable = false)
	private String apellido;
	
	@Column(name = "Edad", nullable = false)
	private int edad;
	
	@Column(name = "DNI", nullable = false, unique = true)
	private int dni;
	
	@Column(name = "Telefono")
	private Long telefono;
	
	@Column(name = "Direccion")
	private String direccion;
	
	@Column(name = "Ciudad de origen")
	private String ciudadOrigen;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Venta> ventas = new ArrayList<>();
	
	
	
}

