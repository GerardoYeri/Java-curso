package com.coderhouse.dtos;

import lombok.Data;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Modelo de respuesta para la creacion de un Venta", title = "DTO Venta Respuesta")
@Data
public class VentaRespuestaDto {

	@Schema(description = "Id de la Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Long id;                                   
	@Schema(description = "Cliente de la Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "{\r\n"
			+ "        \"id\": 1,\r\n"
			+ "        \"nombre\": \"Jeremias\"\r\n"
			+ "    }")
    private ClienteRespuestaDto cliente;
	@Schema(description = "detalles de la Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "[\r\n"
			+ "        {\r\n"
			+ "            \"productoId\": 1,\r\n"
			+ "            \"productoNombre\": \"Auricular\",\r\n"
			+ "            \"cantidad\": 5,\r\n"
			+ "            \"precioUnitario\": 360.00000000000006,\r\n"
			+ "            \"subTotal\": 1800.0000000000002\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"productoId\": 2,\r\n"
			+ "            \"productoNombre\": \"1fe\",\r\n"
			+ "            \"cantidad\": 1,\r\n"
			+ "            \"precioUnitario\": 110.00000000000001,\r\n"
			+ "            \"subTotal\": 110.00000000000001\r\n"
			+ "        }\r\n"
			+ "    ]")
    private List<DetalleVentaRespuestaDto> detalles;  
	@Schema(description = "Precio total de la Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "1000.0")
    private double precioTotal;
	@Schema(description = "Fecha de la Venta", requiredMode = Schema.RequiredMode.REQUIRED, example = "\"Fecha Actual: Sunday 1 26, 2025 Hora: 17:10\"")
    private String fecha;
}