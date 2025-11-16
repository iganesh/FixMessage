package com.mockfix.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class FixMessageGeneratorService {
    private final Random random = new Random();
    private final List<String> symbols = Arrays.asList("AAPL", "TSLA", "GOOGL", "MSFT", "AMZN");
    
    @Scheduled(fixedRate = 5000)
    public void generateMessage() {
        String symbol = symbols.get(random.nextInt(symbols.size()));
        double price = 100 + (random.nextDouble() * 400);
        int quantity = (random.nextInt(10) + 1) * 100;
        
        log.info("Generated order: {} {} shares @ {}", symbol, quantity, String.format("%.2f", price));
    }
}
