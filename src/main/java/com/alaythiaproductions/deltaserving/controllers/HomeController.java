package com.alaythiaproductions.deltaserving.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index() {

        return "views/login_and_register";
    }
}
