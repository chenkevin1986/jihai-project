package com.jihai.mengmian.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class OfmucroomVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Long serviceID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Long roomID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String creationDate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String modificationDate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String name;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String naturalName;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String description;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String lockedDate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String emptyDate;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer canChangeSubject;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer maxUsers;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer publicRoom;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer moderated;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer membersOnly;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer canInvite;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String roomPassword;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer canDiscoverJID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer logEnabled;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String subject;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer rolesToBroadcast;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer useReservedNick;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer canChangeNick;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer canRegister;

}