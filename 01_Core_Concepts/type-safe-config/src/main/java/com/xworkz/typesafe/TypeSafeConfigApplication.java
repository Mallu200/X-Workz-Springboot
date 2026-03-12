package com.xworkz.typesafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enables auto-configuration, component scanning, and configuration properties support
@SpringBootApplication
public class TypeSafeConfigApplication {

	public static void main(String[] args) {
		// Log entry point for debugging the start of the JVM process
		System.out.println("TypeSafeConfigApplication: Bootstrapping the application...");

		// Launches the Spring application, creating the container and injecting properties
		SpringApplication.run(TypeSafeConfigApplication.class, args);

		System.out.println("----------------------------------------------");
		// Final confirmation that the bean lifecycle (including @PostConstruct) is complete
		System.out.println("Type-Safe Configuration Module: READY");
		System.out.println("----------------------------------------------");
	}

}