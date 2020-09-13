package com.example.demo0911.controller;

import com.example.demo0911.entity.User;
import com.example.demo0911.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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
            response.setData("1234566");
            return  response;
        }else {
            response.setStatus(300);
            response.setMsg("账号密码错误");
            return response;
        }

    }

    /**
     * 通过id来查询用户的相关信息
     */
    @RequestMapping("/findid")
    public BaseResponse findid(Integer orderid){
        User user = userService.userFindId(orderid);
        BaseResponse response =new BaseResponse();
        response.setStatus(200);
        response.setData(user);
        return  response;
    }


    @RequestMapping("/index")
    public BaseResponse index(String username,String password){
        BaseResponse response =new BaseResponse();
        if("admin".equals(username) && "123456".equals(password)){
            response.setStatus(200);
            response.setMsg("登录成功");
            response.setData("1234566");
            return  response;
        }
        response.setStatus(300);
        response.setMsg("账号密码错误");
        response.setData("1234566");
        return  response;
    }
}
