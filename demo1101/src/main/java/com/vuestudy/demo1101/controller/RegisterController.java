package com.vuestudy.demo1101.controller;

import com.vuestudy.demo1101.baseResponse.BaseResponse;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @CrossOrigin
    @PostMapping("/api/register")
    @ResponseBody
    public BaseResponse register(@RequestBody User user){
        registerService.register(user);
        return new BaseResponse(201);
    }
}
