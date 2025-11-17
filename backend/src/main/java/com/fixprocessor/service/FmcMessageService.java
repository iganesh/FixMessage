package com.fixprocessor.service;

import com.fixprocessor.dto.FmcRawMessageDTO;
import com.fixprocessor.model.FmcRawMessage;
import com.fixprocessor.repository.FmcRawMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FmcMessageService {
    private final FmcRawMessageRepository repository;

    public FmcRawMessage processMessage(FmcRawMessageDTO dto) {
        log.info("Processing FIX message: {}", dto.getSessionId());
        
        FmcRawMessage message = FmcRawMessage.builder()
                .data(dto.getData())
                .sessionId(dto.getSessionId())
                .clusterName(dto.getClusterName())
                .status("PROCESSED")
                .build();
        
        return repository.save(message);
    }

    public List<FmcRawMessage> getAllMessages() {
        return repository.findAll();
    }
}