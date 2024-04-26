package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired private PaymentProxy paymentProxy;

    public PaymentDTO findById(String tranId){
        return paymentProxy.findPaymentById(tranId);
    }

    public PaymentDTO addPayment(PaymentDTO paymentDTO){
        return paymentProxy.addPayment(paymentDTO);
    }

    public PaymentDTO updatePayment(PaymentDTO paymentDTO){
        return paymentProxy.updatePayment(paymentDTO);
    }
}
