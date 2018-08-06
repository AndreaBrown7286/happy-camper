package org.launchcode.happycamper.services;

import org.launchcode.happycamper.controllers.models.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
