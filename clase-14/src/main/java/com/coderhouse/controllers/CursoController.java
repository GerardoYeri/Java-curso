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

import com.coderhouse.dtos.AsignacionCategoriaCursoDto;
import com.coderhouse.models.Curso;
import com.coderhouse.services.CursoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/cursos")
@Tag(name = "Gestion de Curso", description = "Endpoints para gestionar Cursos")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@Operation(summary = "Obtener lista de cursos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de cursos obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema (implementation = Curso.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al intentar al obtener la lista de cursos", 
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor",
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	@GetMapping
	public ResponseEntity<List<Curso>> getAllcursos(){
		try {
			List<Curso> cursos = cursoService.getAllCursos();
			return ResponseEntity.ok(cursos);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}
	
	@Operation(summary = "Obtener un Curso por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso obtenido correctamente", 
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al intentar obtener el curso", 
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@GetMapping("/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable Long id){
		try {
			Curso curso = cursoService.findById(id);
			return ResponseEntity.ok(curso); 
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Crear un curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Curso creado correctamente", 
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class))
					}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	@PostMapping
	public ResponseEntity<Curso> createCurso(@RequestBody Curso curso){
		try {
			Curso cursoCreado = cursoService.saveCurso(curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(cursoCreado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Modificar un Curso por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso modificado Correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Curso", 
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	@PutMapping("/{id}")
	public ResponseEntity<Curso> updateCursoById(@PathVariable Long id, @RequestBody Curso cursoDetails){
		try {
			Curso cursoModificado = cursoService.updateCursoById(id, cursoDetails);
			return ResponseEntity.ok(cursoModificado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Borrar un Curso por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Curso borrado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Curso", 
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor",
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCursoById(@PathVariable Long id){
		try {
			cursoService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Asignar una Categoria a un Curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria asignada correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Curso o Categoria", 
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", content 
			= @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class)))
	})
	@PostMapping("/asignar-categoria")
	public ResponseEntity<Curso> asignarCategoriaCurso(@RequestBody AsignacionCategoriaCursoDto dto){
		try {
			Curso cursoActualizado = cursoService.asignarCursoCategoria(
					dto.getCursoId(), 
					dto.getCategoriaId()
					);
			return ResponseEntity.ok(cursoActualizado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
}
