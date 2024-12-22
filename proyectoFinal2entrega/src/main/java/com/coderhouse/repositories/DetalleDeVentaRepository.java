package com.coderhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.models.DetalleDeVenta;

public interface DetalleDeVentaRepository extends JpaRepository<DetalleDeVenta, Long> {

}
