package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "DTO de detalle de venta para Crear una Venta", title = "DTO Detalle de Venta")
@Getter
@Setter
public class DetalleDeVentaDto {
	
	@Schema(description = "Id del Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long productoId;
	@Schema(description = "Cantidad de Producto", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
	private int cantidad;
}
