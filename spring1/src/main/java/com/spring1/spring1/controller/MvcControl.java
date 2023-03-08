package com.spring1.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcControl {
    @GetMapping("mvc")
    public String MvcCon(@RequestParam("data") String s, Model model)
    {
        model.addAttribute("data", s);
        return "view2";
    }
}
