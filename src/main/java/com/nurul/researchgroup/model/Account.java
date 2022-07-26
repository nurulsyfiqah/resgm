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
@Document(collection = "accounts")
public class Account {

    @Id
    private String id;
    private String email;
    private String password;
    private String username;
    private String lastName;
    private String firstName;
    private String role;
    private Date createdDate;

}
