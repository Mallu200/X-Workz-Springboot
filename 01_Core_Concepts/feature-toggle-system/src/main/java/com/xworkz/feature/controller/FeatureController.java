package com.xworkz.feature.controller;

import com.xworkz.feature.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks the class as a REST controller where every method returns data directly to the body
@RestController
public class FeatureController {

    /* * required = false is CRITICAL here.
     * If the property is 'false', RewardsService is not in the context.
     * Without 'required = false', Spring would throw a BeanCreationException and fail to start.
     */
    @Autowired(required = false)
    private RewardsService rewardsService;

    // Endpoint to verify if the Rewards module is active or inactive
    @GetMapping("/check-feature")
    public String checkFeature() {
        System.out.println("FeatureController: Received request to check rewards feature status.");

        // Checking if the bean was actually injected by Spring
        if (rewardsService != null) {
            System.out.println("FeatureController: RewardsService is available. Calling service logic.");
            return "Feature Status: " + rewardsService.getStatus();
        } else {
            System.out.println("FeatureController: RewardsService is NULL. Module is disabled.");
            return "Feature Status: This module is currently DISABLED.";
        }
    }
}