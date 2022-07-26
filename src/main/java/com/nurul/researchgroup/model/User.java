package com.nurul.researchgroup.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.beans.ConstructorProperties;
import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String accountId;
    private String[] groupIds;
    private String firstName;
    private String lastName;
    private String publishedName;
    private String[] socialMedia;
    private String about;
    private String image;
    private String[] domain;
    private List<Affiliation> affiliation;

}