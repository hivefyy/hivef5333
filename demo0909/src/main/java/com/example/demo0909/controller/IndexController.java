package com.example.demo0909.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hivef
 */
@Controller
public class IndexController {

    @GetMapping("/test")
    public String index(Model model){
        model.addAttribute("msg","登录成功 ");
//        这里返回的/test是页面
        return "test";

    }
}
