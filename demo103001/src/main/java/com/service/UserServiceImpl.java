package com.service;

import com.entity.User;
import com.userDao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        User userlogin = userMapper.userlogin(user.getUsername(),user.getPassword());
        return userlogin;
    }
}
