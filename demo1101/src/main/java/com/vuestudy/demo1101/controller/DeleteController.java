package com.vuestudy.demo1101.controller;

import com.vuestudy.demo1101.baseResponse.BaseResponse;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteController {
    @Autowired
    DeleteService deleteService;

    @CrossOrigin
    @PostMapping("/api/deleteuser")
    @ResponseBody
    public BaseResponse deleteuser(@RequestBody User user){
        deleteService.delsteuser(user.getId());
        return  new BaseResponse(303);
    }
}
