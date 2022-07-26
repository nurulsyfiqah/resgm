package com.nurul.researchgroup.repository;

import com.nurul.researchgroup.model.Announcement;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AnnouncementRepository extends MongoRepository<Announcement, String> {
    List<Announcement> findAllAnnouncementByGroupId(String groupId, Sort sort);
}