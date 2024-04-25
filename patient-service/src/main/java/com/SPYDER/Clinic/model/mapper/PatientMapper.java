package com.SPYDER.Clinic.model.mapper;

import com.SPYDER.Clinic.model.dto.AddPatientDTO;
import com.SPYDER.Clinic.model.dto.PatientDTO;
import com.SPYDER.Clinic.model.entity.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {



    Patient toEntity(PatientDTO dto);
    PatientDTO toDto(Patient entity);

    Patient toEntity(AddPatientDTO dto);
    AddPatientDTO toAddDto(Patient entity);
}
