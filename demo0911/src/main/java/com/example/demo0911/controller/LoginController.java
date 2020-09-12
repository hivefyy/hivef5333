package com.example.demo0911.controller;

import com.sun.xml.internal.bind.v2.schemagen.XmlSchemaGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hivef
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
   public BaseResponse login(String username,String password){
        BaseResponse response =new BaseResponse();
        if("admin".equals(username) && "123456".equals(password)){
            response.setStatus(200);
            response.setMsg("登录成功");
            response.setObj("1234566");
            return  response;
        }
        response.setStatus(300);
        response.setMsg("账号密码错误");
        response.setObj("1234566");
        return  response;
    }

    @RequestMapping("/index")
    public BaseResponse index(String username,String password){
        BaseResponse response =new BaseResponse();
        if("admin".equals(username) && "123456".equals(password)){
            response.setStatus(200);
            response.setMsg("登录成功");
            response.setObj("1234566");
            return  response;
        }
        response.setStatus(300);
        response.setMsg("账号密码错误");
        response.setObj("1234566");
        return  response;
    }
}
