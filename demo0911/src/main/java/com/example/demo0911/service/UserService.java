package com.example.demo0911.service;

import com.example.demo0911.controller.BaseResponse;
import com.example.demo0911.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User userLogin(User user);
    User userFindId(Integer id);
}
