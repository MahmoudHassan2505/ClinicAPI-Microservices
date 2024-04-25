package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.PatientDTO;
import com.SPYDER.Clinic.model.entity.Patient;
import com.SPYDER.Clinic.model.mapper.PatientMapper;
import com.SPYDER.Clinic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired private PatientMapper patientMapper;

    public PatientDTO add(PatientDTO patientDTO) {

        Patient patient = this.patientMapper.toEntity(patientDTO);
        return patientMapper.toDto(patientRepository.save(patient));
    }

    public PatientDTO update(PatientDTO patientDTO) {

        return patientMapper.toDto(patientRepository.save(this.patientMapper.toEntity(patientDTO)));
    }

    public void delete(long id) {
        patientRepository.deleteById(id);
    }

    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public PatientDTO findById(long id) {
        return patientMapper.toDto(patientRepository.findById(id).orElseThrow( ()->new RuntimeException("Patient not Found")));
    }
}