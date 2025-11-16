package com.fixprocessor.controller;

import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.service.FmcMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/fmc")
@RequiredArgsConstructor
public class FmcMessageController {
    private final FmcMessageService service;
    
    @GetMapping
    public Flux<FmcRawMessage> getAllMessages() {
        return service.getAllMessages();
    }
    
    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Healthy");
    }
}