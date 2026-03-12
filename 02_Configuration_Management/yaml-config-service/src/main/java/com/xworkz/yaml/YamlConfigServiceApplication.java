package com.xworkz.yaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Core annotation that enables auto-configuration and component scanning for the YAML project
@SpringBootApplication
public class YamlConfigServiceApplication {

	public static void main(String[] args) {
		System.out.println("YamlConfigServiceApplication: Starting the YAML-based configuration service...");

		// Launching the Spring Context; this will parse application.yml instead of .properties
		SpringApplication.run(YamlConfigServiceApplication.class, args);

		System.out.println("--------------------------------------------------");
		System.out.println("YAML Configuration Service: STATUS - ONLINE (Port 8081)");
		System.out.println("--------------------------------------------------");
	}

}