package com.example.demo0905.core.mapper;

import com.example.demo0905.core.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperation;

@Mapper
public interface UserMapper {
    /**
     * 根据主键获取实体对象
     *
     * @param id
     * @return 获取的实体对象
     */
    User selectByPrimaryKey(@Param("id") Integer id);

    Integer insert(@Param("entity") User entity);


}
