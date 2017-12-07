package com.jihai.mengmian.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <br>
 * <b>description：</b> VO实体<br>
 * <b>author：</b>kevin chen<br>
 * <b>Time：</b> 2017-12-07 16:37:28 <br>
 * <b>Contact：<b>wechat and phone number - 13826126615<br>
 */
@Data
@ApiModel(value = "View显示实体信息", description = "View显示实体信息")
public class TallocidBysectVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer sect;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Long id;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer allocSize;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String desc;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;

}