package com.vuestudy.demo1101.controller;

import com.vuestudy.demo1101.baseResponse.BaseResponse;
import com.vuestudy.demo1101.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public BaseResponse login(@RequestBody User user){

        String username = user.getUsername();


        if (!Objects.equals("admin",username) || !Objects.equals("123456",user.getPassword())){
            String message = "账号密码错误";
            System.out.println("test");
            return  new BaseResponse(400);
        }else {
            return new BaseResponse(200);
        }

    }
}
