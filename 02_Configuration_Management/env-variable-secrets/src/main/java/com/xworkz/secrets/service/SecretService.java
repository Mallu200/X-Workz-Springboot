package com.xworkz.secrets.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

@Service
public class SecretService {

    // Regular injection from YAML
    @Value("${db.connection.username}")
    private String user;

    /*
     * Spring performs a 'search' for DB_PASSWORD.
     * Order: OS Env Var -> Java System Prop -> YAML default
     */
    @Value("${db.connection.password}")
    private String pass;

    @PostConstruct
    public void showStatus() {
        System.out.println("SecretService: Post-construct phase triggered.");
        System.out.println("==================================================");
        System.out.println("   DATABASE CREDENTIAL RESOLUTION                 ");
        System.out.println("==================================================");

        System.out.println("Resolved Username : " + user);

        // We print it here just to prove the switch happened during your lab session
        System.out.println("Resolved Password : " + pass);

        if ("dev_pass".equals(pass)) {
            System.out.println(">>> WARNING: No OS Environment Variable found.");
            System.out.println(">>> Using hardcoded fallback: dev_pass");
        } else {
            System.out.println(">>> SUCCESS: External secret detected!");
            System.out.println(">>> The password was successfully injected from outside the code.");
        }

        System.out.println("==================================================");
    }
}