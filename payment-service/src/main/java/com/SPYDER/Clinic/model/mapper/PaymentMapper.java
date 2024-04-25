package com.SPYDER.Clinic.model.mapper;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.model.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);
}
