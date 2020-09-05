package com.example.demo0905.core.controller;

import com.example.demo0905.common.base.BaseResponse;
import com.example.demo0905.common.enums.ResponseCodeEnum;
import com.example.demo0905.common.enums.ResponseStatusEnum;
import com.example.demo0905.common.exceptions.ResponseException;
import com.example.demo0905.core.entity.User;
import com.example.demo0905.core.service.UserService;
import lombok.extern.java.Log;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hivef
 * @date: 20020-09-05
 */
@Log
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public BaseResponse<String> login(User user){
        checkParam(user);
        String token = userService.login(user);
        return BaseResponse.<String>builder()
                .status(ResponseStatusEnum.SUCCESS.getStatus())
                .msg("请求成功")
                .build();

    }

    /**
     * 校验参数
     */
    public void checkParam(User user){
        if(user == null){
            throw ResponseException.builder(ResponseCodeEnum.USERNAME_EMPTY);
        }
        /**
         * @todo 其他的校验没有实现
         */

    }

}
