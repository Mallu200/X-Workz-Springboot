package com.xworkz.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Marks this class as a Service bean for the Spring container
@Service
// Restricts this bean's availability to the 'dev' (development) environment only
@Profile("dev")
public class DevMessageService implements MessageService {

    @Override
    public String getWelcomeMessage() {
        System.out.println("DevMessageService: getWelcomeMessage() invoked.");

        // Returns a specific message intended for local development and debugging
        String message = "DEBUG MODE: Welcome to the local Development Server (Unsecured).";

        System.out.println("DevMessageService: Returning development-specific greeting.");
        return message;
    }
}