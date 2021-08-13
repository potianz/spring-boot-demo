package com.zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class custController {

    @RequestMapping("/servlet")
    @ResponseBody
    public String get(){
        return "hello world!";
    }
}
