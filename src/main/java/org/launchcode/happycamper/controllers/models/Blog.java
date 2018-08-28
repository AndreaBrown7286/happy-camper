package org.launchcode.happycamper.controllers.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
public class Blog {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 50)
    private String title;

    @NotNull
    private String location;

    @NotNull
    private String body;

    private String author;

    @NotNull
    private Date createdOn;

    public Blog(String title, String location, String body, String author, Date createdOn) {
        this.title = title;
        this.location = location;
        this.body = body;
        this.author = author;
        this.createdOn = createdOn;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String  getBody() {
        return body;
    }

    public void setBody(String  body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
