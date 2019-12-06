package com.bdiiot.spring.boot.bd.controller;

import com.bdiiot.spring.boot.bd.model.User;
import com.bdiiot.spring.boot.bd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("date", new Date());
        model.addAttribute("listUser", userService.findAll());
        return "index";
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model) {
        model.setViewName("user");
        return model;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@Valid User user, BindingResult bndBindingResult) {
        ModelAndView model = new ModelAndView();
        if (user != null) {
            userService.save(user);
        }
        model.setViewName("redirect:/");
        return model;
    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") Long id) {
        ModelAndView model = new ModelAndView();
        if (id != null) {
            userService.deleteById(id);
        }
        model.setViewName("redirect:/");
        return model;
    }

    @RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
    public ModelAndView editUser(@PathVariable("id") Long id) {
        ModelAndView model = new ModelAndView();
        if (id != null) {
            model.addObject("user", userService.get(id));
        }
        model.setViewName("editUser");
        return model;
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ModelAndView updateUser(@Valid User user, BindingResult bndBindingResult) {
        ModelAndView model = new ModelAndView();
        if (user != null) {
            userService.update(user);
        }
        model.setViewName("redirect:/");
        return model;
    }
}
