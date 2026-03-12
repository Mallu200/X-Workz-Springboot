package com.xworkz.feature.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

// Registers this class as a Service only if the specific property matches the required value
@Service
/* * The Magic: This bean ONLY enters the Spring Context if 'app.features.rewards-enabled' is 'true'.
 * If the property is missing or 'false', this bean is completely ignored by Spring.
 */
@ConditionalOnProperty(name = "app.features.rewards-enabled", havingValue = "true")
public class RewardsService {

    // Runs only if the condition above is met and the bean is successfully created
    @PostConstruct
    public void init() {
        System.out.println("RewardsService: Initializing modular component...");
        System.out.println(">>> SUCCESS: Rewards Module is ACTIVE and Loaded into Memory.");
    }

    // Business logic for the rewards feature
    public String getStatus() {
        System.out.println("RewardsService: Fetching current cashback rates.");
        return "Rewards are calculated at 5% cashback.";
    }
}