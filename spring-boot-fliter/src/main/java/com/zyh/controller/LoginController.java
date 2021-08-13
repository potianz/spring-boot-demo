package com.zyh.controller;

import com.zyh.bean.User;
import com.zyh.service.UserService;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/home")
public class LoginController {
    @Autowired
    private BasicTextEncryptor textEncryptor;

    @ResponseBody
    @PostMapping ("/login")
    public String login(String name, String password, HttpServletResponse response){
        System.out.println("name----->"+name+"\tpassword----------->"+password);
//        System.out.println("login执行了");
        Cookie cookie = new Cookie("isLogin","yes");
        cookie.setMaxAge(60);
        cookie.setPath("/");
        response.addCookie(cookie);
        String username = textEncryptor.encrypt(name);//要加密的数据(数据库的用户名或密码)
        String userpassword  = textEncryptor.encrypt(password);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("data==="+sdf.format(new Date()));
        System.out.println(name+"------"+username);
        System.out.println(password+"------"+userpassword);
        userService.insert(new User(2,username,userpassword));
        return "login success";
    }

    @GetMapping("/toLogin")
    public String toLogin(){
        System.out.println("toLogin执行了");
        return "index";
    }

    @GetMapping("/add")
    @ResponseBody
    public String add() {
        System.out.println("我执行了");
        return "add成功了";
    }

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public User get(){
        return userService.get(1);
    }

}
