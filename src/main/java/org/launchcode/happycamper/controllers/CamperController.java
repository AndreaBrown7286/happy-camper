package org.launchcode.happycamper.controllers;

import org.launchcode.happycamper.controllers.models.Blog;
import org.launchcode.happycamper.controllers.models.data.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("camper")
public class CamperController {

    @Autowired
    private BlogDao blogDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "HappyCamper");
        return "camper/index";
    }

    @RequestMapping(value = "blog")
    public String addblog(Model model){

        model.addAttribute("title", " Write a HappyCamper Blog Post");
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "camper/blog";
    }

    //ToDo: process blog form-conect with database
}
