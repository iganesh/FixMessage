package com.fixprocessor.controller;

import com.fixprocessor.dto.FmcRawMessageDTO;
import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.service.FmcMessageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/fmc")
@RequiredArgsConstructor
public class FmcMessageController {
    private final FmcMessageService service;

    @PostMapping("/process")
    public ResponseEntity<FmcRawMessage> processMessage(@Valid @RequestBody FmcRawMessageDTO dto) {
        FmcRawMessage processed = service.processMessage(dto);
        return ResponseEntity.ok(processed);
    }

    @GetMapping
    public ResponseEntity<List<FmcRawMessage>> getAllMessages() {
        List<FmcRawMessage> messages = service.getAllMessages();
        return ResponseEntity.ok(messages);
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("FMC FIX Processor is healthy");
    }
}