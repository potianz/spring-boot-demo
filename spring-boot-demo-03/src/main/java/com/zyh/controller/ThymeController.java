package com.zyh.controller;

import com.zyh.bean.Resturant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String thy(Model model){
        model.addAttribute("name","<h1>thyme</h1>");
        Resturant resturant = new Resturant();
        resturant.setBoss("张三");
        resturant.setChef("李四");
        model.addAttribute("resturant",resturant);
        return "/thymeleaf/thy";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleaf/welcome";
    }
}
