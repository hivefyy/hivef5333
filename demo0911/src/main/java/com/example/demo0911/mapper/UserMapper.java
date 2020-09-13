package com.example.demo0911.mapper;

import com.example.demo0911.controller.BaseResponse;
import com.example.demo0911.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> findAll();
    User userLogin(@Param("username") String username);
    User userFindId(@Param("orderid") Integer orderid);
}
