package com.SPYDER.Clinic.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {
    private long id;
    private String name;
    private int age;
}
