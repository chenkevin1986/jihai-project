package com.jihai.mengmian1.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class TRmbOrderVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer rmbOrderId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer productId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer userId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String productName;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String productDescription;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer productQuantity;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer amount;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer num;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer totalAmount;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer paytype;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String thirdpartyOrderNo;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer status;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String tradeInfo;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer tradeBeginTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer tradeEndTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;

}