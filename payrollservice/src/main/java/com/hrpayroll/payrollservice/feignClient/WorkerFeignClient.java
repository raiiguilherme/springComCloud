package com.hrpayroll.payrollservice.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hrpayroll.payrollservice.entities.Worker;

@Component
//aqui mostro os caminhos para chegar ao Worker
@FeignClient(name = "wr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable long id);
}
