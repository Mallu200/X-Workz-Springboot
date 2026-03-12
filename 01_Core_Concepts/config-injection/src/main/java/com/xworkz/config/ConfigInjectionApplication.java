package com.xworkz.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main entry point for the configuration injection demonstration
@SpringBootApplication
public class ConfigInjectionApplication {

	public static void main(String[] args) {
		System.out.println("ConfigInjectionApplication: Starting the bootstrap process...");

		// Bootstraps the application and triggers the @Value injection in managed beans
		SpringApplication.run(ConfigInjectionApplication.class, args);

		System.out.println("----------------------------------------------");
		System.out.println("Configuration Module: Active and Properties Injected");
		System.out.println("----------------------------------------------");
	}

}