package com.SPYDER.Clinic.service;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentProxy paymentProxy;

    public List<PaymentDTO> findAllPaymentsByPatientId(long id){
        return paymentProxy.findALlPaymentsByPatientId(id);
    }
}
