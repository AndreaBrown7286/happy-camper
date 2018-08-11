package org.launchcode.happycamper.controllers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String roleName;

    public UserRole(int id, @NotNull String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public UserRole() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
