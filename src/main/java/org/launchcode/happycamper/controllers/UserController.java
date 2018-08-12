package org.launchcode.happycamper.controllers;

import org.launchcode.happycamper.configuration.UserService;
import org.launchcode.happycamper.controllers.models.User;
import org.launchcode.happycamper.controllers.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    //ToDo: build login controllers
    @RequestMapping(value = "login")
    public String displayloginform(Model model) {
        model.addAttribute("title", "Login to HappyCamper");
        return "user/login";
    }

    @RequestMapping(value = "add")
    public String displayadduserform(Model model) {

        model.addAttribute("title", "HappyCamper User SignUp");
        User user = new User();
        model.addAttribute("user", user);
        return "user/add";
    }


    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processadduser(Model model, @ModelAttribute @Valid User user, Errors errors) {

        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null){
            model.addAttribute("message", "Username is taken, Please try again.");
        }
        if(errors.hasErrors()){
            model.addAttribute("user", user);
            model.addAttribute("title", "HappyCamper User SignUp");
            return "user/add";
        }else{
            userService.saveUser(user);
            model.addAttribute("successMessage", "User has been registered successfully");
            model.addAttribute("user", new User());
            return "user/index";
        }
    }
}