package com.jihai.mengmian.web;

import com.jihai.mengmian.syscode.BaseErrorCode;

public class ApiErrorResponse {

    private Integer code;

    private Object message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public ApiErrorResponse(){}

    public ApiErrorResponse(Integer code, Object message) {
        this.code = code;
        this.message = message;
    }


    public static ApiErrorResponse prompt(BaseErrorCode msg){
        return new ApiErrorResponse(msg.getCode(),msg.getMsg());
    }

    public static ApiErrorResponse prompt(Integer code, Object msg){
        return new ApiErrorResponse(code, msg);
    }

}
