package com.coderhouse.models;




import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "Modelo de Detalle de Venta", title = "Modelo de Detalle de Venta")
@Entity
@Table(name = "Detalle_de_Venta")
@Data
@Getter
@Setter
public class DetalleDeVenta {
	
	@Schema(description = "ID del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Schema(description = "Venta del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "venta_id", nullable = false)
	@JsonManagedReference
	private Venta venta;
	
	@Schema(description = "Producto del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", nullable = false)
	private Producto producto;
	
	@Schema(description = "Cantidad de Producto del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Column(name = "Cantidad", nullable = false)
	private int cantidad;
	
	@Schema(description = "Precio unitario del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "100.00")
	@Column(name = "Precio Unitario", nullable = false)
	private double precioUnitario;
	
	@Schema(description = "Sub total del Detalle De Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "150.00")
	@Column(name = "Sub Total", nullable = false)
	private double subTotal;
	
}
