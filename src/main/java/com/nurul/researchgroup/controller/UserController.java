package com.nurul.researchgroup.controller;

import com.nurul.researchgroup.model.User;
import com.nurul.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user/create")
    public User createUser(@RequestBody User user) {
        return userService.insert(user);
    }

    @PostMapping("/user/uploadimage")
    public String uploadImage(@RequestParam("title") String title, @RequestParam("file") MultipartFile image,@RequestParam("accountId") String accountId, Model model)
            throws IOException {
        String id = userService.uploadImage(title, image, accountId);
        return "upload successful";
    }

    @PutMapping("user/update")
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("user/getuserbyid/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @GetMapping("user/getuserbyaccountid/{accountid}")
    public Optional<User> getUserByAccountId(@PathVariable String accountid) {
        return userService.getUserByAccountId(accountid);
    }


}