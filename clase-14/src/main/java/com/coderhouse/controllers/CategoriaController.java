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

import com.coderhouse.models.Categoria;
import com.coderhouse.services.CategoriaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Gestion de Categoria", description = "Endpoints para gestionar las Categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@Operation(summary = "Obtener todas las Categorias")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Categorias obtenida correctamente",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class))
			}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Lista de Categorias",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = 
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
			})
	@GetMapping
	public ResponseEntity<List<Categoria>> getAllCategorias() {
		try {
			List<Categoria> categorias = categoriaService.getAllCategorias();
			return ResponseEntity.ok(categorias);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Obtener Categoria por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Categoria",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500",description = "Error interno del Servidon",
			content = 
					@Content(mediaType = "application/json",schema = @Schema(implementation = ErrorResponse.class)))
	})
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaById(@PathVariable long id) {
		try {
			Categoria categoria = categoriaService.findById(id);
			return ResponseEntity.ok(categoria);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Crear una Categoria")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Categoria creada correctamente",
					content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor",
			content = 
			@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
	})
	@PostMapping
	public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
		try {
			Categoria createdCategoria = categoriaService.createCategoria(categoria);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdCategoria);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Modificar Categoria por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria modificada correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Categoria",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500",description = "Error interno del Servidon",
			content = 
					@Content(mediaType = "application/json",schema = @Schema(implementation = ErrorResponse.class)))
	})
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, @RequestBody Categoria categoriaDetails) {
		try {
			Categoria updatedCategoria = categoriaService.updateCategoriaById(id, categoriaDetails);
			return ResponseEntity.ok(updatedCategoria);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Eliminar Categoria por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Categoria Eliminada correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Categoria",
			content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
			}),
			@ApiResponse(responseCode = "500",description = "Error interno del Servidon",
			content = 
					@Content(mediaType = "application/json",schema = @Schema(implementation = ErrorResponse.class)))
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
		try {
			categoriaService.deleteById(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
