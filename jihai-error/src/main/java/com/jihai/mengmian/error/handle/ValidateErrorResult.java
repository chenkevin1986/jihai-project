package com.jihai.mengmian.error.handle;

/**
 * 校验错误返回
 * @Author: laiqiuhua.
 * @Date: 2017/8/24 9:54.
 */
public class ValidateErrorResult {
    private String propertyPath;
    private String errorMsg;

    public ValidateErrorResult(){}

    public ValidateErrorResult(String propertyPath, String errorMsg) {
        this.propertyPath = propertyPath;
        this.errorMsg = errorMsg;
    }

    public String getPropertyPath() {
        return propertyPath;
    }

    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
