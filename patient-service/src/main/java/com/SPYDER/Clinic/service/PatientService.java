package com.SPYDER.Clinic.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    private List<String> patient = Arrays.asList("Ahmed","Mahmoud","Mostafa","Ziad");
    public String findPatientByName(String name) {
        return patient.stream().filter(patient->patient.equals(name)).findAny().orElse("Patient Not Found");
    }
}
