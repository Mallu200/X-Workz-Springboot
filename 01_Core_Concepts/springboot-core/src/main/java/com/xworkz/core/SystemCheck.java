package com.xworkz.core;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

// Marks this class as a managed Spring bean for automatic detection during component scanning
@Component
public class SystemCheck {

    // Instructs Spring to execute this method immediately after bean initialization and dependency injection
    @PostConstruct
    public void init() {
        System.out.println("Executing SystemCheck: Starting post-construct initialization...");

        System.out.println("----------------------------------------------");
        // Displays a status message confirming the module is functional
        System.out.println("REAL-WORLD CHECK: Inventory System is Online!");

        // Retrieves and prints the current Java Runtime Environment version
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("----------------------------------------------");

        System.out.println("SystemCheck: Initialization process completed.");
    }
}