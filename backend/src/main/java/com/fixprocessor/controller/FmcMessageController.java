package com.fixprocessor.controller;

import com.fixprocessor.dto.FmcRawMessageDTO;
import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.service.FmcMessageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/fmc")
@RequiredArgsConstructor
public class FmcMessageController {
    private final FmcMessageService service;
    
    @PostMapping("/process")
    public Mono<ResponseEntity<FmcRawMessage>> processMessage(@Valid @RequestBody FmcRawMessageDTO dto) {
        return service.processMessage(dto).map(ResponseEntity::ok);
    }
    
    @GetMapping
    public Flux<FmcRawMessage> getAllMessages() {
        return service.getAllMessages();
    }
    
    @PostMapping("/{id}/replay")
    public Mono<ResponseEntity<FmcRawMessage>> replayMessage(@PathVariable Long id) {
        return service.replayMessage(id).map(ResponseEntity::ok);
    }
    
    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("FMC FIX Processor is healthy");
    }
}
