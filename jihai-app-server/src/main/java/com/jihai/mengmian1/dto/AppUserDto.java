package com.jihai.mengmian1.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b>app用户表 DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-06 23:12:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class AppUserDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private String uid;
    @ApiModelProperty( value = "填写其字段的含义")
    private String password;
    @ApiModelProperty( value = "填写其字段的含义")
    private String phone;

}