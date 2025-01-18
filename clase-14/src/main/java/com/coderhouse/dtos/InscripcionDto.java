package com.coderhouse.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Modelo de inscripcion de Alumnos DTO", title = "Inscripciones DTO")
public class InscripcionDto {
	
	@Schema(description = "Alumno ID", requiredMode = RequiredMode.REQUIRED, example = "1")
	private Long alumnoId;
	
	@Schema(description = "Listado ID´s de cursos", requiredMode = RequiredMode.REQUIRED, example = "['1','2','3']")
	private List<Long> cursosIds;
}
