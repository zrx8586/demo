package com.wl.study.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description: index controller
 **/

@Controller
public class IndexController {

    @GetMapping("")
    public String index() {
        return "index";
    }


    @RequestMapping("/login")
    public String tologin(){
        return "login";
    }

    @RequestMapping("register")
    public String home(){
        return "register";
    }
}
