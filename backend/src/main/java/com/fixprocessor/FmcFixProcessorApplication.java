package com.fixprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FmcFixProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FmcFixProcessorApplication.class, args);
        System.out.println("==============================================");
        System.out.println("FMC FIX Processor Started Successfully!");
        System.out.println("==============================================");
        System.out.println("API: http://localhost:8080/api/fmc");
        System.out.println("Health: http://localhost:8080/api/fmc/health");
        System.out.println("H2 Console: http://localhost:8080/h2-console");
        System.out.println("==============================================");
    }
}