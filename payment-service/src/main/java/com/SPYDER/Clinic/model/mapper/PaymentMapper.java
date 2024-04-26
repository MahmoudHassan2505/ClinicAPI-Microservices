package com.SPYDER.Clinic.model.mapper;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.model.entity.Payment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);

    List<PaymentDTO> toListDto(List<Payment> payments);
    List<Payment> toListEntity(List<PaymentDTO> paymentDTOs);


}
