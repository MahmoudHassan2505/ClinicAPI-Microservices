package com.SPYDER.Clinic.repository;

import com.SPYDER.Clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}