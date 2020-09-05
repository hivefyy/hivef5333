package com.example.demo0905.common.base;

import com.example.demo0905.common.enums.ResponseCodeEnum;
import com.example.demo0905.common.enums.ResponseStatusEnum;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> {

    /**
     * 返回的请求状态
     * 来源枚举类：
     * @see ResponseStatusEnum
     */
    private Integer status;

    /**
     *错误响应码
     * 来源枚举类：
     * @see ResponseCodeEnum
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 数据实体对象
     */
    private T data;

    public static BaseResponse success(){
        BaseResponse response = new BaseResponse();
        response.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
        response.setMsg("操作成功");

        return response;
    }

}
