package com.xworkz.validation.runner;

import com.xworkz.validation.config.PaymentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ValidationRunner implements CommandLineRunner {

    // Injecting the validated configuration bean
    @Autowired
    private PaymentConfig paymentConfig;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n==================================================");
        System.out.println("   VALIDATED GATEWAY CONFIGURATION                ");
        System.out.println("==================================================");

        // If the app started, we know these values passed @NotBlank and @Email
        System.out.println("Payment API URL   : " + paymentConfig.getApiUrl());
        System.out.println("Support Contact   : " + paymentConfig.getSupportEmail());

        // This value is guaranteed to be between 1000 and 10000
        System.out.println("Gateway Timeout   : " + paymentConfig.getMaxTimeoutMs() + "ms");

        System.out.println("Security Token    : " + maskToken(paymentConfig.getAuthToken()));

        System.out.println("==================================================\n");
    }

    // Helper method to keep sensitive tokens partially hidden in logs
    private String maskToken(String token) {
        if (token == null || token.length() < 4) return "****";
        return token.substring(0, 4) + "********";
    }
}