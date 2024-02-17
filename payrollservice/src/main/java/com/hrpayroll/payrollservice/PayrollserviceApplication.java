package com.hrpayroll.payrollservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class PayrollserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollserviceApplication.class, args);
	}

}
