package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@SpringBootApplication
public class CarScanHomeAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarScanHomeAssignmentApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("CarScan take home assignment by Anmol Chhabra")
						.description("Vehicle inspection technology in the palm of your hand. A mobile app that's the first of its kind in the motor industry, Carscan uses computer vision and machine learning to scan vehicle damages and provide real time vehicle health condition and repair estimates.")
						.version("v0.0.1"));
	}
}
