package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.entity.Patient;
import com.SPYDER.Clinic.repository.PatientRepository;
import dto.AddPatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient add(AddPatientDTO patientDTO) {
        Patient patient = Patient.builder().
                name(patientDTO.getName())
                .age(patientDTO.getAge()).
                build();
        return patientRepository.save(patient);
    }

    public Patient update(AddPatientDTO patientDTO) {
        Patient patient = Patient.builder().
                id(patientDTO.getId()).
                name(patientDTO.getName())
                .age(patientDTO.getAge()).
                build();
        return patientRepository.save(patient);
    }

    public void delete(long id) {
        patientRepository.deleteById(id);
    }
}