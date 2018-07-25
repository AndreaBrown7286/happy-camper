package org.launchcode.happycamper.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "camper")
public class CamperController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "HappyCamper");
        return "camper/index";
    }

}
