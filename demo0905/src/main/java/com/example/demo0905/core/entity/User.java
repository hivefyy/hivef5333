package com.example.demo0905.core.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hivef
 */
@Data
public class User implements Serializable {

    private  static final long serialVersionUID=1L;

    /**
     * 数据库静态常量字段列表
     */
    public static final String FIELD_ID = "id";
    public static final String FIELD_USER_NAME = "username";
    public static final String FIEID_PASS_WORD = "password";

    private Integer id;
    private String userName;
    private String passWord;
}
