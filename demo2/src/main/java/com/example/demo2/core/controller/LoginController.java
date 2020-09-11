package com.example.demo2.core.controller;

import com.example.demo2.common.Base.BaseResponse;
import com.example.demo2.common.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "try again";
    }

    @GetMapping("/one")
    public BaseResponse login1(User usr){
/**
 * @BaseRespone
 * 把返回的内容直接json化
 */
        BaseResponse response = new BaseResponse();

        if ("hivef".equals(usr.getUsername()) &&  123==usr.getPassword()) {
            response.setStatus("200");
            response.setMsg(usr.getUsername()+":"+usr.getPassword());
            response.setData(usr.getUsername());
            return response;
        } else {
            response.setStatus("404");
            return response;
        }
    }
}
