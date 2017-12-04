package com.jihai.mengmian.syscode;

import com.jihai.mengmian.web.ApiResponse;

/**
 * 企业api错误码
 * @Author: laiqiuhua.
 * @Date: 2017/9/23 14:43.
 */
public enum EnterpriseApiErrorCode {
     ENTERPRISE_API_ERROR(-1, "enterprise api 未知错误"),

    INVALID_ENTERPRISE_TOKEN(5009, "Enterprise API Token 无效"),
    ENTERPISE_DEVICE_OFFLINE(5305, "设备下线"),
    ENTERPISE_DEVICE_NOT_BOUND(5303, "未绑定设备"),
    ENTERPISE_TOKEN_EXPIRED(5011, "enterprise token 失效"),
    ENTERPRISE_DOES_NOT_EXIST(5022, "企业不存在"),
    INVALID_ENTERPRISE_FORM(5002, "表单无效"),
    DEVICE_NOT_BELONG_TO_THIS_PRODUCT(5302, "设备不属于这个产品"),
    THE_PKS_HAS_NOT_ASSOCIATE_WITH_ENTERPRISE(5801, "该产品还没有关联到企业下"),
    ENTERPRISE_ID_NOT_EXIST(5003, "企业id不存在"),
    PRODUCT_SECRET_ERROR(5005, "产品Secret错误"),
    IP_NOT_IN_WHITE_LIST(5012, "ip不在白名单"),
    PRODUCT_KEY_NOT_EXIST(5015,"产品key不存在"),
    PRODUCT_DOES_NOT_EXIST(5025, "产品不存在"),
    UID_NOT_EXIST(5017, "uid不存在"),
    ENTERPISE_DEVICE_NOT_EXIST(5301, "设备不存在"),
    ENTERPRISE_SECRET_ERROR(5004, "企业秘钥错误"),
    APPID_NOT_EXIST(5016, "appid不存在"),

    ;

    EnterpriseApiErrorCode(int errorCode, String errorMessage) {
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
        for(EnterpriseApiErrorCode enterpriseApiErrorCode: EnterpriseApiErrorCode.values()) {
            if (enterpriseApiErrorCode.errorCode == Integer.valueOf(errorcode)) {
                return ApiResponse.prompt(enterpriseApiErrorCode.errorCode, enterpriseApiErrorCode.errorMessage);
            }
        }
        return ApiResponse.prompt(ENTERPRISE_API_ERROR.getErrorCode(), ENTERPRISE_API_ERROR.getErrorMessage());
    }


}
