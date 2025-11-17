package com.mockfix.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class FixMessageGeneratorService {
    private final Random random = new Random();
    private final List<String> symbols = Arrays.asList("AAPL", "TSLA", "GOOGL", "MSFT", "AMZN");
    
    @Scheduled(fixedRate = 10000)
    public void generateMockOrder() {
        String symbol = symbols.get(random.nextInt(symbols.size()));
        double price = 100 + (random.nextDouble() * 400);
        int quantity = (random.nextInt(10) + 1) * 100;
        
        String message = String.format("Mock Order: %s, %d shares @ $%.2f", symbol, quantity, price);
        System.out.println("[MOCK FIX] " + message);
    }
}