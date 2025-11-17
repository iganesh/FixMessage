package com.mockfix.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/mock")
public class MockFixController {
    
    @PostMapping("/send-order")
    public ResponseEntity<Map<String, Object>> sendOrder() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("messageType", "D - NewOrderSingle");
        response.put("orderId", "ORDER-" + System.currentTimeMillis());
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/send-execution")
    public ResponseEntity<Map<String, Object>> sendExecution() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("messageType", "8 - ExecutionReport");
        response.put("execId", "EXEC-" + System.currentTimeMillis());
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> getStatus() {
        Map<String, Object> status = new HashMap<>();
        status.put("service", "FINRA Mock FIX Provider");
        status.put("status", "active");
        status.put("version", "1.0.0");
        return ResponseEntity.ok(status);
    }
}