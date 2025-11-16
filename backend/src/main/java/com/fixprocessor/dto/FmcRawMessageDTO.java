package com.fixprocessor.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FmcRawMessageDTO {
    private String data;
    private String sessionId;
    private String clusterName;
}