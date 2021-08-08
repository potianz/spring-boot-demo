package com.zyh.controller;

import com.zyh.model.Guest;
import com.zyh.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.Transient;
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
        return "guestindex";
    }
    @GetMapping("/toAdd")
    public String toAdd(){
        return "/guestAdd";
    }
    @Transactional
    @PostMapping
    public String add(Guest guest){
        guest.setId(5555L);
//        int result = 1/0;
        guestService.save(guest);
        return "redirect:/guest";
    }
}
