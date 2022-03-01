package com.tsgroup.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public String init(){
        return "Demo TSGroup";
    }

}
