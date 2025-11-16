package com.fixprocessor.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
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
    @CreatedDate
    private LocalDateTime creationDate;
    
    @Column("received_date")
    private LocalDateTime receivedDate;
    
    @Column("status")
    private String status;
    
    @Column("cluster_name")
    private String clusterName;
    
    @Column("session_id")
    private String sessionId;
    
    @Column("msg_type")
    private String msgType;
    
    @Column("msg_seq_num")
    private String msgSeqNum;
    
    @Column("data")
    private String data;
    
    @Column("processed_at")
    private LocalDateTime processedAt;
    
    public FmcRawMessage(String data, String sessionId, String clusterName) {
        this.creationDate = LocalDateTime.now();
        this.receivedDate = LocalDateTime.now();
        this.status = "RECEIVED";
        this.clusterName = clusterName;
        this.sessionId = sessionId;
        this.data = data;
    }
}
