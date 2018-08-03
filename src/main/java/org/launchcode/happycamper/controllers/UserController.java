package org.launchcode.happycamper.controllers;

import org.launchcode.happycamper.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String adduser(Model model) {
        model.addAttribute("title", "HappyCamper User SignUp");
        model.addAttribute(new User());
        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processadduser(Model model, @ModelAttribute User user, Errors errors) {
        if (errors.hasErrors()){
            model.addAttribute("title", "HappyCamper User SignUp");
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("password", user.getPassword());
            model.addAttribute("message", "Passwords do not match!");
            return "user/add";
        }else{
        model.addAttribute("user", user);
        return "user/index";
        }
    }
}
