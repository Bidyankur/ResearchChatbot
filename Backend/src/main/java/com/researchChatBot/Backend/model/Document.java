package com.researchChatBot.Backend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;


    private String path;


    public Document() {}


    public Document(String title, String path) {
        this.title = title;
        this.path = path;
    }


    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
}
