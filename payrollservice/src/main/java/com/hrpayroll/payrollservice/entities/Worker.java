package com.hrpayroll.payrollservice.entities;
import java.io.Serializable;






public class Worker implements Serializable{


    

    private Long id;
    private String name;
    private Double dailyincome;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getDailyincome() {
        return dailyincome;
    }
    public void setDailyincome(Double dailyincome) {
        this.dailyincome = dailyincome;
    }
    public Worker(Long id, String name, Double dailyincome) {
        this.id = id;
        this.name = name;
        this.dailyincome = dailyincome;
    }
    public Worker() {
    }

    



    
}
