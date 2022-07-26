package com.nurul.researchgroup.repository;

import com.nurul.researchgroup.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends MongoRepository<Account, Integer> {

    List<Account> findAccountByEmail(String email);

    Account findAccountByUsername(String username);

    Optional<Account> getAccountById(String id);
}