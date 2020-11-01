package com.vuestudy.demo1101.service.impl;

import com.vuestudy.demo1101.dao.UserMapper;
import com.vuestudy.demo1101.entity.User;
import com.vuestudy.demo1101.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        User newuser = userMapper.userLogin(user.getUsername());
        return newuser;
    }
}
