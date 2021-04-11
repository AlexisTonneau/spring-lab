package com.alexistonneaumarieblais.tp3.controller;

import com.alexistonneaumarieblais.tp3.model.Emp;
import com.alexistonneaumarieblais.tp3.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public Emp getById(@PathVariable("id") Emp emp) {   // Spring Boot handles findById in Parameter
        return emp;
    }

    @PostMapping("/")
    public Emp create(@RequestBody Emp emp) {
        return empRepository.save(emp);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Emp emp) {
        empRepository.delete(emp);
    }


}
