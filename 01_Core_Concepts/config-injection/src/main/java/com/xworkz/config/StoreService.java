package com.xworkz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

// Service component that manages store-specific configurations
@Service
public class StoreService {

    // Injects the 'app.store.name' property from application.properties into this variable
    @Value("${app.store.name}")
    private String storeName;

    // Injects the tax rate; Spring automatically converts the property string to a double
    @Value("${app.store.tax-rate}")
    private double taxRate;

    // Injects the currency code for localized pricing
    @Value("${app.store.currency}")
    private String currency;

    // Method executes automatically after the bean is created and properties are injected
    @PostConstruct
    public void displayStoreInfo() {
        System.out.println("StoreService: Initializing configuration properties...");

        System.out.println("******************************************");
        // Displays the store name pulled from external configuration
        System.out.println("WELCOME TO: " + storeName);

        // Displays the tax rate used for billing calculations
        System.out.println("Current Tax Rate: " + taxRate + "%");

        // Displays the localized currency symbol/code
        System.out.println("Default Currency: " + currency);
        System.out.println("******************************************");

        System.out.println("StoreService: Store info displayed successfully.");
    }
}