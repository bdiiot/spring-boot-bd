package com.bdiiot.spring.boot.bd.controller;

import com.bdiiot.spring.boot.bd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String inde(Model model) {
        model.addAttribute("date", new Date());
        model.addAttribute("listUser", userService.findAll());
        return "index";
    }

}
