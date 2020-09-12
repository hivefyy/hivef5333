package com.example.demo0911.mapper;

import com.example.demo0911.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> findAll();
}
