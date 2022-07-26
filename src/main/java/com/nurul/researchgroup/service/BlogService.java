package com.nurul.researchgroup.service;

import com.nurul.researchgroup.model.Blog;
import com.nurul.researchgroup.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    BlogRepository repository;

    public List<Blog> getAll() {
        return repository.findAll();
    }

    public List<Blog> getPostsByUserId(String userId) {
        return repository.getPostsByUserId(userId);
    }
    public Blog addPost(Blog blog) {
        return repository.insert(blog);
    }

    public Blog update(Blog blog) {
        return repository.save(blog);
    }

    public void delete(String id) {
       repository.deleteById(id);
    }

    public Optional<Blog> getPostById(String id) {
        return repository.findById(id);
    }

    public Optional<Blog> getArticleById(String id) {
        return repository.findById(id);
    }
}