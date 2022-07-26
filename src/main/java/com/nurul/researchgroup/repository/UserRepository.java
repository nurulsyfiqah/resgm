package com.nurul.researchgroup.repository;

import com.nurul.researchgroup.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> getUserById(String accountId);

    Optional<User> findByAccountId(String accountid);
}