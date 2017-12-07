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
public class OfpubsubdefaultconfVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String serviceID;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer leaf;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer deliverPayloads;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer maxPayloadSize;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer persistItems;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer maxItems;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer notifyConfigChanges;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer notifyDelete;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer notifyRetract;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer presenceBased;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer sendItemSubscribe;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String publisherModel;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer subscriptionEnabled;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String accessModel;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String language;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String replyPolicy;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String associationPolicy;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer maxLeafNodes;

}