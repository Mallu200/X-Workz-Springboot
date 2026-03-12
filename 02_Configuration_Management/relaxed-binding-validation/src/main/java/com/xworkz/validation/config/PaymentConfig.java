package com.xworkz.validation.config;

import jakarta.validation.constraints.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "payment.gateway")
@Validated // Crucial: This tells Spring to check constraints during startup
public class PaymentConfig {

    @NotBlank(message = "API URL cannot be empty")
    private String apiUrl;

    @NotBlank(message = "Auth Token is required for security")
    private String authToken;

    @Min(value = 1000, message = "Timeout must be at least 1000ms (1 second)")
    @Max(value = 10000, message = "Timeout cannot exceed 10000ms (10 seconds)")
    private int maxTimeoutMs;

    @Email(message = "Please provide a valid support email address")
    @NotBlank
    private String supportEmail;

    // --- Manual Getters and Setters ---

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public int getMaxTimeoutMs() {
        return maxTimeoutMs;
    }

    public void setMaxTimeoutMs(int maxTimeoutMs) {
        this.maxTimeoutMs = maxTimeoutMs;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }
}