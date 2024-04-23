package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/{name}")
    public String findPatientByName(@PathVariable String name){
        return patientService.findPatientByName(name);
    }
}
