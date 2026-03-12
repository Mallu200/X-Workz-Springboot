package com.xworkz.env.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

// This controller will change its output depending on the 'spring.profiles.active' setting
@RestController
public class DatabaseController {

    // Spring injects the URL from the active profile (H2 for 'dev', MySQL for 'prod')
    @Value("${db.url}")
    private String dbUrl;

    // Spring injects the specific message defined in the active document block
    @Value("${db.message}")
    private String statusMessage;

    @GetMapping("/db-status")
    public Map<String, String> getStatus() {
        System.out.println("DatabaseController: Fetching current environment configuration...");
        System.out.println("Active URL: " + dbUrl);

        // Returning a Map so the browser displays a clean JSON response
        return Map.of(
                "ConnectionURL", dbUrl,
                "EnvironmentNote", statusMessage,
                "CurrentTime", java.time.LocalDateTime.now().toString()
        );
    }
}