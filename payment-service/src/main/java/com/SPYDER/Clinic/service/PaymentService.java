package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.AddPaymentDTO;
import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.model.entity.Payment;
import com.SPYDER.Clinic.model.mapper.PaymentMapper;
import com.SPYDER.Clinic.reposiroty.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired private PaymentMapper paymentMapper;

    public PaymentDTO add(AddPaymentDTO paymentDTO){
        String tranId = UUID.randomUUID().toString();
        Payment payment = Payment.builder().
         amount(paymentDTO.getAmount())
                .patientId(paymentDTO.getPatientId())
                .tranId(tranId)
        .build();
        payment = paymentRepository.save(payment);

        return paymentMapper.toDto(payment);
    }

    public void delete(String id){
        paymentRepository.deleteById(id);
    }

    public PaymentDTO update(PaymentDTO paymentDTO){
        Payment payment = paymentMapper.toEntity(paymentDTO);
        payment = paymentRepository.save(payment);
        return paymentMapper.toDto(payment);
    }

    public PaymentDTO findBytTranId(String id){
        return paymentMapper.toDto(paymentRepository.findById(id).orElseThrow());
    }
}
