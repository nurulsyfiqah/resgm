package com.nurul.researchgroup.service;

import com.nurul.researchgroup.model.Group;
import com.nurul.researchgroup.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    GroupRepository repository;

    public List<Group> findAll() {
        return repository.findAll();
    }

    public Group save(Group group) {
        return repository.insert(group);
    }

    public Optional<Group> findById(String id) {
        return repository.findById(id);
    }

    public Group update(Group group) {
        return repository.save(group);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}