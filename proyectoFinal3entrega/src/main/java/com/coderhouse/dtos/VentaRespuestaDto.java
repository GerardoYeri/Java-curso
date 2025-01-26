package com.coderhouse.dtos;

import lombok.Data;
import java.util.List;

@Data
public class VentaRespuestaDto {
    private Long id;                                   
    private ClienteRespuestaDto cliente;              
    private List<DetalleVentaRespuestaDto> detalles;  
    private double precioTotal;                       
}