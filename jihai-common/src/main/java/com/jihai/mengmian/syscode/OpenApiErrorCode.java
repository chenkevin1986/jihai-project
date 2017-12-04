package com.jihai.mengmian.syscode;

import com.jihai.mengmian.web.ApiResponse;

/**
 * open api错误码
 * @Author: laiqiuhua.
 * @Date: 2017/9/23 14:43.
 */
public enum OpenApiErrorCode {
    OPEN_API_ERROR(-1, "open api 未知错误"),

    INVALID_APPID(9003, "appid无效"),
    INVALID_OPEN_API_TOKEN(9004, "Open API Token 无效"),
    USER_NOT_EXIST(9005, "PASS用户不存在"),
    OPEN_API_TOKEN_EXPIRED(9006, "Open API Token 过期"),
    CODE_EXPIRED(9009, "验证码过期"),
    INVALID_CODE(9010, "无效的验证码"),
    OPEN_API_DEVICE_NOT_FOUND(9014, "找不到设备"),
    INVALID_FORM(9015, "无效的表单"),
    INVALID_PASSCODE(9016, "无效的passcode"),
    OPEN_API_DEVICE_NOT_BOUND(9017, "未绑定该设备"),
    PHONE_ALREADY_EXISTS(9018, "手机号已经存在"),
    USERNAME_ALREAY_EXISTS(9019, "用户名已经存在"),
    USERNAME_OR_PASSWORD_ERROR(9020, "用户名或密码错误"),
    INVALID_USER(9026, "无效的用户"),
    SEND_SMS_FAILED(9037, "发送短信失败"),
    OPEN_API_DEVICE_OFFLINE(9042, "设备下线"),
    DELELE_BINDING_FAILED(9099, "删除绑定设备失败"),
    INVALID_PRODUCT_KEY(10003, "无效的product_key"),

    ;

    OpenApiErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private String errorMessage;
    private int errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static ApiResponse prompErrorCode(String errorcode) {
        for(OpenApiErrorCode openApiErrorCode: OpenApiErrorCode.values()) {
            if (openApiErrorCode.errorCode == Integer.valueOf(errorcode)) {
                return ApiResponse.prompt(openApiErrorCode.errorCode, openApiErrorCode.errorMessage);
            }
        }
        return ApiResponse.prompt(OPEN_API_ERROR.getErrorCode(), OPEN_API_ERROR.getErrorMessage());
    }


}
