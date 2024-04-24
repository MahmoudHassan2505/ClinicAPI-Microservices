package com.SPYDER.Clinic.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "patient-service")
public interface PatientProxy {

    @GetMapping("/patients/{name}")
    public String findPatientByName(@PathVariable String name);
}
