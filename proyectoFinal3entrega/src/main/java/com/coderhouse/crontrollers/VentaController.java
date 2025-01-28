package com.coderhouse.crontrollers;

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

import com.coderhouse.dtos.VentaDto;
import com.coderhouse.dtos.VentaRespuestaDto;
import com.coderhouse.exceptions.ExceptionError;
import com.coderhouse.models.Venta;
import com.coderhouse.services.VentaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/ventas")
@Tag(name = "Gestion de Ventas", description = "Endpoints para la Gestion de Ventas")
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	
	
	@Operation(summary = "Obtener lista de Ventas")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Ventas obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Venta.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener las Ventas", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping
	public ResponseEntity<List<Venta>> getAllVentas(){
		try {
			List<Venta> ventas = ventaService.getAllVentas();
			return ResponseEntity.ok(ventas);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Obtener Venta por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Ventas obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Venta.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Venta", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping("{id}")
	public ResponseEntity<?> getVentaById(@PathVariable Long id){
		try {
			Venta venta = ventaService.getVentaById(id);
			return ResponseEntity.ok(venta);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Crear una Venta")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Venta creada correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Venta.class))
					}),
			@ApiResponse(responseCode = "400", description = "Error al crear la Venta", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PostMapping
	public ResponseEntity<VentaRespuestaDto> createVenta(@RequestBody VentaDto dto){
		try {
			VentaRespuestaDto ventaCreada = ventaService.createVenta(dto);
			return ResponseEntity.status(HttpStatus.CREATED).body(ventaCreada);
		}catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Actualizar una Venta por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Venta actualizada correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Venta.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Venta", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PutMapping("{id}")
	public ResponseEntity<?> upDateVentaById(@PathVariable Long id, @RequestBody VentaDto ventaDto){
		try {
			Venta ventaModificada = ventaService.updateVentaById(id, ventaDto);
			return ResponseEntity.ok(ventaModificada);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Eliminar una venta por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Venta Eliminada correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Venta.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener la Venta", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteVentaById(@PathVariable Long id){
		try {
			ventaService.deleteVentaById(id);
			return ResponseEntity.noContent().build();
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
