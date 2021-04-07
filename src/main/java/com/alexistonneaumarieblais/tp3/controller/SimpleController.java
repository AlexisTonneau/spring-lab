package com.alexistonneaumarieblais.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class SimpleController {

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return "Hello " + name;
    }


}
