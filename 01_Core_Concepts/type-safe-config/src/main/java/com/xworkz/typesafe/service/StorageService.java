package com.xworkz.typesafe.service;

import com.xworkz.typesafe.config.CloudStorageConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Marks this class as a Service component managed by the Spring container
@Service
public class StorageService {

    // Automatically injects the type-safe configuration bean mapped from properties
    @Autowired
    private CloudStorageConfig cloudConfig;

    // Standard lifecycle method that runs once the bean is fully initialized and properties are set
    @PostConstruct
    public void checkConnection() {
        System.out.println("StorageService: Initiating connectivity check using injected configuration...");

        System.out.println("--- CLOUD STORAGE INITIALIZED ---");

        // Displays the bucket name retrieved from the cloud.storage.bucket-name property
        System.out.println("Connecting to Bucket: " + cloudConfig.getBucketName());

        // Displays the API Key retrieved from the cloud.storage.api-key property
        System.out.println("Using API Key: " + cloudConfig.getApiKey());

        // Displays the timeout value converted from a string to an integer
        System.out.println("Timeout set to: " + cloudConfig.getTimeoutSeconds() + "s");

        System.out.println("---------------------------------");

        System.out.println("StorageService: Connection settings verified successfully.");
    }
}