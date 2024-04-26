package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors/payment")
public class PaymentController {

    @Autowired private PaymentService paymentService;

    @GetMapping("/{id}")
    public PaymentDTO findById(@PathVariable String id){
        return paymentService.findById(id);
    }

    @PostMapping
    public PaymentDTO addPayment(@RequestBody PaymentDTO paymentDTO){
        return paymentService.addPayment(paymentDTO);
    }
    @PutMapping
    public PaymentDTO updatePayment(@RequestBody PaymentDTO paymentDTO){
        return paymentService.updatePayment(paymentDTO);
    }

}
