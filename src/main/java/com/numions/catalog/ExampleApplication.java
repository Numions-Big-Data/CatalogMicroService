package com.numions.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication //
@EnableDiscoveryClient
// Crear el cliente de eureka

public class ExampleApplication {


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args); /*Ejecutar aplicacion de forma aislada*/
	}
}
