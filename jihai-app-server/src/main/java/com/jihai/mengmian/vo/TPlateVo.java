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
public class TPlateVo {
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer plateId;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String plateName;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String plateDescription;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String plateLogoPath;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private String plateAdmins;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer deleteFlag;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer order;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer pageView;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer createTimestamp;
    @ApiModelProperty( value = "填写其显示字段的含义")
    private Integer lastmodifyTimestamp;

}