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

import com.coderhouse.models.Cliente;
import com.coderhouse.services.ClienteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/clientes")
@Tag(name = "Gestion de Clientes", description = "Endpoints para gestionar Clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@Operation(summary = "Obtener lista de Clientes")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Clientes obtenida correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener los Clientes", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping
	public ResponseEntity<List<Cliente>> getAllClientes(){
		try {
			List<Cliente> clientes = clienteService.getAllClientes();
			return ResponseEntity.ok(clientes);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();	
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Obtener Cliente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Clientes obtenido correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Cliente", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteByID(@PathVariable Long id){
		try {
			Cliente cliente = clienteService.getClienteById(id);
			return ResponseEntity.ok(cliente);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Crear un Cliente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Cliente creado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class))
					}),
			@ApiResponse(responseCode = "400", description = "Error al crear el Cliente", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del Servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
		try {
			Cliente clienteCreado = clienteService.createCliente(cliente);
			return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@Operation(summary = "Actualizar un Cliente por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Clientes Actualizado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Cliente", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@PutMapping("{id}")
	public ResponseEntity<Cliente> updateClienteById(@PathVariable Long id, @RequestBody Cliente clienteDetails){
		try {
			Cliente clienteModificado = clienteService.updateClienteById(id, clienteDetails);
			return ResponseEntity.ok(clienteModificado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	@Operation(summary = "Eliminar un Cliente por su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Cliente Eliminado correctamente",
					content = {
							@Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class))
					}),
			@ApiResponse(responseCode = "404", description = "Error al obtener el Cliente", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", 
			content = @Content(mediaType = "application/json", 
			schema = @Schema(implementation = ErrorResponse.class))),
	})
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteClienteById(@PathVariable Long id){
		try {
			clienteService.deleteClienteByI(id);;
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
