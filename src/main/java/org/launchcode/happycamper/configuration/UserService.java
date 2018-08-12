package org.launchcode.happycamper.configuration;

import org.launchcode.happycamper.controllers.models.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
