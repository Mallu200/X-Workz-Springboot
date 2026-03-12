package com.xworkz.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main entry point for the Relaxed Binding and Validation project (Folder 05)
@SpringBootApplication
public class RelaxedBindingValidationApplication {

	public static void main(String[] args) {
		System.out.println("RelaxedBindingValidationApplication: Initializing validation engine...");

		/* * NOTE: For @Validated to work, ensure you have this in your pom.xml:
		 * <dependency>
		 * <groupId>org.springframework.boot</groupId>
		 * <artifactId>spring-boot-starter-validation</artifactId>
		 * </dependency>
		 */

		SpringApplication.run(RelaxedBindingValidationApplication.class, args);

		System.out.println("--------------------------------------------------");
		System.out.println("VALIDATION SERVICE: ONLINE");
		System.out.println("All YAML properties passed the safety checks.");
		System.out.println("--------------------------------------------------");
	}

}