package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.PatientDTO;
import com.SPYDER.Clinic.proxy.PatientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService {
    @Autowired private PatientProxy patientProxy;

    public PatientDTO findPatientById(long id){
        return patientProxy.findById(id);
    }

    public void deletePatientById(long id){
        patientProxy.delete(id);
    }
    public PatientDTO addPatient(PatientDTO patientDTO){
        return patientProxy.add(patientDTO);
    }
    public PatientDTO updatePatient(PatientDTO patientDTO){
        return patientProxy.update(patientDTO);
    }
}
