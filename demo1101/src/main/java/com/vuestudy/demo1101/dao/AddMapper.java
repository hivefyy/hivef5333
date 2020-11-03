package com.vuestudy.demo1101.dao;

import com.vuestudy.demo1101.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AddMapper {

/*
* 这里有两种方式，使用@param 传实例参数， 另一种是不使用@param传实例参数
* 下面是第一种方式
* */
    Integer adduser(@Param("user") User user);



/*    *
    这是第二种方式不使用@param传实例参数*/

    Integer adduser1(User user);
}
