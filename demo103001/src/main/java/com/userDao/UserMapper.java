package com.userDao;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User userlogin(@Param("username") String username, @Param("password") String password);
}
