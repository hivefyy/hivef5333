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
   public BaseResponse login(){
        BaseResponse response =new BaseResponse();
        response.setStatus(200);
        response.setMsg("后端返给前端提示信息");
        response.setObj("1234566");
        return  response;
    }
}
