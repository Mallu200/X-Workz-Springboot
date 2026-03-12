package com.xworkz.profile.controller;

import com.xworkz.profile.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks this class as a Web Controller where every method returns data directly to the body
@RestController
public class ProfileController {

    @Autowired
    private MessageService messageService; // Spring will inject Dev or Prod based on your properties!

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("ProfileController: Received request on /welcome endpoint.");

        // This calls the version of the service that matches your active profile
        String response = messageService.getWelcomeMessage();

        System.out.println("ProfileController: Sending response back to browser.");
        return response;
    }
}