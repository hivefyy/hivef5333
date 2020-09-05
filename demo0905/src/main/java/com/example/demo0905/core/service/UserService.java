package com.example.demo0905.core.service;

import com.example.demo0905.core.entity.User;

import java.util.List;

public interface UserService {

    /***
     * 登录
     * @param user
     */
    String login(User user);

    /**
     * 获取所有
     *
     * @return
     */
    List<User> getAll();

    void add(User user);

    User get(Integer id);

    void delete(Integer id);

    void edit(User user);


}
