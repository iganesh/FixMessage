package com.fixprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableR2dbcRepositories
@EnableKafka
@EnableScheduling
public class FmcFixProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FmcFixProcessorApplication.class, args);
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Enhanced FMC FIX Message Processor Started!");
        System.out.println("==============================================");
        System.out.println("Frontend UI:    http://localhost:3000");
        System.out.println("Backend API:    http://localhost:8080/api/fmc");
        System.out.println("Health Check:   http://localhost:8080/actuator/health");
        System.out.println("==============================================");
        System.out.println("");
    }
}
