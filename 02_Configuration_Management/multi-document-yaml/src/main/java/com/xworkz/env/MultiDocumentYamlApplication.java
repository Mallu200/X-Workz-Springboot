package com.xworkz.env;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Standard Spring Boot entry point for the Multi-Document YAML project
@SpringBootApplication
public class MultiDocumentYamlApplication {

	public static void main(String[] args) {
		System.out.println("MultiDocumentYamlApplication: Initializing environment-specific context...");

		/* * Spring will now scan your application.yml, check the 'active' profile,
		 * and only load the properties associated with that specific document block.
		 */
		SpringApplication.run(MultiDocumentYamlApplication.class, args);

		System.out.println("--------------------------------------------------");
		System.out.println("ENVIRONMENT SWITCHER: ACTIVE AND READY");
		System.out.println("Check /db-status to see which profile is loaded.");
		System.out.println("--------------------------------------------------");
	}

}