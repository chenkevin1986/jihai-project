package com.jihai.mengmian.web;

import com.jihai.mengmian.syscode.BaseErrorCode;
import com.jihai.mengmian.syscode.Syscode;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ApiResponse<T> {

    private Integer code;

    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResponse(){}

    public ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(Integer code, String message){
        this.code = code;
        this.message = message;
    }


    public static ApiResponse prompt(BaseErrorCode msg){
        return new ApiResponse(msg.getCode(),msg.getMsg());
    }

    public static ApiResponse prompt(String code,String msg){
        return new ApiResponse(Integer.parseInt(code),msg);
    }

    public static ApiResponse prompt(Integer code,String msg){
        return new ApiResponse(code,msg);
    }

    public static ApiResponse prompt(Syscode syscode){
        return new ApiResponse(syscode.getCode(),syscode.getMsg());
    }

    /**
     * 用于响应前端，无数据体
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> ok(){
        return new ApiResponse(Syscode.SC_OK.getCode(),Syscode.SC_OK.getMsg(),null);
    }

    /**
     * 用于前端获取数据或向前端响应数据的时候使用
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> ok(T data){
        return data != null ? new ApiResponse<T>(Syscode.SC_OK.getCode(),Syscode.SC_OK.getMsg(),data):
                new ApiResponse<T>(Syscode.NOT_CONTENT.getCode(),Syscode.NOT_CONTENT.getMsg());
    }

    /**
     * 没有错误码，正常返回。
     * @return
     */
    @JsonIgnore
    public boolean isNotErrorCode(){
        return this.code == 0 || this.code ==200
                || this.code ==201 || this.code ==204;
    }
}
