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
public class TsoftwareDetailDto {
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer fsoftwareId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String fbundleIdentifier;
    @ApiModelProperty( value = "填写其字段的含义")
    private String fname;
    @ApiModelProperty( value = "填写其字段的含义")
    private String fversion;
    @ApiModelProperty( value = "填写其字段的含义")
    private String fplatformId;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer fprojectId;
    @ApiModelProperty( value = "填写其字段的含义")
    private String furl;
    @ApiModelProperty( value = "填写其字段的含义")
    private String fremark;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer finUse;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer finMaintain;
    @ApiModelProperty( value = "填写其字段的含义")
    private String freleaseNotes;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer fexistRelatedFile;
    @ApiModelProperty( value = "填写其字段的含义")
    private String frelatedFileFormat;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer fcreateTimestamp;
    @ApiModelProperty( value = "填写其字段的含义")
    private Integer fmodifyTimestamp;

}