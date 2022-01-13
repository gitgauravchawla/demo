package com.springrestapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Mycontroller {

    @GetMapping(value = "/home")
    public String MyHome(){
        return "This is a Home Page";
    }

    @GetMapping(value="/createportfolio")
    public String addSong(){
    }
}
