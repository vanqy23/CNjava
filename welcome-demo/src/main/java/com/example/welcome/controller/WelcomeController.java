package com.example.welcome.controller;

import com.example.welcome.model.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String home(Model model) {
        Welcome welcome = new Welcome("Chào mừng bạn đến với Spring MVC!");
        model.addAttribute("welcome", welcome);
        return "welcome";
    }
}
