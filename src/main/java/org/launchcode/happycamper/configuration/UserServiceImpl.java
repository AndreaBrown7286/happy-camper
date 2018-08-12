package org.launchcode.happycamper.configuration;

import org.launchcode.happycamper.controllers.models.User;
import org.launchcode.happycamper.controllers.models.data.UserDao;
import org.launchcode.happycamper.controllers.models.data.UserRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email){
        return userDao.fingdByEmail(email);
    }

    @Override
    public void saveUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = userRoleDao.findByRole("ADMIN");
        user.getRoles(new HashSet<Role>(Arrays.asList(userRole)));
            userDao.save(user);
    }
}
