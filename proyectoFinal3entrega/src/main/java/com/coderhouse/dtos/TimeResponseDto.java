package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Modelo para la Fecha de Creacion", title = "DTO Fecha")
@Data
public class TimeResponseDto {
	
	@Schema(description = "Año de Creacion", requiredMode = Schema.RequiredMode.REQUIRED, example = "2024")
	private int year;
	@Schema(description = "Mes de Creacion", requiredMode = Schema.RequiredMode.REQUIRED, example = "4")
	private int month;
	@Schema(description = "Dia de Creacion", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private int day;
	@Schema(description = "Hora de Creacion", requiredMode = Schema.RequiredMode.REQUIRED, example = "2024")
	private String time;
	@Schema(description = "Dia de la Semana de Creacion", requiredMode = Schema.RequiredMode.REQUIRED, example = "Monday")
	private String dayOfWeek;
	
	
}
