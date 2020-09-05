package com.example.demo0905.core.service.impl;

import com.example.demo0905.core.entity.User;
import com.example.demo0905.core.mapper.UserMapper;
import com.example.demo0905.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public User get(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void edit(User user) {

    }
}
