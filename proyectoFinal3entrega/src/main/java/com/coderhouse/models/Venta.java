package com.coderhouse.models;





import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

@Entity
@Table(name = "Ventas")
@Data
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<DetalleDeVenta> detallesDeVenta;
	
	@Column(name = "Precio_Total", nullable = false)
	private double precioTotal;
	
}
