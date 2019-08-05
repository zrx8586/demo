package com.wl.study.demo.demo.controller;

import com.wl.study.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo
 * @description: 用户controller
 * @author: Wang Long
 * @create: 2019-08-02
 **/
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/checkUser")
    public String checkUser(@RequestParam("user") String user) {
        return userService.queryUserByUserName(user);
    }


    @PostMapping("/register")
    public String register(@RequestParam String user, @RequestParam String pwd) {
        return userService.saveUser(user, pwd);
    }


    @RequestMapping("/login")
    public String tologin(@RequestParam String username, @RequestParam String password) {
        return userService.login(username, password);
    }

}
