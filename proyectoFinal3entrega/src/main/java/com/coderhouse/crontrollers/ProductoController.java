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

import com.coderhouse.exceptions.ExceptionError;
import com.coderhouse.models.Producto;
import com.coderhouse.services.ProductoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/productos")
@Tag(name = "Gestion de Productos", description = "Endpoints para gestionar los Productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Operation(summary = "Obtener lista de Productos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Productos obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener los Productos", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping
	public ResponseEntity<List<Producto>> getAllProductos(){
		try {
			List<Producto> productos = productoService.getAllProductos();
			return ResponseEntity.ok(productos);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.notFound().build();	
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Obtener Producto por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Producto obtenido correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Producto", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping("{id}")
	public ResponseEntity<?> getProductoById(@PathVariable Long id){
		try {
			Producto producto = productoService.getProductoById(id);
			return ResponseEntity.ok(producto);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Crear un Producto")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Producto creado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
					}),
			@ApiResponse(responseCode = "400", description = "Error al crear el Producto", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PostMapping
	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto){
		try {
			Producto productoCreado = productoService.createProducto(producto);
			productoService.calcularPrecios(productoCreado);
			return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.badRequest().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Actualizar Producto por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Producto actualizado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Producto", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PutMapping("{id}")
	public ResponseEntity<?> updateProducto(@PathVariable Long id, @RequestBody Producto producto){
		try {
			Producto productosModificado = productoService.updateProductoById(id, producto);
			productoService.calcularPrecios(productosModificado);
			return ResponseEntity.ok(productosModificado);
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Eliminar Producto por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Producto eliminado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Producto.class))
					}),
			@ApiResponse(responseCode = "400", description = "Error al obtener el Producto", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteProductoById(@PathVariable Long id){
		try {
			productoService.deleteProductoById(id);
			return ResponseEntity.noContent().build();
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionError(e.getMessage()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
