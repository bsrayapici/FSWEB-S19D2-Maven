package com.workintech.s18d4.dto;

import lombok.Data;

@Data
public class CustomerResponse {

    private Integer id;
    private String email;
    private Double salary;

    public CustomerResponse(Integer id, String email, Double salary) {
        this.id = id;
        this.email = email;
        this.salary = salary;
    }
}