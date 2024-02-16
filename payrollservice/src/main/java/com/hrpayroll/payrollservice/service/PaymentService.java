package com.hrpayroll.payrollservice.service;

import org.springframework.stereotype.Service;

import com.hrpayroll.payrollservice.entities.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment (long workerId, int days){
        return new Payment("bob", 200.0, days);
    }


}
