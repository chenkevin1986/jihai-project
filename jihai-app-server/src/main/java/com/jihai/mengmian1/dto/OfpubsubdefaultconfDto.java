package com.jihai.mengmian1.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:06 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class OfpubsubdefaultconfDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private String serviceID;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer leaf;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer deliverPayloads;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer maxPayloadSize;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer persistItems;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer maxItems;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer notifyConfigChanges;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer notifyDelete;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer notifyRetract;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer presenceBased;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer sendItemSubscribe;
    @ApiModelProperty( value = "填写其字段的含义")
    private String publisherModel;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer subscriptionEnabled;
    @ApiModelProperty( value = "填写其字段的含义")
    private String accessModel;
    @ApiModelProperty( value = "填写其字段的含义")
    private String language;
    @ApiModelProperty( value = "填写其字段的含义")
    private String replyPolicy;
    @ApiModelProperty( value = "填写其字段的含义")
    private String associationPolicy;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer maxLeafNodes;

}