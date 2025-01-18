package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.InscripcionDto;
import com.coderhouse.models.Alumno;
import com.coderhouse.services.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/alumnos")
@Tag(name = "Gestion de Alumno", description = "Endpoints para gestionar Alumnos")
public class AlumnoContoller {

	@Autowired
	private AlumnoService alumnoService;
	
	@Operation(summary = "Obtener todos Lista de Alumnos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Alumnos obtenida correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Lista de Alumnos",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@GetMapping
	public ResponseEntity<List<Alumno>> getAllAlumnos(){
		try {
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Obtener un Alumno por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno obtenido correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Alumno",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();						
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	
	}
	
	@Operation(summary = "Crear un Alumno")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Alumno creado correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@PostMapping
	public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno){
		try {
			Alumno alumnoCreado = alumnoService.saveAlumno(alumno);
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoCreado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Modificar un Alumno por us ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno modificado correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Alumno",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@PutMapping("/{id}")
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id,@RequestBody Alumno alumnoModificado){
		try {
			Alumno updateAlumno = alumnoService.updateAlumnoById(id, alumnoModificado) ;
			return ResponseEntity.ok(updateAlumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "ELiminar un Alumno por us ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno eliminado correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Alumno",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAlumnoById(@PathVariable Long id){
		try {
			alumnoService.deleteAlumno(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Inscribir un Alumno a  Curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno inscripro a curso correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Alumno",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@PostMapping("/inscripcion")
	public ResponseEntity<Alumno> inscripcionAlumnoAcurso(@RequestBody InscripcionDto dto){
		try {
			Alumno alumno = alumnoService.inscribirAlumnoACurso(dto);
			return ResponseEntity.ok(alumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}	
	

