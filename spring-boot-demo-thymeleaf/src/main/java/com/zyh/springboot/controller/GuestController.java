package com.zyh.springboot.controller;

import com.zyh.springboot.bean.Guest;
import com.zyh.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;
    @RequestMapping("/guest/list")
    public String list(Model model){
        model.addAttribute("guestList",guestService.selectList());
        return "guestindex";
    }
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "guestAdd";
    }
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        return "guestindex";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        return "guestindex";
    }
    @RequestMapping("/guest/delete")
    public String delete(Guest guest){
        return "guestindex";
    }

}
