package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Account;
import jakarta.transaction.Transactional;

import java.util.List;
@Transactional
public interface AccountService {
    List<Account> findAll();
    Account find(Long id);
    Account save(Account account);
    Account delete(Long id);
    Account deleteAccount(Long id);
}