package com.hrpayroll.payrollservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hrpayroll.payrollservice.entities.Payment;
import com.hrpayroll.payrollservice.entities.Worker;

@Service
public class PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hr-worker.host}")
    private String workerHost; 
    
    
    public Payment getPayment (long workerId, int days){

         //mapa de parametros
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId); //as aspas servem para converter o workerId para string

        //classe espelho da classe Worker do projeto Worker
        //workerHost vem do arquivo aplication.properties
        Worker worker = restTemplate.getForObject(workerHost+"/workers/{id}", Worker.class,uriVariables);
       

        

        //criando o pagamento
        return new Payment(worker.getName(), worker.getDailyincome(), days);
    }


}
