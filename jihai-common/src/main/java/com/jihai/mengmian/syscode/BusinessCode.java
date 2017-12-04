package com.jihai.mengmian.syscode;

/**
 * Created by niuGuangzhe on 2017/8/8.
 */
public enum BusinessCode implements BaseErrorCode {
    FAIL(-1,"操作失败！"),
    SC_OK(200,"OPERATE RETRIEVE SUCCESS"),
    CREATE_UPDATE_SUCCESS(201,"OPERATE UPDATE SUCCESS"),
    DELETE_SUCCESS(204,"OPERATE DELETE SUCCESS"),
    CLIENT_BAD_REQUEST(400, "Bad Request!"),
    CLIENT_NOT_AUTHORIZATION(401, "Not Authorization"),
    SC_NOT_FOUND(404,"404 error, urlpath not found "),
    CLIENT_METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    CLIENT_NO_ACCEPTABLE(406, "Not Acceptable"),
    SERVER_ERROR(500, "Internal Server Error"),

    SERVER_RUNNTIME_EXCEPTION(100000, "[服务器]运行时异常"),
    SERVER_NULL_EXCEPTION(100001, "[服务器]空值异常"),
    SERVER_CLASSCAST_EXCEPTION(100002, "[服务器]数据类型转换异常"),
    SERVER_IO_EXCEPTION(100003, "[服务器]IO异常"),
    SERVER_NOSUCHMETHOD_EXCEPTION(100004, "[服务器]未知方法异常"),
    SERVER_INDEXOUTOFBOUNDS_EXCEPTION(100005, "[服务器]数组越界异常"),
    SERVER_NETWORK_EXCEPTION(100006, "[服务器]网络异常"),

    /**前端请求的参数错误【一般数参数的格式错误，参数值错误】*/
    DTO_PARAMS_ERROR(60003,"请求参数错误"),
    /**后端没有查询到任何数据*/
    NOT_CONTENT(60004," DATA EMPTY"),
    /**验证码无效或过期*/
    INVALID_CAPTCHA(60005, "无效的验证码"),
    /**Access Token 无效*/
    JWT_TOKEN_INVALID(60006,"无效的accesstoken"),
    /**Access Token 过期*/
    JWT_TOKEN_EXPIRAT(60007,"accesstoken过期，请重新登陆"),
    /**重新登录*/
    LOGIN_AGAIN(60008,"长时间未操作，请重新登录"),
    /**用户名或密码错误*/
    ACCOUNT_PWD_ERROR(60009,"账号或密码错误"),
    SYSTEM_EXCEPTION(60010, "系统异常"),
    ISEXIST_ACCOUNT(60104,"登录账号已存在"),
    JWT_REFRESHTOKEN_INVALID(60105,"无效的refreshtoken"),
    USER_SESSION_EXPIRAT(60106,"用户账号缓存过期"),
    ACCOUNT_IS_NOT_EXISTS(60107, "账号不存在"),
    REMOTE_CALL_FAIL(60108,"远程调用失败"),
    //-------------------推送错误代码定义------------------//
    APP_PUSH_TEMPLATE_NOT_EXIST(81001,"推送模板不存在"),
    APP_PUSH_TEMPLATE_TIME_EXPIRED(81002,"推送时间过期"),
    APP_PUSH_TEMPLATE_TIME_NULL(81003,"推送时间不存在"),
    APP_PUSH_TEMPLATE_SEND_FAIL(81004,"任务同步到极光paas过程失败，"),
    APP_PUSH_TEMPLATE_JSON_ILLEGAL(81005,"json条件不合法"),

    //------------------- Enterprise API 错误码 start -----------------//
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

    //------------------- Enterprise API 错误码 end -----------------//

    /**************************设备模块*******************************/
    DEVICE_NOT_FOUND(71001, "找不到设备"),

    /*************************  设备型号 ******************************/
    MODEL_ITEM_NOT_FOUND(73001,"内机物料不存在"),
    /*************************  滤网故障 ******************************/
    APP_FILTER_FAULT_NOT_FOUND(74001,"该mac无需清洗滤网"),
    /*************************  滤网故障 ******************************/
    DEVICE_REPAIR_EXIST(75001,"该设备该条故障已上报，请等待售后人员维修");

            ;
    private int code;
    private String msg;

    BusinessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", msg:" + msg + "}";
    }
}
