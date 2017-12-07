package com.jihai.mengmian.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> DTO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "Dto实体信息", description = "Dto实体信息")
public class TProductDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer productId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer type;
    @ApiModelProperty( value = "填写其字段的含义")
    private String name;
    @ApiModelProperty( value = "填写其字段的含义")
    private String description;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer quantity;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer rate;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer currencyType;
    @ApiModelProperty( value = "填写其字段的含义")
    private String imageCodes;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer status;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;

}