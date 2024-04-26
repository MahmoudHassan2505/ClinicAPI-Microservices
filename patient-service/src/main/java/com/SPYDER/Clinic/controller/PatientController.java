package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.entity.Patient;
import com.SPYDER.Clinic.service.PatientService;
import com.SPYDER.Clinic.model.dto.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping
    public List<Patient> findAll(){
        return patientService.findAll();
    }

    @GetMapping("/{id}")
    public PatientDTO findById(@PathVariable long id){

        return patientService.findById(id);
    }

    @PostMapping
    public PatientDTO add(@RequestBody PatientDTO patientDTO){
        return patientService.add(patientDTO);
    }

    @PutMapping
    public PatientDTO update(@RequestBody PatientDTO patientDTO){
        return patientService.update(patientDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        patientService.delete(id);
    }
}
