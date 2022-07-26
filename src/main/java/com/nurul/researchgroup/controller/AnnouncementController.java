package com.nurul.researchgroup.controller;

import com.nurul.researchgroup.model.Announcement;
import com.nurul.researchgroup.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AnnouncementController {

    @Autowired
    private AnnouncementService annService;

    @GetMapping("/group/announcement/all")
    public List<Announcement> getAllAnnouncements() {
        return annService.findAll();
    }

    @GetMapping("/group/announcement/{groupId}")
    public List<Announcement> getAllAnnouncementsByGroupId(@PathVariable String groupId) {
        return annService.getAnnouncementsByGroupId(groupId);
    }

    @PostMapping("/group/createannouncement")
    public Announcement createAnnouncement(@RequestBody Announcement ann) {
        return annService.create(ann);
    }

    @PutMapping("/group/announcement/update")
    public Announcement update(@RequestBody Announcement ann) {
        return annService.update(ann);
    }

    @DeleteMapping("/group/announcement/delete/{id}")
    public void deletePost(@PathVariable String id) {
        annService.delete(id);
    }
}