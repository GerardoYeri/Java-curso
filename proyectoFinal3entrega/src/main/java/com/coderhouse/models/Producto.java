package com.coderhouse.models;

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

@Schema(description = "Modelo de Producto", title = "Modelo de Producto")
@Entity
@Table(name = "Productos")
@Data
public class Producto {
	
	@Schema(description = "ID del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "Nombre del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "Auricular")
	@Column(name = "Nombre", nullable = false)
	private String nombre;
	
	@Schema(description = "Costo con IVA del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "200.00")
	@Column(name = "Costo con IVA",nullable = false)
	private double costoConIva;
	
	@Schema(description = "Costo Sin IVA del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "165.29")
	@Column(name = "Costo Sin IVA")
	private double costoSinIva;
	
	@Schema(description = "Porcentaje de ganancia del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "10")
	@Column(name = "Porcentaje de ganancia")
	private double porcentajeGanancia;
	
	@Schema(description = "Precio de Venta sin IVA del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "181.82")
	@Column(name = "Precio de venta sin IVA")
	private double precioDeVentaSinIva;
	
	@Schema(description = "Precio de venta con IVA del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "220.00")
	@Column(name = "Precio de Venta con IVA")
	private double precioDeVentaConIva;
	
	@Schema(description = "Stock del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "10")
	@Column(name = "Stock", nullable = false)
	private int stock;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<DetalleDeVenta> detalles;
	
	
}
