package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Schema(description = "DTO de respuesta para Detalle de venta al crear una Venta", title = "DTO Detalle de Venta")
@Data
public class DetalleVentaRespuestaDto {
	
	@Schema(description = "Id del Producto del Detalle de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Long productoId; 
	
	@Schema(description = "Nombre del Producto del Detalle de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "Auricular")
    private String productoNombre;
	
	@Schema(description = "Cantidad del Producto del Detalle de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "3")
    private int cantidad;     
	
	@Schema(description = "Precio Unitario del Producto del Detalle de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "100.00")
    private double precioUnitario;
	
	@Schema(description = "Sub Total del Producto del Detalle de Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "300")
    private double subTotal;     
}