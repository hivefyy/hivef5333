package com.vuestudy.demo1101.controller;

import com.vuestudy.demo1101.baseResponse.BaseResponse;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;


@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public BaseResponse login(@RequestBody User user){

        if (userService.userLogin(user).getPassword().equals(user.getPassword())){
            return new BaseResponse(200);
        }else {

            System.out.println("test");
            return  new BaseResponse(400);
        }


        /*if (!Objects.equals("admin",username) || !Objects.equals("123456",user.getPassword())){
            String message = "账号密码错误";
            System.out.println("test");
            return  new BaseResponse(400);
        }else {
            return new BaseResponse(200);
        }*/

    }
}
