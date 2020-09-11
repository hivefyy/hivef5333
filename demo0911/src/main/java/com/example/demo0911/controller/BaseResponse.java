package com.example.demo0911.controller;

import lombok.Getter;
import lombok.Setter;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

@Getter
@Setter
public class BaseResponse {
    Integer status;
    String msg;
    Object obj;
}
