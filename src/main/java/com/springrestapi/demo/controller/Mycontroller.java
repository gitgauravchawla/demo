package com.springrestapi.demo.controller;

import com.springrestapi.demo.entity.portfolio;
import com.springrestapi.demo.portfoloioservice.portfolioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class Mycontroller {
@Autowired
    private com.springrestapi.demo.portfoloioservice.portfolioservice portfolioservice;

    @GetMapping(value = "/home")
    public String MyHome(){
        return "This is a Home Page";
    }

    @GetMapping(value="/getportfolio")
    public List<portfolio> getportfolio(@PathVariable String portfId){
    return this.portfolioservice.getportfolio();
    }
}
