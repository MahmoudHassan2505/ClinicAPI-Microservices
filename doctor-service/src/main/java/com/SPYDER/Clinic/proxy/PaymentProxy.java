package com.SPYDER.Clinic.proxy;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "payment-service")
public interface PaymentProxy {

    @GetMapping("/payments/{id}")
    public PaymentDTO findPaymentById(@PathVariable String id);

    @PostMapping("/payments")
    public PaymentDTO addPayment(@RequestBody PaymentDTO paymentDTO);

    @PutMapping("/payments")
    public PaymentDTO updatePayment(@RequestBody PaymentDTO paymentDTO);
}
