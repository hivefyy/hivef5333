package com.example.demo2.core.controller;

import com.example.demo2.common.Base.BaseResponse;
import com.example.demo2.common.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "try again";
    }

    @RequestMapping("/one")
    public BaseResponse login1(User usr){
/**
 * @BaseRespone
 * 把返回的内容直接json化
 */
        BaseResponse response = new BaseResponse();
        response.setStatus("200");
        response.setMsg(usr.getUsername()+":"+usr.getPassword());
        response.setData(usr.getUsername());
        return response;
    }
}
