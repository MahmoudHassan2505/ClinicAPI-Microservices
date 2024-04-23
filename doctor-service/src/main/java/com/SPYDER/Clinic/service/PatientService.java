package com.SPYDER.Clinic.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService {
    public String findPatientByName(String name) {
        String url = "http://localhost:9000/patients/";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url+name,String.class);
        return  result;
    }
}
