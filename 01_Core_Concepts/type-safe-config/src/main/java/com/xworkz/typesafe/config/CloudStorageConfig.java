package com.xworkz.typesafe.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// Tells Spring this class provides bean configuration for the application context
@Configuration
// Binds all properties in application.properties starting with "cloud.storage" to this class
@ConfigurationProperties(prefix = "cloud.storage")
public class CloudStorageConfig {

    // Automatically maps from 'cloud.storage.api-key'
    private String apiKey;

    // Automatically maps from 'cloud.storage.secret-key'
    private String secretKey;

    // Automatically maps from 'cloud.storage.bucket-name'
    private String bucketName;

    // Automatically maps from 'cloud.storage.timeout-seconds' and converts to an integer
    private int timeoutSeconds;

    // Manually adding the getter that the compiler is looking for
    public String getBucketName() {return bucketName;}

    public String getApiKey() {return apiKey;}

    public int getTimeoutSeconds() {return timeoutSeconds;}

    // Setters are also required for @ConfigurationProperties to work
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }
    public void setBucketName(String bucketName) { this.bucketName = bucketName; }
    public void setTimeoutSeconds(int timeoutSeconds) { this.timeoutSeconds = timeoutSeconds; }
}