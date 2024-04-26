package com.SPYDER.Clinic.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private String tranId;
    private double amount;
    private long patientId;
}
