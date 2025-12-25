package com.workintech.s18d4.dto;

public class CustomerResponse {

    private Integer id;
    private String email;
    private Double salary;

    public CustomerResponse(Integer id, String email, Double salary) {
        this.id = id;
        this.email = email;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }
}