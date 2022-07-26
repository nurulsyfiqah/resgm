package com.nurul.researchgroup.repository;

import com.nurul.researchgroup.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
}
