package com.example.demo0911.controller;

import com.example.demo0911.entity.User;
import com.example.demo0911.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hivef
 */
@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
   public BaseResponse login(User user){

        BaseResponse response =new BaseResponse();

        if (userService.userLogin(user).getPassword().equals(user.getPassword())) {
            response.setStatus(200);
            response.setMsg("登录成功");
            response.setObj("1234566");
            return  response;
        }
        response.setStatus(300);
        response.setMsg("账号密码错误");
        response.setObj("1234566");
        return  response;



        /*if("admin".equals(username) && "123456".equals(password)){

        }
        response.setStatus(300);
        response.setMsg("账号密码错误");
        response.setObj("1234566");
        return  response;*/
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
