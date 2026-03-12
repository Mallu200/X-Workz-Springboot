package com.xworkz.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks the main class to enable auto-configuration and component scanning in the profile package
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Initiating Spring Boot context for Profile Application...");

		// Launches the application, initializing the internal web server and bean container
		SpringApplication.run(Application.class, args);

		System.out.println("----------------------------------------------");
		System.out.println("Profile Module Status: RUNNING");
		System.out.println("----------------------------------------------");
	}

}