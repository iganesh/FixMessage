package com.fixprocessor.service;

import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.repository.FmcRawMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FmcMessageService {
    private final FmcRawMessageRepository repository;
    
    public Flux<FmcRawMessage> getAllMessages() {
        return repository.findAll();
    }
}