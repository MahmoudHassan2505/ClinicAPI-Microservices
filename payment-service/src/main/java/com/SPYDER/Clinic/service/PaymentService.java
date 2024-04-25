package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.model.entity.Payment;
import com.SPYDER.Clinic.model.mapper.PaymentMapper;
import com.SPYDER.Clinic.reposiroty.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired private PaymentMapper paymentMapper;

    public PaymentDTO add(PaymentDTO paymentDTO){
        Payment payment = paymentMapper.toEntity(paymentDTO);
        payment = paymentRepository.save(payment);

        return paymentMapper.toDto(payment);
    }

    public void delete(long id){
        paymentRepository.deleteById(id);
    }

    public PaymentDTO update(PaymentDTO paymentDTO){
        Payment payment = paymentMapper.toEntity(paymentDTO);
        payment = paymentRepository.save(payment);
        return paymentMapper.toDto(payment);
    }

    public PaymentDTO findBytTranId(long id){
        return paymentMapper.toDto(paymentRepository.findById(id).orElseThrow());
    }
}
