package com.xworkz.feature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enables Auto-Configuration and triggers the Component Scan for services and controllers
@SpringBootApplication
public class FeatureToggleSystemApplication {

	public static void main(String[] args) {
		System.out.println("FeatureToggleSystemApplication: Initializing Spring Context...");

		/* * During this run process, Spring will check application.properties
		 * to decide whether to create the RewardsService bean or skip it.
		 */
		SpringApplication.run(FeatureToggleSystemApplication.class, args);

		System.out.println("----------------------------------------------");
		System.out.println("Feature Toggle System: Startup Complete");
		System.out.println("----------------------------------------------");
	}

}