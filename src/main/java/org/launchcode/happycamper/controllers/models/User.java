package org.launchcode.happycamper.controllers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//ToDo: BCrypt-encript users

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 5, max = 15)
    private String username;

    @NotNull
    @Email
    private String email;

    @NotNull(message = "Please enter a password")
    @Size(min = 5, max = 15)
    private String password;

    @NotNull(message = "Passwords must match")
    private String verify_password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
        checkPassword();
    }

    public String getPassword() {
        return password;
    }
    public String getVerify_password() {
        return verify_password;
    }

    private void checkPassword(){
        if(this.password == null || this.verify_password == null) {
            return;
        }else if (!this.password.equals(verify_password)){
                this.verify_password = null;
            }
        }
    }
