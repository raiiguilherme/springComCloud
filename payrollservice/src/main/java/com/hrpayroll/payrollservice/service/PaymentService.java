package com.hrpayroll.payrollservice.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.hrpayroll.payrollservice.entities.Payment;
import com.hrpayroll.payrollservice.entities.Worker;
import com.hrpayroll.payrollservice.feignClient.WorkerFeignClient;

@Service
public class PaymentService {


    @Autowired
    private WorkerFeignClient workerFeignClient;
    
    
    public Payment getPayment (long workerId, int days){


       //utilizando o metodo da interface para capturar um worker
       //.getBody para que pegue o Worker do ResponseEntity
        Worker worker = workerFeignClient.findById(workerId).getBody();
       

        

        //criando o pagamento
        return new Payment(worker.getName(), worker.getDailyincome(), days);
    }


}
