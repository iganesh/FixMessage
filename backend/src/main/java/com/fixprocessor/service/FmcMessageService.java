package com.fixprocessor.service;

import com.fixprocessor.dto.FmcRawMessageDTO;
import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.repository.FmcRawMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class FmcMessageService {
    private final FmcRawMessageRepository repository;
    
    public Mono<FmcRawMessage> processMessage(FmcRawMessageDTO dto) {
        log.info("Processing FIX message: {}", dto.getSessionId());
        FmcRawMessage message = new FmcRawMessage(dto.getData(), dto.getSessionId(), dto.getClusterName());
        message.setProcessedAt(LocalDateTime.now());
        message.setStatus("PROCESSED");
        return repository.save(message);
    }
    
    public Flux<FmcRawMessage> getAllMessages() {
        return repository.findAll();
    }
    
    public Mono<FmcRawMessage> replayMessage(Long id) {
        return repository.findById(id).flatMap(msg -> {
            msg.setStatus("REPLAYED");
            msg.setProcessedAt(LocalDateTime.now());
            return repository.save(msg);
        });
    }
}
