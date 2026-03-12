package com.xworkz.secrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main entry point for the Secrets and Environment Variables project (Folder 06)
@SpringBootApplication
public class EnvVariableSecretsApplication {

	public static void main(String[] args) {
		System.out.println("EnvVariableSecretsApplication: Starting secure context...");

		/*
		 * During this run() call, Spring Boot will:
		 * 1. Load application.yml
		 * 2. Detect placeholders like ${DB_PASSWORD:dev_pass}
		 * 3. Look into the OS environment variables to find a match
		 * 4. Inject the final resolved value into your SecretService
		 */
		SpringApplication.run(EnvVariableSecretsApplication.class, args);

		System.out.println("--------------------------------------------------");
		System.out.println("SECURITY MODULE: INITIALIZED");
		System.out.println("Application is now using externalized credentials.");
		System.out.println("--------------------------------------------------");
	}
}