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
@Table("fmc_raw_message")
public class FmcRawMessage {
    @Id
    private Long id;
    
    @Column("creation_date")
    private LocalDateTime creationDate;
    
    @Column("status")
    private String status;
    
    @Column("cluster_name")
    private String clusterName;
    
    @Column("session_id")
    private String sessionId;
    
    @Column("data")
    private String data;
}