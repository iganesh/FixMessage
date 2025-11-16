package com.fixprocessor.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("fmc_session_config")
public class FmcSessionConfig {
    @Id
    private Long id;
    
    @Column("session_id")
    private String sessionId;
    
    @Column("host")
    private String host;
    
    @Column("port")
    private Integer port;
    
    @Column("connection_type")
    private String connectionType;
}