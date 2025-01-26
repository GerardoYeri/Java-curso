package com.coderhouse.dtos;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "DTO de Respuesta de Cliente al crear una Venta", title = "DTO Cliente resuesta")
@Getter
@Setter
public class ClienteRespuestaDto {
	
	@Schema(description = "Id del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long id;
	@Schema(description = "Nombre del Cliente", requiredMode = Schema.RequiredMode.REQUIRED, example = "Gerardo")
	private String nombre;
}
