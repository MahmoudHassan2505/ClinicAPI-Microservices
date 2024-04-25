package com.SPYDER.Clinic.repository;

import com.SPYDER.Clinic.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}