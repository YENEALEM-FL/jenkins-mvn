package com.jenkinsgitcicd.jenkinsgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m")
public class HelloController {

    @GetMapping("/{hellos}")
    public String sayHello(@PathVariable("hellos") String hellos){
        return hellos;
    }
}
