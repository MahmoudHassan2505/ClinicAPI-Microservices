package com.SPYDER.Clinic.controller;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import com.SPYDER.Clinic.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired private PaymentService paymentService;

    @GetMapping("/{id}")
    public PaymentDTO findByTranId(@PathVariable long id){
        return paymentService.findBytTranId(id);
    }

    @PostMapping
    public PaymentDTO add(@RequestBody PaymentDTO paymentDTO){
        return paymentService.add(paymentDTO);
    }

    @PutMapping
    public PaymentDTO update(@RequestBody PaymentDTO paymentDTO){
        return paymentService.update(paymentDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        paymentService.delete(id);
    }
}