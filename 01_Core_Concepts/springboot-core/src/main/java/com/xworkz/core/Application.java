package com.xworkz.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enables auto-configuration, component scanning, and extra configuration for the class
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Execution started: Launching Spring Boot Application...");

		// Boots the application and starts the embedded web server (e.g., Tomcat)
		SpringApplication.run(Application.class, args);

		System.out.println("Application Context loaded successfully: Server is running.");
	}

}