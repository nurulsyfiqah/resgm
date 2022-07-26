package com.nurul.researchgroup.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "announcements")
public class Announcement {

    @Id
    private String id;
    private String groupId;
    private String title;
    private String content;
    private Date createdDate;
    private String createdBy;
    private String target;


}