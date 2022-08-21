package com.nalsuwailem.be1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class Backend1Application {

	public static void main(String[] args) {
		SpringApplication.run(Backend1Application.class, args);
	}

}
