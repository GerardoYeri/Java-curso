package com.coderhouse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.dtos.TimeResponseDto;

@Service
public class FechaService {
	
	@Autowired
	private RestTemplate rt;
	
	public TimeResponseDto obteneFechaActual () {
		try {
			final String URL = "https://timeapi.io/api/Time/current/zone?timeZone=America/Argentina/Buenos_Aires";
			
			return rt.getForObject(URL, TimeResponseDto.class);
			
		} catch (RestClientException e) {
			System.err.println("Error no se pudo conectar a la API externa: "+ e.getMessage() );
			return null;
		}
	}
	
	public String formatearFecha(TimeResponseDto fechaActual) {
		return String.format("Fecha Actual: %s %s %d, %d Hora: %s",
				 fechaActual.getDayOfWeek(),
				 fechaActual.getMonth(),
				 fechaActual.getDay(),
				 fechaActual.getYear(),
				 fechaActual.getTime());
	}
}
