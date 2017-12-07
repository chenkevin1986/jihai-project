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
public class OfpubsubitemDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private String serviceID;
    @ApiModelProperty( value = "填写其字段的含义")
    private String nodeID;
    @ApiModelProperty( value = "填写其字段的含义")
    private String id;
    @ApiModelProperty( value = "填写其字段的含义")
    private String jid;
    @ApiModelProperty( value = "填写其字段的含义")
    private String creationDate;
    @ApiModelProperty( value = "填写其字段的含义")
    private String payload;

}