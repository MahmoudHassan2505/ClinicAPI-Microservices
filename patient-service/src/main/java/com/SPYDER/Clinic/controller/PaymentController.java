package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.proxy.PaymentProxy;
import com.SPYDER.Clinic.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients/payment")
public class PaymentController {

   @Autowired private PaymentService paymentService;

    @GetMapping("/{id}")
    public List<PaymentDTO> findAllPaymentsByPatientId(@PathVariable long id){
        return paymentService.findAllPaymentsByPatientId(id);
    }
}
