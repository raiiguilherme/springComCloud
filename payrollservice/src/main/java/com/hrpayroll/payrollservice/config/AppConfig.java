package com.hrpayroll.payrollservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//classe de configuração
@Configuration
public class AppConfig {

    @Bean //criando o restTemplate com uma chamada de metodo
    public RestTemplate restTemplate(){
        return new RestTemplate();
    
    }

}
