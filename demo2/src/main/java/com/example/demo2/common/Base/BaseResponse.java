package com.example.demo2.common.Base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResponse {

    private String status;

    private Object data;

    private String msg;
}
