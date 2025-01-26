package com.coderhouse.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "Modelo de Venta para creacion de Venta", title = "DTO Venta")
@Getter
@Setter
public class VentaDto {
	
	@Schema(description = "Id del cliente para la Venta", requiredMode = Schema.RequiredMode.REQUIRED,example = "1")
	private Long clienteId;
	
	@Schema(description = "Detalles de Venta para la Venta", requiredMode = Schema.RequiredMode.REQUIRED,example = " [\r\n"
			+ "    {\r\n"
			+ "      \"productoId\": 1,\r\n"
			+ "      \"cantidad\": 5\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"productoId\": 2,\r\n"
			+ "      \"cantidad\": 1\r\n"
			+ "    }\r\n"
			+ "  ]")
	private List<DetalleDeVentaDto> detalles;
}

