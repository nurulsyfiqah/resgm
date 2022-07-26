package com.nurul.researchgroup.controller;

import com.nurul.researchgroup.model.Blog;
import com.nurul.researchgroup.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blog/all")
    public List<Blog> getAll() {
        return blogService.getAll();
    }

    @GetMapping("/blog/getpostsbyuserid")
    public List<Blog> getPostsByUserId(@RequestParam(name = "userId") String userId) {
        return blogService.getPostsByUserId(userId);
    }

    @GetMapping("/blog/edit/{id}")
    public Optional<Blog> getPostById(@PathVariable String id) {
        return blogService.getPostById(id);
    }

    @GetMapping("/{username}/{id}")
    public Optional<Blog> getArticleById(@PathVariable String username,@PathVariable String id) {
        return blogService.getArticleById(id);
    }

    @PostMapping("/blog/create")
    public Blog addPost(@RequestBody Blog blog) {
        return blogService.addPost(blog);
    }

    @PutMapping("/blog/update")
    public Blog updatePost(@RequestBody Blog blog) {
        return blogService.update(blog);
    }

    @DeleteMapping("/blog/delete/{id}")
    public void deletePost(@PathVariable String id) {
        blogService.delete(id);
    }


//    @Autowired
//    private BlogRepository repository;
//
//    @GetMapping("/blog/{userId}")
//    public Optional<Blog> getAllPostByUserId(@PathVariable String userId) {
//        return repository.findById(userId);
//    }
//
//    @PostMapping("/blog/create")
//    public String create(@RequestBody Blog blog) {
//        blog.setId(UUID.randomUUID().toString());
//        repository.save(blog);
//        return blog.getId();
//    }
//
//    @GetMapping("/blog/edit/{id}")
//    public Optional<Blog> getPostById(@PathVariable String id) {
//        Optional<Blog> blog = repository.findById(id);
//        return blog;
//    }
//
//    @PutMapping("/blog/update/{id}")
//    public Blog update(@RequestBody Blog blog) {
//        return  repository.save(blog);
//    }

}