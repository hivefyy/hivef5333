package com.example.demospbootone.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelleoContorller {

    @RequestMapping("/login")
    @ResponseBody
    public String hell(){
        System.out.println("Hello ");
        return "HHHHH   world";

    }
}
