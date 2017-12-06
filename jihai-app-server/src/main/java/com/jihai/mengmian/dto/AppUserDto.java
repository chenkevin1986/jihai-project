package com.jihai.mengmian.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kevinchen on 2017/7/24.
 */
@Data
@ApiModel(value = "app用户请求实体信息")
public class AppUserDto {

    @ApiModelProperty( value = "用户id,与平台uid保持一致")
    private String uid;
    @ApiModelProperty( value = "手机号码")
    private String phone;
    @ApiModelProperty( value = "密码")
    private String password;

}
