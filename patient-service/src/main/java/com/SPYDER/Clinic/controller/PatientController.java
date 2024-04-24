package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.entity.Patient;
import com.SPYDER.Clinic.service.PatientService;
import dto.AddPatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    PatientService patientService;


    @PostMapping
    public Patient add(@RequestBody AddPatientDTO patientDTO){
        return patientService.add(patientDTO);
    }

    @PutMapping
    public Patient update(@RequestBody AddPatientDTO patientDTO){
        return patientService.update(patientDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        patientService.delete(id);
    }
}
