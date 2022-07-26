package com.nurul.researchgroup.service;

import com.nurul.researchgroup.model.Account;
import com.nurul.researchgroup.model.User;
import com.nurul.researchgroup.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    public List<Account> getAccount(Account acc) {
        Example<Account> e = Example.of(acc);
        return repository.findAll(e);
    }

    public List<Account> getAccountByEmail(String email) {
        return repository.findAccountByEmail(email);
    }

    public Account create(Account acc) {
        return repository.insert(acc);
    }

    public Account getAccountByUsername(String username) {
        return repository.findAccountByUsername(username);
    }

    public Account update(Account acc) {
        return repository.save(acc);
    }

    public Optional<Account> getAccountById(String id) {
        return repository.getAccountById(id);
    }
}