package com.SPYDER.Clinic.proxy;

import com.SPYDER.Clinic.model.dto.PaymentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "payment-service")
public interface PaymentProxy {

    @GetMapping("/payments/patient/{id}")
    public List<PaymentDTO> findALlPaymentsByPatientId(@PathVariable long id);
}
