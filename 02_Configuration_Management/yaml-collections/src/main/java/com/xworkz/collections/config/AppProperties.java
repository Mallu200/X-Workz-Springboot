package com.xworkz.collections.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Marks this as a configuration component for the Spring IoC container
@Configuration
// Directs Spring to look for properties starting with 'app' in the YAML
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private Security security = new Security();
    private Support support = new Support();

    // --- Getters and Setters for AppProperties ---

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    // Nested class for security list mapping
    public static class Security {
        // Maps the YAML hyphenated list (- "192...") to a Java List
        private List<String> ipWhitelist = new ArrayList<>();

        public List<String> getIpWhitelist() {
            return ipWhitelist;
        }

        public void setIpWhitelist(List<String> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
        }
    }

    // Nested class for support map mapping
    public static class Support {
        // Maps the YAML Key:Value pairs to a Java Map
        private Map<String, String> contacts = new HashMap<>();

        public Map<String, String> getContacts() {
            return contacts;
        }

        public void setContacts(Map<String, String> contacts) {
            this.contacts = contacts;
        }
    }
}