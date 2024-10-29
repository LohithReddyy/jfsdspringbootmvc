package com.kl.jfsdspringbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @GetMapping("/adminLogin")
    public ModelAndView adminLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminLogin");
        return modelAndView;
        
    }
}
