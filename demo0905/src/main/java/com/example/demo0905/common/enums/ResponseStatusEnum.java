package com.example.demo0905.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态枚举值
 */
@AllArgsConstructor
@Getter
public enum  ResponseStatusEnum {

    SUCCESS(200,"请求成功"),
    FAIL(400,"请求失败"),
    EXCEPTION(500,"未知错误");

    /**
     *请求状态
     */
    private Integer status;
    private String msg;

}
