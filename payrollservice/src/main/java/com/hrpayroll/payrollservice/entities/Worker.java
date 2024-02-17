package com.hrpayroll.payrollservice.entities;
import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Worker implements Serializable{


    

    private Long id;
    private String name;
    private Double dailyincome;



    
}
