package com.xworkz.yaml.runner;

import com.xworkz.yaml.config.MailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// @Component ensures Spring detects this class and runs the 'run' method at startup
@Component
public class MailConfigRunner implements CommandLineRunner {

    // Injecting our Type-Safe configuration bean that maps to the YAML
    @Autowired
    private MailConfig mailConfig;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MailConfigRunner: Executing post-startup verification...");

        System.out.println("==================================================");
        System.out.println("   YAML NESTED CONFIGURATION VERIFICATION        ");
        System.out.println("==================================================");

        // Accessing the top-level fields in the MailConfig class
        System.out.println("Gateway Host     : " + mailConfig.getHost());
        System.out.println("Gateway Port     : " + mailConfig.getPort());

        // Navigating into the nested 'Credentials' static inner class
        System.out.println("Auth Username    : " + mailConfig.getCredentials().getUsername());

        // Navigating into the nested 'Settings' static inner class
        System.out.println("TLS Enabled      : " + mailConfig.getSettings().isStarttls());
        System.out.println("Network Timeout  : " + mailConfig.getSettings().getTimeout() + "ms");

        System.out.println("==================================================");
        System.out.println("MailConfigRunner: All nested properties verified.");
    }
}