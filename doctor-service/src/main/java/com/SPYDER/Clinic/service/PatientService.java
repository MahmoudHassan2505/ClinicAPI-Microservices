package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService {
    @Autowired private PatientProxy patientProxy;
    public String findPatientByName(String name) {

        return this.patientProxy.findPatientByName(name);
    }
}
