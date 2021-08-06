package com.zyh.springboot.controller;

import com.zyh.springboot.bean.Guest;
import com.zyh.springboot.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;
    @RequestMapping("/guest/list")
    public String list(Model model){
        model.addAttribute("guestList",guestService.selectList());
        System.out.println(guestService.selectList());
        return "guestindex";
    }
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "guestAdd";
    }
    @RequestMapping("/guest/add")
    public String add(@Param("name")String name,@Param("role")String role,Model model){
        Guest guest = new Guest( guestService.selectList().size(),name,role);
        guestService.add(guest);
        return "redirect:/guest/list";
    }


    @RequestMapping("/guest/toUpdate")
    public String toUpdate(@Param("name")Integer id,Model model){
        List<Guest> list = guestService.selectList();
        model.addAttribute("name",list.get(id).getName());
        model.addAttribute("role",list.get(id).getRole());
        return "guestUpdate";
    }
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toDelete")
    public String toDelete(int id,Model model){
        List<Guest> list = guestService.selectList();
        model.addAttribute("name",list.get(id).getName());
        model.addAttribute("role",list.get(id).getRole());
        return "guestDelete";
    }
    @RequestMapping("/guest/delete")
    public String delete(Guest guest){
        guestService.delete(guest);
        return "redirect:/guest/list";
    }

}
