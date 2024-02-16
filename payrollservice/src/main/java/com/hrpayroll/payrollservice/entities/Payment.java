package com.hrpayroll.payrollservice.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment implements Serializable{

    private String name;
    private Double dailyIncome;
    private Integer days;


     //metodo que retorna o total do salario
     //não precisa ser referenciado em outra classe
     public double getTotal(){
        return days*dailyIncome;
    }
   
    
}
