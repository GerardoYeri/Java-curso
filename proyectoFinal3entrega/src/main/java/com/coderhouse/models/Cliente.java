package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;

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
import lombok.Getter;
import lombok.Setter;

@Schema(description = "Modelo de Cliente", title = "Modelo de Cliente")
@Entity
@Table(name = "Clientes")
@Data
@Getter
@Setter
public class Cliente {
	
	@Schema(description = "ID del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "Nombre del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "Gerardo")
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Schema(description = "Apellid del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "Depetris")
	@Column(name = "Apellido", nullable = false)
	private String apellido;
	
	@Schema(description = "Edad del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "30")
	@Column(name = "Edad", nullable = false)
	private int edad;
	
	@Schema(description = "DNI del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "22333444")
	@Column(name = "DNI", nullable = false, unique = true)
	private int dni;
	
	@Schema(description = "Telefono del Cliente", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "3535877298")
	@Column(name = "Telefono")
	private Long telefono;
	
	@Schema(description = "Direccion del Cliente", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "Santa fe 142")
	@Column(name = "Direccion")
	private String direccion;
	
	@Schema(description = "Ciudad de Origen del Cliente", requiredMode = Schema.RequiredMode.NOT_REQUIRED, example = "Villa Maria")
	@Column(name = "Ciudad de origen")
	private String ciudadOrigen;
	
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Venta> ventas = new ArrayList<>();
	
	
	
}

