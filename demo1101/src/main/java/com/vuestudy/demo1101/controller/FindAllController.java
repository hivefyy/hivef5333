package com.vuestudy.demo1101.controller;

import com.vuestudy.demo1101.baseResponse.BaseResponse;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.FindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindAllController {
    @Autowired
    FindAllService findAllService;

    @CrossOrigin
    @GetMapping(value = "/api/userinfo")
    @ResponseBody
    public List<User> findall(){
        List<User> users= findAllService.findall();
        System.out.println(users);
        return  users;

    }

}
