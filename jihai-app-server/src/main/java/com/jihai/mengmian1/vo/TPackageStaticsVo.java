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
public class TPackageStaticsVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer staticId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer staticDateTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String packageName;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer packageCount;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer staticTotal;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer beginDateTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer endDateTimestamp;

}