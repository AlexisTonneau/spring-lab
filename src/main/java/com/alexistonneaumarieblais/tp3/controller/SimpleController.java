package com.alexistonneaumarieblais.tp3.controller;

import com.alexistonneaumarieblais.tp3.model.Emp;
import com.alexistonneaumarieblais.tp3.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/")
public class SimpleController {

    @Autowired
    private EmpRepository empRepository;

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return "Hello " + name;
    }

    @GetMapping("/employees")
    public List<Emp> getEmployees() {
        return empRepository.findAll();
    }


}
