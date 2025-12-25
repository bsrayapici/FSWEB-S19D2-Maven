package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class AddressController {

    private final AddressService addressService;
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address/{customerId}/{accountId}")
    public Optional<Address> getAddress(@PathVariable Integer customerId, @PathVariable Integer accountId) {
        return addressService.findByIdAndCustomerId(accountId, customerId);
    }
}
