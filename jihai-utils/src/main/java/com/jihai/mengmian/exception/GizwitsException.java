package com.jihai.mengmian.exception;

/**
 * Created by kevinchen on 2016/12/23.
 */
public class GizwitsException extends RuntimeException {

    private static final long serialVersionUID = -6706307799181451578L;
    private Integer errorKey;
    private String errorMsg;

    private Object[] params;

    public GizwitsException(Integer errorKey) {
        this.errorKey = errorKey;
    }

    public GizwitsException(Integer errorCode, String message) {
        this.errorKey = errorCode;
        this.errorMsg = message;
    }

    public GizwitsException(Integer errorCode, String message, Object... params) {
        this.errorKey = errorCode;
        this.errorMsg = message;
        this.params = params;
    }

    public Integer getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(Integer errorKey) {
        this.errorKey = errorKey;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }


}