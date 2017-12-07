package com.jihai.mengmian.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:27 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class OfpubsubsubscriptionDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private String serviceID;
    @ApiModelProperty( value = "填写其字段的含义")
    private String nodeID;
    @ApiModelProperty( value = "填写其字段的含义")
    private String id;
    @ApiModelProperty( value = "填写其字段的含义")
    private String jid;
    @ApiModelProperty( value = "填写其字段的含义")
    private String owner;
    @ApiModelProperty( value = "填写其字段的含义")
    private String state;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer deliver;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer digest;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer digestFrequency;
    @ApiModelProperty( value = "填写其字段的含义")
    private String expire;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer includeBody;
    @ApiModelProperty( value = "填写其字段的含义")
    private String showValues;
    @ApiModelProperty( value = "填写其字段的含义")
    private String subscriptionType;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer subscriptionDepth;
    @ApiModelProperty( value = "填写其字段的含义")
    private String keyword;

}