
package com.workintech.s18d4.dto;

public class AccountResponse {

    private final Integer id;
    private final String accountName;
    private final Double moneyAmount;

    public AccountResponse(Integer id, String accountName, Double moneyAmount) {
        this.id = id;
        this.accountName = accountName;
        this.moneyAmount = moneyAmount;
    }

    public Integer id() {
        return id;
    }

    public String accountName() {
        return accountName;
    }

    public Double moneyAmount() {
        return moneyAmount;
    }
}