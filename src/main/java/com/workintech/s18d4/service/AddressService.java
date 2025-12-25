package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Address;
import jakarta.transaction.Transactional;

import java.util.Optional;

@Transactional
public interface AddressService {
    Address createAddress(Address address);
    Address updateAddress(Address address);
    Address saveAddress(Address address);
    Address deleteAddress(Long id);
    Optional<Address> findByIdAndCustomerId(Integer addressId, Integer customerId);
}
