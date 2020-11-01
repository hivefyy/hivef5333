package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class uerLoginController {

    @Autowired
    UserService userService;

    public String userlogin(User user) {
        if (userService.login(user).getId() != null) {
            return "redirect:/index.html";

        } else {
            return "error";
        }
    }

}
