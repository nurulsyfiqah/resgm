package com.nurul.researchgroup.repository;

import com.nurul.researchgroup.model.Account;
import com.nurul.researchgroup.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {

    List<Blog> getPostsByUserId(String userId);

}
