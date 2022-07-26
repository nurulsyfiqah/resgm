package com.nurul.researchgroup.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "groups")
public class Group {

    @Id
    private String id;
    private String name;
    private String icon;
    private String[] domain;
    private List<Member> member;
    private String description;
    private String createdBy;
    private Date createdDate;
    private int status;


}