package com.spring1.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class con1 {
    @GetMapping("con1")
    public String Cont1(Model model){
        model.addAttribute("data", "con1");
        return "view1";
    }
}
