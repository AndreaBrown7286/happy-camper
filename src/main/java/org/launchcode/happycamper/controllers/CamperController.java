package org.launchcode.happycamper.controllers;

import org.launchcode.happycamper.controllers.models.Blog;
import org.launchcode.happycamper.controllers.models.data.BlogDao;
import org.launchcode.happycamper.controllers.models.data.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

@Controller
@RequestMapping("camper")
public class CamperController {

    @Autowired
    private BlogDao blogDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("blogs", blogDao.findAll());
        model.addAttribute("title", "Welcome to HappyCamper!");
        return "camper/index";
    }

    @RequestMapping(value = "blog")
    public String addblog(Model model) {

        model.addAttribute("title", " Write a HappyCamper Blog Post");
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "camper/blog";
    }

    @RequestMapping(value = "blog", method = RequestMethod.POST)
    public String processblog(Model model, @ModelAttribute @Valid Blog blog, Errors errors) {
        if (!errors.hasErrors()) {
            model.addAttribute("blogs", blogDao.findAll());
            model.addAttribute("title", "HappyCamper Posts");
            model.addAttribute("blog", blog);
            blogDao.save(blog);
            return "camper/index";
        } else {
            if (errors.hasErrors()) {
                model.addAttribute("blog", blog);
                model.addAttribute("title", "Write a HappyCamper Blog Post");
            }
            return "camper/blog";
        }
    }

    @RequestMapping(value = "search")
    public String search(Model model) {

        model.addAttribute(new SearchForm());
        return "camper/search";
    }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public String processsearch(@RequestParam("keyword") String keyword,@ModelAttribute SearchForm searchForm, Model model){

        List<Blog>blogs;

        if(keyword != null){
            blogs = blogDao.findByLocation(searchForm.getKeyword());
            model.addAttribute("blogs", blogs);
        }

        return "camper/searchlist";
    }

}