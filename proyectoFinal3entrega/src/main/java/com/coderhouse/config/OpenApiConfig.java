package com.coderhouse.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {
	
	@Bean
	OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("API REST FULL | JAVA | CODERHOUSE")
						.version("7.1.1")
						.description("La API REST prorciona endpoints para la gestion de Clientes,"
								+" Productos y Ventas de un comercio."
								+" Permite operaciones CRUD(crear, leer , actualizar y eliminar) tanto de"
								+" Clientes como Productos y Ventas. La API esta documentada en SWAGGER lo"
								+" que permite una facil comprension de los endpoint y su uso")
						.contact(new Contact()
								.name("Gerardo")
								.email("geridepetris94@gmail.com"))
						.license(new License()
								.name("Licencia")
								.url("https://github.com/GerardoYeri/Java-curso"))
						)
						.servers(List.of(new Server()
								.url("http://localhost:8080")
								.description("Servidor Local")));
	}
	
}
