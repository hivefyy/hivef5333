package com.vuestudy.demo1101.dao;

import com.vuestudy.demo1101.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

@Mapper
public interface UserMapper {
    User userLogin(@Param("username") String username);
}
