package com.example.talent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HireTalentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HireTalentApplication.class, args);
    }

}
