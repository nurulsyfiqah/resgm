package com.nurul.researchgroup.service;

import com.nurul.researchgroup.model.Announcement;
import com.nurul.researchgroup.model.Group;
import com.nurul.researchgroup.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {

    @Autowired
    AnnouncementRepository repository;

    public Announcement create(Announcement ann) {
        return repository.insert(ann);
    }

    public List<Announcement> getAnnouncementsByGroupId(String groupId) {
        Sort sort = Sort.by(Sort.Direction.DESC,"createdDate");
        return repository.findAllAnnouncementByGroupId(groupId, sort);
    }

    public List<Announcement> findAll() {
        return repository.findAll();
    }

    public Announcement update(Announcement ann) {
        return repository.save(ann);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}