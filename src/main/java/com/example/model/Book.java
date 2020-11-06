package com.example.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    private long bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;

}
