package com.jihai.mengmian.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:29 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class Tuser0Dto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer userId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String jid;
    @ApiModelProperty( value = "填写其字段的含义")
    private String userName;
    @ApiModelProperty( value = "填写其字段的含义")
    private String password;
    @ApiModelProperty( value = "填写其字段的含义")
    private String email;
    @ApiModelProperty( value = "填写其字段的含义")
    private String nickName;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer sex;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer source;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer age;
    @ApiModelProperty( value = "填写其字段的含义")
    private String headPhoto;
    @ApiModelProperty( value = "填写其字段的含义")
    private String sign;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer sexFriend;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer coupleApplyTarget;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer coupleApplySender;
    @ApiModelProperty( value = "填写其字段的含义")
    private String telephone;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer height;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer birthdayTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer zodiac;
    @ApiModelProperty( value = "填写其字段的含义")
    private String sourceChannel;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer appId;

}