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

    @Override
    public void register(User user) {

       addMapper.adduser(user.getUsername(),user.getPassword());


    }
}
