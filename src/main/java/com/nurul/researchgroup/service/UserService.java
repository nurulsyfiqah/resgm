package com.nurul.researchgroup.service;

import com.nurul.researchgroup.model.User;
import com.nurul.researchgroup.repository.UserRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User insert(User user) {
        return repository.insert(user);
    }
    public User save(User user) {
        return repository.save(user);
    }
    public Optional<User> getUserById(String id) {
        return repository.findById(id);
    }

    public String uploadImage(String title, MultipartFile file, String accountId) throws IOException {
//        List<User> userList = repository.getUserById(accountId);
//        System.out.println(userList.toString());
//        User user = userList.get(0);
//        user.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
//        repository.save(user);
////        Photo photo = new Photo(title);
////        photo.setImage(
////                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
////        photo = photoRepo.insert(photo); return photo.getId();
        return "success";
    }

    public Optional<User> getUserByAccountId(String accountid) {
        return repository.findByAccountId(accountid);
    }
}