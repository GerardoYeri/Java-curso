package com.coderhouse.services;




import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.dtos.ClienteRespuestaDto;
import com.coderhouse.dtos.DetalleDeVentaDto;
import com.coderhouse.dtos.DetalleVentaRespuestaDto;
import com.coderhouse.dtos.TimeResponseDto;
import com.coderhouse.dtos.VentaDto;
import com.coderhouse.dtos.VentaRespuestaDto;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.DetalleDeVenta;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;
import com.coderhouse.repositories.ClienteRepository;

import com.coderhouse.repositories.ProductoRepository;
import com.coderhouse.repositories.VentaRepository;


import jakarta.transaction.Transactional;

@Service
public class VentaService {
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	
	@Autowired
	private FechaService fechaService;
	
	public List<Venta> getAllVentas(){
		return ventaRepository.findAll();
	}
	
	public Venta getVentaById(Long id) {
		return ventaRepository.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Venta no Encontrada"));
	}
	
	@Transactional
	public VentaRespuestaDto createVenta(VentaDto dto) {
		Cliente cliente = clienteRepository.findById(dto.getClienteId())
				.orElseThrow(()-> new IllegalArgumentException("Cliente no encontrado"));
		
		Venta venta = new Venta();
		venta.setCliente(cliente);
		
		List<DetalleDeVenta> detallesVentas = new ArrayList<>();
		List<DetalleVentaRespuestaDto> detallesRespuesta = new ArrayList<>();
		double precioTotalVenta = 0;
		
		for(DetalleDeVentaDto detalleDto : dto.getDetalles()) {
			Producto producto = productoRepository.findById(detalleDto.getProductoId())
					.orElseThrow(()-> new IllegalArgumentException("Producto no encontrado"));
			
			calcularStockProducto(producto,detalleDto.getCantidad());
			double precioUnitario = producto.getPrecioDeVentaConIva();
			double subTotalProducto = precioUnitario * detalleDto.getCantidad();
			
			DetalleDeVenta detalleDeVenta = crearDetalleDeVenta(venta, producto, detalleDto, precioUnitario, subTotalProducto);
			detallesVentas.add(detalleDeVenta);
			DetalleVentaRespuestaDto detalleVentaRespuestaDto = creaDetalleVentaRespuestaDto(producto, detalleDto, precioUnitario, subTotalProducto);
			detallesRespuesta.add(detalleVentaRespuestaDto);
			
			precioTotalVenta += subTotalProducto;
		}
		venta.setDetallesDeVenta(detallesVentas);
		venta.setPrecioTotal(precioTotalVenta);
		
		TimeResponseDto fechaActual = fechaService.obteneFechaActual();
		 
		venta.setFecha(fechaService.formatearFecha(fechaActual));
		Venta ventaGuardad = ventaRepository.save(venta);
		
		VentaRespuestaDto ventaRespuesta = crearVentaRespuestaDto(ventaGuardad, cliente, detallesRespuesta, precioTotalVenta);
		
		
		
		return ventaRespuesta;
	}
	
	
	private Producto calcularStockProducto(Producto producto, int cantidad) {
		if(producto.getStock()< cantidad) {
			throw new IllegalArgumentException("Stock insuficiente");
		}
		producto.setStock(producto.getStock()-cantidad);
		return productoRepository.save(producto);
	}
	
	private DetalleDeVenta crearDetalleDeVenta(
			Venta venta, Producto producto, DetalleDeVentaDto detalleDeVentaDto
			, double precioUnitario, double subTotalProducto) {
		
		DetalleDeVenta detalleDeVenta = new DetalleDeVenta();
		detalleDeVenta.setProducto(producto);
		detalleDeVenta.setCantidad(detalleDeVentaDto.getCantidad());
		detalleDeVenta.setPrecioUnitario(precioUnitario);
		detalleDeVenta.setSubTotal(subTotalProducto);
		detalleDeVenta.setVenta(venta);
		return detalleDeVenta;
	}
	
	private DetalleVentaRespuestaDto creaDetalleVentaRespuestaDto(
			Producto producto, DetalleDeVentaDto detalleDeVentaDto, double precioUnitario, double precioSubTotal) {
		
		DetalleVentaRespuestaDto detalleVentaRespuestaDto = new DetalleVentaRespuestaDto();
		detalleVentaRespuestaDto.setProductoId(producto.getId());;
		detalleVentaRespuestaDto.setProductoNombre(producto.getNombre());
		detalleVentaRespuestaDto.setCantidad(detalleDeVentaDto.getCantidad());
		detalleVentaRespuestaDto.setPrecioUnitario(precioUnitario);
		detalleVentaRespuestaDto.setSubTotal(precioSubTotal);
		
		return detalleVentaRespuestaDto;
	}
	
	private VentaRespuestaDto crearVentaRespuestaDto(
			Venta venta , Cliente cliente, List<DetalleVentaRespuestaDto> detallesVentaRespuestaDtos, double precioTotal) {
		
		VentaRespuestaDto ventaRespuestaDto = new VentaRespuestaDto();
		ventaRespuestaDto.setId(venta.getId());
		
		ClienteRespuestaDto clienteRespuestaDto = new ClienteRespuestaDto();
		clienteRespuestaDto.setId(cliente.getId());
		clienteRespuestaDto.setNombre(cliente.getNombre());
		
		ventaRespuestaDto.setCliente(clienteRespuestaDto);
		ventaRespuestaDto.setDetalles(detallesVentaRespuestaDtos);
		ventaRespuestaDto.setPrecioTotal(precioTotal);
		
		TimeResponseDto fechaActual = fechaService.obteneFechaActual();
		
		ventaRespuestaDto.setFecha(fechaService.formatearFecha(fechaActual));
		
		return ventaRespuestaDto;
	}
	
	@Transactional
	public Venta updateVentaById(Long id, VentaDto ventaDetails) {
	    Venta ventaModificada = ventaRepository.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Venta no encontrada"));

	  
	    if (ventaDetails.getClienteId() != null) {
	        Cliente cliente = clienteRepository.findById(ventaDetails.getClienteId())
	                .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
	        ventaModificada.setCliente(cliente);
	    }

	    
	    ventaModificada.getDetallesDeVenta().clear();  

	    
	    double precioTotalVenta = 0;
	    for (DetalleDeVentaDto detalleDto : ventaDetails.getDetalles()) {
	        Producto producto = productoRepository.findById(detalleDto.getProductoId())
	                .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));

	        DetalleDeVenta detalleDeVenta = new DetalleDeVenta();
	        detalleDeVenta.setProducto(producto);
	        detalleDeVenta.setCantidad(detalleDto.getCantidad());
	        detalleDeVenta.setPrecioUnitario(producto.getPrecioDeVentaConIva());
	        detalleDeVenta.setSubTotal(detalleDeVenta.getPrecioUnitario() * detalleDto.getCantidad());

	        detalleDeVenta.setVenta(ventaModificada);
	        ventaModificada.getDetallesDeVenta().add(detalleDeVenta);
	        precioTotalVenta += detalleDeVenta.getSubTotal();
	    }

	   
	    ventaModificada.setPrecioTotal(precioTotalVenta);

	    return ventaRepository.save(ventaModificada);
	}
	
	@Transactional
	public void deleteVentaById(Long id) {
	    try {
	       
	        Venta venta = ventaRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Venta no encontrada"));

	      
	        Hibernate.initialize(venta.getDetallesDeVenta());

	       
	        for (DetalleDeVenta detalle : venta.getDetallesDeVenta()) {
	            Producto producto = detalle.getProducto();
	            producto.setStock(producto.getStock() + detalle.getCantidad());
	            productoRepository.save(producto);
	        }

	       
	        
	        ventaRepository.delete(venta);
	    } catch (Exception e) {
	        throw new RuntimeException("Error al eliminar la venta: " + e.getMessage(), e);
	    }
	}
}
