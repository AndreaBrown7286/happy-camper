package org.launchcode.happycamper.controllers.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 50)
    private String title;

    @NotNull
    private String body;

    // ToDo: connect this with user id using OneToMany ManyToOne
    private String author;

    @NotNull
    private int createdOn;

    public Blog(String title, String body, String author) {
        this.title = title;
        this.body = body;
        this.author = author;
//        this.createdOn = createdOn;
    }
    public Blog(){

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public int getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(int createdOn) {
//        this.createdOn = createdOn;
//    }
}
