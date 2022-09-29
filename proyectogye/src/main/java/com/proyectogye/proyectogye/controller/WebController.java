package com.proyectogye.proyectogye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/panel")
    public String panel(){
        return "panel";
    }
}
