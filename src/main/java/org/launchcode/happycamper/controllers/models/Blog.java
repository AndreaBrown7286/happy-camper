package org.launchcode.happycamper.controllers.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 50)
    private String title;

    @NotNull
    private String boby;

    // ToDo: connect this with user id
    @NotNull
    private String author;

    @NotNull
    private Timestamp createdOn;

    public Blog(String title, String boby, String author, Timestamp createdOn) {
        this.title = title;
        this.boby = boby;
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

    public String getBoby() {
        return boby;
    }

    public void setBoby(String boby) {
        this.boby = boby;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
}
