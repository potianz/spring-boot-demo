package com.zyh.controller;

import com.zyh.model.Guest;
import com.zyh.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService ;

    @GetMapping
    public String  selectAll(Model model){
        List<Guest> list = guestService.list();
        model.addAttribute("guestList",list);
        System.out.println("我执行了");
        return "guestindex";
    }
}
