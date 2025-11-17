package com.fixprocessor.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fmc_raw_message")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FmcRawMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "status")
    private String status;

    @Column(name = "cluster_name")
    private String clusterName;

    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "data", columnDefinition = "TEXT")
    private String data;

    @Column(name = "processed_at")
    private LocalDateTime processedAt;
}