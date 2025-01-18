package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

@Data
@Schema(description = "Modelo de asignacion de categoria DTO", title = "Asignaciones DTO")
public class AsignacionCategoriaCursoDto {
	
	@Schema(description = "Curso ID", requiredMode = RequiredMode.REQUIRED, example = "1")
	private Long cursoId;
	
	@Schema(description = "Categoria ID", requiredMode = RequiredMode.REQUIRED, example = "1")
	private Long categoriaId;
}
