package com.example.demo0905.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  ResponseCodeEnum {
    USERNAME_NOT_EXIST(10,"用户不存在"),
    USERNAME_EMPTY(11,"用户名不能为空"),
    PASSWORD_EMPTY(12,"密码不能为空"),
    USERNAME_PASSWORD_ERROR(21,"用户或者密码错误"),
    USERNAME_EXIST(31,"用户名已存在"),
    INVALID(403, "登录失效"),
    UNKNOWN(500, "服务器太累了，请稍后在试~~~");

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误提示信息
     */
    private String msg;
}

