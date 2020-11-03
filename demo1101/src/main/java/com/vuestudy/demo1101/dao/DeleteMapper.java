package com.vuestudy.demo1101.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeleteMapper {
    Boolean deleteruser(@Param("id") Integer id);
}
