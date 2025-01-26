package com.coderhouse.dtos;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDto {
	
	private Long clienteId;
	
	private List<DetalleDeVentaDto> detalles;
}

