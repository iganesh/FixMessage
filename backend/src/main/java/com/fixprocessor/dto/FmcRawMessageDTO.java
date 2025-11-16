package com.fixprocessor.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FmcRawMessageDTO {
    @NotBlank(message = "Raw FIX message cannot be empty")
    private String data;
    private String sessionId;
    @NotBlank(message = "Cluster name is required")
    private String clusterName;
}
