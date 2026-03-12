package com.xworkz.collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Standard entry point for the Collections and Maps project (Folder 04)
@SpringBootApplication
public class YamlCollectionsApplication {

	public static void main(String[] args) {
		System.out.println("YamlCollectionsApplication: Initializing context for List and Map mapping...");

		/* * Spring Boot will now parse the YAML and perform "Relaxed Binding"
		 * to convert ip-whitelist (kebab-case) into ipWhitelist (camelCase).
		 */
		SpringApplication.run(YamlCollectionsApplication.class, args);

		System.out.println("--------------------------------------------------");
		System.out.println("COLLECTIONS SERVICE: ONLINE");
		System.out.println("Ready to process whitelists and support contacts.");
		System.out.println("--------------------------------------------------");
	}

}