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
@Document(collection = "blogs")
public class Blog {

    @Id
    private String id;
    private String userId;
    private String title;
    private Date date;
    private int status;
    private String content;
    private String imagePath;
    private String category;
    private String[] keywords;
    private int commentOption;


}
