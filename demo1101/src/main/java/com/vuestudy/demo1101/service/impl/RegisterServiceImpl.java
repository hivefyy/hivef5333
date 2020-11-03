package com.vuestudy.demo1101.service.impl;

import com.vuestudy.demo1101.dao.AddMapper;
import com.vuestudy.demo1101.dao.UserMapper;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    AddMapper addMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean register(User user) {

        User olduser = userMapper.userLogin(user.getUsername());
        if (olduser !=null){
            return false;
        }else {
            addMapper.adduser(user);
            return true;
        }
    }
}
