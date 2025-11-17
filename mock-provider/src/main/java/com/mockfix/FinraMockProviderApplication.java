package com.mockfix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FinraMockProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinraMockProviderApplication.class, args);
        System.out.println("==============================================");
        System.out.println("FINRA Mock FIX Provider Started!");
        System.out.println("==============================================");
        System.out.println("API: http://localhost:8081/api/mock");
        System.out.println("Health: http://localhost:8081/actuator/health");
        System.out.println("==============================================");
    }
}