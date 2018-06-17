package com.learning.currency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value= "name", required = false,
            defaultValue = "Elavazhagan") String name, Model model){

        // Here is where the attribute called user is added to the Spring MVC
        // So, in the templates htmls, referring to $user will invoke this user
        model.addAttribute("user", name);

        return "hello";
    }
}
