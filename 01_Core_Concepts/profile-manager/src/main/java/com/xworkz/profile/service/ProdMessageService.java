package com.xworkz.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Defines this class as a Service-layer component for the Spring container
@Service
// Restricts this bean to the 'prod' (production) profile for live environment settings
@Profile("prod")
public class ProdMessageService implements MessageService {

    @Override
    public String getWelcomeMessage() {
        System.out.println("ProdMessageService: getWelcomeMessage() invoked in PRODUCTION mode.");

        // Returns a secure warning message for the live production environment
        String message = "SECURITY ALERT: You are connected to the PRODUCTION Server.";

        System.out.println("ProdMessageService: Returning production-level security greeting.");
        return message;
    }
}