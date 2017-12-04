package com.jihai.mengmian.syscode;

/**
 * Created by kevinchen on 2017/2/21.
 *
 * 基础知识普及
 *
 * HTTP状态码（HTTP Status Code）是用以表示网页伺服器HTTP响应状态的3位数字代码。
 * 它由 RFC 2616 规范定义的，并得到 RFC 2518、RFC 2817、RFC 2295、RFC 2774 与 RFC 4918 等规范扩展。
 * 所有状态码的第一个数字代表了响应的五种状态之一。
 * 1xx消息
 * 这一类型的状态码，代表请求已被接受，需要继续处理。这类响应是临时响应，只包含状态行和某些可选的响应头信息，并以空行结束
 *
 * 2xx成功
 * 这一类型的状态码，代表请求已成功被服务器接收、理解、并接受。
 *
 * 3xx重定向
 * 这类状态码代表需要客户端采取进一步的操作才能完成请求。通常，这些状态码用来重定向，后续的请求地址（重定向目标）在本次响应的Location域中指明。
 *
 * 4xx客户端错误
 * 这类的状态码代表了客户端看起来可能发生了错误，妨碍了服务器的处理
 *
 * 5xx服务器错误
 * 这类状态码代表了服务器在处理请求的过程中有错误或者异常状态发生
 *
 */
public enum Syscode implements BaseErrorCode {
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
    JWT_REFRESHTOKEN_INVALID(60105,"Invalid refreshtoken"),
    USER_SESSION_EXPIRAT(60106,"用户账号缓存过期"),
    ROLE_MENU_ISEXISTS(60107, "角色已经关联菜单，不能删除"),
    USER_IS_EXISTS(60108, "用户名已存在"),
    ROLE_TIED_ACCOUNT(60109, "角色已经分配账号"),
    ACCOUNT_NOT_EXISTS(60110, "账号不存在"),
    SUPPERROLE_ACOUNT_NOT_PERMISS_DEL(60111, "超级管理员不允许删除"),
    ROLE_NAME_NOT_NULL(60112, "角色名称不能为空"),
    ROLE_EXISTS(60113, "角色已存在"),
    ROLE_NOT_EXISTS(60114, "角色不存在"),
    PASSWORD_NOT_NULL(60115, "密码不能为空"),
    GENERAL_ROLE_PERMIT(60116, "只允许创建普通管理员"),
    ROLE_NOT_NULL(60117, "角色不能为空"),
    SUPERROLE_NOT_PERMIT_CHANGE(60118, "超级管理员不允许改变角色"),
    ACCOUNT_EXISTS(60119, "账号已存在"),
    PASSWORD_NOT_SAME(60120, "2次密码输入不一致"),
    ACCOUNT_NOT_LOGINED(60121, "请线登录"),
    PASSWORD_MODIFY_FAIL(60122, "密码修改失败"),
    MAIL_EMPTY(60123, "邮箱不能为空"),
    FORGET_PASSWORD_TOKEN_NOT_EXISTS(60124, "密码重置token不存在或者过期了"),
    PASSWORD_COMPLEXITY_CHECK(60125, "密码必须包含数字、字母，并且要同时含有数字和字母，且长度要在8-18位之间"),

    /**************************设备模块*******************************/
    DEVICE_NOT_FOUND(71001, "找不到设备"),

    /**************************app首页管理模块**************************/
    APP_INDEX_PAGE_VERSION_CONFLICT(72001, "传入版本冲突"),
    APP_INDEX_PAGE_PUBLISH_VERSION_NOT_EXIST(72002, "发布版本不存在"),
    APP_INDEX_PAGE_UNCATCHED_ERROR(72003,"未知错误,出现此错误请联系后台人员修复"),
    /**************************设备型号模块相关**************************/
    DEVICE_MODEL_INPUT_ILLEGAL(73001,"传入参数不合法"),
    DEVICE_MODEL_EXIST(73002,"设备型号已存在"),
    DEVICE_MODEL_NOT_EXIST(73003,"设备型号不存在"),
    DEVICE_MODEL_SN_MAPPING_NOT_EXIST(73004,"设备sn映射不存在"),
    DEVICE_MODEL_SIZE_ERROR(73005,"返回数量不正确"),
    DEVICE_MODEL_MAPPING_SUCCESS(73006,"Mass数据同步没有错误，完全同步成功"),
    DEVICE_MODEL_MAPPING_MIDDLE(73007,"Mass数据同步存在错误，重试成功"),
    DEVICE_MODEL_MAPPING_FAIL(73008,"Mass数据同步存在错误，重试失败，序列化SQL对象到硬盘"),
    DEVICE_MODEL_JSON_ILLEGAL(73009,"传入JSON不合法"),
    /**************************站内信*******************************/
    SYS_MSG_NOT_FOUND(74001, "该站内信不存在"),
    SYS_MSG_NOT_RECEIVED(74002, "您没有收到该站内信"),

    ;
    public static final int VALIDATE_EXCEPTION = -10000;
    // 其他未知错误
    public static final int OTHER = -999999;

    private int code;
    private String msg;

    Syscode(int code, String msg) {
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
        return "{"+"code:" + code +", msg:" + msg + "}";
    }
}
