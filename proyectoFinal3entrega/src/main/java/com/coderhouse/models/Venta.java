package com.coderhouse.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
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
import lombok.Data;

@Schema(description = "Modelo de Venta", title = "Modelo de Venta")
@Entity
@Table(name = "Ventas")
@Data
public class Venta {
	
	@Schema(description = "ID de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "id del Cliente en Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonBackReference
    private List<DetalleDeVenta> detallesDeVenta;
	
	@Schema(description = "Precio total de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1000.00")
	@Column(name = "Precio_Total", nullable = false)
	private double precioTotal;
	
	@Schema(description = "Fecha de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "Fecha Actual: Sunday 1 26, 2025 Hora: 14:50")
	private String fecha;
}
