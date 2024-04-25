package com.SPYDER.Clinic.proxy;

import com.SPYDER.Clinic.model.dto.PatientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "patient-service")
public interface PatientProxy {

    @GetMapping("/patients/{id}")
    PatientDTO findById(@PathVariable long id);

    @PostMapping("/patients")
    PatientDTO add(@RequestBody PatientDTO patientDTO);

    @PutMapping("/patients")
    PatientDTO update(@RequestBody PatientDTO patientDTO);

    @DeleteMapping("/patients/{id}")
    void delete(@PathVariable long id);
    }
