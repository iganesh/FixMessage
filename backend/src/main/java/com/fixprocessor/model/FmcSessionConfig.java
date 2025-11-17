package com.fixprocessor.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fmc_session_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FmcSessionConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_id")
    private String sessionId;

    @Column(name = "host")
    private String host;

    @Column(name = "port")
    private Integer port;

    @Column(name = "connection_type")
    private String connectionType = "acceptor";
}