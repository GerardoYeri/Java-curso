package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Detalle_de_Ventas")
@Data
public class DetalleDeVenta {
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Total", nullable = false)
	private double total;
	
	@OneToMany(mappedBy = "detalleDeVenta", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Venta> ventas = new ArrayList<>();
}
