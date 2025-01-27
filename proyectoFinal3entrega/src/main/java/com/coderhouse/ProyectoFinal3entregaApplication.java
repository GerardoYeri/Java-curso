package com.coderhouse;																									

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProyectoFinal3entregaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinal3entregaApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
