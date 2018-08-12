package org.launchcode.happycamper.controllers.models;

import javax.persistence.Entity;
import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

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

    @NotNull
    @Size(min = 5, max = 15)
    private String password;

    @NotNull
    @Size(min = 5, max = 15)
    private String verify_password;

    private int active;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify_password() {
        return verify_password;
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles(){
        return roles;
    }
    public void setRoles(Set<Role> roles){
        this.roles = roles;
    }

    public void getRoles(HashSet<org.springframework.context.annotation.Role> roles) {
    }
}
