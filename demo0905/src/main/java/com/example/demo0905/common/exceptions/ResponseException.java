package com.example.demo0905.common.exceptions;

import com.example.demo0905.common.enums.ResponseCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.ParameterizedTypeReference;

/**
 * @author hivef
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseException  extends RuntimeException{
    private ResponseCodeEnum code;

    public static ResponseException builder(ResponseCodeEnum coe){
        ResponseException ex = new ResponseException();
        ex.setCode(coe);
        return ex;
    }

}
