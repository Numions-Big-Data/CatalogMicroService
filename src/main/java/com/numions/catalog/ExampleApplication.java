package com.numions.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication //
@EnableDiscoveryClient
<<<<<<< HEAD
=======
// Crear el cliente de eureka
>>>>>>> 63af1ff76ba8dc1bed265a84208bc04eb92829c3

public class ExampleApplication {


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args); /*Ejecutar aplicacion de forma aislada*/
	}
}
