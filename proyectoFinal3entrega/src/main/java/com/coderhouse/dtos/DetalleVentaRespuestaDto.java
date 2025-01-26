package com.coderhouse.dtos;

import lombok.Data;

@Data
public class DetalleVentaRespuestaDto {
    private Long productoId;     
    private String productoNombre; 
    private int cantidad;        
    private double precioUnitario; 
    private double subTotal;     
}