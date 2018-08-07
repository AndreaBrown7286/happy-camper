//package org.launchcode.happycamper.services;
//
//import org.launchcode.happycamper.controllers.models.User;
//import org.launchcode.happycamper.controllers.models.UserRole;
//import org.launchcode.happycamper.controllers.models.data.UserDao;
//import org.launchcode.happycamper.controllers.models.data.UserRoleDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.management.relation.Role;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private UserRoleDao userRoleDao;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Override
//    public User findUserByEmail(String email) {
//        return userDao.findByEmail(email);
//    }
//
//    @Override
//    public void saveUser(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setActive(1);
//        Role userRole = userRoleDao.findByRole("ADMIN");
//        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
//        userDao.save(user);
//    }
//}
