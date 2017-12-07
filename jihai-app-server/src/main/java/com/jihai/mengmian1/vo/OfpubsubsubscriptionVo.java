package com.jihai.mengmian1.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class OfpubsubsubscriptionVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String serviceID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String nodeID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String id;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String jid;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String owner;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String state;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer deliver;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer digest;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer digestFrequency;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String expire;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer includeBody;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String showValues;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String subscriptionType;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer subscriptionDepth;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String keyword;

}