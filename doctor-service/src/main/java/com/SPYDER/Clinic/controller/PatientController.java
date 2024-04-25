package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.dto.PatientDTO;
import com.SPYDER.Clinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/{id}")
    public PatientDTO findPatientByName(@PathVariable long id){
        return patientService.findPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable long id){
         patientService.deletePatientById(id);
    }

    @PostMapping
    public PatientDTO addPatient(@RequestBody PatientDTO patientDTO){
        return patientService.addPatient(patientDTO);
    }

    @PutMapping
    public PatientDTO updatePatient(@RequestBody PatientDTO patientDTO){
        return patientService.updatePatient(patientDTO);
    }
}
