package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Cliente;
import com.coderhouse.repositories.ClienteRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Cliente no Encontrado"));
	}
	
	@Transactional
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente updateByIdCliente(Long id, Cliente clienteDetails) {
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Cliente no Encontrado"));
		cliente.setNombre(clienteDetails.getNombre());
		cliente.setApellido(clienteDetails.getApellido());
		cliente.setCiudad(clienteDetails.getCiudad());
		cliente.setEdad(clienteDetails.getEdad());
		
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public void deleteClienteById(Long id) {
		clienteRepository.findById(id)
		.orElseThrow(()-> new IllegalArgumentException("Cliente no encontrado"));
		clienteRepository.deleteById(id);
	}
	
	
	
}
