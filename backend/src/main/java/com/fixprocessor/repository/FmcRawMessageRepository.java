package com.fixprocessor.repository;

import com.fixprocessor.model.FmcRawMessage;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface FmcRawMessageRepository extends R2dbcRepository<FmcRawMessage, Long> {
    Flux<FmcRawMessage> findByStatus(String status);
}