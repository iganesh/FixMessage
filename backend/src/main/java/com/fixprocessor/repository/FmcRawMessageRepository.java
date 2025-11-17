package com.fixprocessor.repository;

import com.fixprocessor.model.FmcRawMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FmcRawMessageRepository extends JpaRepository<FmcRawMessage, Long> {
    List<FmcRawMessage> findByStatus(String status);
}