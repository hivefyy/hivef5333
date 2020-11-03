package com.vuestudy.demo1101.dao;

import com.vuestudy.demo1101.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.ClientInfoStatus;
import java.util.List;

@Mapper
public interface FindAllMapper {
    List<User> findall();
}
