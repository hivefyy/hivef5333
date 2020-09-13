package com.example.demo0911.controller;

import lombok.*;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    Integer status;
    String msg;
    Object data;

}
