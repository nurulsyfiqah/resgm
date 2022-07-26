package com.nurul.researchgroup.controller;

import com.nurul.researchgroup.model.Group;
import com.nurul.researchgroup.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/group")
    public List<Group> getAllGroups() { return groupService.findAll(); }

    @PostMapping("/group/create")
    public Group create(@RequestBody Group group) {
        return groupService.save(group);
    }

    @PutMapping("/group/update")
    public Group update(@RequestBody Group group) {
        return groupService.update(group);
    }

    @GetMapping("/group/{id}")
    public Optional<Group> getGroupById(@PathVariable String id) {
        Optional<Group> group = groupService.findById(id);
        return group;
    }

    @DeleteMapping("/group/delete/{id}")
    public void deletePost(@PathVariable String id) {
        groupService.delete(id);
    }

}