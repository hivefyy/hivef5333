package com.example.demo0911.service.impl;

import com.example.demo0911.controller.BaseResponse;
import com.example.demo0911.entity.User;
import com.example.demo0911.mapper.UserMapper;
import com.example.demo0911.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hivef
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User userLogin(User user) {

       User newuser = userMapper.userLogin(user.getUsername());

        return newuser;
    }

    @Override
    public List<User> userFindId(Integer orderid) {
        return userMapper.userFindId(orderid);
    }

}
