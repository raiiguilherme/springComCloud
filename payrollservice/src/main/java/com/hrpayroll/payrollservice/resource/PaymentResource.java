package com.hrpayroll.payrollservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrpayroll.payrollservice.entities.Payment;
import com.hrpayroll.payrollservice.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayments(@PathVariable long workerId, @PathVariable Integer days){

        Payment payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);

    }

    @GetMapping
    public String ola(){
        return "olaaaa";
    }
}
