package com.xworkz.collections.runner;

import com.xworkz.collections.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CollectionRunner implements CommandLineRunner {

    @Autowired
    private AppProperties appProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- VERIFYING YAML COLLECTIONS ---");

        // 1. Verifying the List (IP Whitelist)
        System.out.println("Authorized IP Addresses:");
        appProperties.getSecurity().getIpWhitelist().forEach(ip -> System.out.println(" -> Allowed: " + ip));

        // 2. Verifying the Map (Support Contacts)
        System.out.println("\nSupport Contact Directory:");
        appProperties.getSupport().getContacts().forEach((department, email) ->
                System.out.println(" -> Department: [" + department + "] | Email: " + email));

        System.out.println("----------------------------------\n");
    }
}