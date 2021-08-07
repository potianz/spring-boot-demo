package com.example.demo.controller;

import com.example.demo.bean.Guest;
import com.example.demo.service.GuestService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RequestMapping("/guest")
 * 放在类上代表这个类是以/guest开头的请求
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;
    @GetMapping
    public String list(Model model){
        model.addAttribute("guestList",guestService.selectList());
        System.out.println(guestService.selectList());
        return "guestindex";
    }
    @GetMapping("/toAdd")
    public String toAdd(){
        return "guestAdd";
    }
    @PostMapping
    public String add(@Param("name")String name,@Param("role")String role,Model model){
        Guest guest = new Guest( guestService.selectList().size(),name,role);
        guestService.add(guest);
        return "redirect:/guest";
    }

    /**
     * 通过/toUpdate/{name}  和@PathVariable映射到该参数
     * @param id
     * @param model
     * @return
     */

    @GetMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id")Integer id, Model model){
        List<Guest> list = guestService.selectList();
        model.addAttribute("name",list.get(id).getName());
        model.addAttribute("role",list.get(id).getRole());
        model.addAttribute("id",id);
        return "guestUpdate";
    }
    @PutMapping("/{id}")
    public String update(@PathVariable("id")Integer id,Guest guest){
        System.out.println("我执行了");
        guest.setId(id);
        guestService.update(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toDelete/{id}")
    public String toDelete(@PathVariable("id")Integer id,Model model){
        List<Guest> list = guestService.selectList();
        model.addAttribute("name",list.get(id).getName());
        model.addAttribute("role",list.get(id).getRole());
        model.addAttribute("id",list.get(id).getId());
        return "guestDelete";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id")Integer id){
        guestService.delete(id);
        return  "redirect:/guest";
    }
}
