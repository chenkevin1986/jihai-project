package com.jihai.mengmian1.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:39:07 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class TUcoinBillDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer id;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer userId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long billId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Long orderId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer action;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer status;
    @ApiModelProperty( value = "填写其字段的含义")
    private String billInfo;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer billType;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer oldUcoinBalance;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer nowUcoinBalance;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer amt;
    @ApiModelProperty( value = "填写其字段的含义")
    private String userIp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer productId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String productName;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer productCount;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer productTotalPrice;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;

}