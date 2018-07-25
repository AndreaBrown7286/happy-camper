//package org.launchcode.happycamper.controllers;
//
//import org.launchcode.happycamper.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//@Controller
//@RequestMapping(value = "user")
//public class UserController {
//
//    @RequestMapping(value = "add", method = RequestMethod.GET)
//    public String add(Model model) {
//        model.addAttribute("title", "HappyCamper User SignUp");
//
//        return "user/add";
//    }
//
//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String processadd(Model model, @ModelAttribute User user, Errors errors, String verify) {
//        if (errors.hasErrors()) {
//            model.addAttribute(user);
//        }
//
//        return "camper/index";
//    }
//}
