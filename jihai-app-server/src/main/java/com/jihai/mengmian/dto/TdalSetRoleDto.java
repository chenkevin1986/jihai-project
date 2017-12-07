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
public class TdalSetRoleDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private String roleName;
    @ApiModelProperty( value = "填写其字段的含义")
    private String dbName;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer dbType;
    @ApiModelProperty( value = "填写其字段的含义")
    private String desc;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer lastmodifyTimestamp;

}