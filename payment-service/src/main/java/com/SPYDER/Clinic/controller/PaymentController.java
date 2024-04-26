package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.dto.AddPaymentDTO;
import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired private PaymentService paymentService;

    @GetMapping("/patient/{id}")
    public List<PaymentDTO> findAllByPatientId(@PathVariable long id){
        return paymentService.findAllByPatientId(id);
    }

    @GetMapping("/{id}")
    public PaymentDTO findByTranId(@PathVariable String id){
        return paymentService.findBytTranId(id);
    }

    @PostMapping
    public PaymentDTO add(@RequestBody AddPaymentDTO paymentDTO){
        return paymentService.add(paymentDTO);
    }

    @PutMapping
    public PaymentDTO update(@RequestBody PaymentDTO paymentDTO){
        return paymentService.update(paymentDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        paymentService.delete(id);
    }
}
